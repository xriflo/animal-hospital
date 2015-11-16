package PetsStructure;

/**
 * @author Florentina Bratiloveanu
 */

public class Bird extends Pet {
	private boolean feathersClipped;
	
	/**
	 * @param name bird's name
	 * @param ownerName owner's name
	 * @param color bird's color
	 */
	public Bird(String name, String ownerName, String color) {
		super(name, ownerName, color);
		feathersClipped = false;
	}
	
	public boolean clipped() {
		return feathersClipped;
	}
	
	public void setClipped() {
		feathersClipped = true;
	}

	@Override
	public String toString() {
		return "BIRD: " + "\n" +
				super.toString() + "\n" +
				"Feather clipped: " +
				 ((feathersClipped==true) ? "yes" : "no");
	}
	
}
