package schedule.view;
import schedule.model.*;

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
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import schedule.model.Person;

public class ManageAccountController extends Login1Controller implements Initializable {

	 public void oKClicked(ActionEvent event) throws IOException { 

		  Parent person = FXMLLoader.load(getClass().getResource("Workoverview.fxml"));

        Scene personScene = new Scene(person);

        Stage personStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        personStage.hide();

        personStage.setScene(personScene);

        personStage.setTitle("Overview");

        personStage.show();
}

	

  
	 public void update(ActionEvent event) throws IOException { 

		  Parent person = FXMLLoader.load(getClass().getResource("Update.fxml"));

       Scene personScene = new Scene(person);

       Stage personStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

       personStage.hide();

       personStage.setScene(personScene);

       personStage.setTitle("update contact information");

       personStage.show();
}

	

     

	 
    @FXML

    private Label addressLabel;

    @FXML

    private Label phoneNumberLabel;

     @FXML

     private Label emailLabel;

     @FXML


     private Stage dialogStage;

     private Person person;

     private boolean okClicked = false;

     private DBConnection database = new DBConnection();
     private Connection connection;
     private Statement statement;
     private ResultSet resultSet;
     
   



     @Override
     public void initialize(URL location, ResourceBundle resources) {

             
    	 // TODO Auto-generated method stub
        
 	     
     	 try {
     		    	 connection = database.getConnection();
     		            statement = connection.createStatement();
     		    	 Statement statement = connection.createStatement();
     		    	 Statement statement1 = connection.createStatement();
     		    	Statement statement2 = connection.createStatement();
     				String str = "select email from admin where Username = '"+userName+"';";
     				String str1 = "select address from admin where Username = '"+userName+"';";
     				String str2 = "select phoneNumber from admin where Username = '"+userName+"';";
     				ResultSet resultSet = statement.executeQuery(str);
     		     ResultSet resultSet1 = statement1.executeQuery(str1);
     		     ResultSet resultSet2 = statement2.executeQuery(str2);
     		        resultSet.next();
     		     resultSet1.next();
     		    resultSet2.next();
     		   resultSet2.getString("phoneNumber");
     		    resultSet1.getString("address");
     		    addressLabel.setText( resultSet1.getString("address"));
     		        resultSet.getString("email");
     		      emailLabel.setText( resultSet.getString("email"));
     		     phoneNumberLabel.setText( resultSet2.getString("phoneNumber"));
     		        connection.close();
     	            statement.close();
     	           statement1.close();
     	          statement2.close();
     	            resultSet.close();
     	          resultSet1.close();
     	         resultSet2.close();
     		     } catch (SQLException e) {
     				// TODO Auto-generated catch block
     				e.printStackTrace();
     		     }
     		     

     /* 	 try {
		    	 connection = database.getConnection();
		            statement = connection.createStatement();
		    	 Statement statement = connection.createStatement();
				String str = "select address from admin where Username = '"+userName+"';";
         
		        ResultSet resultSet = statement.executeQuery(str);
		        resultSet.next();
		        resultSet.getString("address");
		      addressLabel.setText( resultSet.getString("address"));
		        connection.close();
	            statement.close();
	            resultSet.close();
		     } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		     }
      	 try {
		    	 connection = database.getConnection();
		            statement = connection.createStatement();
		    	 Statement statement = connection.createStatement();
				String str = "select phoneNumber from admin where Username = '"+userName+"';";
         
		        ResultSet resultSet = statement.executeQuery(str);
		        resultSet.next();
		        resultSet.getString("phoneNumber");
		      phoneNumberLabel.setText( resultSet.getString("phoneNumber"));
		        connection.close();
	            statement.close();
	            resultSet.close();
		     } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		     }
		     
*/

  
     

     }


}




     
