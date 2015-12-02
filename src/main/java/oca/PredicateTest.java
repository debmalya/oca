/**
 * 
 */
package oca;

import java.util.function.Predicate;

/**
 * @author debmalyajash
 *
 */
public class PredicateTest {
	
	private static int i = 0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		while (i < 51) {
			System.out.println(i+" even ?" + test((i) -> { return i % 2 == 0; }));
			
			i++;
		}

	}
	
	public static boolean test(Predicate<Integer> t) {
		return t.test(i);
	}

}
