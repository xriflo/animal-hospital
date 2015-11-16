import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Random;

import Parsers.AnimalParser;
import PetsStructure.*;

/**
 * @author Florentina Bratiloveanu
 */

public class AnimalHospital {
	/**
	 * buffer containing pets
	 */
	public ArrayList<Pet> pets;
	
	
	/**
	 * every time we find a keyword like CAT, DOG or BIRD we apply the auxiliar parsers to parse the next lines
	 * @param inputFile - the file to be parsed
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws ParseException
	 */
	public AnimalHospital(String inputFile) throws FileNotFoundException, IOException, ParseException {
		pets = new ArrayList<Pet>();
		AnimalParser p = new AnimalParser();
		
		try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
		    String line;
		    
		    whileloop:
		    while ((line = br.readLine()) != null &&
		    		!line.equals("END")) {
		    	switch(line) {
		    		case "DOG":
		    			Dog dog = p.parseDog(br);
		    			this.pets.add(dog);
		    			break;
		    		case "CAT":
		    			Cat cat = p.parseCat(br);
		    			cat.setBoardStart(12, 1, 2015);
		    			this.pets.add(cat);
		    			break;
		    		case "BIRD":
		    			Bird bird = p.parseBird(br);
		    			this.pets.add(bird);
		    			break;
		    		default:
		    			System.err.println("No keyword found!");
		    			break whileloop;
		    	}
		    }
		}
	}
	/**
	 * @param name - the name of the pet we want to search
	 */
	public void printPetInfoByName(String name) {
		for(Pet p:pets) {
			if(p.getPetName().toLowerCase().equals(name.toLowerCase()))
				System.out.println(p.toString());
		}
	}
	
	/**
	 * @param name the name of the pet we want to search
	 */
	public void printPetInfoByOwner(String name) {
		for(Pet p:pets) {
			if(p.getOwnerName().toLowerCase().equals(name.toLowerCase()))
				System.out.println(p.toString());
				
		}
		
	}
	/**
	 * this function finds all the pets which were treated at some date
	 * @param month 
	 * @param day
	 * @param year
	 */
	public void printPetsBoarding(int month, int day, int year) {
		for(Pet p:pets) {
			if(p instanceof Cat) {
				Cat cat = (Cat)p;
				if(cat.boarding(month, day, year)) {
					System.out.println(cat.toString());
				}
			}
			else if(p instanceof Dog) {
				Dog dog = (Dog)p;
				if(dog.boarding(month, day, year)) {
					System.out.println(dog.toString());
				}
			}
		}
	}
}
