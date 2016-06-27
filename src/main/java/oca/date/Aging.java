/**
 * 
 */
package oca.date;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 * @author debmalyajash
 *
 */
public class Aging {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Birth year :");
			int year = scanner.nextInt();
			System.out.println("Birth month :");
			int month = scanner.nextInt();
			System.out.println("Birth day of month:");
			int dayOfMonth = scanner.nextInt();
			calculateAge(year, month, dayOfMonth);
		}

	}

	public static void calculateAge(int year, int month, int dayOfMonth) {
		try {
			LocalDate birthDate = LocalDate.of(year, month, dayOfMonth);
			Period p = Period.between(birthDate, LocalDate.now());
			System.out.println("Age :" + p.getYears() + " years "
					+ p.getMonths() + " months " + p.getDays() + " days");
		} catch (Throwable th) {
			System.err.println(th.getMessage());
		}
	}

}
