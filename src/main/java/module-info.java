module com.amilcarsystems.recursivedigit {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.amilcarsystems.recursivedigit to javafx.fxml;
    exports com.amilcarsystems.recursivedigit;
    exports com.amilcarsystems.recursivedigit.controller;
    opens com.amilcarsystems.recursivedigit.controller to javafx.fxml;
}