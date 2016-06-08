/**
 * 
 */
package oca;

import java.util.Scanner;

/**
 * @author debmalyajash
 *
 */
public class FlippingBits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int t = scanner.nextInt();
			long[] r = new long[t];
			long b = 0b11111111111111111111111111111111;
			for (int i = 0; i < t; i++) {
				r[i] = 0L;
				long l = scanner.nextLong();
				r[i] = l;			
				r[i] ^= b;
				r[i] >>>= 32;
				r[i] ^= l;
			}

			for (int i = 0; i < t; i++) {
				System.out.println(r[i]);
			}
		}

	}

}
// 1111111111111111111111111111111
