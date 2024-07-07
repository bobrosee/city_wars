module org.example.project_graphic {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.project_graphic to javafx.fxml;
    exports org.example.project_graphic;
}