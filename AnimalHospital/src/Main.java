
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

import javax.swing.text.html.HTMLEditorKit.Parser;

import Parsers.AnimalParser;
import PetsStructure.Cat;
import PetsStructure.Pet;
import PetsStructure.Pet.Sex;

/**
 * @author Florentina Bratiloveanu
 */

public class Main {

	public static void main(String[] args) throws ParseException, FileNotFoundException, IOException {
		AnimalHospital ah = new AnimalHospital("src/tests/pets");
		ah.printPetInfoByName("bagheera");
		ah.printPetsBoarding(12, 1, 2015);
	}

}
