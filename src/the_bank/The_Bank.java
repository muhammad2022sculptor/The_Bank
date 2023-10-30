/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the_bank;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.WindowEvent;
import javafx.util.Duration;

/**
 *
 * @author Shahiryar
 */
public class The_Bank extends Application {

    static Stage tempStage = new Stage(StageStyle.UNDECORATED);
    
    LastScene lc = new LastScene();
    StartUp_UI SUI = new StartUp_UI();
    Client_UI JUI = new Client_UI();
    Client_UI_2 JUI2 = new Client_UI_2();
    Employee E = new Employee();
    static Scene SceneRightNow;
    
    @Override
    public void init (){
        Client_UI_2.SetChildren();
        ListenerClassStudent.StartStudent();
        ListenerClassEmployee.StartEmployee();
        Login_Portal_User.SetChildrenULog();
        Login_Portal_Admin.SetChildrenALog();
        Client_UI.addOnce();
        Logged_In_Admin.SetChilDren();
        Applied.SetChildren();
        Logged_In_User.SetChilDren();
    }
    
    @Override
    public void start(Stage primaryStage){
        
        //tempStage.setScene(Logged_In_User.SetScene());
        tempStage.setScene(SUI.SetStage());
        lc.SetStage();
        //tempStage.setScene(Logged_In_Admin.SetScene());
        tempStage.setOnShowing((WindowEvent e)->{
           tempStage.setMaximized(true);
           SetJUI();
        });
        tempStage.show();
       
    }
    
      
       
    
    void SetJUI(){
       Timeline timelineJUI = new Timeline(new KeyFrame(
                Duration.millis(5000),
                ae -> {
                   (The_Bank.tempStage).setScene(Login_Portal_User.SetStage());
                }));
       timelineJUI.play();
    }
    
    public static void main(String [] arg){
        launch(arg);
    }
}
