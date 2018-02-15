package StarWarsUniverse.StarWars;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.Resource;

public class Weapon {
	String swProperty;
	String swURI;
	Model weapon = ModelFactory.createDefaultModel();
	Property name = weapon.createProperty(swProperty + "name");
	Property model = weapon.createProperty(swProperty + "model");
	Property type = weapon.createProperty(swProperty + "type");
	Property capacity = weapon.createProperty(swProperty + "capacity");
	Property color = weapon.createProperty(swProperty + "color");
	Resource anakinLightsaber;
	Resource lukeLightsaber;
	Resource heavyBlasterPistol;
	Resource bowcaster;
	Resource defenderSportingBlasterPistol;

	Weapon(String swProperty, String swURI) {
		this.swProperty = swProperty;
		this.swURI = swURI;
		createWeapons();
	}

	private void createWeapons() {

		this.anakinLightsaber = weapon.createResource(swURI + "anakin_lightsaber");
		this.anakinLightsaber.addProperty(name, "Anakin's Jedi Lightsaber");
		this.anakinLightsaber.addProperty(model, "Anakin");
		this.anakinLightsaber.addProperty(type, "Lightsaber");
		this.anakinLightsaber.addProperty(capacity, "Infinite");
		this.anakinLightsaber.addProperty(color, "Blue");

		this.heavyBlasterPistol = weapon.createResource(swURI + "heavy_blaster_pistol");
		this.heavyBlasterPistol.addProperty(name, "Heavy Blaster Pistol");
		this.heavyBlasterPistol.addProperty(model, "DL-44");
		this.heavyBlasterPistol.addProperty(type, "Heavy Blaster Pistol");
		this.heavyBlasterPistol.addProperty(capacity, "50 Shots");
		this.heavyBlasterPistol.addProperty(color, "Black");
		
		this.lukeLightsaber = weapon.createResource(swURI + "luke_lightsaber");
		this.lukeLightsaber.addProperty(name, "Luke's Jedi Lightsaber");
		this.lukeLightsaber.addProperty(model, "Luke");
		this.lukeLightsaber.addProperty(type, "Lightsaber");
		this.lukeLightsaber.addProperty(capacity, "Infinite");
		this.lukeLightsaber.addProperty(color, "Green");
		
		this.bowcaster = weapon.createResource(swURI + "bowcaster");
		this.lukeLightsaber.addProperty(name, "Chewbacca's Bowcaster");
		this.lukeLightsaber.addProperty(model, "Wookie Bowcaster");
		this.lukeLightsaber.addProperty(type, "Bowcaster");
		this.lukeLightsaber.addProperty(capacity, "Variable");
		this.lukeLightsaber.addProperty(color, "Black");
		
		this.defenderSportingBlasterPistol = weapon.createResource(swURI + "defender_sporting_blaster_pistol");
		this.lukeLightsaber.addProperty(name, "Defender Sporting Blaster Pistol");
		this.lukeLightsaber.addProperty(model, "Defender");
		this.lukeLightsaber.addProperty(type, "Sporting Pistol");
		this.lukeLightsaber.addProperty(capacity, "100 Shots");
		this.lukeLightsaber.addProperty(color, "Black");
		
		this.weapon.write(System.out, "TURTLE");
	}
}
