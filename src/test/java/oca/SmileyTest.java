/**
 * 
 */
package oca;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author debmalyajash
 *
 */
public class SmileyTest {

	/**
	 * Test method for {@link oca.Smiley#smile(int)}.
	 */
	@Test
	public final void testSmile() {
		
		String smile = Smiley.smile(80);
		Assert.assertNotNull(smile);
		Assert.assertTrue(smile.length() == 80);
		System.out.println(smile);
	}

}
