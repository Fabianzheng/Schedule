package schedule.view;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;
import schedule.model.Friday;
import schedule.model.Monday;
import schedule.model.Saturday;
import schedule.model.Sunday;
import schedule.model.Thursday;
import schedule.model.Tuesday;
import schedule.model.Wednesday;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

import database.DBConnection;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

public class ManagerPageController implements Initializable {

	// Event Listener on Button.onAction
	@FXML
	 public void signOutButtonClicked(ActionEvent event) throws IOException { 

		  Parent person = FXMLLoader.load(getClass().getResource("Login1.fxml"));

      Scene personScene = new Scene(person);

      Stage personStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

      personStage.hide();

      personStage.setScene(personScene);

      personStage.setTitle("Person Overview");

      personStage.show();

 }
	@FXML
	public void viewEmployeeClicked(ActionEvent event) throws IOException {
		  {  	
     	     
	        	FXMLLoader loader = new FXMLLoader(getClass().getResource("ViewEmployee.fxml"));
	        	
	        	try {
					Parent root = (Parent) loader.load();
					Stage dialogStage = new Stage();
					Scene scene = new Scene(root);
					dialogStage.setScene(scene);
					dialogStage.setTitle("Edit Person");
				    dialogStage.initModality(Modality.WINDOW_MODAL);
				   
				    
				    // Set the person into the controller, i.e. show person details on the edit window
			      
			     //   controller.setDialogStage(dialogStage);
			       // controller.setPerson(selectedPerson); 	
				    			    
				    dialogStage.showAndWait();
				    
				    //update the person details
				  //  showPersonDetails(selectedPerson);
			        
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}  }       
	}
	// Event Listener on Button.onAction
	@FXML
	public void approveDayOffClicked(ActionEvent event) throws IOException {
		Parent person = FXMLLoader.load(getClass().getResource("ApproveDayOff.fxml"));

	       Scene personScene = new Scene(person);

	       Stage personStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

	       personStage.hide();

	       personStage.setScene(personScene);

	       personStage.setTitle("Approved Day Off");

	       personStage.show();
	}
	// Event Listener on Button.onAction
	@FXML
	public void createScheduleClicked(ActionEvent event) throws IOException {
		Parent person = FXMLLoader.load(getClass().getResource("CreateSchedule.fxml"));

	       Scene personScene = new Scene(person);

	       Stage personStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

	       personStage.hide();

	       personStage.setScene(personScene);

	       personStage.setTitle("Create Schedule");

	       personStage.show();
	}
	// Event Listener on Button.onAction
	@FXML
	public void manageClicked(ActionEvent event) {
		// TODO Autogenerated
	}
	 @FXML
	 private TableView<Sunday> sundayTable; 
	 @FXML
	 private TableView<Saturday> saturdayTable; 
	 @FXML
	 private TableView<Friday> fridayTable; 
	 @FXML
	 private TableView<Thursday> thursdayTable; 
	 @FXML
	 private TableView<Wednesday> wednesdayTable; 
	 @FXML
	 private TableView<Tuesday> tuesdayTable; 
	 @FXML
	 
	 private TableView<Monday> mondayTable;
	 @FXML
	 private TableColumn<Monday, String> mondayColumn;
	
	 @FXML

    private TableColumn<Tuesday, String> tuesdayColumn;
	
	  @FXML

     private TableColumn<Wednesday, String> wednesdayColumn;
	 @FXML

     private TableColumn<Thursday, String> thursdayColumn;
	 @FXML

     private TableColumn<Friday, String> fridayColumn;
	 @FXML

     private TableColumn<Saturday, String> saturdayColumn;
	 @FXML

     private TableColumn<Sunday, String> sundayColumn;



	 private DBConnection database = new DBConnection();
	    private Connection connection;
	    private Statement statement;
	    private ResultSet resultSet;

	  

	    private ObservableList<Monday> getDataFromMondayAndAddToObservableList(String query){

	        ObservableList<Monday> MondayData = FXCollections.observableArrayList();

	        try {

	 

	            connection = database.getConnection();

	            statement = connection.createStatement();

	            resultSet = statement.executeQuery(query);//"SELECT * FROM Monday;"

	            while(resultSet.next()){

	                         

	                         MondayData.add(new Monday (

	                      resultSet.getString("Employee")

	               
	                        

	                ));

	              }

	            connection.close();

	            statement.close();

	            resultSet.close();

	        } catch (SQLException e) {

	            e.printStackTrace();

	        }

	        return MondayData;

	    }
	    private ObservableList<Tuesday> getDataFromTuesdayAndAddToObservableList(String query){

	        ObservableList<Tuesday> TuesdayData = FXCollections.observableArrayList();

	        try {

	 

	            connection = database.getConnection();

	            statement = connection.createStatement();

	            resultSet = statement.executeQuery(query);//"SELECT * FROM Tuesday;"

	            while(resultSet.next()){

	                         
	                         TuesdayData.add(new Tuesday (
	                      resultSet.getString("Employee1")              
	                ));
	              }
	            connection.close();
	            statement.close();
	            resultSet.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return TuesdayData;
	    }
	    private ObservableList<Wednesday> getDataFromWednesdayAndAddToObservableList(String query){

	        ObservableList<Wednesday> WednesdayData = FXCollections.observableArrayList();

	        try {

	 

	            connection = database.getConnection();

	            statement = connection.createStatement();

	            resultSet = statement.executeQuery(query);//"SELECT * FROM Wednesday;"

	            while(resultSet.next()){

	                         
	            	WednesdayData.add(new Wednesday (
	                      resultSet.getString("Employee2")              
	                ));
	              }
	            connection.close();
	            statement.close();
	            resultSet.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return WednesdayData;
	    }
	    private ObservableList<Thursday> getDataFromThursdayAndAddToObservableList(String query){

	        ObservableList<Thursday> ThursdayData = FXCollections.observableArrayList();

	        try {

	 

	            connection = database.getConnection();

	            statement = connection.createStatement();

	            resultSet = statement.executeQuery(query);//"SELECT * FROM Wednesday;"

	            while(resultSet.next()){

	                         
	            	ThursdayData.add(new Thursday (
	                      resultSet.getString("Employee3")              
	                ));
	              }
	            connection.close();
	            statement.close();
	            resultSet.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return ThursdayData;
	    }
	    private ObservableList<Friday> getDataFromFridayAndAddToObservableList(String query){

	        ObservableList<Friday> FridayData = FXCollections.observableArrayList();

	        try {

	 

	            connection = database.getConnection();

	            statement = connection.createStatement();

	            resultSet = statement.executeQuery(query);//"SELECT * FROM Wednesday;"

	            while(resultSet.next()){

	                         
	            	FridayData.add(new Friday (
	                      resultSet.getString("Employee4")              
	                ));
	              }
	            connection.close();
	            statement.close();
	            resultSet.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return FridayData;
	    }
	    private ObservableList<Saturday> getDataFromSaturdayAndAddToObservableList(String query){

	        ObservableList<Saturday> SaturdayData = FXCollections.observableArrayList();

	        try {

	 

	            connection = database.getConnection();

	            statement = connection.createStatement();

	            resultSet = statement.executeQuery(query);//"SELECT * FROM Wednesday;"

	            while(resultSet.next()){

	                         
	            	SaturdayData.add(new Saturday (
	                      resultSet.getString("Employee5")              
	                ));
	              }
	            connection.close();
	            statement.close();
	            resultSet.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return SaturdayData;
	    }
	    private ObservableList<Sunday> getDataFromSundayAndAddToObservableList(String query){

	        ObservableList<Sunday> SundayData = FXCollections.observableArrayList();

	        try {

	 

	            connection = database.getConnection();

	            statement = connection.createStatement();

	            resultSet = statement.executeQuery(query);//"SELECT * FROM Wednesday;"

	            while(resultSet.next()){

	                         
	            	SundayData.add(new Sunday (
	                      resultSet.getString("Employee6")              
	                ));
	              }
	            connection.close();
	            statement.close();
	            resultSet.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return SundayData;
	    }
	    @Override
		public void initialize(URL location, ResourceBundle resources) {

	    	mondayColumn.setCellValueFactory(new PropertyValueFactory<Monday,String>("Employee"));

		ObservableList<Monday> data = getDataFromMondayAndAddToObservableList("SELECT * FROM Monday;");
			  
		   
		tuesdayColumn.setCellValueFactory(new PropertyValueFactory<Tuesday,String>("Employee1"));    

		         
		     ObservableList<Tuesday> data1 = getDataFromTuesdayAndAddToObservableList("SELECT * FROM Tuesday;");
		    
		     wednesdayColumn.setCellValueFactory(new PropertyValueFactory<Wednesday,String>("Employee2"));    

	         
		     ObservableList<Wednesday> data2 = getDataFromWednesdayAndAddToObservableList("SELECT * FROM Wednesday;");
          
		     thursdayColumn.setCellValueFactory(new PropertyValueFactory<Thursday,String>("Employee3"));    

	     
		     ObservableList<Thursday> data3 = getDataFromThursdayAndAddToObservableList("SELECT * FROM Thursday;");

		     
		     fridayColumn.setCellValueFactory(new PropertyValueFactory<Friday,String>("Employee4"));    

		     
		     ObservableList<Friday> data4 = getDataFromFridayAndAddToObservableList("SELECT * FROM Friday;");

		     saturdayColumn.setCellValueFactory(new PropertyValueFactory<Saturday,String>("Employee5"));    

		     
		     ObservableList<Saturday> data5 = getDataFromSaturdayAndAddToObservableList("SELECT * FROM Saturday;");
		     
		     sundayColumn.setCellValueFactory(new PropertyValueFactory<Sunday,String>("Employee6"));    

		     
		     ObservableList<Sunday> data6 = getDataFromSundayAndAddToObservableList("SELECT * FROM Sunday;");

  
		     
		     
		     
		     mondayTable.getItems().addAll(data);     
		       tuesdayTable.getItems().addAll(data1);   
		       wednesdayTable.getItems().addAll(data2); 
		       thursdayTable.getItems().addAll(data3);     
		       fridayTable.getItems().addAll(data4);   
		       saturdayTable.getItems().addAll(data5); 	
		       sundayTable.getItems().addAll(data6); 	
		    	 /******* Show Person Details  *******/

		         // Clear person details.

		        



		     // Listen for selection changes and show the person details when changed.

		      mondayTable.getSelectionModel().selectedItemProperty();

		      tuesdayTable.getSelectionModel().selectedItemProperty();
		      wednesdayTable.getSelectionModel().selectedItemProperty();
		      thursdayTable.getSelectionModel().selectedItemProperty();
		      fridayTable.getSelectionModel().selectedItemProperty();
		      saturdayTable.getSelectionModel().selectedItemProperty();
		      sundayTable.getSelectionModel().selectedItemProperty();
	    }
}
