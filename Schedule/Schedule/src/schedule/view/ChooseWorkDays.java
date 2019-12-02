package schedule.view;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ChooseWorkDays {

	public void oKClicked(ActionEvent event) throws IOException { 

		  Parent person = FXMLLoader.load(getClass().getResource("Workoverview.fxml"));

       Scene personScene = new Scene(person);

       Stage personStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

       personStage.hide();

       personStage.setScene(personScene);

       personStage.setTitle("Person Overview");

       personStage.show();

  }

}
