package com.cs.oop.techgiant.supershopbillingapp;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class BillingViewController {
    @javafx.fxml.FXML
    private Label unitPriceLabel;
    @javafx.fxml.FXML
    private ComboBox<String> selectProductComboBox;
    @javafx.fxml.FXML
    private ComboBox<Integer> selectQuantityComboBox;
    @javafx.fxml.FXML
    private TableColumn<CartItem, Float> unitPriceCol;
    @javafx.fxml.FXML
    private TableColumn<CartItem, String> productCol;
    @javafx.fxml.FXML
    private TableView<CartItem> productDetailsTable;

    @javafx.fxml.FXML
    public void initialize() {

        selectProductComboBox.getItems().addAll("Soap", "Chocolate", "Coffee");
        selectQuantityComboBox.getItems().addAll(1, 2, 3, 4, 5);

        //setting default
        selectProductComboBox.setValue("Select Product:");
        selectQuantityComboBox.setValue(0);

        productCol.setCellValueFactory(new PropertyValueFactory<>("productName"));
        unitPriceCol.setCellValueFactory(new PropertyValueFactory<>("unitPrice"));

    }

    @javafx.fxml.FXML
    public void addProductToCartOnClick(ActionEvent actionEvent) {

        String name = selectProductComboBox.getValue();
        float price = Float.parseFloat(unitPriceLabel.getText());
        int quantity = selectQuantityComboBox.getValue();
        float totalPrice = price * quantity;

        CartItem p = new CartItem(name, totalPrice, quantity);

        productDetailsTable.getItems().addAll(p);


    }

    @javafx.fxml.FXML
    public void selectProductOnMouseClick(ActionEvent actionEvent) {

        switch (selectProductComboBox.getValue()) {
            case "Soap":
                unitPriceLabel.setText("50");

                break;
            case "Chocolate":
                unitPriceLabel.setText("150");

                break;
            case "Coffee":
                unitPriceLabel.setText("450");
                break;
        }
    }

    @FXML
    public void deleteProductFromCartOnClick(ActionEvent actionEvent) {
        ObservableList<CartItem> selectedItem = productDetailsTable.getSelectionModel().getSelectedItems(); {
            productDetailsTable.getItems().removeAll(selectedItem);

        }


    }

}


