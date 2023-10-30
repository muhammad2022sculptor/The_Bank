/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the_bank;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
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
import javafx.scene.text.FontWeight;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Client_UI_2 {
    
    static AnchorPane Ap2 = new AnchorPane();
    
    static Scene scene2 = new Scene(Ap2,1920,1080);
    static Scene scene;
    
    static boolean AccountTypeCheck = false;//to stop the doubling of ComboBox Items
    static boolean EmployeeButton ;
    static boolean StudentButton ;
    
    static Label JobDescription = new Label("Employment Descripton:");
    static Label WelcomeLabel = new Label("Welcome!");
    static Label SwitchStoE = new Label("Press this Button to shift\nbetween Student or Employee form");
    
    static ComboBox AccountType = new ComboBox();
    
    static Button Apply = new Button ("Apply");
    
    //====================================================================
    //Student Part
    
    static String UniIDfile;
    static String CNICStudentfile;
    static String UtilityBillStudentfile;
    
    static TextField UniIDName = new TextField();
    static TextField UniIDRollNo = new TextField();
    static TextField Depart = new TextField();
    static TextField UniAddress = new TextField();
    static TextField UniCity = new TextField();
    static TextField OpeningAmountStudent = new TextField();
    static TextField UniName = new TextField();
    static TextField StudentPassword = new TextField();
    static TextField StudentConfirmPassword = new TextField();
    
    static Label StudentPasswordError = new Label();
    static Label StudentPasswordLabel = new Label("Password:");
    static Label StudentConfirmPasswordLabel = new Label("Confirm Password:");
    static Label UniIDNameLabel = new Label("University ID Name:");
    static Label UniIDRollNoLabel = new Label("University Roll No:");
    static Label DepartLabel = new Label("Department:");
    static Label UniAddressLabel = new Label("University Address:");
    static Label UniCityLabel = new Label("University City:");
    static Label OpeningAmountStudentLabel = new Label("Opening Amount:");
    static Label UniNameLabel = new Label("University Name:");
    
    static Button BrowseCNICStudent = new Button ("Browse");
    static Button BrowseUniID = new Button ("Browse");
    static Button BrowseUtilityBillStudent = new Button ("Browse");
    
    static Label BrowseCNICStudentFile = new Label("Browse CNIC Image file (png or jpg)!");
    static Label BrowseUniIDFile = new Label("Browse Student ID/Fee Slip(Payed) Image file (png or jpg)!");
    static Label BrowseUtilityBillStudentFile = new Label("Browse Utility Bill Image file (png or jpg)!");
    
    //====================================================================
    //Employee Part
    
    static String CompanyIDfile;
    static String CNICfile;
    static String UtilityBillfile;
    
    static TextField EmploymentStatus = new TextField();
    static TextField EmploymentID = new TextField();
    static TextField CompanyName = new TextField();
    static TextField CompanyAddress = new TextField();
    static TextField CompanyCity = new TextField();
    static TextField OpeningAmount = new TextField();
    static TextField EmployeePassword = new TextField();
    static TextField EmployeeConfirmPassword = new TextField();
    
    void emptyAll(){
    
    EmploymentStatus.setText("");
    EmploymentID.setText("");
    CompanyName.setText("");
    CompanyAddress.setText("");
    CompanyCity.setText("");
    OpeningAmount.setText("");
    EmployeePassword.setText("");
    EmployeeConfirmPassword.setText("");
    
    UniIDName.setText("");
    UniIDRollNo.setText("");
    Depart.setText("");
    UniAddress.setText("");
    UniCity.setText("");
    OpeningAmountStudent.setText("");
    UniName.setText("");
    StudentPassword.setText("");
    StudentConfirmPassword.setText("");
    }
    
    
    static Label EmployeePasswordError = new Label();
    static Label EmployeePasswordLabel = new Label("Password:");
    static Label EmployeeConfirmPasswordLabel = new Label("Confirm Password:");
    static Label EmploymentStatusLabel = new Label("Employment Status:");
    static Label EmploymentIDLabel = new Label("Designation:");
    static Label CompanyNameLabel = new Label("Company:");
    static Label CompanyAddressLabel = new Label("Company Address:");
    static Label CompanyCityLabel = new Label("Company City:");
    static Label OpeningAmountLabel = new Label("Opening Amount:");
    
    static Button BrowseCNIC = new Button ("Browse");
    static Button BrowseCompanyID = new Button ("Browse");
    static Button BrowseUtilityBill = new Button ("Browse");
    
    static Label BrowseCNICFile = new Label("Browse CNIC Image file (png or jpg)!");
    static Label BrowseCompanyIDFile = new Label("Browse Company ID Image file (png or jpg)!");
    static Label BrowseUtilityBillFile = new Label("Browse Utility Bill Image file (png or jpg)!");
    
    //====================================================================
    
    static Label AccountTypeLabel = new Label("Account Type:");
    static Label AccountTypeError = new Label();
    static Label OccupationLabel = new Label("Occupation:");
    
    static Button EmployeeAccount =  new Button("go to");
    static Button StudentAccount = new Button("go to");
    static Button Exit = new Button("X");
    static Button GoBack = new Button("Go Back");
    
    static Image Ap2image = new Image("file:///D:/The_Bank/LastScenebg.jpg");
    
    int minus = 12;
    
     int j=0;
   
    int l = 0;
    Timeline timeline4 = new Timeline(new KeyFrame(
        Duration.millis(18-minus),
        ae -> { if(l<251)
        {AccountTypeSize(l);
        l = l+2;
        }
        }));
    
    private static int x=-210;
    private static int y=-40;
    
    static Scene SetStage(){
        Ap2.setBackground(
                new Background(
                        new BackgroundImage(
                Ap2image,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT)));
        
        JobDescription.setFont(Font.font("Alegreya Sans ExtraBold", FontWeight.EXTRA_BOLD, 32));
        JobDescription.setTranslateX(280+x);
        JobDescription.setTranslateY(100+y);
        
        WelcomeLabel.setFont(Font.font("Alegreya Sans ExtraBold", FontWeight.EXTRA_BOLD, 32));
        WelcomeLabel.setTranslateX(880+x);
        WelcomeLabel.setTranslateY(100+y);
        
        StudentAccount.setTranslateX(300);
        StudentAccount.setTranslateY(150);
        StudentAccount.setMinSize(80,40);
        StudentAccount.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(40,40,40,40,false), Insets.EMPTY)));
        
        StudentAccount.setOnAction((ActionEvent e)->{
            SwitchStoE.setText("Press This Button to\ngo to Employee Form.");
            StudentButton = true;
            EmployeeButton = false;
            WelcomeLabel.setText("Welcome to Student Form!");
            Ap2.getChildren().clear();
            if(Ap2.getChildren().isEmpty())
            Student.SETChildrenStudent();
            The_Bank.SceneRightNow = scene;
            (The_Bank.tempStage).setScene(The_Bank.SceneRightNow);
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(Client_UI_2.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                Student s = new Student();
                s.PlayAll();
            }
        });
        
        StudentAccount.setOnMouseEntered((MouseEvent e)->{
                StudentAccount.setBackground(new Background(new BackgroundFill(Color.DARKGRAY,new CornerRadii(40,40,40,40,false), Insets.EMPTY)));    
        });
        StudentAccount.setOnMouseExited((MouseEvent e)->{
                StudentAccount.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(40,40,40,40,false), Insets.EMPTY)));    
        });
        
        EmployeeAccount.setTranslateX(300);
        EmployeeAccount.setTranslateY(150);
        EmployeeAccount.setMinSize(80,40);
        EmployeeAccount.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(40,40,40,40,false), Insets.EMPTY)));
        
        EmployeeAccount.setOnAction((ActionEvent e) -> {
            SwitchStoE.setText("Press This Button to\ngo to Student Form.");
            EmployeeButton = true;
            StudentButton = false;
            WelcomeLabel.setText("Welcome to Employee Form!");
            Ap2.getChildren().clear();
            if(Ap2.getChildren().isEmpty())
                Employee.SETChildrenEmployee();
            The_Bank.SceneRightNow = scene;
            (The_Bank.tempStage).setScene(The_Bank.SceneRightNow);
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(Client_UI_2.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                Employee E = new Employee();
                E.PlayAll();
            }
        });
        
        EmployeeAccount.setOnMouseEntered((MouseEvent e)->{
                EmployeeAccount.setBackground(new Background(new BackgroundFill(Color.DARKGRAY,new CornerRadii(40,40,40,40,false), Insets.EMPTY)));    
        });
        EmployeeAccount.setOnMouseExited((MouseEvent e)->{
                EmployeeAccount.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(40,40,40,40,false), Insets.EMPTY)));    
        });
        
        OccupationLabel.setTranslateX(360+x);
        OccupationLabel.setTranslateY(190+y);
        OccupationLabel.setMinSize(250, 40);
        OccupationLabel.setFont(new Font(18));
        
        AccountType.setTranslateX(460+x);
        AccountType.setTranslateY(250+y);
        AccountType.setMinSize(0, 40);
        AccountType.setMaxSize(0, 40);
        AccountType.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(10,40,40,10,false), Insets.EMPTY)));
        if(AccountTypeCheck == false){
            
            AccountTypeCheck = true;
            AccountType.getItems().addAll("Savings","Checking","none");
            AccountType.setValue("none");
        }
        AccountTypeLabel.setTranslateX(340+x);
        AccountTypeLabel.setTranslateY(250+y);
        AccountTypeLabel.setMinSize(250, 40);
        AccountTypeLabel.setFont(new Font(18));
        
        AccountTypeError.setTranslateX(640+x);
        AccountTypeError.setTranslateY(260+y);
        
        Apply.setTranslateX(1070);
        Apply.setTranslateY(620);
        Apply.setMinSize(80, 40);
        Apply.setFont(Font.font(18));
        Apply.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(30,30,30,30,false),Insets.EMPTY)));
        
        Apply.setOnAction((ActionEvent e)->{
            
            
            if(StudentButton){
                
             if(AccountType.getValue().equals("none"))
            {
                Client_UI.ValidityLabel.setText("Fill the form fullY with Valid Information!");
                Client_UI.ValidityLabel.setTextFill(Color.RED);
                AccountTypeError.setText("You Forgot this");
                AccountTypeError.setTextFill(Color.RED);
            }
             else
             {
                 Client_UI.ValidityLabel.setText("");
                 AccountTypeError.setText("");
             }
             if(StudentPassword.getText().equals("")||StudentConfirmPassword.getText().equals(""))
            {
                Client_UI.ValidityLabel.setText("Fill the form fullY with Valid Information!");
                Client_UI.ValidityLabel.setTextFill(Color.RED);
                StudentPasswordError.setText("You Forgot this");
                StudentPasswordError.setTextFill(Color.RED);
            }
             else
             {
                 Client_UI.ValidityLabel.setText("");
                 StudentPasswordError.setText("");
             }
                
                if(!(CNICStudentfile==null || UniIDfile==null || UtilityBillStudentfile==null))
                {
                    try {
                
                        new File ("D://The_Bank//Data").mkdirs();
        
                        File file = new File("D://The_Bank//Data//"+Client_UI.UserName.getText()+".txt");
        
                        file.createNewFile();
        
                            FileWriter fr = new FileWriter(file);
                            BufferedWriter br = new BufferedWriter(fr);

                                br.write("Student");
                                br.newLine();
                                br.write(Client_UI.UserName.getText());
                                br.newLine();
                                br.write(StudentPassword.getText());
                                br.newLine();
                                br.write(OpeningAmountStudent.getText())  ;
                                br.newLine();
                                br.write(Client_UI.CNIC.getText());
                                br.newLine();
                                br.write(Client_UI.FirstName.getText())  ;
                                br.newLine();
                                br.write(Client_UI.LastName.getText())  ;
                                br.newLine();
                                br.write(Client_UI.EmailAddress.getText())  ;
                                br.newLine();
                                br.write(Client_UI.DP1.getText()+" "+Client_UI.DP2.getText()+" "+Client_UI.DP3.getText())  ;
                                br.newLine();
                                br.write(Client_UI.Gender.getValue().toString())  ;
                                br.newLine();
                                br.write(Client_UI.AddressLine1.getText())  ;
                                br.newLine();
                                br.write(Client_UI.AddressLine2.getText())  ;
                                br.newLine();
                                br.write(Client_UI.PhoneNumber1.getText())  ;
                                br.newLine();
                                br.write(Client_UI.PhoneNumber2.getText())  ;
                                br.newLine();
                                br.write(Client_UI.City.getText())  ;
                                br.newLine();
                                br.write(Client_UI.PostalCode.getText())  ;
                                br.newLine();
                                br.write(Client_UI.State.getText())  ;
                                br.newLine();
                                br.write(Client_UI.Country.getText())  ;
                                br.newLine();
                                br.newLine();
                                br.write("Employment Description:");
                                br.newLine();
                                br.write(AccountType.getValue().toString());
                                br.newLine();
                                br.write(UniName.getText());
                                br.newLine();
                                br.write(UniIDName.getText());
                                br.newLine();
                                br.write(UniIDRollNo.getText());
                                br.newLine();
                                br.write(Depart.getText());
                                br.newLine();
                                br.write(UniAddress.getText());
                                br.newLine();
                                br.write(UniCity.getText());
                                
                                br.flush();
                                br.close();
                                fr.close();
                            
            
                        } catch (IOException ex) {

                            System.out.println(ex);
                        }
                            }
                else 
                {
                    Client_UI.ValidityLabel.setText("Fill the form fully with Valid Information!");
                    Client_UI.ValidityLabel.setTextFill(Color.RED);
                }
                }
            else if (EmployeeButton)
            {
                 if(AccountType.getValue().equals("none"))
            {
                Client_UI.ValidityLabel.setText("Fill the form fullY with Valid Information!");
                Client_UI.ValidityLabel.setTextFill(Color.RED);
                AccountTypeError.setText("You Forgot this");
                AccountTypeError.setTextFill(Color.RED);
            }
             else
             {
                 Client_UI.ValidityLabel.setText("");
                 AccountTypeError.setText("");
             }
             if(EmployeePassword.getText().equals("")||EmployeeConfirmPassword.getText().equals(""))
            {
                Client_UI.ValidityLabel.setText("Fill the form fullY with Valid Information!");
                Client_UI.ValidityLabel.setTextFill(Color.RED);
                EmployeePasswordError.setText("You need to fill this");
                EmployeePasswordError.setTextFill(Color.RED);
            }
             else
             {
                 Client_UI.ValidityLabel.setText("");
                 EmployeePasswordError.setText("");
             }
                
                if(!(CNICfile==null || CompanyIDfile==null || UtilityBillfile==null))
                {
                    try {
                
                new File ("D://The_Bank//Data").mkdirs();
        
        File file = new File("D://The_Bank//Data//"+Client_UI.UserName.getText()+".txt");
        
        file.createNewFile();
                
                FileWriter fr = new FileWriter(file);
                BufferedWriter br = new BufferedWriter(fr);
                        
                        br.write("Employee");
                        br.newLine();
                        br.write(Client_UI.UserName.getText());
                        br.newLine();
                        br.write(EmployeePassword.getText());
                        br.newLine();
                        br.write(OpeningAmount.getText())  ;
                        br.newLine();
                        br.write(Client_UI.CNIC.getText());
                        br.newLine();
                        br.write(Client_UI.FirstName.getText())  ;
                        br.newLine();
                        br.write(Client_UI.LastName.getText())  ;
                        br.newLine();
                        br.write(Client_UI.EmailAddress.getText())  ;
                        br.newLine();
                        br.write(Client_UI.DP1.getText()+" "+Client_UI.DP2.getText()+" "+Client_UI.DP3.getText())  ;
                        br.newLine();
                        br.write(Client_UI.Gender.getValue().toString())  ;
                        br.newLine();
                        br.write(Client_UI.AddressLine1.getText())  ;
                        br.newLine();
                        br.write(Client_UI.AddressLine2.getText())  ;
                        br.newLine();
                        br.write(Client_UI.PhoneNumber1.getText())  ;
                        br.newLine();
                        br.write(Client_UI.PhoneNumber2.getText())  ;
                        br.newLine();
                        br.write(Client_UI.City.getText())  ;
                        br.newLine();
                        br.write(Client_UI.PostalCode.getText())  ;
                        br.newLine();
                        br.write(Client_UI.State.getText())  ;
                        br.newLine();
                        br.write(Client_UI.Country.getText())  ;
                        br.newLine();
                        br.newLine();
                        br.write("Employment Description:");
                        br.newLine();
                        br.write(AccountType.getValue().toString());
                        br.newLine();
                        br.write(EmploymentStatus.getText());
                        br.newLine();
                        br.write(EmploymentID.getText());
                        br.newLine();
                        br.write(CompanyName.getText());
                        br.newLine();
                        br.write(CompanyAddress.getText());
                        br.newLine();
                        br.write(CompanyCity.getText());
                        
                        br.flush();
                        br.close();
                        fr.close();
        
            } catch (IOException ex) {

                            System.out.println(ex);
                        }
                            }
                else 
                {
                    Client_UI.ValidityLabel.setText("Fill the form fully with Valid Information!");
                    Client_UI.ValidityLabel.setTextFill(Color.RED);
                }
        }
             The_Bank.SceneRightNow = Applied.SetScene();
            (The_Bank.tempStage).setScene(The_Bank.SceneRightNow);
        });
        
        Apply.setOnMouseEntered((MouseEvent e)->{
        Apply.setBackground(new Background(new BackgroundFill(Color.DARKGRAY,new CornerRadii(30,30,30,30,false),Insets.EMPTY)));
        });
        
        Apply.setOnMouseExited((MouseEvent e)->{
        Apply.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(30,30,30,30,false),Insets.EMPTY)));
        });
        
        GoBack.setTranslateX(1170);
        GoBack.setTranslateY(620);
        GoBack.setMinSize(80, 40);
        GoBack.setFont(Font.font(18));
        GoBack.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(30,30,30,30,false),Insets.EMPTY)));
        
        GoBack.setOnAction((ActionEvent e) -> {
            (Student.Ap2).getChildren().clear();
            if((Student.Ap2).getChildren().isEmpty())
                (The_Bank.tempStage).setScene(Client_UI.scene1);
            Client_UI.NextCheck=true;
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(Client_UI_2.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                Client_UI UI = new Client_UI();
                UI.PlayALL();
            }
        });
      
        GoBack.setOnMouseEntered((MouseEvent e) -> {
            GoBack.setBackground(new Background(new BackgroundFill(Color.DARKGRAY,new CornerRadii(30,30,30,30,false),Insets.EMPTY)));
        });
      
        GoBack.setOnMouseExited((MouseEvent e) -> {
            GoBack.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(30,30,30,30,false),Insets.EMPTY)));
        });
        
        Exit.setBackground(new Background(new BackgroundFill(Color.TOMATO,new CornerRadii(30,30,30,30,true),Insets.EMPTY)));
        Exit.setMinSize(50, 50);
        Exit.setTranslateX(1270);
        Exit.setTranslateY(50);
      
        Exit.setOnAction((ActionEvent e)->{
            (The_Bank.tempStage).setScene(LastScene.lastscene);
            });
      
        Exit.setOnMouseEntered((MouseEvent e) -> {
            Exit.setBackground(new Background(new BackgroundFill(Color.BROWN,new CornerRadii(30),Insets.EMPTY)));
        });
      
        Exit.setOnMouseExited((MouseEvent e) -> {
            Exit.setBackground(new Background(new BackgroundFill(Color.TOMATO,new CornerRadii(10,10,10,10,true),Insets.EMPTY)));
        });
    
        //========================================================================================
        //Browse Buttons for the Employee Scene
     try{   BrowseCompanyID.setTranslateX(900);
        BrowseCompanyID.setTranslateY(150+100);
        BrowseCompanyID.setMinSize(80,40);
        BrowseCompanyID.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(40,40,40,40,false), Insets.EMPTY)));
        
        BrowseCompanyID.setOnAction((ActionEvent e)->{
            Stage stg = new Stage();
            FileChooser f = new FileChooser();
            f.getExtensionFilters().addAll(new ExtensionFilter("PNG","*.png"),
                                            new ExtensionFilter("JPG","*.jpg"));
            File file;
            file = f.showOpenDialog(stg);
            CompanyIDfile = file.getName();
            BrowseCompanyIDFile.setText(CompanyIDfile+" Selected!");
            });
        BrowseCompanyID.setOnMouseEntered((MouseEvent e)->{
                BrowseCompanyID.setBackground(new Background(new BackgroundFill(Color.DARKGRAY,new CornerRadii(40,40,40,40,false), Insets.EMPTY)));    
        });
        BrowseCompanyID.setOnMouseExited((MouseEvent e)->{
                BrowseCompanyID.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(40,40,40,40,false), Insets.EMPTY)));    
        });
        
        BrowseCompanyIDFile.setTranslateX(800-100);
        BrowseCompanyIDFile.setTranslateY(230-22.5);
        BrowseCompanyIDFile.setFont(new Font(18));
        
        BrowseCNIC.setTranslateX(900);
        BrowseCNIC.setTranslateY(250+100);
        BrowseCNIC.setMinSize(80,40);
        BrowseCNIC.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(40,40,40,40,false), Insets.EMPTY)));
        
        BrowseCNIC.setOnAction((ActionEvent e)->{
            Stage stg = new Stage();
            FileChooser f = new FileChooser();
            f.getExtensionFilters().addAll(new ExtensionFilter("PNG","*.png"),
                                            new ExtensionFilter("JPG","*.jpg"));
            File file;
            file = f.showOpenDialog(stg);
            CNICfile = file.getName();
            BrowseCNICFile.setText(CNICfile+" Selected!");
            });
        BrowseCNIC.setOnMouseEntered((MouseEvent e)->{
                BrowseCNIC.setBackground(new Background(new BackgroundFill(Color.DARKGRAY,new CornerRadii(40,40,40,40,false), Insets.EMPTY)));    
        });
        BrowseCNIC.setOnMouseExited((MouseEvent e)->{
                BrowseCNIC.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(40,40,40,40,false), Insets.EMPTY)));    
        });
        
        BrowseCNICFile.setTranslateX(800-100);
        BrowseCNICFile.setTranslateY(330-22.5);
        BrowseCNICFile.setFont(new Font(18));
        
        BrowseUtilityBill.setTranslateX(900);
        BrowseUtilityBill.setTranslateY(350+100);
        BrowseUtilityBill.setMinSize(80,40);
        BrowseUtilityBill.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(40,40,40,40,false), Insets.EMPTY)));
        
        BrowseUtilityBill.setOnAction((ActionEvent e)->{
            Stage stg = new Stage();
            FileChooser f = new FileChooser();
            f.getExtensionFilters().addAll(new ExtensionFilter("PNG","*.png"),
                                            new ExtensionFilter("JPG","*.jpg"));
            File file;
            file = f.showOpenDialog(stg);
            UtilityBillfile = file.getName();
            BrowseUtilityBillFile.setText(UtilityBillfile+" Selected!");
            });
        BrowseUtilityBill.setOnMouseEntered((MouseEvent e)->{
                BrowseUtilityBill.setBackground(new Background(new BackgroundFill(Color.DARKGRAY,new CornerRadii(40,40,40,40,false), Insets.EMPTY)));    
        });
        BrowseUtilityBill.setOnMouseExited((MouseEvent e)->{
                BrowseUtilityBill.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(40,40,40,40,false), Insets.EMPTY)));    
        });
        
        BrowseUtilityBillFile.setTranslateX(800-100);
        BrowseUtilityBillFile.setTranslateY(430-22.5);
        BrowseUtilityBillFile.setFont(new Font(18));
        
        //===========================================================================================
        //Browse Buttons for the Student Scene
        
        BrowseUniID.setTranslateX(900);
        BrowseUniID.setTranslateY(150+100);
        BrowseUniID.setMinSize(80,40);
        BrowseUniID.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(40,40,40,40,false), Insets.EMPTY)));
        
        BrowseUniID.setOnAction((ActionEvent e)->{
            Stage stg = new Stage();
            FileChooser f = new FileChooser();
            f.getExtensionFilters().addAll(new ExtensionFilter("PNG","*.png"),
                                            new ExtensionFilter("JPG","*.jpg"));
            File file;
            file = f.showOpenDialog(stg);
            UniIDfile = file.getName();
            BrowseUniIDFile.setText(UniIDfile+" Selected!");
        });
        BrowseUniID.setOnMouseEntered((MouseEvent e)->{
                BrowseUniID.setBackground(new Background(new BackgroundFill(Color.DARKGRAY,new CornerRadii(40,40,40,40,false), Insets.EMPTY)));    
        });
        BrowseUniID.setOnMouseExited((MouseEvent e)->{
                BrowseUniID.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(40,40,40,40,false), Insets.EMPTY)));    
        });
        
        BrowseUniIDFile.setTranslateX(800-100);
        BrowseUniIDFile.setTranslateY(230-22.5);
        BrowseUniIDFile.setFont(new Font(18));
        
        BrowseCNICStudent.setTranslateX(900);
        BrowseCNICStudent.setTranslateY(250+100);
        BrowseCNICStudent.setMinSize(80,40);
        BrowseCNICStudent.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(40,40,40,40,false), Insets.EMPTY)));
        
        BrowseCNICStudent.setOnAction((ActionEvent e)->{
            Stage stg = new Stage();
            FileChooser f = new FileChooser();
            f.getExtensionFilters().addAll(new ExtensionFilter("PNG","*.png"),
                                            new ExtensionFilter("JPG","*.jpg"));
            File file;
            file = f.showOpenDialog(stg);
            CNICStudentfile = file.getName();
            BrowseCNICStudentFile.setText(CNICStudentfile+" Selected!");
        });
        BrowseCNICStudent.setOnMouseEntered((MouseEvent e)->{
                BrowseCNICStudent.setBackground(new Background(new BackgroundFill(Color.DARKGRAY,new CornerRadii(40,40,40,40,false), Insets.EMPTY)));    
        });
        BrowseCNICStudent.setOnMouseExited((MouseEvent e)->{
                BrowseCNICStudent.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(40,40,40,40,false), Insets.EMPTY)));    
        });
        
        BrowseCNICStudentFile.setTranslateX(800-100);
        BrowseCNICStudentFile.setTranslateY(330-22.5);
        BrowseCNICStudentFile.setFont(new Font(18));
        
        BrowseUtilityBillStudent.setTranslateX(900);
        BrowseUtilityBillStudent.setTranslateY(350+100);
        BrowseUtilityBillStudent.setMinSize(80,40);
        BrowseUtilityBillStudent.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(40,40,40,40,false), Insets.EMPTY)));
        
        BrowseUtilityBillStudent.setOnAction((ActionEvent e)->{
            Stage stg = new Stage();
            FileChooser f = new FileChooser();
            f.getExtensionFilters().addAll(new ExtensionFilter("PNG","*.png"),
                                            new ExtensionFilter("JPG","*.jpg"));
            File file;
            file = f.showOpenDialog(stg);
            UtilityBillStudentfile = file.getName();
            BrowseUtilityBillStudentFile.setText(UtilityBillStudentfile+" Selected!");
            });
        BrowseUtilityBillStudent.setOnMouseEntered((MouseEvent e)->{
                BrowseUtilityBillStudent.setBackground(new Background(new BackgroundFill(Color.DARKGRAY,new CornerRadii(40,40,40,40,false), Insets.EMPTY)));    
        });
        BrowseUtilityBillStudent.setOnMouseExited((MouseEvent e)->{
                BrowseUtilityBillStudent.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(40,40,40,40,false), Insets.EMPTY)));    
        });
    }catch(Exception e){
                
                }
        BrowseUtilityBillStudentFile.setTranslateX(800-100);
        BrowseUtilityBillStudentFile.setTranslateY(430-22.5);
        BrowseUtilityBillStudentFile.setFont(new Font(18));
        
        //==============================================================================
        //Label for the info about the Switch functionality Button of th forms Employee and Student
        SwitchStoE.setTranslateX(390);
        SwitchStoE.setTranslateY(150);
        SwitchStoE.setFont(Font.font("Sarif",FontWeight.SEMI_BOLD,14));
        
        
        
        scene = scene2;
        
        return scene2;
    }
    
    static void SetChildren(){
        Ap2.getChildren().addAll(JobDescription,OccupationLabel,StudentAccount,SwitchStoE,
                Exit,GoBack,WelcomeLabel);
    }
     
    void AccountTypeSize(int i){ 
        AccountType.setMinSize(i,40);
        AccountType.setMaxSize(i,40);
    }
    
    void PlayAll(){
        
        
        timeline4.setCycleCount(Animation.INDEFINITE);
        timeline4.play();
        
    }
    
    
    
}
