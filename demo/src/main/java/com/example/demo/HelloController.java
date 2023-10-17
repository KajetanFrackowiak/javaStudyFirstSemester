package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

import static java.time.LocalDate.*;

public class HelloController {

    @FXML
    private Label name;

    @FXML
    private TextField textField;


    @FXML
    private DatePicker datePicker;
    @FXML
    public Label result;

    @FXML
    protected void onHelloButtonClick() {
        String enteredName = textField.getText();
        LocalDate selectedDate = datePicker.getValue();


    }


}
}