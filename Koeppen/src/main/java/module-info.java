module com.example.koeppen {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.koeppen to javafx.fxml;
    exports com.example.koeppen;
}