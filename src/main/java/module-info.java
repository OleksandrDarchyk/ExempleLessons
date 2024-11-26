module dk.easv.exemplelessons {
    requires javafx.controls;
    requires javafx.fxml;


    opens dk.easv.exemplelessons to javafx.fxml;
    exports dk.easv.exemplelessons;
}