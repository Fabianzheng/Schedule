package schedule.view;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;

import javafx.scene.control.Alert.AlertType;

import javafx.scene.control.TextField;

import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;

import java.sql.SQLException;

import schedule.model.Person;

import database.DBConnection;

import database.DBoperation;

import javafx.event.ActionEvent;

public class UpdateController {

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
                 * @throws IOException 

                 */

        

               

            // Event Listener on Button.onAction

            @FXML

            public void handleOk(ActionEvent event) throws SQLException, IOException {

            	  Person temp = new schedule.model.Person(null, null, null, null, null, null, "0");         
            	if (isInputValid()) {


                        temp.setAddress(addressField.getText());

                        temp.setEmail(emailField.getText());

                        temp.setPhoneNumber(Integer.parseInt(phoneNumberField.getText()));

                     
                        DBConnection database = new DBConnection();            

                        DBoperation.addressBookUpdate(database, temp);                          

                        Parent person = FXMLLoader.load(getClass().getResource("ManageAccount.fxml"));

                        Scene personScene = new Scene(person);

                        Stage personStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

                        personStage.hide();

                        personStage.setScene(personScene);

                        personStage.setTitle("Person Overview");

                        personStage.show();  

                    }

            }

            // Event Listener on Button.onAction

            @FXML

            public void handleCancel(ActionEvent event) throws IOException {

            	  Parent person = FXMLLoader.load(getClass().getResource("ManageAccount.fxml"));

                  Scene personScene = new Scene(person);

                  Stage personStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

                  personStage.hide();

                  personStage.setScene(personScene);

                  personStage.setTitle("manage account");

                  personStage.show();   
            }                       

  /**

     * Validates the user input in the text fields.

     * 

     * @return true if the input is valid

     */

    private boolean isInputValid() {

        String errorMessage = "";



        if (addressField.getText() == null || addressField.getText().length() == 0) {

            errorMessage += "No valid last name!\n"; 

        }

        if (emailField.getText() == null || emailField.getText().length() == 0) {

            errorMessage += "No valid street!\n"; 

        }

        if (phoneNumberField.getText() == null || phoneNumberField.getText().length() == 0) {

            errorMessage += "No valid postal code!\n"; 

        } else {

            // try to parse the postal code into an int.

            try {

                Integer.parseInt(phoneNumberField.getText());

            } catch (NumberFormatException e) {

                errorMessage += "No valid postal code (must be an integer)!\n"; 

            }

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

    }       }
