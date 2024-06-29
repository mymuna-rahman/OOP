package com.cs.oop.techgiant.supershopbillingapp;

import javafx.beans.property.SimpleObjectProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class ReceiptViewController
{
    @javafx.fxml.FXML
    private Label unitPriceLabel;
    @javafx.fxml.FXML
    private CheckBox selectUSD;
    @javafx.fxml.FXML
    private Label predefinedVatLabel;
    @javafx.fxml.FXML
    private ComboBox<String> selectProductComboBox;
    @javafx.fxml.FXML
    private ComboBox<Integer> selectQuantityComboBox;
    @javafx.fxml.FXML
    private RadioButton cashRadioButton;
    @javafx.fxml.FXML
    private RadioButton cardRadioButton;
    @FXML
    private TableColumn<Payment, String> productCol;
    @FXML
    private TableColumn<Payment,Double> vatAmountCol;
    @FXML
    private TableColumn<Payment, Double> unitPriceCol;
    @FXML
    private TableColumn<Payment, Double> totalAmountCol;
    @FXML
    private TableColumn<Payment, Integer> quantityCol;
    @FXML
    private TableColumn<Payment, Double> vatCol;
    @FXML
    private TextArea totalPaymentTextArea;
    @FXML
    private TableView<Payment> table;
    @FXML
    private ComboBox<Integer> vatConsiderComboBox;
    @FXML
    private ToggleGroup paymentMethod;

    @javafx.fxml.FXML
    public void initialize() {
        //add product in combo-box

        selectProductComboBox.getItems().addAll("Lux Bar Soap", "Condense Milk", "Milk Bread", "Nescafe Coffee",
                "Pringles", "Yoghurt", "Nuggets", "Salmon", "Kit-kat", "Biotin Shampoo");
        selectQuantityComboBox.getItems().addAll(1,2,3,4,6,7,8,9,10);
        vatConsiderComboBox.getItems().addAll(1,2,3,4,5,6,7,8,9,10);

        //set default value in combo-box
        selectProductComboBox.setValue("Select Product");

        //initialize table column
        productCol.setCellValueFactory(new PropertyValueFactory<Payment,String>("productName"));
        unitPriceCol.setCellValueFactory(new PropertyValueFactory<Payment, Double>("unitPrice"));
        quantityCol.setCellValueFactory(new PropertyValueFactory<Payment, Integer>("quantity"));
        vatCol.setCellValueFactory(new PropertyValueFactory<Payment, Double>("predefinedVat"));
        vatAmountCol.setCellValueFactory((new PropertyValueFactory<Payment, Double>("vatAmount")));
        totalAmountCol.setCellValueFactory(new PropertyValueFactory<Payment, Double>("totalAmount"));

    }

    @javafx.fxml.FXML
    public void addOnMouseClick(ActionEvent actionEvent) {
        //verification and validation
        String selected = selectProductComboBox.getValue();



    }

    @javafx.fxml.FXML
    public void deleteOnMouseClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void checkoutOnMouseClick(ActionEvent actionEvent) {
    }

    @FXML
    public void selectProductOnMouseClick(ActionEvent actionEvent) {
        //take value form selected product combo-box and use as expression inside the switch keyword

        //"Lux Bar Soap", "Condense Milk", "Milk Bread", "Nescafe Coffee",
        //                "Pringles", "Yoghurt", "Nuggets", "Salmon", "Kit-kat", "Biotin Shampoo"
        switch(selectProductComboBox.getValue()){
            case "Lux Bar Soap":
                unitPriceLabel.setText("50tk.");
                predefinedVatLabel.setText("1%");
                break;

            case "Condense Milk":
                unitPriceLabel.setText("210tk.");
                predefinedVatLabel.setText("2.5%");
                break;

            case "Milk Bread":
                unitPriceLabel.setText("180tk.");
                predefinedVatLabel.setText("2%");
                break;

            case "Nescafe Coffee":
                unitPriceLabel.setText("410tk.");
                predefinedVatLabel.setText("6.5%");
                break;

            case "Pringles":
                unitPriceLabel.setText("299tk.");
                predefinedVatLabel.setText("5%");
                break;

            case "Yoghurt":
                unitPriceLabel.setText("250tk.");
                predefinedVatLabel.setText("3%");
                break;

            case "Nuggets":
                unitPriceLabel.setText("310tk.");
                predefinedVatLabel.setText("6.3%");
                break;

            case "Salmon":
                unitPriceLabel.setText("799tk.");
                predefinedVatLabel.setText("10%");
                break;

            case "Kit-kat":
                unitPriceLabel.setText("150tk.");
                predefinedVatLabel.setText("2.2%");
                break;

            case "Biotin Shampoo":
                unitPriceLabel.setText("450tk.");
                predefinedVatLabel.setText("8%");
                break;

            default:
                unitPriceLabel.setText("");
                predefinedVatLabel.setText("");

        }

    }
}