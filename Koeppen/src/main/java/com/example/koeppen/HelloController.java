package com.example.koeppen;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class HelloController {
    @FXML
    public Text cost;
    @FXML
    private Text enjoy;
    @FXML
    public TextField students;
    @FXML
    public TextField minutes;
    @FXML
    public TextField tuition;
    @FXML
    public TextField credits;
    public float minuteValue;
    @FXML
    private float calculatedCost;

    @FXML
    protected void onCalculate() {
        minuteValue = Float.parseFloat(tuition.getText()) / 2 / Integer.parseInt(credits.getText()) / 50 / 14;
        System.out.print(minuteValue);
        calculatedCost = (int)((Integer.parseInt(minutes.getText()) * minuteValue * Integer.parseInt(students.getText()))*100);
        calculatedCost = calculatedCost/100;
        try {
            cost.setText(String.valueOf(calculatedCost));
            enjoy.setText("Enjoy the rest of your time with Koeppen!");
        } catch (Exception e){

        }

    }
}
