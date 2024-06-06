module com.cs.oop.techgiant.studentprofile {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.cs.oop.techgiant.studentprofile to javafx.fxml;
    exports com.cs.oop.techgiant.studentprofile;
}