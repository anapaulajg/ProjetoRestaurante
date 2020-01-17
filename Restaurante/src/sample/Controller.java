package sample;

import javafx.collections.*;
import javafx.event.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;


public class Controller {
    @FXML
    private ListView<Mesa> listviewReservadas;

    @FXML
    private ListView<Mesa> listviewLivre;

    @FXML
    private ListView<Mesa> listviewOcupadas;

    @FXML
    private ComboBox<String> comboBoxPedidos;

    @FXML
    private ComboBox<Funcionario> comboBoxGarcom = new ComboBox<Funcionario>();
    private List<Funcionario> funcionarios = new ArrayList<>();

    ObservableList<Funcionario> obsFuncionario;

    @FXML
    private Button botaoAbrirMesa;

    @FXML
    private Button botaoReservarMesa;

    @FXML
    private ComboBox<?> comboBoxOcupadas;

    @FXML
    private Button botaoDesocuparMesa;


    private List<Mesa> mesas = new ArrayList<>();
    private List<Mesa> mesasOcupadas = new ArrayList<>();

    private ObservableList<Mesa> obsMesas;
    private ObservableList<Mesa> obsMesasOcupadas;

    public Controller() {
        mesas = new ArrayList<>();
    }

    public void carregandoMesas(){
        Mesa mesa1 = new Mesa(1);
        Mesa mesa2 = new Mesa(2);
        Mesa mesa3 = new Mesa(3);
        Mesa mesa4 = new Mesa(4);
        Mesa mesa5 = new Mesa(5);

        mesas.add(mesa1);
        mesas.add(mesa2);
        mesas.add(mesa3);
        mesas.add(mesa4);
        mesas.add(mesa5);

        obsMesas = FXCollections.observableArrayList((mesas));
        obsMesasOcupadas = FXCollections.observableArrayList((mesasOcupadas));

        listviewLivre.setItems(obsMesas);
        listviewOcupadas.setItems(obsMesasOcupadas);
    }

        @FXML
    public void initialize () {
        System.out.println("opa");
        carregandoMesas();
        Funcionario func1 = new Funcionario("João", 22, "opa");
        funcionarios.add(func1);
        obsFuncionario = FXCollections.observableArrayList((funcionarios));
        comboBoxGarcom.setItems(obsFuncionario);


        }
        @FXML
        public void abrirMesa (ActionEvent event) throws IOException {
            Stage stage1 = (Stage) botaoAbrirMesa.getScene().getWindow();
            stage1.close();

            FXMLLoader load = new FXMLLoader(this.getClass().getResource("Comandas.fxml"));
            Parent root = load.load();
            Stage stage = new Stage();
            stage.setScene(new Scene((root)));
            stage.show();
        }

}


