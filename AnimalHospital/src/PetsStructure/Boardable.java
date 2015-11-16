package PetsStructure;
import java.text.ParseException;
import java.util.Date;

/**
 * @author Florentina Bratiloveanu
 */
public interface Boardable {
	void setBoardStart(int month, int day, int year) throws ParseException;
	void setBoardEnd(int month, int day, int year) throws ParseException;
	boolean boarding(int month, int day, int year) throws ParseException; 
}
