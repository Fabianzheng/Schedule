package schedule.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Saturday {

	private final StringProperty Employee5;
	public Saturday() {
        this(null);
    }

	 public Saturday(String Employee5)
	 {

		 this.Employee5 = new SimpleStringProperty(Employee5);
	 }
	


	    public String getEmployee5() {

	        return Employee5.get();

	    }

	 

	    public void setEmployee5(String Employee5) {

	        this.Employee5.set(Employee5);

	    }

	    

	    public StringProperty Employee5Property() {

	        return Employee5;

	    }

}