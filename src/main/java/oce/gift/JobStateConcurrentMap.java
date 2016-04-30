/**
 * 
 */
package oce.gift;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


/**
 * @author debmalyajash
 *
 */
public class JobStateConcurrentMap {

//	private EnumMap<JobState, String> jobStateMap = new EnumMap<>(
//			JobState.class);

	private EnumMap<JobState, ConcurrentHashMap<String, Float>> jobEmployeeMap = new EnumMap<>(
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
		ConcurrentHashMap<String, Float> value = jobEmployeeMap.get(JobState.EMPLOYED);
		if (value == null) {
			value = new ConcurrentHashMap<>();
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
