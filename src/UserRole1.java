import javafx.scene.control.Alert.AlertType;
import javafx.application.Application;
import java.util.Optional;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import java.util.ArrayList;
import javafx.scene.control.ChoiceDialog;

public class UserRole1 extends Application {

    public void start(Stage primaryStage) {
        ArrayList<String> choices = new ArrayList<String>();
        choices.add("administrtor!");
        choices.add("faculty!");
        choices.add("staff!");
        choices.add("student!");
        choices.add("guest!");

        String defaultOption = choices.get(4);
        @SuppressWarnings("unchecked")
        ChoiceDialog choiceDialog = new ChoiceDialog(defaultOption, choices);
        choiceDialog.setTitle("User");
        choiceDialog.setHeaderText("Please select your role.");
        @SuppressWarnings("unchecked")
        Optional<String> result = choiceDialog.showAndWait();

        String selected = result.get();
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Time to choose");
        alert.setHeaderText("Welcome!");
        switch(selected) {
            case "administrator!":
                alert.setContentText("WELCOME ADMINISTRATOR");
                break;
            case "faculty!":
                alert.setContentText("WELCOME FACULTY");
                break;
            case "staff!":
                alert.setContentText("WELCOME STAFF");
                break;
            case "student!":
                alert.setContentText("WELCOME STUDENT");
                break;
            case "guest!":
                alert.setContentText("WELCOME GUEST");
                break;
            default:
                alert.setContentText("WHO ARE YOU THEN");

        }
        alert.showAndWait();
    }

    public static void main(String [] args) {
        launch(args);
    }
}

