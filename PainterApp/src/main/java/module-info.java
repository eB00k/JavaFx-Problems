module simple.painterapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens simple.painterapp to javafx.fxml;
    exports simple.painterapp;
}