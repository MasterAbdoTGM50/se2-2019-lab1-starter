package com.se2.lab1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    public static void main(String[] args) { launch(args); }

    @Override
    public void start(Stage stage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("/App.fxml"));
        Scene scene = new Scene(root, 800, 600);

        stage.setResizable(false);
        stage.setTitle("uStalk");
        stage.setScene(scene);
        stage.show();

    }

}
