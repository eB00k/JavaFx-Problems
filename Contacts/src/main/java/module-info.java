module sample.contacts {
    requires javafx.controls;
    requires javafx.fxml;


    opens sample.contacts to javafx.fxml;
    exports sample.contacts;
}