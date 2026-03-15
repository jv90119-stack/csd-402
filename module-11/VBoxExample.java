// JOSE VELAZQUEZ
// MODULE 11.2 ASSIGNMENT 
// DATE: 03/15/2026
// This program demonstrates the use of VBox layout in JavaFX. It creates a simple GUI with three buttons arranged vertically.

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VBoxExample extends Application {

    @Override
    public void start(Stage stage) {

        Button button1 = new Button("Home");
        Button button2 = new Button("About");
        Button button3 = new Button("Contact");

        VBox vbox = new VBox(10); // 10px spacing between items
        vbox.getChildren().addAll(button1, button2, button3);

        Scene scene = new Scene(vbox, 300, 200);

        stage.setTitle("VBox Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}