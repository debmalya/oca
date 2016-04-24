/**
 * 
 */
package oce.gift;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/**
 * @author debmalyajash
 *
 */
public class JobStateMap {

//	private EnumMap<JobState, String> jobStateMap = new EnumMap<>(
//			JobState.class);

	private EnumMap<JobState, Map<String, Float>> jobEmployeeMap = new EnumMap<>(
			JobState.class);

	public static void main(String[] args) {

	}

	/**
	 * 
	 * @param companyName
	 * @param yearsOfExperience
	 */
	public void addExperience(final String companyName,
			final float yearsOfExperience) {
		Map<String, Float> value = jobEmployeeMap.get(JobState.EMPLOYED);
		if (value == null) {
			value = new HashMap<>();
		}
		value.put(companyName, yearsOfExperience);
		jobEmployeeMap.put(JobState.EMPLOYED, value);
	}
	
	/**
	 * 
	 * @param companyName
	 * @return
	 */
	public float getExperience(final String companyName) {
		
		Map<String, Float> expMap = jobEmployeeMap.get(JobState.EMPLOYED);
		Float exp = expMap.get(companyName);
		if (exp == null){
			return 0.00f;
		}
		return exp;
		
	}
}
