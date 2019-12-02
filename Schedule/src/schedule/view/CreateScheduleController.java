package schedule.view;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;
import schedule.model.ChooseWork;
import schedule.model.Friday;
import schedule.model.Monday;
import schedule.model.Person;
import schedule.model.Saturday;
import schedule.model.Sunday;
import schedule.model.Thursday;
import schedule.model.Tuesday;
import schedule.model.Wednesday;

public class CreateScheduleController implements Initializable {
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

			 employeeColumn.setCellValueFactory(new PropertyValueFactory<Person,String>("Name"));

		     

		         ObservableList<ChooseWork> ChooseWorkData = getDataFromChooseWorkAndAddToObservableList("SELECT * FROM ChooseWork;");

		         ChooseWorktable.getItems().addAll(ChooseWorkData);     

		    	 
		    	 
		    	 /******* Show Person Details  *******/

		         // Clear person details.

		        



		     // Listen for selection changes and show the person details when changed.

		    ChooseWorktable.getSelectionModel().selectedItemProperty().addListener(

		       (observable, oldValue, newValue) -> showPersonDetails(newValue)); 
		     
		     
		     
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

		public void backClicked(ActionEvent event) throws IOException { 

			  Parent person = FXMLLoader.load(getClass().getResource("ManagerPage.fxml"));

	       Scene personScene = new Scene(person);

	       Stage personStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

	       personStage.hide();

	       personStage.setScene(personScene);

	       personStage.setTitle("Person Overview");

	       personStage.show();

	  }


		public void addM(ActionEvent event) throws IOException { 

			// TODO Autogenerated
			
			
			  Parent person = FXMLLoader.load(getClass().getResource("AddMonday.fxml"));

		       Scene personScene = new Scene(person);

		       Stage personStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

		       personStage.hide();

		       personStage.setScene(personScene);

		       personStage.setTitle("Add monday");

		       personStage.show();

	         }
	         public void addT(ActionEvent event) throws IOException { 

	 			// TODO Autogenerated
	 			
	 			
	 	         {  	
	 	        	     
	 	        	FXMLLoader loader = new FXMLLoader(getClass().getResource("AddTuesday.fxml"));
	 	        	
	 	        	try {
	 					Parent root = (Parent) loader.load();
	 					Stage dialogStage = new Stage();
	 					Scene scene = new Scene(root);
	 					dialogStage.setScene(scene);
	 					dialogStage.setTitle("Add monday");
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
	 				}         
	 	        
	 	         }
	 	       
	       
	        
		
		}				
	         public void addW(ActionEvent event) throws IOException { 

		 			// TODO Autogenerated
		 			
		 			
		 	         {  	
		 	        	     
		 	        	FXMLLoader loader = new FXMLLoader(getClass().getResource("AddWednesday.fxml"));
		 	        	
		 	        	try {
		 					Parent root = (Parent) loader.load();
		 					Stage dialogStage = new Stage();
		 					Scene scene = new Scene(root);
		 					dialogStage.setScene(scene);
		 					dialogStage.setTitle("Add Wednesday");
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
		 				}         
		 	        
		 	         }
		 	       
		       
		        
			
			}			
	         public void addTh(ActionEvent event) throws IOException { 

		 			// TODO Autogenerated
		 			
		 			
		 	         {  	
		 	        	     
		 	        	FXMLLoader loader = new FXMLLoader(getClass().getResource("AddThursday.fxml"));
		 	        	
		 	        	try {
		 					Parent root = (Parent) loader.load();
		 					Stage dialogStage = new Stage();
		 					Scene scene = new Scene(root);
		 					dialogStage.setScene(scene);
		 					dialogStage.setTitle("Add Thursday");
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
		 				}         
		 	        
		 	         }
		 	       
		       
		        
			
			}			
	         public void addF(ActionEvent event) throws IOException { 

		 			// TODO Autogenerated
		 			
		 			
		 	         {  	
		 	        	     
		 	        	FXMLLoader loader = new FXMLLoader(getClass().getResource("AddFriday.fxml"));
		 	        	
		 	        	try {
		 					Parent root = (Parent) loader.load();
		 					Stage dialogStage = new Stage();
		 					Scene scene = new Scene(root);
		 					dialogStage.setScene(scene);
		 					dialogStage.setTitle("Add Friday");
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
		 				}         
		 	        
		 	         }
		 	       

			}			
	         public void addSat(ActionEvent event) throws IOException { 

		 			// TODO Autogenerated
		 			
		 			
		 	         {  	
		 	        	     
		 	        	FXMLLoader loader = new FXMLLoader(getClass().getResource("AddSaturday.fxml"));
		 	        	
		 	        	try {
		 					Parent root = (Parent) loader.load();
		 					Stage dialogStage = new Stage();
		 					Scene scene = new Scene(root);
		 					dialogStage.setScene(scene);
		 					dialogStage.setTitle("Add Saturday");
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
		 				}         
		 	        
		 	         }
		 	       
		       
		        
			
			}			
	         public void addS(ActionEvent event) throws IOException { 

		 			// TODO Autogenerated
		 			
		 			
		 	         {  	
		 	        	     
		 	        	FXMLLoader loader = new FXMLLoader(getClass().getResource("AddSunday.fxml"));
		 	        	
		 	        	try {
		 					Parent root = (Parent) loader.load();
		 					Stage dialogStage = new Stage();
		 					Scene scene = new Scene(root);
		 					dialogStage.setScene(scene);
		 					dialogStage.setTitle("Add Sunday");
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
		 				}         
		 	        
		 	         }
		 	       
		       
		        
			
			}			
		 @FXML

		    private void handleDeletePerson() {


		int selectedIndex = mondayTable.getSelectionModel().getSelectedIndex();{

       

           
            Monday selectedMonday = mondayTable.getSelectionModel().getSelectedItem();

         

            if (selectedIndex >= 0) {

                mondayTable.getItems().remove(selectedIndex);
            try {

                             DBoperation.deleteMonday(database, connection, selectedMonday);

                  } catch (SQLException e) {

               // TODO Auto-generated catch block

                             e.printStackTrace();

               }

         

              } else {

             // Nothing selected.

            Alert alert = new Alert(AlertType.WARNING);

            // alert.initOwner(mainApp.getPrimaryStage());

            alert.setTitle("No Selection");

            alert.setHeaderText("No Person Selected");

            alert.setContentText("Please select a person in the table.");



            alert.showAndWait();

		       
		}
		}}
		 @FXML

		    private void handleDeletePerson1() {


		int selectedIndex = tuesdayTable.getSelectionModel().getSelectedIndex();{

  

         

         Tuesday selectedTuesday = tuesdayTable.getSelectionModel().getSelectedItem();


         if (selectedIndex >= 0) {

             tuesdayTable.getItems().remove(selectedIndex);

         try {

                          DBoperation.deleteTuesday(database, connection, selectedTuesday);

               } catch (SQLException e) {

            // TODO Auto-generated catch block

                          e.printStackTrace();

            }

      

           } else {

          // Nothing selected.

         Alert alert = new Alert(AlertType.WARNING);

         // alert.initOwner(mainApp.getPrimaryStage());

         alert.setTitle("No Selection");

         alert.setHeaderText("No Person Selected");

         alert.setContentText("Please select a person in the table.");



         alert.showAndWait();

		       
		}
		}}		 
		 @FXML
		 private void handleDeletePerson2() {


				int selectedIndex = wednesdayTable.getSelectionModel().getSelectedIndex();{


		         

		         Wednesday selectedWednesday = wednesdayTable.getSelectionModel().getSelectedItem();


			     if (selectedIndex >= 0) {

			         wednesdayTable.getItems().remove(selectedIndex);
			         
		         try {

		                          DBoperation.deleteWednesday(database, connection, selectedWednesday);

		               } catch (SQLException e) {

		            // TODO Auto-generated catch block

		                          e.printStackTrace();

		            }

		      

		           } else {

		          // Nothing selected.

		         Alert alert = new Alert(AlertType.WARNING);

		         // alert.initOwner(mainApp.getPrimaryStage());

		         alert.setTitle("No Selection");

		         alert.setHeaderText("No Person Selected");

		         alert.setContentText("Please select a person in the table.");



		         alert.showAndWait();

				       
				}
				}}		  
		 @FXML
		 private void handleDeletePerson3() {


				int selectedIndex = thursdayTable.getSelectionModel().getSelectedIndex();{

		     

		         

		         Thursday selectedThursday = thursdayTable.getSelectionModel().getSelectedItem();
		         if (selectedIndex >= 0) {

			         thursdayTable.getItems().remove(selectedIndex);
		         try {

		                          DBoperation.deleteThursday(database, connection, selectedThursday);

		               } catch (SQLException e) {

		            // TODO Auto-generated catch block

		                          e.printStackTrace();

		            }

		      

		           } else {

		          // Nothing selected.

		         Alert alert = new Alert(AlertType.WARNING);

		         // alert.initOwner(mainApp.getPrimaryStage());

		         alert.setTitle("No Selection");

		         alert.setHeaderText("No Person Selected");

		         alert.setContentText("Please select a person in the table.");



		         alert.showAndWait();

				       
				}
				}}		  
		 @FXML
		 private void handleDeletePerson4() {


				int selectedIndex = fridayTable.getSelectionModel().getSelectedIndex();{

		 
		         

		         Friday selectedFriday = fridayTable.getSelectionModel().getSelectedItem();
		         if (selectedIndex >= 0) {

			         fridayTable.getItems().remove(selectedIndex);

		         try {

		                          DBoperation.deleteFriday(database, connection, selectedFriday);

		               } catch (SQLException e) {

		            // TODO Auto-generated catch block

		                          e.printStackTrace();

		            }

		      

		           } else {

		          // Nothing selected.

		         Alert alert = new Alert(AlertType.WARNING);

		         // alert.initOwner(mainApp.getPrimaryStage());

		         alert.setTitle("No Selection");

		         alert.setHeaderText("No Person Selected");

		         alert.setContentText("Please select a person in the table.");



		         alert.showAndWait();

				       
				}
				}}		  
		 @FXML
		 private void handleDeletePerson5() {


				int selectedIndex = saturdayTable.getSelectionModel().getSelectedIndex();{

		   

		         

		         Saturday selectedSaturday = saturdayTable.getSelectionModel().getSelectedItem();
		         if (selectedIndex >= 0) {

			         saturdayTable.getItems().remove(selectedIndex);
		         try {

		                          DBoperation.deleteSaturday(database, connection, selectedSaturday);

		               } catch (SQLException e) {

		            // TODO Auto-generated catch block

		                          e.printStackTrace();

		            }

		      

		           } else {

		          // Nothing selected.

		         Alert alert = new Alert(AlertType.WARNING);

		         // alert.initOwner(mainApp.getPrimaryStage());

		         alert.setTitle("No Selection");

		         alert.setHeaderText("No Person Selected");

		         alert.setContentText("Please select a person in the table.");



		         alert.showAndWait();

				       
				}
				}}	
		 @FXML
		 private void handleDeletePerson6() {


				int selectedIndex = sundayTable.getSelectionModel().getSelectedIndex();{


		         

		         Sunday selectedSunday = sundayTable.getSelectionModel().getSelectedItem();
			     if (selectedIndex >= 0) {

			         sundayTable.getItems().remove(selectedIndex);

		         try {

		                          DBoperation.deleteSunday(database, connection, selectedSunday);

		               } catch (SQLException e) {

		            // TODO Auto-generated catch block

		                          e.printStackTrace();

		            }

		      

		           } else {

		          // Nothing selected.

		         Alert alert = new Alert(AlertType.WARNING);

		         // alert.initOwner(mainApp.getPrimaryStage());

		         alert.setTitle("No Selection");

		         alert.setHeaderText("No Person Selected");

		         alert.setContentText("Please select a person in the table.");



		         alert.showAndWait();

				       
				}
				}}	

		 

		 @FXML

	     private TableColumn<Person, String> employeeColumn;
		 @FXML

		 private Label mondayLabel;

		    @FXML

		    private Label tuesdayLabel;

		    @FXML

		    private Label wednesdayLabel;
			 
		    
		    @FXML

		    private Label thursdayLabel;
			 
		    @FXML

		    private Label fridayLabel;

		    @FXML

		    private Label saturdayLabel;

		    @FXML

		    private Label sundayLabel;

		    @FXML

		    private TableView<ChooseWork> ChooseWorktable;

		    private ObservableList<ChooseWork> getDataFromChooseWorkAndAddToObservableList(String query){

		        ObservableList<ChooseWork> ChooseWorkData = FXCollections.observableArrayList();

		        try {

		 

		            connection = database.getConnection();

		            statement = connection.createStatement();

		            resultSet = statement.executeQuery(query);//"SELECT * FROM person;"

		            while(resultSet.next()){

		                         

		                         ChooseWorkData.add(new ChooseWork (
		                     resultSet.getString("Name"),
		                      resultSet.getString("Monday"),

		                       resultSet.getString("Tuesday"),                        

		                        resultSet.getString("Wednesday"),

		                        resultSet.getString("Thursday"),

		                        resultSet.getString("Friday"),

		                     
		                       resultSet.getString("Saturday"),

		                        resultSet.getString("Sunday")
		                        
		                        

		                ));

		              }

		            connection.close();

		            statement.close();

		            resultSet.close();

		        } catch (SQLException e) {

		            e.printStackTrace();

		        }

		        return ChooseWorkData;

		    }
		    
		    
		    
		    private void showPersonDetails(ChooseWork ChooseWork) {

		        if (ChooseWork != null) {

		            // Fill the labels with info from the person object.


		        	  mondayLabel.setText(ChooseWork.getMonday());

			            tuesdayLabel.setText(ChooseWork.getTuesday());
			            wednesdayLabel.setText(ChooseWork.getWednesday());

			            thursdayLabel.setText(ChooseWork.getThursday());


		          fridayLabel.setText(ChooseWork.getFriday());

		            saturdayLabel.setText(ChooseWork.getSaturday());
		            sundayLabel.setText(ChooseWork.getSunday());

		        
		 

		        } else {

		            // Person is null, remove all the text.
		            mondayLabel.setText("");

		            tuesdayLabel.setText("");
		            wednesdayLabel.setText("");

		            thursdayLabel.setText("");
		            fridayLabel.setText("");
		            saturdayLabel.setText("");
		            sundayLabel.setText("");

		           

		        

		        }
		  
		    }

		  
		    public void resetWeek(ActionEvent event) throws IOException { 

	 			// TODO Autogenerated
	 			
	 			
		  	  Parent person = FXMLLoader.load(getClass().getResource("AreYouSure.fxml"));

		       Scene personScene = new Scene(person);

		       Stage personStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

		       personStage.hide();

		       personStage.setScene(personScene);

		       personStage.setTitle("Are you sure");

		       personStage.show();
		        

		    }

		  
		 
}
			

			  
		   

