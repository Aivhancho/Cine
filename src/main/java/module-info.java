module com.example.cine {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.cine to javafx.fxml;
    exports com.example.cine;
}