/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the_bank;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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
import javafx.scene.text.FontWeight;

/**
 *
 * @author Shahiryar
 */
public class Login_Portal_User {
    
    Client_UI JUI = new Client_UI();
    
    static Image UserImage = new Image("file:///D:/The_Bank/User.png");
    static ImageView UserImageIV = new ImageView(UserImage);
    static Image Ap3image = new Image("file:///D:/The_Bank/LastScenebg.jpg");
    
    static Image UserImageInfo = new Image("file:///D:/The_Bank/Info.png");
    static ImageView UserImageInfoIV = new ImageView(UserImageInfo);
    
    static Button ChangeButton = new Button("Go to Admin Login Portal");
    static Button LoginButton = new Button("Log in");
    static Button CreateAccountButton = new Button("Create New Account");
    static Button Exit = new Button("X");
    
    static TextField UserName = new TextField();
    static PasswordField Password = new PasswordField();
    
    static Label UserLoginLabel = new Label("Welcome  to  User  Log  in");
    static Label ChangeInfo = new Label("If you are a Customer then\nCick the Button Below to\ngo to Admin Log in Portal:");
    static Label UserNameLabel = new Label("User Name:");
    static Label PasswordLabel = new Label("Password:");
    static Label LoginError = new Label();
    
    static String Dir;
    
    static AnchorPane Ap3 = new AnchorPane();
    
    static Scene LoginSceneUser = new Scene(Ap3,1920,1080);
    
    static Scene SetStage (){
        
        Ap3.setBackground(
                new Background(
                        new BackgroundImage(
                Ap3image,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT)));
        
        ChangeButton.setMinSize(80, 40);
        ChangeButton.setTranslateX(500+500+40);
        ChangeButton.setTranslateY(420+200);
        ChangeButton.setFont(Font.font("Sarif",FontWeight.SEMI_BOLD,18));
        ChangeButton.setBackground(new Background(new BackgroundFill(Color.ALICEBLUE,new CornerRadii(40,40,40,40,false), Insets.EMPTY)));
        
        ChangeButton.setOnAction((ActionEvent e)->{
            (The_Bank.tempStage).setScene(Login_Portal_Admin.SetStage());
        });
        
        ChangeButton.setOnMouseEntered((MouseEvent e)->{
            ChangeButton.setBackground(new Background(new BackgroundFill(Color.DARKGRAY,new CornerRadii(40,40,40,40,false), Insets.EMPTY)));
        });
        
        ChangeButton.setOnMouseExited((MouseEvent e)->{
            ChangeButton.setBackground(new Background(new BackgroundFill(Color.ALICEBLUE,new CornerRadii(40,40,40,40,false), Insets.EMPTY)));
        });
        
        UserImageInfoIV.setTranslateX(1000);
        UserImageInfoIV.setTranslateY(545);
        
        ChangeInfo.setTranslateX(1070);
        ChangeInfo.setTranslateY(540);
        ChangeInfo.setFont(Font.font("Sarif",FontWeight.BOLD,16));
        
        LoginButton.setMinSize(80, 40);
        LoginButton.setTranslateX(635+90);
        LoginButton.setTranslateY(535);
        LoginButton.setFont(Font.font("Sarif",FontWeight.BOLD,20));
        LoginButton.setBackground(new Background(new BackgroundFill(Color.GHOSTWHITE,new CornerRadii(40,40,40,40,false), Insets.EMPTY)));
        
        CreateAccountButton.setMinSize(60, 40);
        CreateAccountButton.setTranslateX(500);
        CreateAccountButton.setTranslateY(535);
        CreateAccountButton.setFont(Font.font("Sarif",FontWeight.BOLD,20));
        CreateAccountButton.setBackground(new Background(new BackgroundFill(Color.GHOSTWHITE,new CornerRadii(40,40,40,40,false), Insets.EMPTY)));
        
        CreateAccountButton.setOnAction((ActionEvent e)->{
           (The_Bank.tempStage).setScene(Client_UI.SetStage());
            try {
                Thread.sleep(300);
            } catch (InterruptedException ex) {
                Logger.getLogger(Login_Portal_User.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                Client_UI JUI = new Client_UI();
                JUI.PlayALL();
            }
           
        });
        
        CreateAccountButton.setOnMouseEntered((MouseEvent e)->{
            CreateAccountButton.setBackground(new Background(new BackgroundFill(Color.DARKGRAY,new CornerRadii(40,40,40,40,false), Insets.EMPTY)));
        });
        
        CreateAccountButton.setOnMouseExited((MouseEvent e)->{
            CreateAccountButton.setBackground(new Background(new BackgroundFill(Color.GHOSTWHITE,new CornerRadii(40,40,40,40,false), Insets.EMPTY)));
        });
        
        LoginError.setTranslateX(100);
        LoginError.setTranslateY(100);
        LoginError.setFont(new Font(24));
        
        LoginButton.setOnAction((ActionEvent e)->{
            
           try{ 
               Dir = "D:/The_Bank/Data/"+UserName.getText()+".txt";
            
            File file = new File(Dir);
            
            if(file.exists())
            {
                Logged_In_User.Dir=Dir;
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                   br.readLine();
                
               if(br.readLine().equals(UserName.getText())||(br.readLine().equals(UserName.getText())))
               {
                   The_Bank.SceneRightNow = Logged_In_User.SetScene();
                   The_Bank.tempStage.setScene(The_Bank.SceneRightNow);
                   Logged_In_User lu = new Logged_In_User();
                   lu.PlayAll();
                   LoginError.setText("");
               }
               else
               {
                   LoginError.setText("Invalid Password/UserName!");
                   LoginError.setTextFill(Color.RED);
               }
            }
           }catch(Exception ex){
               System.out.println(ex);
           }
            
        });
        
        LoginButton.setOnMouseEntered((MouseEvent e)->{
            LoginButton.setBackground(new Background(new BackgroundFill(Color.DARKGRAY,new CornerRadii(40,40,40,40,false), Insets.EMPTY)));
        });
        
        LoginButton.setOnMouseExited((MouseEvent e)->{
            LoginButton.setBackground(new Background(new BackgroundFill(Color.GHOSTWHITE,new CornerRadii(40,40,40,40,false), Insets.EMPTY)));
        });
        
        UserLoginLabel.setTranslateX(555);
        UserLoginLabel.setTranslateY(330+30+20);
        UserLoginLabel.setFont(Font.font("Alegreya Sans ExtraBold", FontWeight.NORMAL, 26));
        
        UserName.setTranslateX(575);
        UserName.setTranslateY(375+30+20);
        UserName.setFont(Font.font("Sans Serif",FontWeight.EXTRA_BOLD,18));
        UserName.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(40,40,40,40,false), Insets.EMPTY)));
        
        UserNameLabel.setTranslateX(470);
        UserNameLabel.setTranslateY(435);
        UserNameLabel.setFont(new Font(18));
        
        Password.setTranslateX(575);
        Password.setTranslateY(475);
        Password.setFont(Font.font("Sans Serif",FontWeight.EXTRA_BOLD,18));
        Password.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(40,40,40,40,false), Insets.EMPTY)));
        
        PasswordLabel.setTranslateX(480);
        PasswordLabel.setTranslateY(480);
        PasswordLabel.setFont(new Font(18));
        
        UserImageIV.setTranslateX(610);
        UserImageIV.setTranslateY(130);
        
        Exit.setBackground(new Background(new BackgroundFill(Color.TOMATO,new CornerRadii(10,10,10,10,true),Insets.EMPTY)));
        Exit.setMinSize(50, 50);
        Exit.setTranslateX(1270);
        Exit.setTranslateY(50);
        
      
        Exit.setOnAction((ActionEvent e)->{
            (The_Bank.tempStage).close();
            });
      
        Exit.setOnMouseEntered((MouseEvent e) -> {
            Exit.setBackground(new Background(new BackgroundFill(Color.BROWN,new CornerRadii(30),Insets.EMPTY)));
        });
      
        Exit.setOnMouseExited((MouseEvent e) -> {
            Exit.setBackground(new Background(new BackgroundFill(Color.TOMATO,new CornerRadii(10,10,10,10,true),Insets.EMPTY)));
        });
        
        
        
        
        return LoginSceneUser;
    }
    
    static void SetChildrenULog(){
        Ap3.getChildren().addAll(UserImageIV,ChangeButton,UserLoginLabel,
                UserName,Password,LoginButton,ChangeInfo,UserImageInfoIV,
                UserNameLabel,PasswordLabel,CreateAccountButton,Exit,LoginError);
    }
    
    
    
}
