//Esto es copiado y pegado salvo el package del builder, view ultima opción
package com.example.cine;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;
//Se implementa lo initializable y abajo se hae un void
public class CineController implements Initializable {

    @FXML
    private ComboBox generocb;

    @FXML
    private TextArea informaciontxt;

    @FXML
    private TextField nombretx;


    private String[] generos= {"Drama","Comedia","Terror"};
    private  String informacion;
    @FXML
    void onEnviarClick(ActionEvent event) {
        //si el nombretx está vacío, guardará en información lo que haya en el campo de nombre, se comprueba que la cadena no es vacía
        if (!nombretx.getText().isEmpty()) {
            informacion = nombretx.getText() + "\n";
        }
        //guardará lo que se haya seleccionado en la lista, se comprueba que el objeto no sea vacío
        if (generocb.getValue()!=null) {
            informacion += generocb.getValue().toString() + "\n";
        }
   // se pondrá el recuadro y con appendtext imprimirá lo guardado en informacion
        informaciontxt.appendText(informacion);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //se llama al combo box
        generocb.getItems().addAll(generos);
    }
}