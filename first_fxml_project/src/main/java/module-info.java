module com.cs.oop.techgiant.first_fxml_project {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.cs.oop.techgiant.first_fxml_project to javafx.fxml;
    exports com.cs.oop.techgiant.first_fxml_project;
}