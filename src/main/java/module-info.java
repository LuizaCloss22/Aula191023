module com.example.lulu {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.lulu to javafx.fxml;
    exports com.example.lulu;
}