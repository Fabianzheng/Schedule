package schedule.view;

import java.awt.TextArea;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ResourceBundle;

import database.DBConnection;
import database.DBoperation;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;
import schedule.model.DayOff;

public class RequestDayOff extends Login1Controller implements Initializable {
	

	 private DBConnection database = new DBConnection();
	    private Connection connection;
	    private Statement statement;
	    private ResultSet resultSet;
	    @FXML 
		Label firstNameLabel;
	  
		 public void oKClicked(ActionEvent event) throws IOException { 

			  Parent person = FXMLLoader.load(getClass().getResource("Workoverview.fxml"));

	         Scene personScene = new Scene(person);

	         Stage personStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

	         personStage.hide();

	         personStage.setScene(personScene);

	         personStage.setTitle("Person Overview");

	         personStage.show();

	    }
		 
		  @FXML

		  private TextField firstName ;
		  @FXML

		  private TextField reason ;
		  @FXML

  private ComboBox<String> dayOff ;
          

          private Stage dialogStage;
          public void setDialogStage(Stage dialogStage) {

              this.dialogStage = dialogStage;

          }         
		 @Override
  public void initialize(URL location, ResourceBundle resources) {
	  ObservableList<String> list = FXCollections.observableArrayList("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"); 

	   dayOff.setItems(list);

	   try {
	    	 connection = database.getConnection();
	            statement = connection.createStatement();
	    	 Statement statement = connection.createStatement();
			String str = "select Username from admin where Username = '"+userName+"';";
        
	        ResultSet resultSet = statement.executeQuery(str);
	        resultSet.next();
	        resultSet.getString("Username");
	      firstNameLabel.setText( resultSet.getString("Username"));
	        connection.close();
            statement.close();
            resultSet.close();
	     } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	     }
	         
		 }

  
  @FXML

  public void handleOk(ActionEvent event) throws SQLException, IOException {
  	
  	     System.out.println("testtesttest....");

  	     DayOff temp = new schedule.model.DayOff(null, null, null);
  	     
  	    if (isInputValid()) {

             

              temp.setDaysOff(dayOff.getValue());
              
              temp.setreason(reason.getText());
              
              DBConnection database = new DBConnection();            

              DBoperation.RequestOff(database, temp);   
  
}
  }

  private boolean isInputValid() {

	        String errorMessage = "";

	      

	        if (dayOff.getValue() == null || dayOff.getValue().length() == 0) {

	            errorMessage += "No valid password!\n"; 

	        }

	        if (reason.getText() == null || reason.getText().length() == 0) {

	            errorMessage += "No valid first name!\n"; 

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