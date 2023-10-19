package com.example.lulu;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

public class HelloController {

    @FXML
    private Button btnentrar;

    @FXML
    private Label lblresultado;

    @FXML
    private PasswordField txtsenha;

    @FXML
    private TextField txtusuario;

    @FXML
    void efetuarlogin(MouseEvent event) {
        String usuario = txtusuario.getText();
        String senha = txtsenha.getText();
        if(usuario.equals("admin") && senha.equals("12345")){
            lblresultado.setText("Bem vindo(a): "+usuario);
        } else{
            lblresultado.setText("Usiário ou senha invalida");
        }
    }

}
