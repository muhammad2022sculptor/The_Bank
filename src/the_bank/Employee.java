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
public class Employee extends Client_UI_2 {
    
    private int o=0;private int minus = 12;
    private Timeline timeline0 = new Timeline(new KeyFrame(
        Duration.millis(17-minus),
        ae -> { if(o<251)
        {AccountTypeSize(o);
        o = o+2;
        }
        }));
    private int i=0; 
    private Timeline timeline1 = new Timeline(new KeyFrame(
        Duration.millis(18-minus),
        ae -> { if(i<251)
        {EmploymentStatusSize(i);
        i = i+2;
        }
        }));
    private int j=0; 
    private Timeline timeline2 = new Timeline(new KeyFrame(
        Duration.millis(19-minus),
        ae -> { if(j<251)
        {EmploymentIDSize(j);
        j = j+2;
        }
        }));
    private int k=0;
    private Timeline timeline3 = new Timeline(new KeyFrame(
        Duration.millis(20-minus),
        ae -> { if(k<251)
        {CompanyNameSize(k);
        k = k+2;
        }
        }));
    private int l=0;
    private Timeline timeline4 = new Timeline(new KeyFrame(
        Duration.millis(21-minus),
        ae -> { if(l<251)
        {CompanyAddressSize(l);
        l = l+2;
        }
        }));
    private int m=0;
    private Timeline timeline5 = new Timeline(new KeyFrame(
        Duration.millis(22-minus),
        ae -> { if(m<251)
        {CompanyCitySize(m);
        m = m+2;
        }
        }));
    private int n=0;
    private Timeline timeline6 = new Timeline(new KeyFrame(
        Duration.millis(23-minus),
        ae -> { if(n<251)
        {OpeningAmountSize(n);
        n = n+2;
        }
        }));
    private int q=0;
    private Timeline timeline7 = new Timeline(new KeyFrame(
        Duration.millis(24-minus),
        ae -> { if(q<251)
        {EmployeePasswordSize(q);
        q = q+2;
        }
        }));
    private int p=0;
    private Timeline timeline8 = new Timeline(new KeyFrame(
        Duration.millis(25-minus),
        ae -> { if(p<251)
        {EmployeeConfirmPasswordSize(p);
        p = p+2;
        }
        }));
    
    static void SETChildrenEmployee(){
        
        EmploymentStatus.setTranslateX(250);
        EmploymentStatus.setTranslateY(270);
        EmploymentStatus.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(10,40,40,10,false), Insets.EMPTY)));
        
        EmploymentStatusLabel.setTranslateX(90);
        EmploymentStatusLabel.setTranslateY(275);
        EmploymentStatusLabel.setFont(new Font(18));
        
        EmploymentID.setTranslateX(250);
        EmploymentID.setTranslateY(330);
        EmploymentID.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(10,40,40,10,false), Insets.EMPTY)));
        
        EmploymentIDLabel.setTranslateX(150);
        EmploymentIDLabel.setTranslateY(335);
        EmploymentIDLabel.setFont(new Font(18));
        
        CompanyName.setTranslateX(250);
        CompanyName.setTranslateY(390);
        CompanyName.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(10,40,40,10,false), Insets.EMPTY)));
        
        CompanyNameLabel.setTranslateX(170);
        CompanyNameLabel.setTranslateY(395);
        CompanyNameLabel.setFont(new Font(18));
        
        CompanyAddress.setTranslateX(250);
        CompanyAddress.setTranslateY(450);
        CompanyAddress.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(10,40,40,10,false), Insets.EMPTY)));
        
        CompanyAddressLabel.setTranslateX(100);
        CompanyAddressLabel.setTranslateY(455);
        CompanyAddressLabel.setFont(new Font(18));
        
        EmployeePassword.setTranslateX(690);
        EmployeePassword.setTranslateY(420+120);
        EmployeePassword.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(10,40,40,10,false), Insets.EMPTY)));
        
        EmployeePasswordError.setTranslateX(760);
        EmployeePasswordError.setTranslateY(580);
        
        EmployeePasswordLabel.setTranslateX(610);
        EmployeePasswordLabel.setTranslateY(545);
        EmployeePasswordLabel.setFont(new Font(18));
        
        CompanyCity.setTranslateX(250);
        CompanyCity.setTranslateY(510);
        CompanyCity.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(10,40,40,10,false), Insets.EMPTY)));
        
        CompanyCityLabel.setTranslateX(132.5);
        CompanyCityLabel.setTranslateY(515);
        CompanyCityLabel.setFont(new Font(18));
        
        EmployeeConfirmPassword.setTranslateX(690);
        EmployeeConfirmPassword.setTranslateY(480+120);
        EmployeeConfirmPassword.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(10,40,40,10,false), Insets.EMPTY)));
        
        EmployeeConfirmPasswordLabel.setTranslateX(540);
        EmployeeConfirmPasswordLabel.setTranslateY(605);
        EmployeeConfirmPasswordLabel.setFont(new Font(18));
        
        
        OpeningAmount.setTranslateX(250);
        OpeningAmount.setTranslateY(570);
        OpeningAmount.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(10,40,40,10,false), Insets.EMPTY)));
        
        OpeningAmountLabel.setTranslateX(132.5-22.5);
        OpeningAmountLabel.setTranslateY(575);
        OpeningAmountLabel.setFont(new Font(18));
        
        Ap2.getChildren().addAll(
                JobDescription,OccupationLabel,AccountType,AccountTypeLabel,StudentAccount,SwitchStoE,Exit,GoBack,
                BrowseCNIC,BrowseCNICFile,BrowseCompanyID,BrowseCompanyIDFile,BrowseUtilityBill,BrowseUtilityBillFile,
                EmploymentStatus,EmploymentID,CompanyName,CompanyAddress,CompanyCity,OpeningAmount,OpeningAmountLabel,
                EmploymentStatusLabel,EmploymentIDLabel,CompanyNameLabel,CompanyAddressLabel,CompanyCityLabel,Apply,
                WelcomeLabel,Client_UI.ValidityLabel,EmployeePassword,EmployeeConfirmPassword,
                EmployeePasswordLabel,EmployeeConfirmPasswordLabel,EmployeePasswordError);
    }
    
    void EmploymentStatusSize(int i){ 
        EmploymentStatus.setMinSize(i,40);
        EmploymentStatus.setMaxSize(i,40);
        
    } 
    void EmploymentIDSize(int i){ 
        EmploymentID.setMinSize(i,40);
        EmploymentID.setMaxSize(i,40);
    } 
    void CompanyNameSize(int i){ 
        CompanyName.setMinSize(i,40);
        CompanyName.setMaxSize(i,40);
    } 
    void CompanyAddressSize(int i){ 
        CompanyAddress.setMinSize(i,40);
        CompanyAddress.setMaxSize(i,40);
    } 
    void CompanyCitySize(int i){ 
        CompanyCity.setMinSize(i,40);
        CompanyCity.setMaxSize(i,40);
    } 
    void AccountTypeSize(int i){ 
        AccountType.setMinSize(i,40);
        AccountType.setMaxSize(i,40);
    } 
    void OpeningAmountSize(int i){ 
        OpeningAmount.setMinSize(i,40);
        OpeningAmount.setMaxSize(i,40);
    } 
    void EmployeePasswordSize(int i){ 
        EmployeePassword.setMinSize(i,40);
        EmployeePassword.setMaxSize(i,40);
    } 
    void EmployeeConfirmPasswordSize(int i){ 
        EmployeeConfirmPassword.setMinSize(i,40);
        EmployeeConfirmPassword.setMaxSize(i,40);
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
        
    }
    
}
