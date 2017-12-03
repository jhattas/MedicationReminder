package application;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 * when user adds a medication, instance of this class will be created
 * to store the info
 */

public class TodayMedication {
	
	private SimpleStringProperty name  = new SimpleStringProperty("");
	private SimpleStringProperty time = new SimpleStringProperty("");
	private SimpleStringProperty status = new SimpleStringProperty("");

	public TodayMedication() {
		this(new Medication(), "");
	}
	
	public TodayMedication(Medication medication, String status) {
		setName(medication.getName());
		setTime(medication.getTime());
		setStatus(status);
	}
	
	// name of medication, string, "Advil"
	public String getName() {
		return name.get();
	}
	public void setName(String name) {
		this.name.set(name);
	}
	
	// time of day to take med, type TBD, "14:30"
	public String getTime() {
		return time.get();
	}
	public void setTime(String time) {
		this.time.set(time);
	}
	
	// dose of med to be taken at time, String, ex. 4
	public String getStatus() {
		return status.get();
	}
	public void setStatus(String status) {
		this.status.set(status);
	}
	
	
}