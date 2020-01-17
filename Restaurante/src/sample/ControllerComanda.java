package sample;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

public class ControllerComanda {

        @FXML
        private TableView tabelaComanda = new TableView<>();


        @FXML
        private TableColumn tabelaGarcom = new TableColumn<>("Garcom");

        @FXML
        private TableColumn tabelaValor = new TableColumn<>("Valor");

        @FXML
        private TableColumn tabelaPedido = new TableColumn<>("Pedido");



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

        @FXML
        public void initialize() {
                System.out.println("opa2");
                List pessoas = Arrays.asList(
                        new Pessoa("Adelino",22,"aa"),
                        new Pessoa("Ana Paula", 25, "oi")
                );

                tabelaGarcom.setCellValueFactory(new PropertyValueFactory<>("nome"));
                tabelaPedido.setCellValueFactory(new PropertyValueFactory<>("contato"));
                tabelaValor.setCellValueFactory(new PropertyValueFactory<>("idade"));
                tabelaComanda.setItems(FXCollections.observableArrayList(pessoas));
        }


}
