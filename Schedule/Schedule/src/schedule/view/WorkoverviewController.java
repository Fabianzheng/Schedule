package schedule.view;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class WorkoverviewController {

	 public void signOutButtonClicked(ActionEvent event) throws IOException { 

		  Parent person = FXMLLoader.load(getClass().getResource("Login1.fxml"));

        Scene personScene = new Scene(person);

        Stage personStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        personStage.hide();

        personStage.setScene(personScene);

        personStage.setTitle("Person Overview");

        personStage.show();

   }
	 public void requestDaysOffClicked(ActionEvent event) throws IOException { 

		  Parent person = FXMLLoader.load(getClass().getResource("RequestDayOff.fxml"));

       Scene personScene = new Scene(person);

       Stage personStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

       personStage.hide();

       personStage.setScene(personScene);

       personStage.setTitle("Person Overview");

       personStage.show();

  }
	 public void chooseDaysOffClicked(ActionEvent event) throws IOException { 

		  Parent person = FXMLLoader.load(getClass().getResource("ChooseWorkDays.fxml"));

      Scene personScene = new Scene(person);

      Stage personStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

      personStage.hide();

      personStage.setScene(personScene);

      personStage.setTitle("Person Overview");

      personStage.show();
	 
}
	 
	 public void manageClicked(ActionEvent event) throws IOException { 

		  Parent person = FXMLLoader.load(getClass().getResource("ManageAccount.fxml"));

     Scene personScene = new Scene(person);

     Stage personStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

     personStage.hide();

     personStage.setScene(personScene);

     personStage.setTitle("Person Overview");

     personStage.show();
}
}