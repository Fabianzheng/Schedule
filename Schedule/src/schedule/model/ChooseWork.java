package schedule.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class ChooseWork {

		
		private final StringProperty name;

		  private final StringProperty monday;

		private final StringProperty tuesday;

	  private final StringProperty wednesday;

	   

	    private final StringProperty thursday;

	    private final StringProperty friday;
	    private final StringProperty saturday;

	    private final StringProperty sunday;


	 

	    /**

	     * Default constructor.

	     */
	    public ChooseWork() {
	        this(null, null, null, null, null, null, null, null);
	    }
	    

	    public ChooseWork(String name,String monday, String tuesday, String wednesday, String thursday, String friday, String saturday  , String sunday) {

	      

	        
			
			this.name = new SimpleStringProperty(name);
			this.monday = new SimpleStringProperty(monday);
			this.tuesday = new SimpleStringProperty(tuesday);
			this.wednesday = new SimpleStringProperty(wednesday);
			  this.thursday = new SimpleStringProperty(thursday);
			  
			this.friday = new SimpleStringProperty(friday);
			this.saturday = new SimpleStringProperty(saturday);
	       
			this.sunday = new SimpleStringProperty(sunday);

	    }

	    
	    
	    

	    public String getName() {

	        return name.get();

	    }

	 

	    public void setName(String Name) {

	        this.name.set(Name);

	    }

	    

	    public StringProperty nameProperty() {

	        return name;

	    }

	 

	    public String getMonday() {

	        return monday.get();

	    }

	 

	    public void setMonday(String monday) {

	        this.monday.set(monday);

	    }

	    

	    public StringProperty mondayProperty() {

	        return monday;

	    }


	    
	    
	    
	    
	    
	    

	    public String getTuesday() {

	        return tuesday.get();

	    }

	 

	    public void setTuesday(String tuesday) {

	        this.tuesday.set(tuesday);

	    }

	    

	    public StringProperty tuesdayProperty() {

	        return tuesday;

	    }

	 

	    public String getWednesday() {

	        return wednesday.get();

	    }

	 
	    public void setWednesday(String wednesday) {

	        this.wednesday.set(wednesday);

	    }

	    

	    public StringProperty wednesdayProperty() {

	        return wednesday;

	    }

	    public String getThursday() {

	        return thursday.get();

	    }
	    public void setThursday(String thursday) {

	        this.thursday.set(thursday);

	    }

	    

	    public StringProperty thursdayProperty() {

	        return thursday;

	    }
	    
	    
	    
	    
	    public String getFriday() {

	        return friday.get();

	    }

	 

	    public void setFriday(String friday) {

	        this.friday.set(friday);

	    }

	    

	    public StringProperty fridayProperty() {

	        return friday;

	    }
	 

	    public String getSaturday() {

	        return saturday.get();

	    }

	 

	    public void setSaturday(String saturday) {

	        this.saturday.set(saturday);

	    }

	    

	    public StringProperty saturdayProperty() {

	        return saturday;


	    }

	 
	        public String getSunday() {

		        return sunday.get();

		    }

		 

		    public void setSunday(String sunday) {

		        this.sunday.set(sunday);

		    }

		    

		    public StringProperty sundayProperty() {

		        return sunday;

	}

}
