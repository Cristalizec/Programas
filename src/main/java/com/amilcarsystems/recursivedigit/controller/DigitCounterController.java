package com.amilcarsystems.recursivedigit.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DigitCounterController {

    @FXML
    private TextField numberInputField;

    @FXML
    private Button calculateButton;

    @FXML
    private Label resultLabel;

    @FXML
    private void initialize() {
        calculateButton.setOnAction(e -> countDigitsAction());
    }

    private void countDigitsAction() {
        try {
            int number = Integer.parseInt(numberInputField.getText());
            if(number <= 0) {
                resultLabel.setText("Ingresa un número positivo.");
            } else {
                int digits = countDigits(number);
                resultLabel.setText("El número " + number + " tiene " + digits + " dígitos.");
            }
        } catch (NumberFormatException e) {
            resultLabel.setText("Debes ingresar un número válido.");
        }
    }

    private int countDigits(int num) {
        if(num <= 0) return 0;
        return 1 + countDigits(num / 10);
    }
}