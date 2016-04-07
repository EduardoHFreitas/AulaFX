package br;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class TPrincipalController {

    @FXML
    private Button Executar;

    @FXML
    private TextField Campo;

    @FXML
    void Executar(ActionEvent event) {
    	System.out.println(Campo.getText());
    }
}
