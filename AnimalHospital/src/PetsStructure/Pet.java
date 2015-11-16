package PetsStructure;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Florentina Bratiloveanu
 */

public class Pet {
	public enum Sex {MALE, FEMALE, SPAYED, NEUTRED};
	
	private String name, ownerName, color;
	protected Sex sex;
	
	/**
	 * @param name pet's name
	 * @param ownerName owner's name
	 * @param color pet's color
	 */
	public Pet(String name, String ownerName, String color) {
		this.name = name;
		this.ownerName = ownerName;
		this.color = color;
	}

	public String getPetName() {
		return name;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public String getColor() {
		return color;
	}

	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sexid) {
		this.sex = sexid;
	}

	@Override
	public String toString() {
		return this.name + " owned by " + this.ownerName + "\n" +
				"Color: " + this.color + "\n" +
				"Sex: " + this.sex;
	
	}
	
}
