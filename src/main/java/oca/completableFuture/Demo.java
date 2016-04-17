/**
 * 
 */
package oca.completableFuture;

import java.util.concurrent.CompletableFuture;

/**
 * @author debmalyajash
 *
 */
public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CompletableFuture<String> cf = CompletableFuture
				.completedFuture("I'm done,Raju!");
		cf.isDone(); // return true
		cf.join(); // return "I'm done"

	}

}
