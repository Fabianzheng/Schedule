package schedule.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Wednesday {

	private final StringProperty Employee2;
	public Wednesday() {
        this(null);
    }

	 public Wednesday(String Employee2)
	 {

		 this.Employee2 = new SimpleStringProperty(Employee2);
	 }
	


	    public String getEmployee2() {

	        return Employee2.get();

	    }

	 

	    public void setEmployee2(String Employee2) {

	        this.Employee2.set(Employee2);

	    }

	    

	    public StringProperty Employee2Property() {

	        return Employee2;

	    }

}