module uam.edu.ni.autorent {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens uam.edu.ni.autorent to javafx.fxml;
    exports uam.edu.ni.autorent;
}