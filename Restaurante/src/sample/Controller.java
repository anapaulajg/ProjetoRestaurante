package sample;

import javafx.collections.*;
import javafx.event.*;
import javafx.fxml.FXML;
import javafx.scene.control.*;


public class Controller {
    @FXML
    private ListView<?> listviewReservadas;

    @FXML
    private ListView<?> listviewLivre;

    @FXML
    private ListView<?> listviewOcupadas;

    @FXML
    private ComboBox<?> comboBoxPedidos;

    @FXML
    private ComboBox<?> comboBoxGarcom;

    @FXML
    private Button botaoAbrirMesa;

    @FXML
    private Button botaoReservarMesa;

    @FXML
    private ComboBox<?> comboBoxOcupadas;

    @FXML
    private Button botaoDesocuparMesa;

}


