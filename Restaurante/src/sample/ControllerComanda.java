package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ControllerComanda {

        @FXML
        private TableView<?> tableviewComanda;

        @FXML
        private TableColumn<?, ?> tabelaGarcom;

        @FXML
        private TableColumn<?, ?> tabelaPedido;

        @FXML
        private TableColumn<?, ?> tabelaValor;

        @FXML
        private Button botaoLiberarMesa;

        @FXML
        private Button botaoAplicarDesconto;

        @FXML
        private Button botaoFinalizarPedido;

        @FXML
        private TextField textfieldTotal;

        @FXML
        private TextField textfieldDesconto;


}
