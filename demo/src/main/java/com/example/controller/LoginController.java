package com.example.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    Stage stage;
    public TextField txtfieldpseudo;
    public PasswordField txtfieldpassword;
    public Button btnconnexion;


    public void btnconnexion(ActionEvent event) throws IOException {
        String pseudo = "nawan";
        if (txtfieldpseudo.getText().equals(pseudo) && txtfieldpassword.getText().equals(pseudo)) {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Inscription.fxml"));
            Parent root = fxmlLoader.load();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("AUTHENTIFICATION");
            stage.show();
            System.out.println("Bienvenue sur votre gestionnaire des inscriptions");
        } else
            System.out.println("Oups ! Pseudo ou mot de passe incorrect !");


    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
