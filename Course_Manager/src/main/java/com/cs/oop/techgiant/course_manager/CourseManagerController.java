package com.cs.oop.techgiant.course_manager;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.util.ArrayList;

public class CourseManagerController
{
    @javafx.fxml.FXML
    private RadioButton foundationRadioButton;
    @javafx.fxml.FXML
    private RadioButton minorRadioButton;
    @javafx.fxml.FXML
    private TextField capacityTextField;
    @javafx.fxml.FXML
    private ComboBox<String> labCodeComboBox;
    @javafx.fxml.FXML
    private Label courseNvalueLabel;
    @javafx.fxml.FXML
    private TextArea labTextArea;
    @javafx.fxml.FXML
    private Label LabNvalueLabel;
    @javafx.fxml.FXML
    private CheckBox isLabCheckBox;
    @javafx.fxml.FXML
    private ComboBox<String> labTimeComboBox;
    @javafx.fxml.FXML
    private TextArea courseTextArea;
    @javafx.fxml.FXML
    private TextField courseNameTextField;
    @javafx.fxml.FXML
    private ComboBox<String> courseCodeComboBox;
    @javafx.fxml.FXML
    private RadioButton majorRadioButton;
    @javafx.fxml.FXML
    private DatePicker courseStartDatePicker;
    @javafx.fxml.FXML
    private RadioButton coreRadioButton;
    @javafx.fxml.FXML
    private TextField facultyNameTextField;
    @javafx.fxml.FXML
    private AnchorPane parentAnchorPane;
    @javafx.fxml.FXML
    private ComboBox<String> courseTimeComboBox;
    @javafx.fxml.FXML
    private TextField sectionNumTextField;

    private ArrayList<Course> courseDetail;
    private ToggleGroup toggle;

    @javafx.fxml.FXML
    public void initialize() {
        courseCodeComboBox.getItems().addAll("PHY101", "ENG101", "MAT104", "CSE203", "CSE213", "CSE303", "CSE421", "CSE425",
                "CSE451", "CSE464");
        courseTimeComboBox.getItems().addAll("ST: 08:00-09:30", "ST: 09:40-11:10", "ST: 11:20-12:50", "ST: 13:00-14:30", "ST: 14:40-16:10", "ST: 16:20-17:50",
                "MW: 08:00-09:30", "MW: 09:40-11:10", "MW: 11:20-12:50", "MW: 13:00-14:30", "MW: 14:40-16:10", "MW: 16:20-17:50");
        labTimeComboBox.getItems().addAll("ST: 08:00-09:30", "ST: 09:40-11:10", "ST: 11:20-12:50", "ST: 13:00-14:30", "ST: 14:40-16:10", "ST: 16:20-17:50",
                "MW: 08:00-09:30", "MW: 09:40-11:10", "MW: 11:20-12:50", "MW: 13:00-14:30", "MW: 14:40-16:10", "MW: 16:20-17:50");

        toggle = new ToggleGroup();

        foundationRadioButton.setToggleGroup(toggle);
        coreRadioButton.setToggleGroup(toggle);
        majorRadioButton.setToggleGroup(toggle);
        minorRadioButton.setToggleGroup(toggle);

        courseDetail = new ArrayList<Course>();
    }

    @javafx.fxml.FXML
    public void viewCourseInfoButtonOnClick(ActionEvent actionEvent) {
        String courseType;
        if (toggle.getSelectedToggle() == null) {
            courseType = "Not Declared";
        } else if (toggle.getSelectedToggle().equals(foundationRadioButton)) {
            courseType = "Foundation";
        } else if (toggle.getSelectedToggle().equals(coreRadioButton)) {
            courseType = "Core";
        } else if (toggle.getSelectedToggle().equals(majorRadioButton)) {
            courseType = "Major";
        }
        else {
            courseType = "Minor";
    }

        Course new_course = new Course(courseType, courseNameTextField.getText(), courseCodeComboBox.getValue(), courseTimeComboBox.getValue(), Integer.parseInt(sectionNumTextField.getText()), labCodeComboBox.getValue(), labTimeComboBox.getValue(), facultyNameTextField.getText(), Integer.parseInt(capacityTextField.getText()));
        courseDetail.add(new_course);
    }
}



