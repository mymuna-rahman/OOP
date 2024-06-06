module com.cs.oop.techgiant.course_manager {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.cs.oop.techgiant.course_manager to javafx.fxml;
    exports com.cs.oop.techgiant.course_manager;
}