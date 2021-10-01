module com.example.simplecalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.simplecalculator to javafx.fxml;
    exports com.example.simplecalculator;
}