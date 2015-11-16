package Parsers;
import java.io.BufferedReader;
import java.io.IOException;

import PetsStructure.*;
import PetsStructure.Pet.Sex;

/**
 * @author Florentina Bratiloveanu
 */

public class AnimalParser {
	/**
	 * @param line the string to be parsed as a Sex field
	 * @return Sex enum type
	 */
	public static Sex parseSex(String line) {
		Sex sex = null;
		switch(line) {
			case "male":
				sex = Pet.Sex.MALE;
				break;
			case "female":
				sex = Pet.Sex.FEMALE;
				break;
			case "neutred":
				sex = Pet.Sex.NEUTRED;
				break;
			case "spayed":
				sex = Pet.Sex.SPAYED;
				break;
		}
		return sex;
	}
	/**
	 * @param br current state of the buffer reader from where to parse
	 * @return a class of type Cat
	 * @throws IOException
	 */
	public Cat parseCat(BufferedReader br) throws IOException {
		String name = br.readLine();
		String ownerName = br.readLine();
		String color = br.readLine();
		Sex sex = parseSex(br.readLine());
		String hairLength = br.readLine();
		Cat cat = new Cat(name, ownerName, color, hairLength);
		cat.setSex(sex);
		return cat;
	}
	
	/**
	 * @param br current state of the buffer reader from where to parse
	 * @return a class of type Cat
	 * @throws IOException
	 */
	public Dog parseDog(BufferedReader br) throws IOException {
		String name = br.readLine();
		String ownerName = br.readLine();
		String color = br.readLine();
		Sex sex = parseSex(br.readLine());
		String size = br.readLine();
		Dog dog = new Dog(name, ownerName, color, size);
		dog.setSex(sex);
		return dog;
	}
	
	/**
	 * @param br current state of the buffer reader from where to parse
	 * @return a class of type Bird
	 * @throws IOException
	 */
	public Bird parseBird(BufferedReader br) throws IOException {
		String name = br.readLine();
		String ownerName = br.readLine();
		String color = br.readLine();
		Sex sex = parseSex(br.readLine());
		Bird bird = new Bird(name, ownerName, color);
		bird.setSex(sex);
		return bird;
	}
}
