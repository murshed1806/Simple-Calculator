package com.example.simplecalculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SimpleCalculator extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        VBox vBox = FXMLLoader.load(getClass().getResource("simpleCalculator.fxml"));
        Scene scene = new Scene(vBox);
        stage.setScene(scene);
        stage.setTitle("Simple Calculator");
        stage.show();
    }
}
