/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the_bank;

import javafx.beans.value.ObservableValue;


/**
 *
 * @author Shahiryar
 */
public class ListenerClassStudent extends Student {
    
    static void StartStudent(){
        
    UniName.textProperty().addListener((observable, oldValue, newValue) -> {
        if (!newValue.matches("\\sa-zA-Z*")) {
            UniName.setText(newValue.replaceAll("[^\\sa-zA-Z]", ""));
        }
    });
    
    UniName.lengthProperty().addListener((ObservableValue<? extends Number> observable, Number oldValue, Number newValue) -> {
         if (newValue.intValue() > oldValue.intValue()) {
             if (UniName.getText().length() >= 80) {
                 UniName.setText(UniName.getText().substring(0, 80));
             }
         }
    });
    
    UniIDName.textProperty().addListener((observable, oldValue, newValue) -> {
        if (!newValue.matches("\\sa-zA-Z*")) {
            UniIDName.setText(newValue.replaceAll("[^\\sa-zA-Z]", ""));
        }
    });
    
    UniIDName.lengthProperty().addListener((ObservableValue<? extends Number> observable, Number oldValue, Number newValue) -> {
         if (newValue.intValue() > oldValue.intValue()) {
             if (UniIDName.getText().length() >= 30) {
                 UniIDName.setText(UniIDName.getText().substring(0, 30));
             }
         }
    });
    
    UniIDRollNo.lengthProperty().addListener((ObservableValue<? extends Number> observable, Number oldValue, Number newValue) -> {
         if (newValue.intValue() > oldValue.intValue()) {
             if (UniIDRollNo.getText().length() >= 10) {
                 UniIDRollNo.setText(UniIDRollNo.getText().substring(0, 10));
             }
         }
    });
    
    Depart.lengthProperty().addListener((ObservableValue<? extends Number> observable, Number oldValue, Number newValue) -> {
         if (newValue.intValue() > oldValue.intValue()) {
             if (Depart.getText().length() >= 25) {
                 Depart.setText(Depart.getText().substring(0, 25));
             }
         }
    });
    
    Depart.textProperty().addListener((observable, oldValue, newValue) -> {
        if (!newValue.matches("\\sa-zA-Z*")) {
            Depart.setText(newValue.replaceAll("[^\\sa-zA-Z]", ""));
        }
    });
    
    UniAddress.lengthProperty().addListener((ObservableValue<? extends Number> observable, Number oldValue, Number newValue) -> {
         if (newValue.intValue() > oldValue.intValue()) {
             if (UniAddress.getText().length() >= 40) {
                 UniAddress.setText(UniAddress.getText().substring(0, 40));
             }
         }
    });
    
    UniCity.lengthProperty().addListener((ObservableValue<? extends Number> observable, Number oldValue, Number newValue) -> {
         if (newValue.intValue() > oldValue.intValue()) {
             if (UniCity.getText().length() >= 15) {
                 UniCity.setText(UniCity.getText().substring(0, 15));
             }
         }
    });
    
    UniCity.textProperty().addListener((observable, oldValue, newValue) -> {
        if (!newValue.matches("\\sa-zA-Z*")) {
            UniCity.setText(newValue.replaceAll("[^\\sa-zA-Z]", ""));
        }
    });
    
    OpeningAmountStudent.textProperty().addListener((observable, oldValue, newValue) -> {
            if(!newValue.matches("[0-9]*")){
                OpeningAmountStudent.setText(oldValue);
                newValue="";
            }
        });
    
    }
}
