module com.amilcarsystems.recursivesum {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.amilcarsystems.recursivesum to javafx.fxml;
    exports com.amilcarsystems.recursivesum;
    exports com.amilcarsystems.recursivesum.controller;
    opens com.amilcarsystems.recursivesum.controller to javafx.fxml;
}