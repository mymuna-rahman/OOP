package com.cs.oop.techgiant.studentprofile;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class StudentController
{
    @javafx.fxml.FXML
    private ComboBox<String> nationalityComboBox;
    @javafx.fxml.FXML
    private RadioButton femaleRadioButton;
    @javafx.fxml.FXML
    private TextField idTextfield;
    @javafx.fxml.FXML
    private RadioButton maleRadioButton;
    @javafx.fxml.FXML
    private DatePicker dobDatePicker;
    @javafx.fxml.FXML
    private TextArea displayTextarea;
    @javafx.fxml.FXML
    private TextField nameTextfield;

    @javafx.fxml.FXML
    public void initialize() {
        nationalityComboBox.getItems().addAll("American", "Bangladeshi", "Chinese", "Indian", "Japanese", "Korean");

        ToggleGroup toggleGroup = new ToggleGroup();
        maleRadioButton.setToggleGroup(toggleGroup);
        femaleRadioButton.setToggleGroup(toggleGroup);
    }

    @javafx.fxml.FXML
    public void createProfileOnAction(ActionEvent actionEvent) {
        String name = nameTextfield.getText();
        String id = idTextfield.getText();
        String nationality = nationalityComboBox.getValue();
        String dob = dobDatePicker.getValue().toString();

        String gender;
        if(maleRadioButton.isSelected()){
            gender = "Male";
        }
        else{
            gender = "Female";
        }

    }
}