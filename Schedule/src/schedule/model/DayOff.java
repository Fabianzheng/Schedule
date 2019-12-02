package schedule.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class DayOff {
	private final StringProperty firstName;

	  private final StringProperty DaysOff;

	private final StringProperty reason;

	  public DayOff() {
	        this(null, null, null);
	        
	    }
	   public DayOff(String firstName,String DaysOff, String reason) {

		      

	        
			
				this.firstName = new SimpleStringProperty(firstName);
				this.DaysOff = new SimpleStringProperty(DaysOff);
				this.reason = new SimpleStringProperty(reason);
			
		    }

	    public String getfirstName() {

	        return firstName.get();

	    }

	 

	    public void setfirstName(String firstName) {

	        this.firstName.set(firstName);

	    }

	    

	    public StringProperty firstNameProperty() {

	        return firstName;

	    }

	 

	    public String getDaysOff() {

	        return DaysOff.get();

	    }

	 

	    public void setDaysOff(String daysoff) {

	        this.DaysOff.set(daysoff);

	    }

	    

	    public StringProperty DaysOffProperty() {

	        return DaysOff;

	    }


	    
	    
	    
	    
	    
	    

	    public String getreason() {

	        return reason.get();

	    }

	 

	    public void setreason(String reason) {

	        this.reason.set(reason);

	    }

	    

	    public StringProperty reasonProperty() {

	        return reason;

	    }

}
