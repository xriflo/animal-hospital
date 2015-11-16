package PetsStructure;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import javax.rmi.CORBA.Util;

public class Cat extends Pet implements Boardable{
	private String hairLength;
	private Date startDate, endDate;
	
	/**
	 * @param name cat's name
	 * @param ownerName owner's name
	 * @param color cat's color
	 * @param hairLength cat's hair length
	 */
	public Cat(String name, String ownerName, String color, String hairLength) {
		super(name, ownerName, color);
		this.hairLength = hairLength;
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

	public String getHairLength() {
		return hairLength;
	}

	@Override
	public String toString() {
		return "CAT: " + "\n" +
				super.toString() + "\n" +
				"Hair: " + this.hairLength;
	}
	
	

}
