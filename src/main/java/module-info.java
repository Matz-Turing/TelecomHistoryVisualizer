module com.example.interactivetelecomhistory {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.interactivetelecomhistory to javafx.fxml;
    exports com.example.interactivetelecomhistory;
}
