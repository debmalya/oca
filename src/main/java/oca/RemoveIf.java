/**
 * 
 */
package oca;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author debmalyajash
 *
 */
public class RemoveIf {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		check(2);

	}
	
	/**
	 * First generate random numbers in range 0 and 1000.
	 * 
	 * @param n whose multiple if any will be removed.
	 */
	public static List<Integer> check(int n){
		List<Integer> randomIntCollection = new ArrayList<>();
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			randomIntCollection.add(random.nextInt(1000));
		}
		System.out.println("Original collection :" + randomIntCollection);
		randomIntCollection.removeIf(e -> e % n == 0);
		System.out.println("After removing multiple of " + n + " :" + randomIntCollection);
		return randomIntCollection;
	}

}
