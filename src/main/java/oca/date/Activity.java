/**
 * 
 */
package oca.date;

import java.time.LocalDateTime;

/**
 * @author debmalyajash
 *
 */
public class Activity {
	/**
	 * Local date time of the activity. When the activity is started.
	 */
	private LocalDateTime activityStartDateTime = LocalDateTime.now();

	/**
	 * Activity end local date time.
	 */
	private LocalDateTime activityEndDateTime;

	/**
	 * Activity description.
	 */
	private String activityDescription;

	/**
	 * Remarks about activity.
	 */
	private String remarks;

	/**
	 * Whether activity is successful or not.
	 */
	private boolean success;

	/**
	 * @return the activityStartDateTime
	 */
	public LocalDateTime getActivityStartDateTime() {
		return activityStartDateTime;
	}

	/**
	 * @param activityStartDateTime the activityStartDateTime to set
	 */
	public void setActivityStartDateTime(LocalDateTime activityStartDateTime) {
		this.activityStartDateTime = activityStartDateTime;
	}

	/**
	 * @return the activityEndDateTime
	 */
	public LocalDateTime getActivityEndDateTime() {
		return activityEndDateTime;
	}

	/**
	 * @param activityEndDateTime the activityEndDateTime to set
	 */
	public void setActivityEndDateTime(LocalDateTime activityEndDateTime) {
		this.activityEndDateTime = activityEndDateTime;
	}

	/**
	 * @return the activityDescription
	 */
	public String getActivityDescription() {
		return activityDescription;
	}

	/**
	 * @param activityDescription the activityDescription to set
	 */
	public void setActivityDescription(String activityDescription) {
		this.activityDescription = activityDescription;
	}

	/**
	 * @return the remarks
	 */
	public String getRemarks() {
		return remarks;
	}

	/**
	 * @param remarks the remarks to set
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	/**
	 * @return the success
	 */
	public boolean isSuccess() {
		return success;
	}

	/**
	 * @param success the success to set
	 */
	public void setSuccess(boolean success) {
		this.success = success;
	}

	public Activity(LocalDateTime activityStartDateTime,
			LocalDateTime activityEndDateTime, String activityDescription,
			String remarks, boolean success) {
		super();
		this.activityStartDateTime = activityStartDateTime;
		this.activityEndDateTime = activityEndDateTime;
		this.activityDescription = activityDescription;
		this.remarks = remarks;
		this.success = success;
	}

	public Activity() {
		super();
		// TODO Auto-generated constructor stub
	}

}
