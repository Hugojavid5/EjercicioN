module org.hugo.ejercicion {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.hugo.ejercicion to javafx.fxml;
    exports org.hugo.ejercicion;
}