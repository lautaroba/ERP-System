module Interfaz.main {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;
	requires transitive java.persistence;
	requires java.desktop;
    
    opens Interfaz.main to javafx.fxml;
    exports Interfaz.main;
}
