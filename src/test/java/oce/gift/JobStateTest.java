/**
 * 
 */
package oce.gift;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author debmalyajash
 *
 */
public class JobStateTest {

	@Test
	public final void test() {
		JobState state = JobState.EMPLOYED;
		Assert.assertEquals(state.name(),"EMPLOYED");
		
		state = JobState.SEARCHING_ACTIVE;
		Assert.assertEquals(state.name(),"SEARCHING_ACTIVE");
	}

}
