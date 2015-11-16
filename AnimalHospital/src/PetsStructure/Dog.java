package PetsStructure;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Florentina Bratiloveanu
 */
public class Dog extends Pet implements Boardable{
	private String size;
	private Date startDate, endDate;
	
	/**
	 * @param name dog's name
	 * @param ownerName owner's name
	 * @param color dog's color
	 * @param size dog's size
	 */
	public Dog(String name, String ownerName, String color, String size) {
		super(name, ownerName, color);
		this.size = size;
		this.startDate = Utils.toDate(1, 1, 1970);
		this.endDate = Utils.toDate(1, 1, 1970);
	}

	@Override
	public void setBoardStart(int month, int day, int year) throws ParseException {
		startDate = Utils.toDate(month, day, year);
	}

	@Override
	public void setBoardEnd(int month, int day, int year) {
		endDate = Utils.toDate(month, day, year);
		
	}

	@Override
	public boolean boarding(int month, int day, int year) {
		Date boarding = Utils.toDate(month, day, year);
		return Utils.boarding(boarding, startDate, endDate);
	}

	public String getSize() {
		return size;
	}

	@Override
	public String toString() {
		return "DOG: " + "\n" +
				super.toString() + "\n" +
				"Size: " + size;
	}
	
	

}
