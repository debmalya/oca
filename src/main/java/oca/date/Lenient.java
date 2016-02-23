/**
 * 
 */
package oca.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author debmalyajash
 *
 */
public class Lenient {

	/**
	 * To show the effect of setLenient true by default.
	 * and the effect of setLenient false.
	 * @param args
	 */
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date date1 = sdf.parse("28/02/2016");
			System.out.println(date1);
		} catch (ParseException e) {
			System.err.println("1. " + e.getMessage());
		}
		
		try {
			Date date1 = sdf.parse("31/02/2016");
			System.out.println(date1);
		} catch (ParseException e) {
			System.err.println("2. " + e.getMessage());
		}
		
		try {
			sdf.setLenient(false);
			Date date1 = sdf.parse("31/02/2016");			
			System.out.println(date1);
		} catch (ParseException e) {
			System.err.println("3. " + e.getMessage());
		}

	}

}
