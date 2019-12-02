package schedule.model;

import javafx.beans.property.DoubleProperty;

import javafx.beans.property.IntegerProperty;

import javafx.beans.property.ObjectProperty;

import javafx.beans.property.SimpleDoubleProperty;

import javafx.beans.property.SimpleIntegerProperty;

import javafx.beans.property.SimpleObjectProperty;

import javafx.beans.property.SimpleStringProperty;

import javafx.beans.property.StringProperty;

 

/**

 * Model class for a Person.

 *

 */

public class Person {

	
	private final StringProperty Username;

	  private final StringProperty dbAdminPassword;

	private final StringProperty firstName;

  private final StringProperty lastName;

   

    private final StringProperty address;

    private final IntegerProperty phoneNumber;
    private final StringProperty email;

   


 

    /**

     * Default constructor.

     */
    public Person() {
        this(null, null, null, null, null, null, "0");
    }
    

    public Person(String Username,String dbAdminPassword, String firstName, String lastName, String address, String email, String phoneNumber) {

      

        
		
		this.Username = new SimpleStringProperty(Username);
		this.dbAdminPassword = new SimpleStringProperty(dbAdminPassword);
		this.firstName = new SimpleStringProperty(firstName);
		this.lastName = new SimpleStringProperty(lastName);
		  this.address = new SimpleStringProperty(address);
		  
		this.email = new SimpleStringProperty(email);
		
		 this.phoneNumber = new SimpleIntegerProperty(Integer.valueOf(phoneNumber));

       


    }

    
    
    

    public String getUsername() {

        return Username.get();

    }

 

    public void setUsername(String Username) {

        this.Username.set(Username);

    }

    

    public StringProperty UsernameProperty() {

        return Username;

    }

 

    public String getdbAdminPassword() {

        return dbAdminPassword.get();

    }

 

    public void setdbAdminPassword(String dbAdminPassword) {

        this.dbAdminPassword.set(dbAdminPassword);

    }

    

    public StringProperty dbAdminPasswordProperty() {

        return dbAdminPassword;

    }


    
    
    
    
    
    

    public String getFirstName() {

        return firstName.get();

    }

 

    public void setFirstName(String firstName) {

        this.firstName.set(firstName);

    }

    

    public StringProperty firstNameProperty() {

        return firstName;

    }

 

    public String getLastName() {

        return lastName.get();

    }

 

    public void setLastName(String lastName) {

        this.lastName.set(lastName);

    }

    

    public StringProperty lastNameProperty() {

        return lastName;

    }
    
    
    
    
    public String getEmail() {

        return email.get();

    }

 

    public void setEmail(String email) {

        this.email.set(email);

    }

    

    public StringProperty emailProperty() {

        return email;

    }
 

    public String getAddress() {

        return address.get();

    }

 

    public void setAddress(String address) {

        this.address.set(address);

    }

    

    public StringProperty addressProperty() {

        return address;

    }

      

 

    public int getPhoneNumber() {

        return phoneNumber.get();

    }

 

    public void setPhoneNumber(int phoneNumber) {

        this.phoneNumber.set(phoneNumber);

    }

    

    public IntegerProperty phoneNumberProperty() {

        return phoneNumber;

    }


}


	
	

 


    

  
