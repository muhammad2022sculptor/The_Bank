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
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Shahiryar
 */
public class LastScene {
    static Button lastExit = new Button("Quit");
    static Label lastLabel = new Label("Are you sure, You want to Quit?"
            + "\nAny Unsaved changes will be lost!");
    Button No = new Button ("No");
    
    static AnchorPane Borderp =  new AnchorPane();
    static Scene lastscene = new Scene(Borderp,1920,1080);
    static Stage stg = new Stage(StageStyle.UNDECORATED);
    
    static Image Gifimage = new Image("file:///D:/The_Bank/question1.png");
    static ImageView GifIV = new ImageView(Gifimage);
    
    static Image Borderpimage = new Image("file:///D:/The_Bank/LastScenebg.jpg");
    
    Client_UI JUI = new Client_UI();
    Client_UI_2 JUI2 = new Client_UI_2();
    
    void SetStage(){
            
            
            int x =560, y=250;
           
           GifIV.setTranslateY(370);
           GifIV.setTranslateX(430);
           
           lastLabel.setTranslateY(370);
           lastLabel.setTranslateX(500);
           lastLabel.setFont(Font.font("Sarif",FontWeight.BOLD,20));
           
           lastExit.setTranslateY(340+y);
           lastExit.setTranslateX(560+x);
           lastExit.setFont(Font.font("Sarif",FontWeight.BOLD,20));
           lastExit.setMinSize(100, 100);
           lastExit.setBackground(new Background(new BackgroundFill(Color.TOMATO, new CornerRadii(10,10,10,10,true),Insets.EMPTY)));
           
           No.setTranslateY(340+y);
           No.setTranslateX(440+x);
           No.setFont(Font.font("Sarif",FontWeight.BOLD,20));
           No.setMinSize(100, 100);
           No.setBackground(new Background(new BackgroundFill(Color.GREEN, new CornerRadii(10,10,10,10,true),Insets.EMPTY)));
           
           lastExit.setOnAction((ActionEvent e)->{
              (The_Bank.tempStage).close();
           });
           
           No.setOnAction((ActionEvent e)->{
              (The_Bank.tempStage).setScene(The_Bank.SceneRightNow);
           });
           
           No.setOnMouseEntered((MouseEvent e) -> {
            No.setBackground(new Background(new BackgroundFill(Color.LIGHTGREEN,new CornerRadii(10,10,10,10,true),Insets.EMPTY)));
        });
      
        No.setOnMouseExited((MouseEvent e) -> {
            No.setBackground(new Background(new BackgroundFill(Color.GREEN,new CornerRadii(10,10,10,10,true),Insets.EMPTY)));
        });
           
           lastExit.setOnMouseEntered((MouseEvent e) -> {
            lastExit.setBackground(new Background(new BackgroundFill(Color.BROWN,new CornerRadii(10,10,10,10,true),Insets.EMPTY)));
        });
      
        lastExit.setOnMouseExited((MouseEvent e) -> {
            lastExit.setBackground(new Background(new BackgroundFill(Color.TOMATO,new CornerRadii(10,10,10,10,true),Insets.EMPTY)));
        });
           
           
           
           Borderp.getChildren().addAll(lastLabel,lastExit,GifIV,No);
           Borderp.setBackground(
                new Background(
                        new BackgroundImage(
                Borderpimage,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT)));
           
    }
    
}
