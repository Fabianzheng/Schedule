package schedule.view;

import java.io.IOException;
import java.sql.SQLException;

import database.DBConnection;
import database.DBoperation;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import schedule.model.Monday;
import schedule.model.Person;

public class AddMondayController {

	 @FXML 
     private TextField EmployeeField;

	    private Stage dialogStage;

       

        private boolean okClicked = false;

		private Monday Monday;
        public void setDialogStage(Stage dialogStage) {

            this.dialogStage = dialogStage;

        }           
        public void setMonday(Monday temp) {

            this.Monday = temp;
            EmployeeField.setText(Monday.getEmployee());
            
          
        }
            @FXML

            public void handleOk(ActionEvent event) throws SQLException, IOException {
            	
            	     System.out.println("testtesttest....");

            	     Monday temp = new schedule.model.Monday(null);
            	     
                     if (isInputValid()) {

                        temp.setEmployee(EmployeeField.getText());

                

                     DBConnection database = new DBConnection();            

                    DBoperation.addMonday(database, temp);                          
                    Parent person = FXMLLoader.load(getClass().getResource("CreateSchedule.fxml"));

        	        Scene personScene = new Scene(person);

        	        Stage personStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        	        personStage.hide();

        	        personStage.setScene(personScene);

        	        personStage.setTitle("Add Monday");

        	        personStage.show();
                 
                     }
                      
                    }
             
               

                   

                     private boolean isInputValid() {

             	        String errorMessage = "";

             	        if (EmployeeField.getText() == null || EmployeeField.getText().length() == 0) {

             	            errorMessage += "No valid Employee!\n"; 

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

