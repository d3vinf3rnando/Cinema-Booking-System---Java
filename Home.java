package com.example.green_code_movies;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;


import java.text.SimpleDateFormat;
import java.util.Date;

import static javafx.application.Application.launch;



public class Home {

    @FXML
    Button back;

    @FXML
    Label userlabel;

    @FXML
    Label l_date;

    @FXML
    Label l_time;

    @FXML
    private Label timer;



    public void back() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        Stage window=(Stage) back.getScene().getWindow();
        window.setScene(new Scene(root,600,400));

        userlabel.setText("Admin");

        



    }










}
