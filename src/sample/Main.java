package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;


public class Main extends Application implements EventHandler<ActionEvent> {

    @Override
    public void start(Stage primaryStage) throws Exception{

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(8);
        grid.setHgap(10);


        Label nameLabel = new Label("Username");
        GridPane.setConstraints(nameLabel, 0,0);

        TextField nameInput = new TextField();
        GridPane.setConstraints(nameInput, 1, 0);

        Label pwLabel = new Label("Password:");
        GridPane.setConstraints(pwLabel, 0,1);

        TextField pwInput = new TextField();
        pwInput.setPromptText("Skriv PW");
        GridPane.setConstraints(pwInput, 1, 1);

        Button loginButton = new Button("Klicka här för att logga in");
        GridPane.setConstraints(loginButton, 1,2);
        loginButton.setOnAction(this);

        grid.getChildren().addAll(nameLabel, nameInput, pwLabel, pwInput, loginButton);

        primaryStage.setTitle("Welcome to Skiworld!");
        primaryStage.setScene(new Scene(grid, 300, 150  ));
        primaryStage.show();

    }

    @Override
    public void handle(ActionEvent event) {



    }

    public static void main(String[] args) {
        launch(args);
    }





}
