package schedule.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Friday {

	private final StringProperty Employee4;
	public Friday() {
        this(null);
    }

	 public Friday(String Employee4)
	 {

		 this.Employee4 = new SimpleStringProperty(Employee4);
	 }
	


	    public String getEmployee4() {

	        return Employee4.get();

	    }

	 

	    public void setEmployee4(String Employee4) {

	        this.Employee4.set(Employee4);

	    }

	    

	    public StringProperty Employee4Property() {

	        return Employee4;

	    }

}