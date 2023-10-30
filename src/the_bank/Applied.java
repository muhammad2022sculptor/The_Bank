/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the_bank;

import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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

/**
 *
 * @author Shahiryar
 */
public class Applied {
    
    static AnchorPane Ap52 = new AnchorPane();
    
    static Scene scene3 = new Scene(Ap52,1920,1080);
    
    static Button Ok = new Button("OK");
    
    static Label Thankyou = new Label("     Thank you for choosing our \n"
                                    + "Services you will get your account\n"
                                    + " active very soon. And don't worry about\n"
                                    + "your personal information and the documents\n"
                                    + " they are in safe hands and are kept\n"
                                    + "private from others. This paper work\n"
                                    + " is just to make our bank community\n"
                                    + "     a safe place for our members.");
    
    static Image Ap52image = new Image("file:///D:/The_Bank/LastScenebg.jpg");
    
    static Scene SetScene(){
        
        Ap52.setBackground(
                new Background(
                        new BackgroundImage(
                                Ap52image,
                                BackgroundRepeat.NO_REPEAT,
                                BackgroundRepeat.NO_REPEAT,
                                BackgroundPosition.DEFAULT,
                                BackgroundSize.DEFAULT
                                )));
        
        
        Ok.setTranslateX(1000);
        Ok.setTranslateY(600);
        Ok.setMinSize(100, 60);
        Ok.setFont(new Font(24));
        Ok.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(30,30,30,30,false),Insets.EMPTY)));
        
        Ok.setOnAction((ActionEvent e)->{
            (The_Bank.SceneRightNow) = Login_Portal_User.SetStage();
            (The_Bank.tempStage).setScene(The_Bank.SceneRightNow);
            });
        Ok.setOnMouseEntered((MouseEvent e)->{
        Ok.setBackground(new Background(new BackgroundFill(Color.DARKGRAY,new CornerRadii(30,30,30,30,false),Insets.EMPTY)));            
        });
        Ok.setOnMouseExited((MouseEvent e)->{
        Ok.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(30,30,30,30,false),Insets.EMPTY)));            
        });
        Thankyou.setTranslateX(250);
        Thankyou.setTranslateY(150);
        Thankyou.setFont(Font.font("Sans Sarif", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 30));
        
        return scene3;
    }
    
    static void SetChildren(){
        
        Ap52.getChildren().addAll(Ok,Thankyou);
        
    }
    
}
