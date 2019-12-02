package schedule.view;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import database.DBConnection;
import database.DBoperation;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class AreYouSureController {

	 @FXML
	 private void resetButton(ActionEvent event) throws SQLException, IOException {



	    
		    

		   DBConnection database = new DBConnection();

	        Connection connection = database.getConnection();

	         try {

	                          DBoperation.resetWeek(database, connection);

	               } catch (SQLException e) {

	            // TODO Auto-generated catch block

	                          e.printStackTrace();

	          
	               }

		  	  Parent person = FXMLLoader.load(getClass().getResource("CreateSchedule.fxml"));

		       Scene personScene = new Scene(person);

		       Stage personStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

		       personStage.hide();

		       personStage.setScene(personScene);

		       personStage.setTitle("Create Work Schedule");

		       personStage.show();
		        
	 }

	 @FXML
	 private void cancelButton(ActionEvent event) throws SQLException, IOException {
		  Parent person = FXMLLoader.load(getClass().getResource("CreateSchedule.fxml"));

	       Scene personScene = new Scene(person);

	       Stage personStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

	       personStage.hide();

	       personStage.setScene(personScene);

	       personStage.setTitle("Create Work Schedule");

	       personStage.show();
	 }
}
