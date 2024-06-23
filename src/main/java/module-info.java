module com.example.demofaculdade {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demofaculdade to javafx.fxml;
    exports com.example.demofaculdade;
}