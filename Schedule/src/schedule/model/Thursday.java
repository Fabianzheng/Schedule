package schedule.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Thursday {

	private final StringProperty Employee3;
	public Thursday() {
        this(null);
    }

	 public Thursday(String Employee3)
	 {

		 this.Employee3 = new SimpleStringProperty(Employee3);
	 }
	


	    public String getEmployee3() {

	        return Employee3.get();

	    }

	 

	    public void setEmployee3(String Employee3) {

	        this.Employee3.set(Employee3);

	    }

	    

	    public StringProperty Employee3Property() {

	        return Employee3;

	    }

}