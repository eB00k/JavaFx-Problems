module sample.tipcalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens sample.tipcalculator to javafx.fxml;
    exports sample.tipcalculator;
}