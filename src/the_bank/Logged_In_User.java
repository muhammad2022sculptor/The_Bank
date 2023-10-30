/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the_bank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.util.Duration;
import static the_bank.Client_UI_2.AccountType;
import static the_bank.Client_UI_2.Depart;
import static the_bank.Client_UI_2.StudentPassword;
import static the_bank.Client_UI_2.UniAddress;
import static the_bank.Client_UI_2.UniCity;
import static the_bank.Client_UI_2.UniIDName;
import static the_bank.Client_UI_2.UniIDRollNo;
import static the_bank.Client_UI_2.UniName;
import static the_bank.Logged_In_Admin.Addrs;

/**
 *
 * @author Shahiryar
 */
public class Logged_In_User {
    
   static AnchorPane Ap5 = new AnchorPane();
    
    static Scene scene = new Scene(Ap5,1920,1080);
    
    static Button Withdraw = new Button("Withdraw");
    static Button DeleteAccount = new Button("Delete My\nAccount");
    static Button EditAccount = new Button("Edit My\nAccount");
    static Button Loan = new Button("Loan");
    static Button Deposit = new Button("Deposit");
    static Button Logout = new Button("Logout");
    
    static TextField WithdrawTextField = new TextField();
    static TextField DepositTextField = new TextField();
    static TextField LoanTextField = new TextField();
    
    static Label WithdrawLabel = new Label("Withdraw Amount:");
    static Label DepositLabel = new Label("Deposit Amount:");
    static Label LoanLabel = new Label("Loan Amount:");
    static Label InfoLabel = new Label();
    
    static String Dir=Login_Portal_User.Dir;
    
    static Image Ap5image = new Image("file:///D:/The_Bank/LastScenebg.jpg");
    
    int i=0; int minus = 16;
    Timeline timeline3 = new Timeline(new KeyFrame(
        Duration.millis(24-minus),
        ae -> { if(i<151)
        {LoanTextFieldSize(i);
        i = i+2;
        }
        }));
    int j=0;
    Timeline timeline1 = new Timeline(new KeyFrame(
        Duration.millis(20-minus),
        ae -> { if(j<151)
        {WithdrawTextFieldSize(j);
        j = j+2;
        }
        }));
    int k = 0;
    Timeline timeline2 = new Timeline(new KeyFrame(
        Duration.millis(22-minus),
        ae -> { if(k<151)
        {WithdrawTextFieldSize(k);
        k =k+2;
        }
        }));
    
    static Scene SetScene(){
        
        Ap5.setBackground(
                new Background(
                        new BackgroundImage(
                                Ap5image,
                                BackgroundRepeat.NO_REPEAT,
                                BackgroundRepeat.NO_REPEAT,
                                BackgroundPosition.DEFAULT,
                                BackgroundSize.DEFAULT
                                )));
        
        
        
        Withdraw.setFont(Font.font("New Rock",FontWeight.SEMI_BOLD, FontPosture.ITALIC, 16));
        Withdraw.setTranslateX(200);
        Withdraw.setTranslateY(500);
        Withdraw.setMinSize(150, 150);
        Withdraw.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(100,10,100,10,false),Insets.EMPTY)));
        
        WithdrawTextField.setTranslateX(200);
        WithdrawTextField.setTranslateY(450);
        WithdrawTextField.setMinSize(150, 40);
        WithdrawTextField.setMaxSize(150, 40);
        WithdrawTextField.setFont(new Font(18));
        WithdrawTextField.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(40,40,40,40,false), Insets.EMPTY)));
        
        
        WithdrawLabel.setTranslateX(200);
        WithdrawLabel.setTranslateY(430);
        
        Withdraw.setOnAction((ActionEvent e)->{
            
            try { if(!Dir.isEmpty())
            {
               FileReader fr = new FileReader(Dir);
                 
               BufferedReader br = new BufferedReader(fr);
               
               br.readLine();
               br.readLine();
               br.readLine();
               
                  int Balance=Integer.parseInt(br.readLine());
                  int Dep = Integer.parseInt(WithdrawTextField.getText());
                    
                  Balance = Balance-Dep;
                  
                  br.close();
                  fr.close();


                               FileWriter fr2 = new FileWriter(Dir);
                            BufferedWriter br3 = new BufferedWriter(fr2);

                                br3.write("Student");
                                br3.newLine();
                                br3.write(Client_UI.UserName.getText());
                                br3.newLine();
                                br3.write(StudentPassword.getText());
                                br3.newLine();
                                br3.write(String.valueOf(Balance))  ;
                                br3.newLine();
                                br3.write(Client_UI.CNIC.getText());
                                br3.newLine();
                                br3.write(Client_UI.FirstName.getText())  ;
                                br3.newLine();
                                br3.write(Client_UI.LastName.getText())  ;
                                br3.newLine();
                                br3.write(Client_UI.EmailAddress.getText())  ;
                                br3.newLine();
                                br3.write(Client_UI.DP1.getText()+" "+Client_UI.DP2.getText()+" "+Client_UI.DP3.getText())  ;
                                br3.newLine();
                                br3.write(String.valueOf(Client_UI.Gender.getValue()))  ;
                                br3.newLine();
                                br3.write(Client_UI.AddressLine1.getText())  ;
                                br3.newLine();
                                br3.write(Client_UI.AddressLine2.getText())  ;
                                br3.newLine();
                                br3.write(Client_UI.PhoneNumber1.getText())  ;
                                br3.newLine();
                                br3.write(Client_UI.PhoneNumber2.getText())  ;
                                br3.newLine();
                                br3.write(Client_UI.City.getText())  ;
                                br3.newLine();
                                br3.write(Client_UI.PostalCode.getText())  ;
                                br3.newLine();
                                br3.write(Client_UI.State.getText())  ;
                                br3.newLine();
                                br3.write(Client_UI.Country.getText())  ;
                                br3.newLine();
                                br3.newLine();
                                br3.write("Employment Description:");
                                br3.newLine();
                                //br3.write(AccountType.getValue().toString());
                                br3.newLine();
                                br3.write(UniName.getText());
                                br3.newLine();
                                br3.write(UniIDName.getText());
                                br3.newLine();
                                br3.write(UniIDRollNo.getText());
                                br3.newLine();
                                br3.write(Depart.getText());
                                br3.newLine();
                                br3.write(UniAddress.getText());
                                br3.newLine();
                                br3.write(UniCity.getText());
                                
                                br3.flush();
                                br3.close();
                                fr.close();
                                
                                
                         
            }
            } catch (FileNotFoundException ex) {
                     
                 } catch (IOException ex) {
             
            }
            
        });
        Withdraw.setOnMouseEntered((MouseEvent e)->{
        Withdraw.setBackground(new Background(new BackgroundFill(Color.DARKGRAY,new CornerRadii(100,10,100,10,false),Insets.EMPTY)));    
        });
        Withdraw.setOnMouseExited((MouseEvent e)->{
        Withdraw.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(100,10,100,10,false),Insets.EMPTY)));    
        });
        
        Deposit.setFont(Font.font("New Rock",FontWeight.SEMI_BOLD, FontPosture.ITALIC, 16));
        Deposit.setTranslateX(1000);
        Deposit.setTranslateY(500);
        Deposit.setMinSize(150, 150);
        Deposit.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(100,10,100,10,false),Insets.EMPTY)));
        
        DepositTextField.setTranslateX(1000);
        DepositTextField.setTranslateY(450);
        DepositTextField.setMinSize(150, 40);
        DepositTextField.setMaxSize(150, 40);
        DepositTextField.setFont(new Font(18));
        DepositTextField.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(40,40,40,40,false), Insets.EMPTY)));
        
        DepositLabel.setTranslateX(1000);
        DepositLabel.setTranslateY(430);
        
        Deposit.setOnAction((ActionEvent e)->{
            
            try { if(!Dir.isEmpty())
            {
               FileReader fr = new FileReader(Dir);
                 
               BufferedReader br = new BufferedReader(fr);
               
               br.readLine();
               br.readLine();
               br.readLine();
               
                  int Balance=Integer.parseInt(br.readLine());
                  int Dep = Integer.parseInt(DepositTextField.getText());
                    
                  Balance = Balance+Dep;
                  
                  br.close();
                  fr.close();


                               FileWriter fr2 = new FileWriter(Dir);
                            BufferedWriter br3 = new BufferedWriter(fr2);

                                br3.write("Student");
                                br3.newLine();
                                br3.write(Client_UI.UserName.getText());
                                br3.newLine();
                                br3.write(StudentPassword.getText());
                                br3.newLine();
                                br3.write(String.valueOf(Balance))  ;
                                br3.newLine();
                                br3.write(Client_UI.CNIC.getText());
                                br3.newLine();
                                br3.write(Client_UI.FirstName.getText())  ;
                                br3.newLine();
                                br3.write(Client_UI.LastName.getText())  ;
                                br3.newLine();
                                br3.write(Client_UI.EmailAddress.getText())  ;
                                br3.newLine();
                                br3.write(Client_UI.DP1.getText()+" "+Client_UI.DP2.getText()+" "+Client_UI.DP3.getText())  ;
                                br3.newLine();
                                br3.write(String.valueOf(Client_UI.Gender.getValue()))  ;
                                br3.newLine();
                                br3.write(Client_UI.AddressLine1.getText())  ;
                                br3.newLine();
                                br3.write(Client_UI.AddressLine2.getText())  ;
                                br3.newLine();
                                br3.write(Client_UI.PhoneNumber1.getText())  ;
                                br3.newLine();
                                br3.write(Client_UI.PhoneNumber2.getText())  ;
                                br3.newLine();
                                br3.write(Client_UI.City.getText())  ;
                                br3.newLine();
                                br3.write(Client_UI.PostalCode.getText())  ;
                                br3.newLine();
                                br3.write(Client_UI.State.getText())  ;
                                br3.newLine();
                                br3.write(Client_UI.Country.getText())  ;
                                br3.newLine();
                                br3.newLine();
                                br3.write("Employment Description:");
                                br3.newLine();
                                br3.write(AccountType.getValue().toString());
                                br3.newLine();
                                br3.write(UniName.getText());
                                br3.newLine();
                                br3.write(UniIDName.getText());
                                br3.newLine();
                                br3.write(UniIDRollNo.getText());
                                br3.newLine();
                                br3.write(Depart.getText());
                                br3.newLine();
                                br3.write(UniAddress.getText());
                                br3.newLine();
                                br3.write(UniCity.getText());
                                
                                br3.flush();
                                br3.close();
                                fr.close();
                                
                                
                         
            }
            } catch (FileNotFoundException ex) {
                     
                 } catch (IOException ex) {
             
            }
            
        });
        Deposit.setOnMouseEntered((MouseEvent e)->{
        Deposit.setBackground(new Background(new BackgroundFill(Color.DARKGRAY,new CornerRadii(100,10,100,10,false),Insets.EMPTY)));    
        });
        Deposit.setOnMouseExited((MouseEvent e)->{
        Deposit.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(100,10,100,10,false),Insets.EMPTY)));    
        });
        
        InfoLabel.setTranslateX(100);
        InfoLabel.setTranslateY(100);
        InfoLabel.setFont(new Font(24));
        
        DeleteAccount.setFont(Font.font("New Rock",FontWeight.SEMI_BOLD, FontPosture.ITALIC, 16));
        DeleteAccount.setTranslateX(400);
        DeleteAccount.setTranslateY(500);
        DeleteAccount.setMinSize(150, 150);
        DeleteAccount.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(100,10,100,10,false),Insets.EMPTY)));
        DeleteAccount.setOnAction((ActionEvent e)->{
            
            if(!Dir.isEmpty())
            {
                File file = new File(Dir);
                file.delete();
                InfoLabel.setText("The record of "+Login_Portal_User.UserName.getText()+" has been removed!");
            }
            
        });
        DeleteAccount.setOnMouseEntered((MouseEvent e)->{
        DeleteAccount.setBackground(new Background(new BackgroundFill(Color.DARKGRAY,new CornerRadii(100,10,100,10,false),Insets.EMPTY)));    
        });
        DeleteAccount.setOnMouseExited((MouseEvent e)->{
        DeleteAccount.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(100,10,100,10,false),Insets.EMPTY)));    
        });
        EditAccount.setFont(Font.font("New Rock",FontWeight.SEMI_BOLD, FontPosture.ITALIC, 16));
        EditAccount.setTranslateX(600);
        EditAccount.setTranslateY(500);
        EditAccount.setMinSize(150, 150);
        EditAccount.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(100,10,100,10,false),Insets.EMPTY)));
        EditAccount.setOnAction((ActionEvent e)->{
            
            try {
                FileReader fr = new FileReader(Dir);
                BufferedReader br = new BufferedReader(fr);
                String i;
                
                if((i=br.readLine())=="Student")
                Client_UI_2.StudentButton = true;
                else
                Client_UI_2.StudentButton = false;    
                Client_UI.UserName.setText(br.readLine());
                if(i=="Student")
                Client_UI_2.EmployeePassword.setText(br.readLine());
                else
                Client_UI_2.StudentPassword.setText(br.readLine());
                
                if(i=="Student")
                Client_UI_2.OpeningAmount.setText(br.readLine());
                else
                Client_UI_2.OpeningAmountStudent.setText(br.readLine());
                
                Client_UI.CNIC.setText(br.readLine());
                
                Client_UI.FirstName.setText(br.readLine());
                Client_UI.LastName.setText(br.readLine());
                Client_UI.EmailAddress.setText(br.readLine());
                Client_UI.ConfirmEmailAddress.setText(Client_UI.EmailAddress.getText());
                
                String line = br.readLine();
                String [] arr = new String[10];
                      arr =  line.split(" ");
                
               try{ Client_UI.DP1.setText(arr[0]);
                Client_UI.DP2.setText(arr[1]);
                Client_UI.DP3.setText(arr[2]);
               }catch(Exception c){
                   
               }
                Client_UI.Gender.setValue(br.readLine());
                
                Client_UI.AddressLine1.setText(br.readLine());
                Client_UI.AddressLine2.setText(br.readLine());
                
                Client_UI.PhoneNumber1.setText(br.readLine());
                Client_UI.PhoneNumber2.setText(br.readLine());
                Client_UI.City.setText(br.readLine());
                Client_UI.PostalCode.setText(br.readLine());
                Client_UI.State.setText(br.readLine());
                Client_UI.Country.setText(br.readLine());
                br.readLine();
                br.readLine();
                
                Client_UI_2.AccountType.setValue(br.readLine());
                Client_UI_2.UniName.setText(br.readLine());
                Client_UI_2.UniIDName.setText(br.readLine());
                Client_UI_2.UniIDRollNo.setText(br.readLine());
                Client_UI_2.Depart.setText(br.readLine());
                Client_UI_2.UniAddress.setText(br.readLine());
                Client_UI_2.UniCity.setText(br.readLine());
                
                The_Bank.SceneRightNow = Client_UI.SetStage();
                The_Bank.tempStage.setScene(The_Bank.SceneRightNow);
                Client_UI UI = new Client_UI();
                UI.PlayALL();
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Logged_In_Admin.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Logged_In_Admin.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        EditAccount.setOnMouseEntered((MouseEvent e)->{
        EditAccount.setBackground(new Background(new BackgroundFill(Color.DARKGRAY,new CornerRadii(100,10,100,10,false),Insets.EMPTY)));    
        });
        EditAccount.setOnMouseExited((MouseEvent e)->{
        EditAccount.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(100,10,100,10,false),Insets.EMPTY)));    
        });
        Loan.setFont(Font.font("New Rock",FontWeight.SEMI_BOLD, FontPosture.ITALIC, 16));
        Loan.setTranslateX(800);
        Loan.setTranslateY(500);
        Loan.setMinSize(150, 150);
        Loan.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(100,10,100,10,false),Insets.EMPTY)));
        
        LoanLabel.setTranslateX(800);
        LoanLabel.setTranslateY(430);
        
        LoanTextField.setTranslateX(800);
        LoanTextField.setTranslateY(450);
        LoanTextField.setMinSize(150, 40);
        LoanTextField.setMaxSize(150, 40);
        LoanTextField.setFont(new Font(18));
        LoanTextField.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(40,40,40,40,false), Insets.EMPTY)));
        
        Loan.setOnAction((ActionEvent e)->{
            
        });
        Loan.setOnMouseEntered((MouseEvent e)->{
        Loan.setBackground(new Background(new BackgroundFill(Color.DARKGRAY,new CornerRadii(100,10,100,10,false),Insets.EMPTY)));    
        });
        Loan.setOnMouseExited((MouseEvent e)->{
        Loan.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(100,10,100,10,false),Insets.EMPTY)));    
        });
        
        Logout.setBackground(new Background(new BackgroundFill(Color.TOMATO,new CornerRadii(10,10,10,10,true),Insets.EMPTY)));
        Logout.setMinSize(80, 80);
        Logout.setTranslateX(1240);
        Logout.setTranslateY(50);
        
        Logout.setOnAction((ActionEvent e)->{
            Login_Portal_User.UserName.setText("");
            Login_Portal_User.Password.setText("");
            
            The_Bank.SceneRightNow = Login_Portal_User.SetStage();
            The_Bank.tempStage.setScene(The_Bank.SceneRightNow);
            
            
            });
      
        Logout.setOnMouseEntered((MouseEvent e) -> {
            Logout.setBackground(new Background(new BackgroundFill(Color.BROWN,new CornerRadii(100),Insets.EMPTY)));
        });
      
        Logout.setOnMouseExited((MouseEvent e) -> {
            Logout.setBackground(new Background(new BackgroundFill(Color.TOMATO,new CornerRadii(10,10,10,10,true),Insets.EMPTY)));
        });
        
        return scene;
    }
    
    static void SetChilDren(){
        Ap5.getChildren().addAll(Withdraw,WithdrawTextField,WithdrawLabel,Deposit,DepositLabel,DepositTextField,
                Loan,LoanTextField,LoanLabel,DeleteAccount,EditAccount,InfoLabel,Logout);
    }
    
    void LoanTextFieldSize(int i){
        LoanTextField.setMinSize(i, 40);
        LoanTextField.setMaxSize(i, 40);
    }
    void WithdrawTextFieldSize(int i){
        WithdrawTextField.setMinSize(i, 40);
        WithdrawTextField.setMaxSize(i, 40);
    }
    void DepositTextFieldSize(int i){
        DepositTextField.setMinSize(i, 40);
        DepositTextField.setMaxSize(i, 40);
    }
    
    void PlayAll(){
        
        timeline1.setCycleCount(Animation.INDEFINITE);
        timeline1.play();
        
        timeline2.setCycleCount(Animation.INDEFINITE);
        timeline2.play();
        
        timeline3.setCycleCount(Animation.INDEFINITE);
        timeline3.play();
    }
    
}
