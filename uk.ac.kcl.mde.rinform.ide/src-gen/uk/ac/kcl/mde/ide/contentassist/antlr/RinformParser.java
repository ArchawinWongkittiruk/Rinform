/*
 * generated by Xtext 2.20.0
 */
package uk.ac.kcl.mde.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import uk.ac.kcl.mde.ide.contentassist.antlr.internal.InternalRinformParser;
import uk.ac.kcl.mde.services.RinformGrammarAccess;

public class RinformParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(RinformGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, RinformGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getSentencePartAccess().getAlternatives(), "rule__SentencePart__Alternatives");
			builder.put(grammarAccess.getItemDeclarationAccess().getAlternatives(), "rule__ItemDeclaration__Alternatives");
			builder.put(grammarAccess.getTextAccess().getAlternatives(), "rule__Text__Alternatives");
			builder.put(grammarAccess.getSYMBOLAccess().getAlternatives(), "rule__SYMBOL__Alternatives");
			builder.put(grammarAccess.getDirectionAccess().getAlternatives(), "rule__Direction__Alternatives");
			builder.put(grammarAccess.getRoomDeclarationAccess().getGroup(), "rule__RoomDeclaration__Group__0");
			builder.put(grammarAccess.getRoomAliasAccess().getGroup(), "rule__RoomAlias__Group__0");
			builder.put(grammarAccess.getRoomDescriptionAccess().getGroup(), "rule__RoomDescription__Group__0");
			builder.put(grammarAccess.getContainerDeclarationAccess().getGroup(), "rule__ContainerDeclaration__Group__0");
			builder.put(grammarAccess.getItemInRoomDeclarationAccess().getGroup(), "rule__ItemInRoomDeclaration__Group__0");
			builder.put(grammarAccess.getItemInContainerDeclarationAccess().getGroup(), "rule__ItemInContainerDeclaration__Group__0");
			builder.put(grammarAccess.getItemDescriptionAccess().getGroup(), "rule__ItemDescription__Group__0");
			builder.put(grammarAccess.getCharacterDeclarationAccess().getGroup(), "rule__CharacterDeclaration__Group__0");
			builder.put(grammarAccess.getCharacterDescriptionAccess().getGroup(), "rule__CharacterDescription__Group__0");
			builder.put(grammarAccess.getDirectionStatementAccess().getGroup(), "rule__DirectionStatement__Group__0");
			builder.put(grammarAccess.getReverseInformProgramAccess().getSentencesAssignment(), "rule__ReverseInformProgram__SentencesAssignment");
			builder.put(grammarAccess.getRoomDeclarationAccess().getNameAssignment_1(), "rule__RoomDeclaration__NameAssignment_1");
			builder.put(grammarAccess.getRoomAliasAccess().getRoomAssignment_1(), "rule__RoomAlias__RoomAssignment_1");
			builder.put(grammarAccess.getRoomAliasAccess().getAliasesAssignment_3(), "rule__RoomAlias__AliasesAssignment_3");
			builder.put(grammarAccess.getRoomDescriptionAccess().getRoomDescriptionAssignment_1(), "rule__RoomDescription__RoomDescriptionAssignment_1");
			builder.put(grammarAccess.getRoomDescriptionAccess().getRoomAssignment_4(), "rule__RoomDescription__RoomAssignment_4");
			builder.put(grammarAccess.getContainerDeclarationAccess().getNameAssignment_1(), "rule__ContainerDeclaration__NameAssignment_1");
			builder.put(grammarAccess.getContainerDeclarationAccess().getRoomAssignment_5(), "rule__ContainerDeclaration__RoomAssignment_5");
			builder.put(grammarAccess.getItemInRoomDeclarationAccess().getNameAssignment_1(), "rule__ItemInRoomDeclaration__NameAssignment_1");
			builder.put(grammarAccess.getItemInRoomDeclarationAccess().getRoomAssignment_5(), "rule__ItemInRoomDeclaration__RoomAssignment_5");
			builder.put(grammarAccess.getItemInContainerDeclarationAccess().getNameAssignment_1(), "rule__ItemInContainerDeclaration__NameAssignment_1");
			builder.put(grammarAccess.getItemInContainerDeclarationAccess().getContainerAssignment_5(), "rule__ItemInContainerDeclaration__ContainerAssignment_5");
			builder.put(grammarAccess.getItemDescriptionAccess().getItemDescriptionAssignment_1(), "rule__ItemDescription__ItemDescriptionAssignment_1");
			builder.put(grammarAccess.getItemDescriptionAccess().getItemAssignment_4(), "rule__ItemDescription__ItemAssignment_4");
			builder.put(grammarAccess.getCharacterDeclarationAccess().getNameAssignment_1(), "rule__CharacterDeclaration__NameAssignment_1");
			builder.put(grammarAccess.getCharacterDeclarationAccess().getRoomAssignment_5(), "rule__CharacterDeclaration__RoomAssignment_5");
			builder.put(grammarAccess.getCharacterDescriptionAccess().getPersonDescriptionAssignment_1(), "rule__CharacterDescription__PersonDescriptionAssignment_1");
			builder.put(grammarAccess.getCharacterDescriptionAccess().getPersonAssignment_4(), "rule__CharacterDescription__PersonAssignment_4");
			builder.put(grammarAccess.getDirectionStatementAccess().getRoom1Assignment_1(), "rule__DirectionStatement__Room1Assignment_1");
			builder.put(grammarAccess.getDirectionStatementAccess().getDirectionAssignment_2(), "rule__DirectionStatement__DirectionAssignment_2");
			builder.put(grammarAccess.getDirectionStatementAccess().getRoom2Assignment_3(), "rule__DirectionStatement__Room2Assignment_3");
			builder.put(grammarAccess.getWordsAccess().getWordsAssignment(), "rule__Words__WordsAssignment");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private RinformGrammarAccess grammarAccess;

	@Override
	protected InternalRinformParser createParser() {
		InternalRinformParser result = new InternalRinformParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public RinformGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(RinformGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
