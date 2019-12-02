package schedule.view;

import schedule.model.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;

	import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

	import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;

	import java.sql.SQLException;
import java.sql.Statement;

import schedule.model.Person;

	import database.DBConnection;

	import database.DBoperation;

	import javafx.event.ActionEvent;

	public class RegisterController {

		 @FXML 
          private TextField UsernameField;

         @FXML

         private PasswordField dbAdminPasswordField;
		     @FXML

	            private TextField firstNameField;

	            @FXML

	            private TextField lastNameField;

	            @FXML

	            private TextField addressField;

	            @FXML

	            private TextField phoneNumberField;

	            @FXML

	            private TextField emailField;      

	             private Stage dialogStage;

	             private Person person;

	             private boolean okClicked = false;

	             

	             /**

	                 * Sets the stage of this dialog.

	                 * 

	                 * @param dialogStage

	                 */

	                public void setDialogStage(Stage dialogStage) {

	                    this.dialogStage = dialogStage;

	                }           

	                /**

	                 * Sets the person to be edited in the dialog.

	                 * 

	                 * @param person

	                 */

	                public void setPerson(Person person) {

	                    this.person = person;
	                    UsernameField.setText(person.getUsername());
	                    dbAdminPasswordField.setText(person.getdbAdminPassword());
	                    firstNameField.setText(person.getFirstName());

	                    lastNameField.setText(person.getLastName());

	                    addressField.setText(person.getAddress());

	                   // phoneNumberField.setText(Integer.toString(person.getPhoneNumber()));

	                    emailField.setText(person.getEmail());

	                }

	            // Event Listener on Button.onAction

	            @FXML

	            public void handleOk(ActionEvent event) throws SQLException, IOException {
	            	
	            	     System.out.println("testtesttest....");

	            	     Person temp = new schedule.model.Person(null, null, null, null, null, null, "0");
	            	     
	                     if (isInputValid()) {

	                        temp.setUsername(UsernameField.getText());

	                        temp.setdbAdminPassword(dbAdminPasswordField.getText());

	                        temp.setFirstName(firstNameField.getText());

	                        temp.setLastName(lastNameField.getText());
	                        temp.setAddress(addressField.getText());   
	                       
	                       temp.setEmail(emailField.getText());  
	                       
	                      temp.setPhoneNumber(Integer.parseInt(phoneNumberField.getText()));
	                       
	                        System.out.print(temp.getPhoneNumber());

	                     DBConnection database = new DBConnection();            

	                    DBoperation.scheduleAddRecordPerson(database, temp);                          

	                 
	                    Parent person = FXMLLoader.load(getClass().getResource("Login1.fxml"));

	        	        Scene personScene = new Scene(person);

	        	        Stage personStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

	        	        personStage.hide();

	        	        personStage.setScene(personScene);

	        	        personStage.setTitle("Register");

	        	        personStage.show();
	                    
	                    
	                    //     dialogStage.close();
	                        
	                     }

	                    

	            }

	            // Event Listener on Button.onAction

	            @FXML

	            public void handleCancel(ActionEvent event) {

	                          dialogStage.close();

	            }                       

	  /**
 
	     * Validates the user input in the text fields.

	     * 

	     * @return true if the input is valid

	     */

	    private boolean isInputValid() {

	        String errorMessage = "";

	        if (UsernameField.getText() == null || UsernameField.getText().length() == 0) {

	            errorMessage += "No valid user name!\n"; 

	        }

	        if (dbAdminPasswordField.getText() == null || dbAdminPasswordField.getText().length() == 0) {

	            errorMessage += "No valid password!\n"; 

	        }

	        if (firstNameField.getText() == null || firstNameField.getText().length() == 0) {

	            errorMessage += "No valid first name!\n"; 

	        }

	        if (lastNameField.getText() == null || lastNameField.getText().length() == 0) {

	            errorMessage += "No valid last name!\n"; 

	        }
	        if (phoneNumberField.getText() == null || phoneNumberField.getText().length() == 0) {

	            errorMessage += "No valid phone number!\n"; 
	           if (emailField.getText() == null || emailField.getText().length() == 0) {

		            errorMessage += "No valid email name!\n"; 

		        }
	        } else {

	            // try to parse the postal code into an int.

	            try {

	                Integer.parseInt(phoneNumberField.getText());

	            } catch (NumberFormatException e) {

	                errorMessage += "No valid phone number (must be an integer)!\n"; 

	            }

	        }

	        if (addressField.getText() == null || addressField.getText().length() == 0) {

	            errorMessage += "No valid address!\n"; 

	        }

	        if (errorMessage.length() == 0) {

	            return true;

	        } else {

	            // Show the error message.

	            Alert alert = new Alert(AlertType.ERROR);

	            alert.initOwner(dialogStage);

	            alert.setTitle("Invalid Fields");

	            alert.setHeaderText("Please correct invalid fields");

	            alert.setContentText(errorMessage);            

	            alert.showAndWait();            

	            return false;

	        }

	    
	    
	    
	    }    
	    
	 
	    
	 	}

	    

	
	


