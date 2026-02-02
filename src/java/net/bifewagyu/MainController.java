package net.bifewagyu;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {
    // registro de componentes
    @FXML
    private Button buTton1;
    @FXML
    private TextField texT1;
    @FXML
    private TextField texT2;
    @FXML
    private Label textResultado;


    // criação da soma entre dois numeros
    @FXML
    public void somaDosnumeros(ActionEvent evt) {
        int n1 = Integer.parseInt(texT1.getText());
        int n2 = Integer.parseInt(texT2.getText());

        int s = n1 + n2;
        textResultado.setText(Integer.toString(s));
    }
}
