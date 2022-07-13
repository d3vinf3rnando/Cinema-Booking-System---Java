package com.example.green_code_movies;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class HelloController {

    @FXML
    private TextField username;

    @FXML
    private TextField pw;

    @FXML
    private Label label;

    @FXML
    Button log;

    public void btn() throws Exception{

        if (username.getText().equals("Admin") && pw.getText().equals("1234")){
            String txt1=("correct");
            label.setText("Sign In");

            Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
            Stage window=(Stage) log.getScene().getWindow();
            window.setScene(new Scene(root,1280,720));

        }
        else{

            label.setText("Incorrect Username or Password!");



    }







}}

