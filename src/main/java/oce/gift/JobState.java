/**
 * 
 */
package oce.gift;

/**
 * @author debmalyajash
 *
 */
public enum JobState {
	UNEMPLOYED("unemployed"),
	
	SEARCHING_PASSIVE("searching_passive"),
	
	SEARCHING_ACTIVE("searching_active"),
	
	EMPLOYED("employed");
	
	private final String jobState;
	
	private JobState(final String state) {
		jobState = state;
	}
}
