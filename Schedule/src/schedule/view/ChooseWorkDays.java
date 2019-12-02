package schedule.view;

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
import schedule.model.ChooseWork;

public class ChooseWorkDays extends Login1Controller implements Initializable {

	public void oKClicked(ActionEvent event) throws IOException { 

		  Parent person = FXMLLoader.load(getClass().getResource("Workoverview.fxml"));

       Scene personScene = new Scene(person);

       Stage personStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

       personStage.hide();

       personStage.setScene(personScene);

       personStage.setTitle("Person Overview");

       personStage.show();

  }
/*	
 * 
 *  
 *  
 *@FXML

    private DatePicker dateField; 
 
	 public void dateGet(ActionEvent event)
	 {
		 LocalDate date1 = dateField.getValue();
		 System.out.println(date1);
		  String strDateFormat = "E";
		     SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
		     
		     System.out.println("Current day of week in E format : " + sdf.format(2019-11-12));
		     
		     //formatting day of week in EEEE format like Sunday, Monday etc.
		     strDateFormat = "EEEE";
		     sdf = new SimpleDateFormat(strDateFormat);
		     System.out.println("Current day of week in EEEE format : " + sdf.format(2019-11-12));
	     
	 }
*/
	 private DBConnection database = new DBConnection();
	    private Connection connection;
	    private Statement statement;
	    private ResultSet resultSet;
	 @FXML 
     private TextField nameField;

	 @FXML 
		Label firstNameLabel;
      
        
           @FXML

           private ComboBox<String> monday ;
           
           @FXML

           private ComboBox<String> tuesday ;
           
           @FXML

           private ComboBox<String> wednesday ;
           
           @FXML

           private ComboBox<String> thursday;
         
           @FXML

           private ComboBox<String> friday ;
         
           @FXML

           private ComboBox<String> saturday ;
         
           @FXML

           private ComboBox<String> sunday ;
         
           private Stage dialogStage;
           public void setDialogStage(Stage dialogStage) {

               this.dialogStage = dialogStage;

           }         
           
    @Override
           public void initialize(URL location, ResourceBundle resources) {
        	   
        	   ObservableList<String> list = FXCollections.observableArrayList("Yes","No"); 

        	   monday.setItems(list);
        	   
        	   ObservableList<String> list1 = FXCollections.observableArrayList("Yes","No"); 

        	   tuesday.setItems(list1);
        	   
        	   
        	   ObservableList<String> list2 = FXCollections.observableArrayList("Yes","No"); 

        	   wednesday.setItems(list2);
        	   
        	   ObservableList<String> list3 = FXCollections.observableArrayList("Yes","No"); 

        	   thursday.setItems(list3);
        	   
        	   ObservableList<String> list4 = FXCollections.observableArrayList("Yes","No"); 

        	   friday.setItems(list4);
        	   
        	   
        	   ObservableList<String> list5 = FXCollections.observableArrayList("Yes","No"); 

        	   saturday.setItems(list5);
        	   
        	   
        	   ObservableList<String> list6 = FXCollections.observableArrayList("Yes","No"); 

        	   sunday.setItems(list6);
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

           	     ChooseWork temp = new schedule.model.ChooseWork(null, null, null, null, null, null,null, null);
           	     
                    if (isInputValid()) {

                       temp.setName(nameField.getText());

                       temp.setMonday(monday.getValue());

                       temp.setTuesday(tuesday.getValue());

                       temp.setWednesday(wednesday.getValue());
                       temp.setThursday(thursday.getValue());   
                      
                      temp.setFriday(friday.getValue());  
                      temp.setSaturday(saturday.getValue());  
                      temp.setSunday(sunday.getValue());  
                    
                      
                   System.out.print(monday);

                    DBConnection database = new DBConnection();            

                   DBoperation.workAddPerson(database, temp);                          

                
                   Parent person = FXMLLoader.load(getClass().getResource("Workoverview.fxml"));

       	        Scene personScene = new Scene(person);

       	        Stage personStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

       	        personStage.hide();

       	        personStage.setScene(personScene);

       	        personStage.setTitle("Choose Work Day");

       	        personStage.show();
                   
                   
                   //     dialogStage.close();
                       
                    }

                   

                    
           }

           private boolean isInputValid() {

   	        String errorMessage = "";

   	      

   	        if (monday.getValue() == null || monday.getValue().length() == 0) {

   	            errorMessage += "No valid password!\n"; 

   	        }

   	        if (tuesday.getValue() == null || tuesday.getValue().length() == 0) {

   	            errorMessage += "No valid first name!\n"; 

   	        }

   	        if (wednesday.getValue() == null || wednesday.getValue().length() == 0) {

   	            errorMessage += "No valid last name!\n"; 

   	        }
   	        if (thursday.getValue() == null || thursday.getValue().length() == 0) {

   	            errorMessage += "No valid phone number!\n"; 
   	           if (saturday.getValue() == null || saturday.getValue().length() == 0) {

   		            errorMessage += "No valid email name!\n"; 

   		        }
   	     

   	        }

   	        if (sunday.getValue() == null || sunday.getValue().length() == 0) {

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

   	    public void cancel(ActionEvent event) throws IOException { 

   	 			// TODO Autogenerated
   	 			
   	 			
   		  	  Parent person = FXMLLoader.load(getClass().getResource("Workoverview.fxml"));

   		       Scene personScene = new Scene(person);

   		       Stage personStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

   		       personStage.hide();

   		       personStage.setScene(personScene);

   		       personStage.setTitle("Work Overview");

   		       personStage.show();
   		        

   		    }

}
