module com.example.edith {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;
    requires javafx.swing;
    requires javafx.graphics;
    requires  java.base;

    opens com.example.edith to javafx.fxml;
    exports com.example.edith;
}