package com.example.simplecalculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class SimpleCalculatorController {

    boolean start = true;
    String operator = "";
    double num1 = 0;

    @FXML
    TextField display;

    @FXML
    void offButtonAction() {
        System.exit(1);
    }

    @FXML
    void allClearButtonAction() {
        display.setText("");
        start = true;
    }

    @FXML
    void clearButtonAction() {
        String oldText = display.getText();
        if(oldText.equals("")) return;
        String newText = oldText.substring(0 , oldText.length()-1);
        display.setText(newText);
    }

    @FXML
    void numberButtonAction(ActionEvent event) {
        if (start==true) {
            display.setText("");
            start = false;
        }
        String oldText = display.getText();
        String newText = ((Button)event.getSource()).getText();
        String number = oldText + newText;
        display.setText(number);
    }


    @FXML
    void operatorAction(ActionEvent event) {
        num1 = Double.parseDouble(display.getText());
        operator = ((Button)event.getSource()).getText();
        display.setText("");
    }

    @FXML
    void resultButtonAction(ActionEvent event) {
        double num2 = Double.parseDouble(display.getText());
        Double output;
        switch (operator) {
            case "+" :
                output = num1 + num2;
                display.setText(output.toString());
                break;
            case "-" :
                output = num1 - num2;
                display.setText(output.toString());
                break;
            case "X" :
                output = num1 * num2;
                display.setText(output.toString());
                break;
            case "/" :
                output = num1 / num2;
                display.setText(output.toString());
                break;
        }

        start = true;
    }

    @FXML
    void dotButtonAction() {
        String text = display.getText();
        if (text.contains(".")) return;
        display.setText(text + ".");;
    }

    @FXML
    void moduleButtonAction() {
        String num2 = display.getText();
        Double res = (num1 * Double.parseDouble(num2)) / 100;
        display.setText(res.toString());
    }


}
