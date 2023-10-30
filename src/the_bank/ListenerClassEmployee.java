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
public class ListenerClassEmployee extends Employee {
    
    
    static void StartEmployee () {
        
        EmploymentStatus.lengthProperty().addListener((ObservableValue<? extends Number> observable, Number oldValue, Number newValue) -> {
         if (newValue.intValue() > oldValue.intValue()) {
             if (EmploymentStatus.getText().length() >= 15) {
                 EmploymentStatus.setText(EmploymentStatus.getText().substring(0, 15));
             }
         }
    });
    
    EmploymentStatus.textProperty().addListener((observable, oldValue, newValue) -> {
        if (!newValue.matches("\\sa-zA-Z*")) {
            EmploymentStatus.setText(newValue.replaceAll("[^\\sa-zA-Z]", ""));
        }
    });
       
    EmploymentID.lengthProperty().addListener((ObservableValue<? extends Number> observable, Number oldValue, Number newValue) -> {
         if (newValue.intValue() > oldValue.intValue()) {
             if (EmploymentID.getText().length() >= 15) {
                 EmploymentID.setText(EmploymentID.getText().substring(0, 15));
             }
         }
    });
    
    CompanyName.lengthProperty().addListener((ObservableValue<? extends Number> observable, Number oldValue, Number newValue) -> {
         if (newValue.intValue() > oldValue.intValue()) {
             if (CompanyName.getText().length() >= 15) {
                 CompanyName.setText(CompanyName.getText().substring(0, 15));
             }
         }
    });
    
    CompanyCity.textProperty().addListener((observable, oldValue, newValue) -> {
        if (!newValue.matches("\\sa-zA-Z*")) {
            CompanyCity.setText(newValue.replaceAll("[^\\sa-zA-Z]", ""));
        }
    });
    
    CompanyCity.lengthProperty().addListener((ObservableValue<? extends Number> observable, Number oldValue, Number newValue) -> {
         if (newValue.intValue() > oldValue.intValue()) {
             if (CompanyCity.getText().length() >= 15) {
                 CompanyCity.setText(CompanyCity.getText().substring(0, 15));
             }
         }
    });
    
    OpeningAmount.textProperty().addListener((observable, oldValue, newValue) -> {
            if(!newValue.matches("[0-9]*")){
                OpeningAmount.setText(oldValue);
                newValue="";
            }
        });
    
    }
}
