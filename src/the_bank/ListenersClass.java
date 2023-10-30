/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the_bank;

import java.time.LocalDate;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Tooltip;
import javafx.scene.paint.Color;

/**
 *
 * @author Shahiryar
 */
public class ListenersClass extends Client_UI{
    
    boolean DPCheck = true;
    
    void Start(){
     FirstName.lengthProperty().addListener((ObservableValue<? extends Number> observable, Number oldValue, Number newValue) -> {
         if (newValue.intValue() > oldValue.intValue()) {
             
             if (FirstName.getText().length() >= 15) {
                 FirstName.setText(FirstName.getText().substring(0, 15));
             }
         }
     });
        
        FirstName.textProperty().addListener((observable, oldValue, newValue) -> {
        if (!newValue.matches("[a-zA-Z]*")) {
            FirstName.setText(newValue.replaceAll("[^\\sa-zA-Z]", ""));
        }
    });
        
     
        
        LastName.textProperty().addListener((observable, oldValue, newValue) -> {
        if (!newValue.matches("[a-zA-Z]*")) {
            LastName.setText(newValue.replaceAll("[^a-zA-Z]", ""));
        }
    });
        
        
     LastName.lengthProperty().addListener((ObservableValue<? extends Number> observable, Number oldValue, Number newValue) -> {
         if (newValue.intValue() > oldValue.intValue()) {
             if (LastName.getText().length() >= 15) {
                 LastName.setText(LastName.getText().substring(0, 15));
             }
         }
     });
        
        LastName.textProperty().addListener((observable, oldValue, newValue) -> {
        if (!newValue.matches("\\sa-zA-Z*")) {
            LastName.setText(newValue.replaceAll("[^\\sa-zA-Z]", ""));
        }
    });
        EmailAddress.textProperty().addListener((observable, oldValue, newValue) -> {
        if ((!newValue.contains("@")) || (!(newValue.contains(".com")))) {
            EmailError.setText("Invalid");
            EmailError.setTextFill(Color.RED);
        }
        else
        {
            EmailError.setText(" ");
        }
        
        });
        
        ConfirmEmailAddress.textProperty().addListener((ObservableValue<? extends String> observable, String oldValue, String newValue) -> {
            if ((!newValue.contains("@")) || (!(newValue.contains(".com")))) {
                ConfirmEmailError.setText("Invalid");
                ConfirmEmailError.setTextFill(Color.RED);
                
            }
            else
            {
                ConfirmEmailError.setText(" ");
            }
            
            if(ConfirmEmailAddress.getText().equals(EmailAddress.getText()))
            {
                EmailError.setText("Matched!");
                EmailError.setTextFill(Color.GREEN);
                ConfirmEmailError.setText("Matched!");
                ConfirmEmailError.setTextFill(Color.GREEN);
            }
     });
        
        CNIC.textProperty().addListener((observable, oldValue, newValue) -> {
            if(!newValue.matches("[0-9]*")){
                CNIC.setText(oldValue);
                newValue="";
            }
        });
        
        
        CNIC.lengthProperty().addListener((ObservableValue<? extends Number> observable, Number oldValue, Number newValue) -> {
         if (newValue.intValue() > oldValue.intValue()) {
             
             if (CNIC.getText().length() >= 13) {
                 CNIC.setText(CNIC.getText().substring(0, 13));
             }
         }
         if(newValue.intValue()>0 && newValue.intValue()<13)
         {
             CNICError.setText("Invalid");
             CNICError.setTextFill(Color.RED);
         }
         else
         {
             CNICError.setText("");
         }
         
     });
        
        
        AddressLine1.lengthProperty().addListener((ObservableValue<? extends Number> observable, Number oldValue, Number newValue) -> {
            if (newValue.intValue() > oldValue.intValue()) {
                
                if (AddressLine1.getText().length() >= 25) {
                    AddressLine1.setText(AddressLine1.getText().substring(0, 25));
                }
            }
     });
        AddressLine2.lengthProperty().addListener((ObservableValue<? extends Number> observable, Number oldValue, Number newValue) -> {
            if (newValue.intValue() > oldValue.intValue()) {
                
                if (AddressLine2.getText().length() >= 25) {
                    AddressLine2.setText(AddressLine2.getText().substring(0, 25));
                }
            }
     });
       
        PhoneNumber1.textProperty().addListener((observable, oldValue, newValue) -> {
            if(!newValue.matches("[0-9]*")){
                PhoneNumber1.setText(oldValue);
                newValue="";
            }
        });
        
        PhoneNumber1.lengthProperty().addListener((ObservableValue<? extends Number> observable, Number oldValue, Number newValue) -> {
         if (newValue.intValue() > oldValue.intValue()) {
             
             if (PhoneNumber1.getText().length() >= 11) {
                 PhoneNumber1.setText(PhoneNumber1.getText().substring(0, 11));
             }
         }
         if(newValue.intValue()>0 && newValue.intValue()<11)
         {
             PhoneNumber1Error.setText("Invalid");
             PhoneNumber1Error.setTextFill(Color.RED);
         }
         else
         {
             PhoneNumber1Error.setText("");
         }
         
     });
        PhoneNumber2.textProperty().addListener((observable, oldValue, newValue) -> {
            if(!newValue.matches("[0-9]*")){
                PhoneNumber2.setText(oldValue);
                newValue="";
            }
        });
        
        PhoneNumber2.lengthProperty().addListener((ObservableValue<? extends Number> observable, Number oldValue, Number newValue) -> {
         if (newValue.intValue() > oldValue.intValue()) {
             
             if (PhoneNumber2.getText().length() >= 11) {
                 PhoneNumber2.setText(PhoneNumber2.getText().substring(0, 11));
             }
         }
         if(newValue.intValue()>0 && newValue.intValue()<11)
         {
             PhoneNumber2Error.setText("Invalid");
             PhoneNumber2Error.setTextFill(Color.RED);
         }
         else
         {
             PhoneNumber2Error.setText("");
         }
         
     });
        
         City.textProperty().addListener((observable, oldValue, newValue) -> {
        if (!newValue.matches("\\sa-zA-Z*")) {
            City.setText(newValue.replaceAll("[^\\sa-zA-Z]", ""));
        }
    });
        
         City.lengthProperty().addListener((ObservableValue<? extends Number> observable, Number oldValue, Number newValue) -> {
         if (newValue.intValue() > oldValue.intValue()) {
             if (City.getText().length() >= 15) {
                 City.setText(City.getText().substring(0, 15));
             }
         }
         if(newValue.intValue()<=4)
         {
             CityError.setText("Invalid");
             CityError.setTextFill(Color.RED);
         }
         else
             CityError.setText("");
     });
        
         
         PostalCode.textProperty().addListener((observable, oldValue, newValue) -> {
            if(!newValue.matches("[0-9]*")){
                PostalCode.setText(oldValue);
                newValue="";
            }
        });
         
        PostalCode.lengthProperty().addListener((ObservableValue<? extends Number> observable, Number oldValue, Number newValue) -> {
         if (newValue.intValue() > oldValue.intValue()) {
             if (PostalCode.getText().length() >= 5) {
                 PostalCode.setText(PostalCode.getText().substring(0, 5));
             }
         }
     });
        
        PostalCode.lengthProperty().addListener((ObservableValue<? extends Number> observable, Number oldValue, Number newValue) -> {
         if (newValue.intValue() > oldValue.intValue()) {
             
             if (PostalCode.getText().length() > 5) {
                 PostalCode.setText(PostalCode.getText().substring(0, 5));
             }
         }
         if(newValue.intValue()>0 && newValue.intValue()<5)
         {
             PostalCodeError.setText("Invalid");
             PostalCodeError.setTextFill(Color.RED);
         }
         else
         {
             PostalCodeError.setText("");
         }
    });
        
        DP1.lengthProperty().addListener((ObservableValue<? extends Number> observable, Number oldValue, Number newValue) -> {
         if (newValue.intValue() > oldValue.intValue()) {
             
             if (DP1.getText().length() >= 2) {
                 DP1.setText(DP1.getText().substring(0, 2));
             }
         }
         
     });
        DP1.textProperty().addListener((observable, oldValue, newValue) -> {
            if(!newValue.matches("[0-9]*")){
                DP1.setText(oldValue);
                newValue="";
            }
        });
        DP2.lengthProperty().addListener((ObservableValue<? extends Number> observable, Number oldValue, Number newValue) -> {
         if (newValue.intValue() > oldValue.intValue()) {
             
             if (DP2.getText().length() >= 2) {
                 DP2.setText(DP2.getText().substring(0, 2));
             }
         }
         
     });
        DP2.textProperty().addListener((observable, oldValue, newValue) -> {
            if(!newValue.matches("[0-9]*")){
                DP2.setText(oldValue);
                newValue="";
            }
        });
        DP3.lengthProperty().addListener((ObservableValue<? extends Number> observable, Number oldValue, Number newValue) -> {
         if (newValue.intValue() > oldValue.intValue()) {
             
             if (DP3.getText().length() >= 4) {
                 DP3.setText(DP3.getText().substring(0, 4));
             }
         }
         
     });
        DP3.textProperty().addListener((observable, oldValue, newValue) -> {
            if(!newValue.matches("[0-9]*")){
                DP3.setText(oldValue);
                newValue="";
            }
        });
        
        UserName.lengthProperty().addListener((ObservableValue<? extends Number> observable, Number oldValue, Number newValue) -> {
         if (newValue.intValue() > oldValue.intValue()) {
             
             if (UserName.getText().length() >= 6) {
                 UserName.setText(UserName.getText().substring(0, 6));
             }
         }
         
     });
        
    }
}
