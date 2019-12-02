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
import schedule.model.Sunday;
import schedule.model.Person;

public class AddSundayController {

	 @FXML 
     private TextField Employee6Field;

	    private Stage dialogStage;

       

        private boolean okClicked = false;

		private Sunday Sunday;
        public void setDialogStage(Stage dialogStage) {

            this.dialogStage = dialogStage;

        }           
        public void setMonday(Sunday temp) {

            this.Sunday = temp;
            Employee6Field.setText(Sunday.getEmployee6());
            
          
        }
            @FXML

            public void handleOk(ActionEvent event) throws SQLException, IOException {
            	
            	     System.out.println("testtesttest....");

            	     Sunday temp = new schedule.model.Sunday(null);
            	     
                     if (isInputValid()) {

                        temp.setEmployee6(Employee6Field.getText());

                

                     DBConnection database = new DBConnection();            

                    DBoperation.addSunday(database, temp);                          
              /*      Parent person = FXMLLoader.load(getClass().getResource("CreateSchedule.fxml"));

        	        Scene personScene = new Scene(person);

        	        Stage personStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        	        personStage.hide();

        	        personStage.setScene(personScene);

        	        personStage.setTitle("Add Sunday");

        	        personStage.show();*/
                 
                     }
                      
                    }
             
               

                   

                     private boolean isInputValid() {

             	        String errorMessage = "";

             	        if (Employee6Field.getText() == null || Employee6Field.getText().length() == 0) {

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