package StarWarsUniverse.StarWars;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.Resource;

public class Character {
	String swProperty;
	String swURI;
	Model character = ModelFactory.createDefaultModel();
	// properties
	Property name = character.createProperty(swProperty + "name");
	Property height = character.createProperty(swProperty + "height");
	Property mass = character.createProperty(swProperty + "mass");
	Property skinColor = character.createProperty(swProperty + "skin_color");
	Property hairColor = character.createProperty(swProperty + "hair_color");
	Property born = character.createProperty(swProperty + "born");
	Property died = character.createProperty(swProperty + "died");
	Property species = character.createProperty(swProperty + "species");
	Resource luke;
	Resource han;
	Resource leia;
	Resource chewy;
	Resource c3po;
	Resource r2d2;
	Resource becca;

	Character(String swProperty, String swURI) {
		this.swProperty = swProperty;
		this.swURI = swURI;
		createCharacters();
	}

	// Character

	private void createCharacters() {
		// Luke
		this.luke = character.createResource(swURI + "luke_skywalker");
		this.luke.addProperty(name, "Luke Skywalker");
		this.luke.addProperty(height, "1.72 meters");
		this.luke.addProperty(mass, "73 kilograms");
		this.luke.addProperty(skinColor, "Light");
		this.luke.addProperty(hairColor, "Blond");
		this.luke.addProperty(born, "19 BBY");
		this.luke.addProperty(died, "34 ABY");
		this.luke.addProperty(species, "Human");

		this.han = character.createResource(swURI + "han_solo");
		this.han.addProperty(name, "Han Solo");
		this.han.addProperty(height, "1.8 meters");
		this.han.addProperty(mass, "80 kilograms");
		this.han.addProperty(skinColor, "Light");
		this.han.addProperty(hairColor, "Brown");
		this.han.addProperty(born, "29 BBY");
		this.han.addProperty(died, "34 ABY");
		this.han.addProperty(species, "Human");

		this.leia = character.createResource(swURI + "leia_organa");
		this.leia.addProperty(name, "Leia Organa");
		this.leia.addProperty(height, "1.72 meters");
		this.leia.addProperty(mass, "73 kilograms");
		this.leia.addProperty(skinColor, "Light");
		this.leia.addProperty(hairColor, "Brown");
		this.leia.addProperty(born, "19 BBY");
		this.leia.addProperty(died, "34 ABY");
		this.leia.addProperty(species, "Human");

		this.chewy = character.createResource(swURI + "chewbacca");
		this.chewy.addProperty(name, "Chewbacca");
		this.chewy.addProperty(height, "1.72 meters");
		this.chewy.addProperty(mass, "73 kilograms");
		this.chewy.addProperty(skinColor, "Light");
		this.chewy.addProperty(hairColor, "Brown");
		this.chewy.addProperty(born, "19 BBY");
		this.chewy.addProperty(died, "34 ABY");
		this.chewy.addProperty(species, "Wookie");

		this.c3po = character.createResource(swURI + "C3PO");
		this.c3po.addProperty(name, "C-3PO");
		this.c3po.addProperty(height, "1.72 meters");
		this.c3po.addProperty(mass, "73 kilograms");
		this.c3po.addProperty(skinColor, "Gold");
		this.c3po.addProperty(hairColor, "");
		this.c3po.addProperty(born, "19 BBY");
		this.c3po.addProperty(died, "34 ABY");
		this.c3po.addProperty(species, "Protocol Android");

		this.r2d2 = character.createResource(swURI + "R2D2");
		this.r2d2.addProperty(name, "R2-D2");
		this.r2d2.addProperty(height, "1.72 meters");
		this.r2d2.addProperty(mass, "73 kilograms");
		this.r2d2.addProperty(skinColor, "White");
		this.r2d2.addProperty(hairColor, "");
		this.r2d2.addProperty(born, "19 BBY");
		this.r2d2.addProperty(died, "34 ABY");
		this.r2d2.addProperty(species, "Astromech Android");

		this.becca = character.createResource(swURI + "becca");
		this.becca.addProperty(name, "Serka Bukett");
		this.becca.addProperty(height, "1.72 meters");
		this.becca.addProperty(mass, "73 kilograms");
		this.becca.addProperty(skinColor, "Light");
		this.becca.addProperty(hairColor, "Brown");
		this.becca.addProperty(born, "19 BBY");
		this.becca.addProperty(died, "34 ABY");
		this.becca.addProperty(species, "Human");

		this.character.write(System.out, "TURTLE");

	}

}
