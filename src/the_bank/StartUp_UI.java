/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the_bank;

import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;


/**
 *
 * @author Shahiryar
 */
public class StartUp_UI {
    
    AnchorPane ap = new AnchorPane();
    
    Scene scene = new Scene(ap,1920,1080);
    
    ProgressBar pb = new ProgressBar();
    
    Image logoimage = new Image("file:///D:/The_Bank/Bank Logo.png");
    ImageView LogoIV = new ImageView(logoimage);
    
    Image AnchorPaneimage = new Image("file:///D:/The_Bank/LastScenebg.jpg");
    
    public Scene SetStage(){
        
        pb.setTranslateX(600-20);
        pb.setTranslateY(550);
        pb.setMinSize(200, 20);
        
        LogoIV.setTranslateX(595-120);
        LogoIV.setTranslateY(330-200);
        
        ap.setBackground(
                new Background(
                        new BackgroundImage(
                AnchorPaneimage,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT)));
       
        
        ap.getChildren().addAll(pb,LogoIV);
        return scene;
    }
    
}
