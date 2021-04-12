/*
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.mde.generator

import java.util.List
import java.util.ArrayList

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

import uk.ac.kcl.mde.rinform.ReverseInformProgram
import uk.ac.kcl.mde.rinform.RoomDeclaration
import uk.ac.kcl.mde.rinform.RoomDescription
import uk.ac.kcl.mde.rinform.ItemDeclaration
import uk.ac.kcl.mde.rinform.ItemDescription
import uk.ac.kcl.mde.rinform.PersonDeclaration
import uk.ac.kcl.mde.rinform.PersonDescription
import uk.ac.kcl.mde.rinform.DirectionStatement
import uk.ac.kcl.mde.rinform.SentencePart
import uk.ac.kcl.mde.rinform.Direction
import uk.ac.kcl.mde.rinform.ContainerDeclaration
import uk.ac.kcl.mde.rinform.ItemInRoomDeclaration
import uk.ac.kcl.mde.rinform.ItemInContainerDeclaration

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class RinformGenerator extends AbstractGenerator {

	List<RoomDeclaration> declaredRooms = new ArrayList<RoomDeclaration>()
	List<ItemDeclaration> declaredItems = new ArrayList<ItemDeclaration>()
	List<PersonDeclaration> declaredPeople = new ArrayList<PersonDeclaration>()

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val model = resource.contents.head as ReverseInformProgram
		fsa.generateFile(resource.getFileName, model.getGeneratedCode.replace('\n`', ''))
	}
	
	def getFileName(Resource resource) {
		resource.URI.appendFileExtension('txt').lastSegment
	}
	
	def String getGeneratedCode(ReverseInformProgram m){
		'''
		«m.sentences.filter(RoomDescription).map[generateInformCode].join('\n')»
		«m.sentences.filter(RoomDeclaration).map[generateInformCode].join('\n')»
		«m.sentences.filter(ItemDescription).map[generateInformCode].join('\n')»
		«m.sentences.filter(ItemDeclaration).map[generateInformCode].join('\n')»
		«m.sentences.filter(PersonDescription).map[generateInformCode].join('\n')»
		«m.sentences.filter(PersonDeclaration).map[generateInformCode].join('\n')»
		«m.sentences.filter(DirectionStatement).map[generateInformCode].join('\n')»
		'''
	}
	
	dispatch def generateInformCode(SentencePart stmt){''''''}
	
	dispatch def generateInformCode(RoomDescription stmt){
		declaredRooms.add(stmt.room)
		'''«stmt.room.name.toFirstUpper» is a Room. "«stmt.roomDescription.getString.toFirstUpper»"'''	
	}
	
	dispatch def generateInformCode(RoomDeclaration stmt){
		if (!declaredRooms.contains(stmt)){
			stmt.declareRoom
		} else '''`'''	
	}
	
	dispatch def generateInformCode(ItemDescription stmt){
		if(!declaredItems.contains(stmt.item)) {
			declaredItems.add(stmt.item)
		
			if (stmt.item instanceof ContainerDeclaration) {
				var item = stmt.item as ContainerDeclaration
				'''«item.name.toFirstUpper» is in «item.room.name.toFirstUpper». "«stmt.itemDescription.getString.toFirstUpper»"'''
			} else if (stmt.item instanceof ItemInRoomDeclaration) {
				var item = stmt.item as ItemInRoomDeclaration
				'''«item.name.toFirstUpper» is in «item.room.name.toFirstUpper». "«stmt.itemDescription.getString.toFirstUpper»"'''
			} else {
				var item = stmt.item as ItemInContainerDeclaration
				'''«item.name.toFirstUpper» is in «item.container.name.toFirstUpper». "«stmt.itemDescription.getString.toFirstUpper»"'''
			}
		} else '''`'''
	} 
	
	dispatch def generateInformCode(ItemDeclaration stmt){
		if (!declaredItems.contains(stmt)) {
			declaredItems.add(stmt)
			
			if (stmt instanceof ContainerDeclaration) {
				var item = stmt as ContainerDeclaration
				'''«item.name.toFirstUpper» is in «item.room.name.toFirstUpper».'''
			} else if (stmt instanceof ItemInRoomDeclaration) {
				var item = stmt as ItemInRoomDeclaration
				'''«item.name.toFirstUpper» is in «item.room.name.toFirstUpper».'''
			} else {
				var item = stmt as ItemInContainerDeclaration
				'''«item.name.toFirstUpper» is in «item.container.name.toFirstUpper».'''
			}
		} else '''`'''
	}
	
	dispatch def generateInformCode(PersonDescription stmt){
		declaredPeople.add(stmt.person)
		'''«stmt.person.name.toFirstUpper» is in «stmt.person.room.name.toFirstUpper». "«stmt.personDescription.getString.toFirstUpper»"'''
	}
	
	dispatch def generateInformCode(PersonDeclaration stmt) {
		if (!declaredPeople.contains(stmt)) {
			'''«stmt.name.toFirstUpper» is in «stmt.room.name»'''
		} else '''`'''
	}
	
	dispatch def generateInformCode(DirectionStatement stmt){
		if(!declaredRooms.contains(stmt.room1)){
			stmt.room1.declareRoom
		}			
		if(!declaredRooms.contains(stmt.room2)){
			stmt.room2.declareRoom
		}
		if( stmt.direction == Direction.BELOW || stmt.direction == Direction.ABOVE){
			'''«stmt.direction» «stmt.room1.name.toFirstUpper» is «stmt.room2.name.toFirstUpper»'''
		}
		else{
			'''«stmt.direction» of «stmt.room1.name.toFirstUpper» is «stmt.room2.name.toFirstUpper»'''
		}		
	}
	
	def declareRoom(RoomDeclaration stmt){
		declaredRooms.add(stmt)
		'''«stmt.name.toFirstUpper» is a Room. '''
	}
	
	def String getString(List<String> text) {
		var toReturn = ""
		for (String word: text){
			toReturn += word + " "
		}
		toReturn.trim()
	}
}
