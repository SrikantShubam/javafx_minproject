module something.last {
    requires javafx.controls;
    requires javafx.fxml;

    opens something.last to javafx.fxml;
    exports something.last;
}
