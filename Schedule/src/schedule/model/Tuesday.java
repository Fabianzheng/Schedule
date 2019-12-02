package schedule.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Tuesday {

	private final StringProperty Employee1;
	public Tuesday() {
        this(null);
    }

	 public Tuesday(String Employee1)
	 {

		 this.Employee1 = new SimpleStringProperty(Employee1);
	 }
	


	    public String getEmployee1() {

	        return Employee1.get();

	    }

	 

	    public void setEmployee1(String Employee1) {

	        this.Employee1.set(Employee1);

	    }

	    

	    public StringProperty Employee1Property() {

	        return Employee1;

	    }

}