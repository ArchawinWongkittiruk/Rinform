# Rinform
Inform 7 in reverse - generate the environment from the story

How to use Rinform:

Import the project into Eclipse and generate XText artifacts from "Rinform.xtext" file.
Launch a new Eclipse runtime instance and create a new file with .rinform extention.
Either paste a literary text into a file to use the DSML in its originally intended
manner, or declare an environment from scratch.
Hint: use "Ctrl + Space" key combination to get suggestions on what tags to use

Rinform sythax:
- To declare rooms: “r- Kitchen -r” 
- To describe rooms: “{The ceiling is only about a foot above Frodo !r[Kitchen]}” 
- To declare items/containers in rooms: “i- Cupboard -i !r[Kitchen]” 
- To declare items in containers: “i- Ring -i !c(Cupboard)” 
- To describe items/containers: “{The ring is shiny and has some strange writing on it i- [Ring]}” 
- To declare characters: “p- Gandalf -p !r[Corridor].” 
- To describe characters: “{Gandalf wears grey robes and a long beard !p[Gandalf]}” 
- To set directions: “\<Corridor East Kitchen>”  
- To add aliases: “!i[Ring] = [The One Ring] = [The Ring] 

Sample project (please note that to escape GitHub's markdown character, a backslash is
added before the direction declaration, that will not be recognised by Rinform)

r- Armour Gallery -r
\<Armour Gallery East Trophy Room>
The r-Trophy Room-r was where awards, trophies, cups, plates, shields, 
statues, and i-medals-i !c[crystal glass displays] were kept 
in c-crystal glass displays-c !r[Trophy Room]. This room 
also contained i-a list of Head Boys and Head Girls-i !r[Trophy Room]. 
{Prominently displayed were Hogwarts Awards for Services to the School !r[Trophy Room]}, 
with known recipients being p-Tom Marvolo Riddle-p !r[Trophy Room], 
p-Harry Potter-p !r[Trophy Room] and 
p-Ron Weasley-p !r[Trophy Room]. Probably, the i-Triwizard Cup-i !r[Trophy Room] was placed 
here as well. The Trophy Room was connected to an Armour Gallery.
