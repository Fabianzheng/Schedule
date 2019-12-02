package schedule.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Monday {

	private final StringProperty Employee;
	public Monday() {
        this(null);
    }

	 public Monday(String Employee)
	 {

		 this.Employee = new SimpleStringProperty(Employee);
	 }
	


	    public String getEmployee() {

	        return Employee.get();

	    }

	 

	    public void setEmployee(String Employee) {

	        this.Employee.set(Employee);

	    }

	    

	    public StringProperty EmployeeProperty() {

	        return Employee;

	    }

}
