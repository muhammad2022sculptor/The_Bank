/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the_bank;

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
public class Login_Portal_Admin {
    
    static Image AdminImage = new Image("file:///D:/The_Bank/Admin.png");
    static ImageView AdminImageIV = new ImageView(AdminImage);
    static Image Ap4image = new Image("file:///D:/The_Bank/LastScenebg.jpg");
    
    static Image AdminImageInfo = new Image("file:///D:/The_Bank/Info.png");
    static ImageView AdminImageInfoIV = new ImageView(AdminImageInfo);
    
    static Button ChangeButton = new Button("Go to User Login Portal");
    static Button LoginButton = new Button("Log in");
    static Button Exit = new Button("X");
    
    static TextField UserName = new TextField();
    static PasswordField Password = new PasswordField();
    
    static Label AdminLoginLabel = new Label("Welcome  to  Admin  Log  in");
    static Label ChangeInfo = new Label("If you are a Customer then\nCick the Button Below to\ngo to User Log in Portal:");
    static Label UserNameLabel = new Label("User Name:");
    static Label PasswordLabel = new Label("Password:");
    
    
    static AnchorPane Ap4 = new AnchorPane();
    
    static Scene LoginSceneAdmin = new Scene(Ap4,1920,1080);
    
    static Scene SetStage (){
        
        Ap4.setBackground(
                new Background(
                        new BackgroundImage(
                Ap4image,
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
            (The_Bank.tempStage).setScene(Login_Portal_User.SetStage());
        });
        
        ChangeButton.setOnMouseEntered((MouseEvent e)->{
            ChangeButton.setBackground(new Background(new BackgroundFill(Color.DARKGRAY,new CornerRadii(40,40,40,40,false), Insets.EMPTY)));
        });
        
        ChangeButton.setOnMouseExited((MouseEvent e)->{
            ChangeButton.setBackground(new Background(new BackgroundFill(Color.ALICEBLUE,new CornerRadii(40,40,40,40,false), Insets.EMPTY)));
        });
        
        AdminImageInfoIV.setTranslateX(1000);
        AdminImageInfoIV.setTranslateY(545);
        
        ChangeInfo.setTranslateX(1070);
        ChangeInfo.setTranslateY(540);
        ChangeInfo.setFont(Font.font("Sarif",FontWeight.BOLD,16));
        
        LoginButton.setMinSize(80, 40);
        LoginButton.setTranslateX(635+90);
        LoginButton.setTranslateY(535);
        LoginButton.setFont(Font.font("Sarif",FontWeight.BOLD,20));
        LoginButton.setBackground(new Background(new BackgroundFill(Color.GHOSTWHITE,new CornerRadii(40,40,40,40,false), Insets.EMPTY)));
        
        LoginButton.setOnAction((ActionEvent e)->{
            
            if(UserName.getText().equals("admin") && Password.getText().equals("admin"))
            {   try {
                Thread.sleep(1000);
                UserName.setText("");
                Password.setText("");
                Thread.sleep(500);
                } catch (InterruptedException ex) {
                        System.out.println(ex);
                }finally{
            (The_Bank.SceneRightNow) = Logged_In_Admin.SetScene();
                (The_Bank.tempStage).setScene(The_Bank.SceneRightNow);
                Logged_In_Admin LA = new Logged_In_Admin();
                LA.PlayAll();
            }
            }
            else
            {
                
            }
            
        });
        
        LoginButton.setOnMouseEntered((MouseEvent e)->{
            LoginButton.setBackground(new Background(new BackgroundFill(Color.DARKGRAY,new CornerRadii(40,40,40,40,false), Insets.EMPTY)));
        });
        
        LoginButton.setOnMouseExited((MouseEvent e)->{
            LoginButton.setBackground(new Background(new BackgroundFill(Color.GHOSTWHITE,new CornerRadii(40,40,40,40,false), Insets.EMPTY)));
        });
        
        AdminLoginLabel.setTranslateX(555);
        AdminLoginLabel.setTranslateY(330+30+20);
        AdminLoginLabel.setFont(Font.font("Alegreya Sans ExtraBold", FontWeight.NORMAL, 26));
        
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
        
        AdminImageIV.setTranslateX(610);
        AdminImageIV.setTranslateY(130);
        
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
        
       
        
        
        return LoginSceneAdmin;
    }
    
    static void SetChildrenALog(){
         Ap4.getChildren().addAll(AdminImageIV,ChangeButton,AdminLoginLabel,
                UserName,Password,LoginButton,ChangeInfo,AdminImageInfoIV,
                UserNameLabel,PasswordLabel,Exit);
    }
}
