package com.example.green_code_movies;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        primaryStage.setTitle("Cinema Hub");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();

    }
    public static void main(String[] args){launch(args);}




}