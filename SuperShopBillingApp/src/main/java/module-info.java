module com.cs.oop.techgiant.supershopbillingapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.cs.oop.techgiant.supershopbillingapp to javafx.fxml;
    exports com.cs.oop.techgiant.supershopbillingapp;
}