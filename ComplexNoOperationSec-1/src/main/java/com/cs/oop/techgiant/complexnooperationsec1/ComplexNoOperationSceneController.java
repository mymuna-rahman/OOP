package com.cs.oop.techgiant.complexnooperationsec1;

import javafx.event.Event;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ComplexNoOperationSceneController
{
    @javafx.fxml.FXML
    private TextField imgOf1stCnoTextField;
    @javafx.fxml.FXML
    private TextField imgOf2ndCnoTextField;
    @javafx.fxml.FXML
    private TextField realOf1stCnoTextField;
    @javafx.fxml.FXML
    private TextField realOf2ndCnoTextField;
    @javafx.fxml.FXML
    private TextArea resultLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    ComplexNo c1, c2, c3;

    @javafx.fxml.FXML
    public void addCnoButtonOnMouseClicked(Event event) {

        c1 = new ComplexNo(
                Integer.parseInt(realOf1stCnoTextField.getText()),
                Integer.parseInt(imgOf1stCnoTextField.getText())

        );

        c2 = new ComplexNo(
                Integer.parseInt(realOf2ndCnoTextField.getText()),
                Integer.parseInt(imgOf2ndCnoTextField.getText())

        );

        c3 = c1.add(c2);
        resultLabel.setText(c3.toString());

    }

    @javafx.fxml.FXML
    public void subtractCnoButtonOnMouseClicked(Event event) {

        c1 = new ComplexNo(
                Integer.parseInt(realOf1stCnoTextField.getText()),
                Integer.parseInt(imgOf1stCnoTextField.getText())

        );

        c2 = new ComplexNo(
                Integer.parseInt(realOf2ndCnoTextField.getText()),
                Integer.parseInt(imgOf2ndCnoTextField.getText())

        );



        c3 = c1.subtract(c2);
        resultLabel.setText(c3.toString());
    }
}