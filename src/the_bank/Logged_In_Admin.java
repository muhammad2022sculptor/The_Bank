/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the_bank;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
/**
 *
 * @author Shahiryar
 */
public class Logged_In_Admin {
    
    static AnchorPane Ap5 = new AnchorPane();
    
    static Scene scene = new Scene(Ap5,1920,1080);
    
    static Button CreateAccount = new Button("Create Account");
    static Button DeleteAccount = new Button("Delete Account");
    static Button EditAccount = new Button("Edit Account");
    static Button SearchAccount = new Button("Search Account");
    static Button OpenNewRequests = new Button("Open\nNew Account\nRequests");
    static Button Logout = new Button("Logout");
    
    static TextField Search = new TextField();
    
    static Label SearchLabel = new Label("Search?");
    
    static Image Ap5image = new Image("file:///D:/The_Bank/LastScenebg.jpg");
    
    
    static String Addrs;
    
    int i=0; int minus = 16;
    Timeline timeline4 = new Timeline(new KeyFrame(
        Duration.millis(18-minus),
        ae -> { if(i<151)
        {SearchSize(i);
        i = i+2;
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
        
        
        
        CreateAccount.setFont(Font.font("New Rock",FontWeight.SEMI_BOLD, FontPosture.ITALIC, 16));
        CreateAccount.setTranslateX(200);
        CreateAccount.setTranslateY(500);
        CreateAccount.setMinSize(150, 150);
        CreateAccount.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(100,10,100,10,false),Insets.EMPTY)));
        CreateAccount.setOnAction((ActionEvent e)->{
            The_Bank.SceneRightNow = Client_UI.SetStage();
            The_Bank.tempStage.setScene(The_Bank.SceneRightNow);
            Client_UI UI = new Client_UI();
            Client_UI_2 UI2 = new Client_UI_2();
            UI2.emptyAll();
            UI.PlayALL();
        });
        CreateAccount.setOnMouseEntered((MouseEvent e)->{
        CreateAccount.setBackground(new Background(new BackgroundFill(Color.DARKGRAY,new CornerRadii(100,10,100,10,false),Insets.EMPTY)));    
        });
        CreateAccount.setOnMouseExited((MouseEvent e)->{
        CreateAccount.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(100,10,100,10,false),Insets.EMPTY)));    
        });
        
        DeleteAccount.setFont(Font.font("New Rock",FontWeight.SEMI_BOLD, FontPosture.ITALIC, 16));
        DeleteAccount.setTranslateX(400);
        DeleteAccount.setTranslateY(500);
        DeleteAccount.setMinSize(150, 150);
        DeleteAccount.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(100,10,100,10,false),Insets.EMPTY)));
        DeleteAccount.setOnAction((ActionEvent e)->{
            
            if(!Addrs.isEmpty())
            {
                File file = new File(Addrs);
                file.delete();
                SearchLabel.setText("The record of "+Search.getText()+" has been removed!");
            }
            else
                SearchLabel.setText("You Can't press delete! First Search!");
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
                FileReader fr = new FileReader(Addrs);
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
                
                try{Client_UI.DP1.setText(arr[0]);
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
        SearchAccount.setFont(Font.font("New Rock",FontWeight.SEMI_BOLD, FontPosture.ITALIC, 16));
        SearchAccount.setTranslateX(800);
        SearchAccount.setTranslateY(500);
        SearchAccount.setMinSize(150, 150);
        SearchAccount.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(100,10,100,10,false),Insets.EMPTY)));
        
        Search.setTranslateX(800);
        Search.setTranslateY(450);
        Search.setMinSize(0, 40);
        Search.setMaxSize(0, 40);
        Search.setFont(new Font(18));
        Search.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(10,40,40,10,false), Insets.EMPTY)));
        
        SearchLabel.setTranslateX(800);
        SearchLabel.setTranslateY(430);
        
        SearchAccount.setOnAction((ActionEvent e)->{
            
            File file =  new File("D:/The_Bank/Data/"+Search.getText()+".txt");
            
            if (file.exists())
            {
                Addrs="D:/The_Bank/Data/"+Search.getText()+".txt";
                SearchLabel.setText("Record Exists!");
            }
            else{
                SearchLabel.setText("Record doesn't Exist!");
            }
            
        });
        SearchAccount.setOnMouseEntered((MouseEvent e)->{
        SearchAccount.setBackground(new Background(new BackgroundFill(Color.DARKGRAY,new CornerRadii(100,10,100,10,false),Insets.EMPTY)));    
        });
        SearchAccount.setOnMouseExited((MouseEvent e)->{
        SearchAccount.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(100,10,100,10,false),Insets.EMPTY)));    
        });
        OpenNewRequests.setFont(Font.font("New Rock",FontWeight.SEMI_BOLD, FontPosture.ITALIC, 16));
        OpenNewRequests.setTranslateX(1000);
        OpenNewRequests.setTranslateY(500);
        OpenNewRequests.setMinSize(150, 150);
        OpenNewRequests.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(100,10,100,10,false),Insets.EMPTY)));
        OpenNewRequests.setOnAction((ActionEvent e)->{
            
        });
        OpenNewRequests.setOnMouseEntered((MouseEvent e)->{
        OpenNewRequests.setBackground(new Background(new BackgroundFill(Color.DARKGRAY,new CornerRadii(100,10,100,10,false),Insets.EMPTY)));    
        });
        OpenNewRequests.setOnMouseExited((MouseEvent e)->{
        OpenNewRequests.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(100,10,100,10,false),Insets.EMPTY)));    
        });
        
        Logout.setBackground(new Background(new BackgroundFill(Color.TOMATO,new CornerRadii(10,10,10,10,true),Insets.EMPTY)));
        Logout.setMinSize(80, 80);
        Logout.setTranslateX(1240);
        Logout.setTranslateY(50);
        
        Logout.setOnAction((ActionEvent e)->{
            The_Bank.SceneRightNow = Login_Portal_Admin.SetStage();
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
        Ap5.getChildren().addAll(CreateAccount,DeleteAccount,EditAccount,SearchAccount,Search,SearchLabel,OpenNewRequests,Logout);
    }
    
    void SearchSize(int i){
        Search.setMinSize(i, 40);
        Search.setMaxSize(i, 40);
    }
    
    void PlayAll(){
        timeline4.setCycleCount(Animation.INDEFINITE);
        timeline4.play();
    }
    
}
