package Patron_Mediateur;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MyApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Hello world!");
        this.setComponants(primaryStage);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    private void setComponants(Stage stage){
        stage.setWidth(425);
        stage.setHeight(310);

        GridPane grid = new GridPane();
        setUpGrid(grid);

        Label prenomLabel = new Label("Prénom:");
        TextField prenomTextField = new TextField();

        Label familleLabel = new Label("Nom de famille:");
        TextField familleTextField = new TextField();
        Button sendButton = new Button("Envoyer");

        grid.add(prenomLabel, 0,1);
        grid.add(prenomTextField,1,1);
        grid.add(familleLabel, 0,2);
        grid.add(familleTextField, 1,2);
        grid.add(sendButton, 0,3);

        Scene scene = new Scene(grid);
        stage.setScene(scene);
    }

    private void setUpGrid(GridPane grid){
        grid.setAlignment(Pos.BASELINE_LEFT);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
    }
}
