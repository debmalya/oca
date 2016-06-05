/**
 * 
 */
package oca;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

/**
 * @author debmalyajash
 *
 */
public class RemoveIfTest {

	/**
	 * Test method for {@link oca.RemoveIf#check(int)}.
	 */
	@Test
	public final void testCheck() {
		// Testing a list generation without any number divisible by 3
		List<Integer> notDivisibleBy3 = RemoveIf.check(3);
		
		for (int i : notDivisibleBy3) {
			assertTrue(i+" divisible by 3",i % 3 != 0);
		}
	}

}
