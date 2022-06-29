package com.example.demo;

import com.example.controller.HelloController;
import com.example.controller.LoginController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class HelloApplication extends Application {
    public static void main(String[] args) throws IOException {
        LoginController loginController = new LoginController();
        HelloController helloController = new HelloController();
        /*if(loginController.btnconnexion())
            System.out.println("On bascule sur l'interface de gestion des inscriptions");*/
        launch();


    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("LoginForm.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("AUTHENTIFICATION");
        stage.show();


    }
}