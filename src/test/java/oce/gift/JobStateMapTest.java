/**
 * 
 */
package oce.gift;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author debmalyajash
 *
 */
public class JobStateMapTest {

	/**
	 * Test method for {@link oce.gift.JobStateMap#addExperience(java.lang.String, float)}.
	 */
	@Test
	public final void testAddExperience() {
		JobStateMap jsm = new JobStateMap();
		jsm.addExperience("Avita Software Private Limited", 6.5f);
		
		float actual = jsm.getExperience("Avita Software Private Limited");
		Assert.assertEquals(6.5f, actual, 0.00f);
		
		actual = jsm.getExperience("Avita Software Private");
		Assert.assertEquals(0.00f, actual, 0.00f);
		
		actual = jsm.getExperience("Google");
		Assert.assertEquals(0.00f, actual, 0.00f);
		
		actual = jsm.getExperience("IBM");
		Assert.assertEquals(0.00f, actual, 0.00f);
	}

}
