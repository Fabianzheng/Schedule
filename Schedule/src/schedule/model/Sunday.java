package schedule.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Sunday {

	private final StringProperty Employee6;
	public Sunday() {
        this(null);
    }

	 public Sunday(String Employee6)
	 {

		 this.Employee6 = new SimpleStringProperty(Employee6);
	 }
	


	    public String getEmployee6() {

	        return Employee6.get();

	    }

	 

	    public void setEmployee6(String Employee6) {

	        this.Employee6.set(Employee6);

	    }

	    

	    public StringProperty Employee6Property() {

	        return Employee6;

	    }

}