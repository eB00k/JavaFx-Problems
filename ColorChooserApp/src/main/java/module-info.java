module sample.colorchooserapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens sample.colorchooserapp to javafx.fxml;
    exports sample.colorchooserapp;
}