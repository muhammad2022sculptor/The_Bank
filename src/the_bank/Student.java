/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the_bank;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.util.Duration;

/**
 *
 * @author Shahiryar
 */
public class Student extends Client_UI_2{
    
    private int i=0; private int minus = 12;
    private Timeline timeline1 = new Timeline(new KeyFrame(
        Duration.millis(18-minus),
        ae -> { if(i<251)
        {UniIDNameSize(i);
        i = i+2;
        }
        }));
    private int j=0; 
    private Timeline timeline2 = new Timeline(new KeyFrame(
        Duration.millis(19-minus),
        ae -> { if(j<251)
        {UniIDRollNoSize(j);
        j = j+2;
        }
        }));
    private int k=0;
    private Timeline timeline3 = new Timeline(new KeyFrame(
        Duration.millis(20-minus),
        ae -> { if(k<251)
        {DepartSize(k);
        k = k+2;
        }
        }));
    private int l=0;
    private Timeline timeline4 = new Timeline(new KeyFrame(
        Duration.millis(21-minus),
        ae -> { if(l<251)
        {UniAddressSize(l);
        l = l+2;
        }
        }));
    private int m=0;
    private Timeline timeline5 = new Timeline(new KeyFrame(
        Duration.millis(22-minus),
        ae -> { if(m<251)
        {UniCitySize(m);
        m = m+2;
        }
        }));
    private int p=0;
    private Timeline timeline7 = new Timeline(new KeyFrame(
        Duration.millis(23-minus),
        ae -> { if(p<251)
        {OpeningAmountStudentSize(p);
        p = p+2;
        }
        }));
    private int q=0;
    private Timeline timeline8 = new Timeline(new KeyFrame(
        Duration.millis(23-minus),
        ae -> { if(q<251)
        {StudentPasswordSize(q);
        q = q+2;
        }
        }));
    private int r=0;
    private Timeline timeline9 = new Timeline(new KeyFrame(
        Duration.millis(25-minus),
        ae -> { if(r<251)
        {StudentConfirmPasswordSize(r);
        r = r+2;
        }
        }));
    private int n=0;
    private Timeline timeline6 = new Timeline(new KeyFrame(
        Duration.millis(17-minus),
        ae -> { if(n<251)
        {UniNameSize(n);
        n = n+2;
        }
        }));
    private int o=0;
    private Timeline timeline0 = new Timeline(new KeyFrame(
        Duration.millis(16-minus),
        ae -> { if(o<251)
        {AccountTypeSize(o);
        o = o+2;
        }
        }));
    
    static void SETChildrenStudent(){
        
        
        UniName.setTranslateX(250);
        UniName.setTranslateY(270);
        UniName.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(10,40,40,10,false), Insets.EMPTY)));
        
        UniNameLabel.setTranslateX(105);
        UniNameLabel.setTranslateY(275);
        UniNameLabel.setFont(new Font(18));
        
        UniIDName.setTranslateX(250);
        UniIDName.setTranslateY(330);
        UniIDName.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(10,40,40,10,false), Insets.EMPTY)));
        
        UniIDNameLabel.setTranslateX(95);
        UniIDNameLabel.setTranslateY(335);
        UniIDNameLabel.setFont(new Font(18));
        
        UniIDRollNo.setTranslateX(250);
        UniIDRollNo.setTranslateY(390);
        UniIDRollNo.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(10,40,40,10,false), Insets.EMPTY)));
        
        UniIDRollNoLabel.setTranslateX(105);
        UniIDRollNoLabel.setTranslateY(395);
        UniIDRollNoLabel.setFont(new Font(18));
        
        Depart.setTranslateX(250);
        Depart.setTranslateY(450);
        Depart.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(10,40,40,10,false), Insets.EMPTY)));
        
        DepartLabel.setTranslateX(150);
        DepartLabel.setTranslateY(455);
        DepartLabel.setFont(new Font(18));
        
        UniAddress.setTranslateX(250);
        UniAddress.setTranslateY(510);
        UniAddress.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(10,40,40,10,false), Insets.EMPTY)));
        
        StudentPassword.setTranslateX(690);
        StudentPassword.setTranslateY(420+120);
        StudentPassword.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(10,40,40,10,false), Insets.EMPTY)));
        
        StudentPasswordError.setTranslateX(760);
        StudentPasswordError.setTranslateY(580);
        
        StudentPasswordLabel.setTranslateX(610);
        StudentPasswordLabel.setTranslateY(545);
        StudentPasswordLabel.setFont(new Font(18));
        
        UniAddressLabel.setTranslateX(100);
        UniAddressLabel.setTranslateY(515);
        UniAddressLabel.setFont(new Font(18));
        
        UniCity.setTranslateX(250);
        UniCity.setTranslateY(570);
        UniCity.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(10,40,40,10,false), Insets.EMPTY)));
        
        StudentConfirmPassword.setTranslateX(690);
        StudentConfirmPassword.setTranslateY(480+120);
        StudentConfirmPassword.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(10,40,40,10,false), Insets.EMPTY)));
        
        StudentConfirmPasswordLabel.setTranslateX(540);
        StudentConfirmPasswordLabel.setTranslateY(605);
        StudentConfirmPasswordLabel.setFont(new Font(18));
        
        UniCityLabel.setTranslateX(132.5);
        UniCityLabel.setTranslateY(575);
        UniCityLabel.setFont(new Font(18));
        
        OpeningAmountStudent.setTranslateX(250);
        OpeningAmountStudent.setTranslateY(630);
        OpeningAmountStudent.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(10,40,40,10,false), Insets.EMPTY)));
        
        OpeningAmountStudentLabel.setTranslateX(132.5-22.5);
        OpeningAmountStudentLabel.setTranslateY(635);
        OpeningAmountStudentLabel.setFont(new Font(18));
        
        Ap2.getChildren().addAll(
                JobDescription,OccupationLabel,AccountType,AccountTypeLabel,EmployeeAccount,SwitchStoE,Exit,GoBack,
                UniIDName,UniIDRollNo,UniName,UniNameLabel,Depart,UniAddress,UniCity,OpeningAmountStudent,OpeningAmountStudentLabel,
                BrowseCNICStudent,BrowseCNICStudentFile,BrowseUniID,BrowseUniIDFile,BrowseUtilityBillStudent,BrowseUtilityBillStudentFile,
                UniIDNameLabel,UniIDRollNoLabel,DepartLabel,UniAddressLabel,UniCityLabel,Apply,WelcomeLabel,
                Client_UI.ValidityLabel,StudentPassword,StudentConfirmPassword,StudentPasswordLabel,StudentConfirmPasswordLabel,
                StudentPasswordError
                );
    }
    
    void AccountTypeSize(int i){ 
        AccountType.setMinSize(i,40);
        AccountType.setMaxSize(i,40);
    } 
    void UniIDNameSize(int i){ 
        UniIDName.setMinSize(i,40);
        UniIDName.setMaxSize(i,40);
    } 
    void UniIDRollNoSize(int i){ 
        UniIDRollNo.setMinSize(i,40);
        UniIDRollNo.setMaxSize(i,40);
    } 
    void DepartSize(int i){ 
        Depart.setMinSize(i,40);
        Depart.setMaxSize(i,40);
    } 
    void UniAddressSize(int i){ 
        UniAddress.setMinSize(i,40);
        UniAddress.setMaxSize(i,40);
    } 
    void UniCitySize(int i){ 
        UniCity.setMinSize(i,40);
        UniCity.setMaxSize(i,40);
    } 
    void UniNameSize(int i){ 
        UniName.setMinSize(i,40);
        UniName.setMaxSize(i,40);
    } 
    void OpeningAmountStudentSize(int i){ 
        OpeningAmountStudent.setMinSize(i,40);
        OpeningAmountStudent.setMaxSize(i,40);
    } 
    void StudentPasswordSize(int i){ 
        StudentPassword.setMinSize(i,40);
        StudentPassword.setMaxSize(i,40);
    } 
    void StudentConfirmPasswordSize(int i){ 
        StudentConfirmPassword.setMinSize(i,40);
        StudentConfirmPassword.setMaxSize(i,40);
    } 
    
    @Override
    void PlayAll(){
        
        timeline0.setCycleCount(Animation.INDEFINITE);
        timeline0.play();
        
        timeline1.setCycleCount(Animation.INDEFINITE);
        timeline1.play();
        
        timeline2.setCycleCount(Animation.INDEFINITE);
        timeline2.play();
    
        timeline3.setCycleCount(Animation.INDEFINITE);
        timeline3.play();
        
        timeline4.setCycleCount(Animation.INDEFINITE);
        timeline4.play();
        
        timeline5.setCycleCount(Animation.INDEFINITE);
        timeline5.play();
        
        timeline6.setCycleCount(Animation.INDEFINITE);
        timeline6.play();
        
        timeline7.setCycleCount(Animation.INDEFINITE);
        timeline7.play();
        
        timeline8.setCycleCount(Animation.INDEFINITE);
        timeline8.play();
        
        timeline9.setCycleCount(Animation.INDEFINITE);
        timeline9.play();
        
    }
    
}
