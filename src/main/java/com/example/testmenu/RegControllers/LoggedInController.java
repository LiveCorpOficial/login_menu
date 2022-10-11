package com.example.testmenu.RegControllers;

import com.example.testmenu.DataAccessor;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class LoggedInController implements Initializable {

    @FXML
    private Label label_welcome;

    @FXML
    private Button button_logout;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //обработчик событий
        button_logout.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                DataAccessor.changeScene(event, "/RegFXML/sample.fxml", "Log in!", null);
            }
        });

    }
        //вывод после входа в систему
    public void setUserInformation(String username){
        label_welcome.setText("Привет " + username + "!");
    }
}
