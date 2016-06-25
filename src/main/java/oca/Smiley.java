/**
 * 
 */
package oca;

import java.util.Random;

/**
 * @author debmalyajash
 *
 */
public class Smiley {
	
	public static final char SMILEY = '\u263A';

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(smile(new Random().nextInt(80)));
	}
	
	/**
	 * 
	 * @param n
	 * @return
	 */
	public static String smile(int n) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(SMILEY);
		}
		
		return sb.toString();
	}

}
