module com.example.testmenu {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.testmenu to javafx.fxml;
    exports com.example.testmenu;
    exports com.example.testmenu.RegControllers;
    opens com.example.testmenu.RegControllers to javafx.fxml;
}