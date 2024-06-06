module com.cs.oop.techgiant.complexnooperationsec1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.cs.oop.techgiant.complexnooperationsec1 to javafx.fxml;
    exports com.cs.oop.techgiant.complexnooperationsec1;
}