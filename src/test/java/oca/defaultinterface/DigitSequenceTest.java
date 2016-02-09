/**
 * 
 */
package oca.defaultinterface;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author debmalyajash
 *
 */
public class DigitSequenceTest {

	/**
	 * Test method for {@link oca.defaultinterface.DigitSequence#hasNext()}.
	 */
	@Test
	public final void testHasNext() {
		DigitSequence di = new DigitSequence(Integer.MAX_VALUE);
		while (di.hasNext()) {
			int n = di.next();
			Assert.assertTrue(n > 0);
		}
		
		Assert.assertFalse(di.hasNext());
	}

	/**
	 * Test method for {@link oca.defaultinterface.DigitSequence#next()}.
	 */
	@Test
	public final void testNext() {
		DigitSequence di = new DigitSequence(100);
		
		int actual = di.next();
		Assert.assertEquals(0,actual);
		
		actual = di.next();
		Assert.assertEquals(0,actual);
		
		actual = di.next();
		Assert.assertEquals(1,actual);
		
		Assert.assertFalse(di.hasNext());
	}

}
