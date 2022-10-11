package com.example.testmenu;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Objects;
import java.util.concurrent.CompletionService;

public class HelloController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    //Table
    @FXML
    private TableView<Tickets> menuMain;

    //Columns
    @FXML
    public TableColumn<Tickets, String> ticketNoCol;

    @FXML
    public TableColumn<Tickets, String> bookRefCol;

    @FXML
    public TableColumn<Tickets, String> passengerIdCol;

    @FXML
    public TableColumn<Tickets, String> passengerNameCol;

    @FXML
    public TableColumn<Tickets, String> contactDataCol;

    //Button
    @FXML
    private Button btnClose;

    @FXML
    private Button btnNext;

    @FXML
    private Button btnBreak;

    @FXML
    private Button btnDel;

    @FXML
    private Button btnOpen;
/*
    @FXML
    public void handleBtnOpenTestActional(ActionEvent event) {
        try {
            DataAccessor da = DataAccessor.getDataAccessor();
            tvMain.getColumns().clear();

            TableColumn<Person, String> firstNameCol = new TableColumn<>("First Name");
            TableColumn<Person, String> lastNameCol = new TableColumn<>("Last Name");
            TableColumn<Person, String> phoneCol = new TableColumn<>("Phone");

            firstNameCol.setCellValueFactory(new PropertyValueFactory<>("firstName"));
            lastNameCol.setCellValueFactory(new PropertyValueFactory<>("lastName"));
            phoneCol.setCellValueFactory(new PropertyValueFactory<>("phoneNum"));

            tvMain.getColumns().addAll(firstNameCol, lastNameCol, phoneCol);

            tvMain.getItems().addAll(da.getPersonList());
        }   catch (SQLException ignored){};
    }
*/
    @FXML
    public void handleBtnOpenAttActional(ActionEvent event){
        try {
            DataAccessor da = DataAccessor.getDataAccessor();
            menuMain.getColumns().clear();

            TableColumn<Tickets, String> ticketNoCol = new TableColumn<>("Номер билета");
            TableColumn<Tickets, String> bookRefCol = new TableColumn<>("Номер полёта");
            TableColumn<Tickets, String> passengerIdCol = new TableColumn<>("Id пассажира");
            TableColumn<Tickets, String> passengerNameCol = new TableColumn<>("Имя пассажира");
            TableColumn<Tickets, String> contactDataCol = new TableColumn<>("Контакты");

            ticketNoCol.setCellValueFactory(new PropertyValueFactory<>("ticket_no"));
            bookRefCol.setCellValueFactory(new PropertyValueFactory<>("book_ref"));
            passengerIdCol.setCellValueFactory(new PropertyValueFactory<>("passenger_id"));
            passengerNameCol.setCellValueFactory(new PropertyValueFactory<>("passenger_name"));
            contactDataCol.setCellValueFactory(new PropertyValueFactory<>("contact_data"));

            menuMain.getColumns().addAll(ticketNoCol, bookRefCol, passengerIdCol, passengerNameCol, contactDataCol);

            menuMain.getItems().addAll(da.getTicketList());
        } catch (SQLException ignored){}
    }

    @FXML
    public void SwitchToScene1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Scene3.fxml")));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void SwitchToScene2(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Scene2.fxml")));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void SwitchToMenu(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Menu.fxml")));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void handleBtnCloseActional(ActionEvent event) {
        Stage s = (Stage) btnClose.getScene().getWindow();
        s.close();
    }


}