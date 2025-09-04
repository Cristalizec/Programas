package com.amilcarsystems.recursivesum.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {
    @FXML
    private TextField inputField;

    @FXML
    private Button calculateButton;

    @FXML
    private Label resultLabel;

    // Método recursivo
    private int sum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sum(n - 1);
        }
    }

    @FXML
    private void handleCalculate() {
        try {
            int n = Integer.parseInt(inputField.getText());

            if (n <= 0) {
                resultLabel.setText("Enter a positive number!");
                return;
            }

            int result = sum(n);
            resultLabel.setText("Result: " + result);

        } catch (NumberFormatException e) {
            resultLabel.setText("Please enter a valid integer!");
        }
    }
}