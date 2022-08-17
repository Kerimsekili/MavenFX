module mavenfx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.jmc.mavenfx to javafx.fxml;
    exports com.jmc.mavenfx;
}