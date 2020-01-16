package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

    public class ControllerPedidos {

        @FXML
        private TableView<?> tableviewPedidos;

        @FXML
        private TableColumn<?, ?> colunaMesa;

        @FXML
        private TableColumn<?, ?> colunaPedido;

        @FXML
        private TableColumn<?, ?> colunaGarcom;

        @FXML
        private TableColumn<?, ?> colunaHorario;

        @FXML
        private ComboBox<?> comboboxPedidoAtual;

        @FXML
        private ComboBox<?> comboboxGarcom;

        @FXML
        private Button botaoAdicionar;

        @FXML
        private Button botaoEliminar;

        @FXML
        private TextArea textAreaComentarios;

        @FXML
        private Button botaoEditarPedido;

        @FXML
        private Button botaoEnviarparaCozinha;

        @FXML
        private Button botaoFecharMesa;

    }

