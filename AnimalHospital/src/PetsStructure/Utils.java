package PetsStructure;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Florentina Bratiloveanu
 */
public class Utils {
	/**
	 * @param month
	 * @param day
	 * @param year
	 * @return an object of type Date
	 */
	public static final Date toDate(int month, int day, int year) {
		String date = year + "/" + month + "/" + day;
		Date retDate = null;
		try {
		      SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
		      retDate = formatter.parse(date);
		    } catch (ParseException e) {
		      System.out.println(e.toString());
		      e.printStackTrace();
		    }
		return retDate;
	}
	
	/**
	 * @param boarding
	 * @param startDate
	 * @param endDate
	 * @return true is the boarding date is included between start and end dates
	 */
	public static final boolean boarding(Date boarding, Date startDate, Date endDate) {
		if(boarding.after(startDate) && boarding.before(endDate) ||
	    		  boarding.equals(startDate) ||
	    		  boarding.equals(endDate))
	    	  return true;
		return false;
	}
}
