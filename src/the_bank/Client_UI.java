/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the_bank;


import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
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
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;
/**
 *
 * @author Shahiryar
 */
public class Client_UI {
    
    //The_Bank tb = new The_Bank();
    
    static AnchorPane Ap = new AnchorPane();
    
    static Scene scene1 = new Scene(Ap,1700,860);
    
    static Stage lastStage = new Stage(StageStyle.UNDECORATED);
    
    //---------------------------------------------------------------------------------------------------------------
    //Buttons Used in the UI
    
    static Button Exit1 = new Button("X");
    static Button Next1 = new Button("Next");
    static Button GoBack1 = new Button("Go Back");
    static boolean NextCheck = false;
    static boolean genderCheck = false; 
    
    //---------------------------------------------------------------------------------------------------------------
    //Transition Timers
    int i=0; int minus = 16;
    Timeline timeline1 = new Timeline(new KeyFrame(
        Duration.millis(18-minus),
        ae -> { if(i<251)
        {FirstNameSize(i);
        i = i+2;
        }
        }));
     int j=0;
    Timeline timeline2 = new Timeline(new KeyFrame(
        Duration.millis(19-minus),
        ae -> { if(j<251)
        {LastNameSize(j);
        j = j+2;
        }
        }));
    int k = 0;
    Timeline timeline3 = new Timeline(new KeyFrame(
        Duration.millis(20-minus),
        ae -> { if(k<251)
        {EmailAddressSize(k);
        k = k+2;
        }
        }));
    int l = 0;
    Timeline timeline4 = new Timeline(new KeyFrame(
        Duration.millis(21-minus),
        ae -> { if(l<251)
        {ConfirmEmailAddressSize(l);
        l = l+2;
        }
        }));
    int m = 0;
    Timeline timeline5 = new Timeline(new KeyFrame(
        Duration.millis(22-minus),
        ae -> { if(m<251)
        {UserNameSize(m);
        m = m+2;
        }
        }));
    int n = 0;
    Timeline timeline6 = new Timeline(new KeyFrame(
        Duration.millis(23-minus),
        ae -> { if(n<251)
        {CNICSize(n);
        n = n+2;
        }
        }));
    int o = 0;
    Timeline timeline7 = new Timeline(new KeyFrame(
        Duration.millis(24-minus),
        ae -> { if(o<76)
        {DP1Size(o);
         DP2Size(o);
         DP3Size(o);
          
        o = o+2;
        }
        }));
    int p = 0;
    Timeline timeline8 = new Timeline(new KeyFrame(
        Duration.millis(25-minus),
        ae -> { if(p<251)
        {GenderSize(p);
        p = p+2;
        }
        }));
    int q = 0;
    Timeline timeline9 = new Timeline(new KeyFrame(
        Duration.millis(26-minus),
        ae -> { if(q<251)
        {AddressLine1(q);
        q = q+2;
        }
        }));
    int r = 0;
    Timeline timeline10 = new Timeline(new KeyFrame(
        Duration.millis(27-minus),
        ae -> { if(r<251)
        {AddressLine2(r);
        r = r+2;
        }
        }));
    int s = 0;
    Timeline timeline11 = new Timeline(new KeyFrame(
        Duration.millis(28-minus),
        ae -> { if(s<251)
        {PhoneNumber1(s);
        s = s+2;
        }
        }));
    int t = 0;
    Timeline timeline12 = new Timeline(new KeyFrame(
        Duration.millis(29-minus),
        ae -> { if(t<251)
        {PhoneNumber2(t);
        t = t+2;
        }
        }));
    int u = 0;
    Timeline timeline13 = new Timeline(new KeyFrame(
        Duration.millis(30-minus),
        ae -> { if(u<251)
        {City(u);
        u = u+2;
        }
        }));
    int v = 0;
    Timeline timeline14 = new Timeline(new KeyFrame(
        Duration.millis(31-minus),
        ae -> { if(v<251)
        {PostalCode(v);
        v = v+2;
        }
        }));
    int w = 0;
    Timeline timeline15 = new Timeline(new KeyFrame(
        Duration.millis(32-minus),
        ae -> { if(w<251)
        {State(w);
        w = w+2;
        }
        }));
    int x = 0;
    Timeline timeline16 = new Timeline(new KeyFrame(
        Duration.millis(33-minus),
        ae -> { if(x<251)
        {Country(x);
        x = x+2;
        }
        }));
    
    //------------------------------------------------------------------------------------------------------------------------
    //Text Fields Used in the UI
    static TextField FirstName = new TextField();
    static TextField LastName = new TextField();
    static TextField EmailAddress = new TextField();
    static TextField ConfirmEmailAddress = new TextField();
    static TextField UserName = new TextField();
    static TextField CNIC = new TextField();
    static TextField AddressLine1 = new TextField();
    static TextField AddressLine2 = new TextField();
    static TextField PhoneNumber1 = new TextField();
    static TextField PhoneNumber2 = new TextField();
    static TextField City = new TextField();
    static TextField PostalCode = new TextField();
    static TextField State = new TextField();
    static TextField Country = new TextField();
    
    static ComboBox Gender = new ComboBox();
    
    static TextField DP1 =  new TextField();
    static TextField DP2 =  new TextField();
    static TextField DP3 =  new TextField();
    
    
    //-----------------------------------------------------------------------------
    //Labels Used in the UI
    static Label FirstNameLabel = new Label("First Name:");
    static Label LastNameLabel = new Label("Last Name:");
    static Label EmailAddressLabel = new Label("Email Address:");
    static Label ConfirmEmailAddressLabel = new Label("Confirm Email Address:");
    static Label UserNameLabel = new Label("User Name:");
    static Label CNICLabel = new Label("CNIC:");
    static Label DPLabel = new Label("Date of Birth:");
    static Label PersonalInformationLabel = new Label("Personal Information:");
    static Label AddressAndContactInformationLabel = new Label("Address & Contact Information:");
    static Label GenderLabel = new Label("Gender:");
    static Label AddressLine1Label = new Label("Addressline 1:");
    static Label AddressLine2Label = new Label("AddressLine 2:");
    static Label PhoneNumber1Label = new Label("Phone Number:");
    static Label PhoneNumber2Label = new Label("Alternative Phone Number:");
    static Label CityLabel = new Label("City:");
    static Label PostalCodeLabel = new Label("Postal Code:");
    static Label StateLabel = new Label("State:");
    static Label CountryLabel = new Label("Country:");
    static Label EmailError = new Label();
    static Label ConfirmEmailError = new Label();
    static Label CNICError = new Label();
    static Label DPError = new Label();
    static Label PhoneNumber1Error = new Label();
    static Label PhoneNumber2Error = new Label();
    static Label PostalCodeError = new Label();
    static Label CityError = new Label();
    static Label ValidityLabel = new Label();
    static Label GenderError = new Label();
    static Label UserNameError = new Label();
    
    static final Group LabelGroup = new Group(PersonalInformationLabel,
            FirstNameLabel,LastNameLabel,
            EmailAddressLabel,ConfirmEmailAddressLabel,
            UserNameLabel,CNICLabel,DPLabel,
            AddressAndContactInformationLabel,
            GenderLabel,AddressLine1Label,
            AddressLine2Label,PhoneNumber1Label,
            PhoneNumber2Label,CityLabel,
            PostalCodeLabel,StateLabel,
            CountryLabel,EmailError,ConfirmEmailError,
            PhoneNumber1Error,PhoneNumber2Error,PostalCodeError,
            CityError,ValidityLabel,UserNameError);
      
    static Image Apimage = new Image("file:///D:/The_Bank/LastScenebg.jpg");
    
    public static Scene SetStage(){
        
        ListenersClass LC = new ListenersClass();
        
        LC.Start();
        
         Ap.setBackground(
                new Background(
                        new BackgroundImage(
                Apimage,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT)));
        
        int x=-210,y=-40;
        
        PersonalInformationLabel.setFont(Font.font("Alegreya Sans ExtraBold", FontWeight.EXTRA_BOLD, 32));
        PersonalInformationLabel.setTranslateX(280+x);
        PersonalInformationLabel.setTranslateY(100+y);
        
        AddressAndContactInformationLabel.setFont(Font.font("Alegreya Sans ExtraBold", FontWeight.EXTRA_BOLD, 32));
        AddressAndContactInformationLabel.setTranslateX(820+x);
        AddressAndContactInformationLabel.setTranslateY(100+y);
        
        AddressLine1.setTranslateX(1000+x);
        AddressLine1.setTranslateY(190+y);
        AddressLine1.setMinSize(0, 40);
        AddressLine1.setMaxSize(0, 40);
        AddressLine1.setFont(Font.font("Sans Serif",FontWeight.EXTRA_BOLD,18));
        AddressLine1.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(10,40,40,10,false), Insets.EMPTY)));
        AddressLine1.setPromptText("25 Characters limit!");
        
        AddressLine1Label.setTranslateX(885+x);
        AddressLine1Label.setTranslateY(190+y);
        AddressLine1Label.setMinSize(250, 40);
        AddressLine1Label.setFont(new Font(18));
        
        AddressLine2.setTranslateX(1000+x);
        AddressLine2.setTranslateY(250+y);
        AddressLine2.setMinSize(0, 40);
        AddressLine2.setMaxSize(0, 40);
        AddressLine2.setFont(Font.font("Sans Serif",FontWeight.EXTRA_BOLD,18));
        AddressLine2.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(10,40,40,10,false), Insets.EMPTY)));
        AddressLine2.setPromptText("25 Characters limit!");
        
        AddressLine2Label.setTranslateX(880+x);
        AddressLine2Label.setTranslateY(250+y);
        AddressLine2Label.setMinSize(250, 40);
        AddressLine2Label.setFont(new Font(18));
        
        PhoneNumber1.setTranslateX(1000+x);
        PhoneNumber1.setTranslateY(310+y);
        PhoneNumber1.setMinSize(0, 40);
        PhoneNumber1.setMaxSize(0, 40);
        PhoneNumber1.setFont(Font.font("Sans Serif",FontWeight.EXTRA_BOLD,18));
        PhoneNumber1.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(10,40,40,10,false), Insets.EMPTY)));
        PhoneNumber1.setPromptText("Must be Valid");
        
        PhoneNumber1Label.setTranslateX(870+x);
        PhoneNumber1Label.setTranslateY(310+y);
        PhoneNumber1Label.setMinSize(250, 40);
        PhoneNumber1Label.setFont(new Font(18));
        
        PhoneNumber1Error.setTranslateX(1255+x);
        PhoneNumber1Error.setTranslateY(310+y);
        PhoneNumber1Error.setFont(new Font(18));
        
        PhoneNumber2.setTranslateX(1000+x);
        PhoneNumber2.setTranslateY(370+y);
        PhoneNumber2.setMinSize(0, 40);
        PhoneNumber2.setMaxSize(0, 40);
        PhoneNumber2.setFont(Font.font("Sans Serif",FontWeight.EXTRA_BOLD,18));
        PhoneNumber2.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(10,40,40,10,false), Insets.EMPTY)));
        PhoneNumber2.setPromptText("Must be Valid");
        
        PhoneNumber2Label.setTranslateX(780+x);
        PhoneNumber2Label.setTranslateY(370+y);
        PhoneNumber2Label.setMinSize(250, 40);
        PhoneNumber2Label.setFont(new Font(18));
        
        PhoneNumber2Error.setTranslateX(1255+x);
        PhoneNumber2Error.setTranslateY(370+y);
        PhoneNumber2Error.setFont(new Font(18));
        
        City.setTranslateX(1000+x);
        City.setTranslateY(430+y);
        City.setMinSize(0, 40);
        City.setMaxSize(0, 40);
        City.setFont(Font.font("Sans Serif",FontWeight.EXTRA_BOLD,18));
        City.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(10,40,40,10,false), Insets.EMPTY)));
        City.setPromptText("15 Characters limit!");
        
        CityLabel.setTranslateX(965+x);
        CityLabel.setTranslateY(430+y);
        CityLabel.setMinSize(250, 40);
        CityLabel.setFont(new Font(18));
        
        CityError.setTranslateX(1255+x);
        CityError.setTranslateY(430+y);
        CityError.setFont(new Font(18));
        
        PostalCode.setTranslateX(1000+x);
        PostalCode.setTranslateY(490+y);
        PostalCode.setMinSize(0, 40);
        PostalCode.setMaxSize(0, 40);
        PostalCode.setFont(Font.font("Sans Serif",FontWeight.EXTRA_BOLD,18));
        PostalCode.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(10,40,40,10,false), Insets.EMPTY)));
        PostalCode.setPromptText("Must be Valid");
        
        PostalCodeLabel.setTranslateX(900+x);
        PostalCodeLabel.setTranslateY(490+y);
        PostalCodeLabel.setMinSize(250, 40);
        PostalCodeLabel.setFont(new Font(18));
        
        PostalCodeError.setTranslateX(1255+x);
        PostalCodeError.setTranslateY(490+y);
        PostalCodeError.setFont(new Font(18));
        
        State.setTranslateX(1000+x);
        State.setTranslateY(550+y);
        State.setMinSize(0, 40);
        State.setMaxSize(0, 40);
        State.setFont(Font.font("Sans Serif",FontWeight.EXTRA_BOLD,18));
        State.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(10,40,40,10,false), Insets.EMPTY)));
        State.setPromptText("15 Characters limit!");
        
        StateLabel.setTranslateX(950+x);
        StateLabel.setTranslateY(550+y);
        StateLabel.setMinSize(250, 40);
        StateLabel.setFont(new Font(18));
        
        Country.setTranslateX(1000+x);
        Country.setTranslateY(610+y);
        Country.setMinSize(0, 40);
        Country.setMaxSize(0, 40);
        Country.setFont(Font.font("Sans Serif",FontWeight.EXTRA_BOLD,18));
        Country.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(10,40,40,10,false), Insets.EMPTY)));
        Country.setPromptText("15 Characters limit!");
        
        CountryLabel.setTranslateX(930+x);
        CountryLabel.setTranslateY(610+y);
        CountryLabel.setMinSize(250, 40);
        CountryLabel.setFont(new Font(18));
        
        ValidityLabel.setTranslateX(850+x);
        ValidityLabel.setTranslateY(690+y);
        ValidityLabel.setMinSize(250, 40);
        ValidityLabel.setFont(Font.font("Serif",FontWeight.BOLD,22));
        
        FirstName.setTranslateX(460+x);
        FirstName.setTranslateY(190+y);
        FirstName.setMinSize(0, 40);
        FirstName.setMaxSize(0, 40);
        FirstName.setFont(Font.font("Sans Serif",FontWeight.EXTRA_BOLD,18));
        FirstName.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(10,40,40,10,false), Insets.EMPTY)));
        FirstName.setPromptText("15 Characters limit!");
        
        FirstNameLabel.setTranslateX(365+x);
        FirstNameLabel.setTranslateY(190+y);
        FirstNameLabel.setMinSize(250, 40);
        FirstNameLabel.setFont(new Font(18));
        
        LastName.setTranslateX(460+x);
        LastName.setTranslateY(250+y);
        LastName.setMinSize(0, 40);
        LastName.setMaxSize(0, 40);
        LastName.setFont(new Font(18));
        LastName.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(10,40,40,10,false), Insets.EMPTY)));
        LastName.setPromptText("15 Characters limit!");
        
        LastNameLabel.setTranslateX(370+x);
        LastNameLabel.setTranslateY(250+y);
        LastNameLabel.setMinSize(250, 40);
        LastNameLabel.setFont(new Font(18));
        
        EmailAddress.setTranslateX(460+x);
        EmailAddress.setTranslateY(310+y);
        EmailAddress.setMinSize(0, 40);
        EmailAddress.setMaxSize(0, 40);
        EmailAddress.setFont(new Font(18));
        EmailAddress.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(10,40,40,10,false), Insets.EMPTY)));
        EmailAddress.setPromptText("Must be Valid");
        
        EmailError.setTranslateX(510);
        EmailError.setTranslateY(275);
        EmailError.setFont(new Font(18));
        
        EmailAddressLabel.setTranslateX(340+x);
        EmailAddressLabel.setTranslateY(310+y);
        EmailAddressLabel.setMinSize(250, 40);
        EmailAddressLabel.setFont(new Font(18));
        
        ConfirmEmailAddress.setTranslateX(460+x);
        ConfirmEmailAddress.setTranslateY(370+y);
        ConfirmEmailAddress.setMinSize(0, 40);
        ConfirmEmailAddress.setMaxSize(0, 40);
        ConfirmEmailAddress.setFont(new Font(18));
        ConfirmEmailAddress.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(10,40,40,10,false), Insets.EMPTY)));
        ConfirmEmailAddress.setPromptText("Must Match");
        
        ConfirmEmailError.setTranslateX(510);
        ConfirmEmailError.setTranslateY(335);
        ConfirmEmailError.setFont(Font.font(18));
        
        ConfirmEmailAddressLabel.setTranslateX(272.5+x);
        ConfirmEmailAddressLabel.setTranslateY(370+y);
        ConfirmEmailAddressLabel.setMinSize(250, 40);
        ConfirmEmailAddressLabel.setFont(new Font(18));
        
        UserName.setTranslateX(460+x);
        UserName.setTranslateY(430+y);
        UserName.setMinSize(0, 40);
        UserName.setMaxSize(0, 40);
        UserName.setFont(new Font(18));
        UserName.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(10,40,40,10,false), Insets.EMPTY)));
        UserName.setPromptText("Must be Unique");
        
        UserNameLabel.setTranslateX(365+x);
        UserNameLabel.setTranslateY(430+y);
        UserNameLabel.setMinSize(250, 40);
        UserNameLabel.setFont(new Font(18));
        
        UserNameError.setTranslateX(515+200+x);
        UserNameError.setTranslateY(430+y);
        UserNameError.setMinSize(250, 40);
        UserNameError.setFont(new Font(18));
        
        CNIC.setTranslateX(460+x);
        CNIC.setTranslateY(490+y);
        CNIC.setMinSize(0, 40);
        CNIC.setMaxSize(0, 40);
        CNIC.setFont(new Font(18));
        CNIC.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(10,40,40,10,false), Insets.EMPTY)));
        CNIC.setTooltip(new Tooltip("Without Dashes \"-\""));
        CNIC.setPromptText("Without Dashes");
        
        CNICError.setTranslateX(515);
        CNICError.setTranslateY(495+y);
        CNICError.setFont(new Font(18));
        
        CNICLabel.setTranslateX(412.5+x);
        CNICLabel.setTranslateY(490+y);
        CNICLabel.setMinSize(250, 40);
        CNICLabel.setFont(new Font(18));
        
        DP1.setTranslateX(460+x);
        DP1.setTranslateY(550+y);
        DP1.setMinSize(0, 40);
        DP1.setMaxSize(0, 40);
        DP1.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(30,30,30,30,false),Insets.EMPTY)));
        DP1.setPromptText("Month");
        
        DP2.setTranslateX(542.5+x);
        DP2.setTranslateY(550+y);
        DP2.setMinSize(0, 40);
        DP2.setMaxSize(0, 40);
        DP2.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(30,30,30,30,false),Insets.EMPTY)));
        DP2.setPromptText("Day");
        
        DP3.setTranslateX(625+x);
        DP3.setTranslateY(550+y);
        DP3.setMinSize(0, 40);
        DP3.setMaxSize(0, 40);
        DP3.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(30,30,30,30,false),Insets.EMPTY)));
        DP3.setPromptText("Year");
        
        DPLabel.setTranslateX(352+x);
        DPLabel.setTranslateY(550+y);
        DPLabel.setMinSize(250, 40);
        DPLabel.setFont(new Font(18));
        
        DPError.setTranslateX(712+x);
        DPError.setTranslateY(560+y);
        
        Gender.setTranslateX(460+x);
        Gender.setTranslateY(610+y);
        Gender.setMinSize(0, 40);
        Gender.setMaxSize(0, 40);
        Gender.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(10,40,40,10,false), Insets.EMPTY)));
        Gender.setPromptText("Select Gender");
        if(genderCheck == false){
        Gender.getItems().addAll("Male","Female","Other","none");
        Gender.setValue("none");
        genderCheck = true;
        }
        
        GenderLabel.setTranslateX(394+x);
        GenderLabel.setTranslateY(610+y);
        GenderLabel.setMinSize(250, 40);
        GenderLabel.setFont(new Font(18));
        
        GenderError.setTranslateX(712+x);
        GenderError.setTranslateY(620+y);
        
        
        Exit1.setBackground(new Background(new BackgroundFill(Color.TOMATO,new CornerRadii(10,10,10,10,true),Insets.EMPTY)));
        Exit1.setMinSize(50, 50);
        Exit1.setTranslateX(1270);
        Exit1.setTranslateY(50);
        
        Next1.setTranslateX(1170);
        Next1.setTranslateY(620);
        Next1.setMinSize(80, 40);
        Next1.setFont(Font.font(18));
        Next1.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(30,30,30,30,false),Insets.EMPTY)));
        
        Next1.setOnAction((ActionEvent e)->{
           
            boolean First = false;
            
            if(DP1.getLength()!=0 && DP2.getLength()!=0 && DP3.getLength()!=0) 
           {int Dp1, Dp2, Dp3;
            
            Dp1 = Integer.parseInt(DP1.getText());
            Dp2 = Integer.parseInt(DP2.getText());
            Dp3 = Integer.parseInt(DP3.getText());
            
                if(Dp1>12)
                {
                    DPError.setText("Invalid Month!");
                    DPError.setTextFill(Color.RED);
                    ValidityLabel.setTextFill(Color.RED);
                    ValidityLabel.setText("Please fill the Form fully with valid Information!");
                }
                else if ((Dp1==1 ||
                        Dp1==3 ||
                        Dp1==5 ||
                        Dp1==7 ||
                        Dp1==9 ||
                        Dp1==11) && (Dp2>31||Dp2==0)){
                    DPError.setText("Invalid Day odd!");
                    DPError.setTextFill(Color.RED);
                    ValidityLabel.setTextFill(Color.RED);
                    ValidityLabel.setText("Please fill the Form fully with valid Information!");
                }
                else if (Dp1==2 && (Dp2>28))
                {
                    DPError.setText("Invalid Day feb!");
                    DPError.setTextFill(Color.RED);
                    ValidityLabel.setTextFill(Color.RED);
                    ValidityLabel.setText("Please fill the Form fully with valid Information!");
                }
                else if ((Dp1==4 ||
                        Dp1==6 ||
                        Dp1==8 ||
                        Dp1==10 ||
                        Dp1==12) && (Dp2>30 || Dp2==0))
                {
                    DPError.setText("Invalid Day even!");
                    DPError.setTextFill(Color.RED);
                    ValidityLabel.setTextFill(Color.RED);
                    ValidityLabel.setText("Please fill the Form fully with valid Information!");
                }
                else{
                    DPError.setText("");
                    if((((java.time.LocalDate.now().getYear())-Dp3)<0))
                            {
                                DPError.setText("Invalid Year!");
                                DPError.setTextFill(Color.RED);
                                ValidityLabel.setTextFill(Color.RED);
                                ValidityLabel.setText("Please fill the Form fully with valid Information!");
                            }
                    else if((((java.time.LocalDate.now().getYear())-Dp3)<18 && ((java.time.LocalDate.now().getYear())-Dp3)!=17))
                    {
                    DPError.setText("You are Under age!");
                    DPError.setTextFill(Color.RED);
                    ValidityLabel.setTextFill(Color.RED);
                    ValidityLabel.setText("Please fill the Form fully with valid Information!");
                    }
                    else if (((java.time.LocalDate.now().getYear())-Dp3 == 17) && (Dp2>9))
                    {
                        DPError.setText("");
                        ValidityLabel.setText("");
                        First = true;
                    }
                    else
                    {
                        DPError.setText("");
                        ValidityLabel.setText("");
                        First = true;
                        
                    }
                }
                
                    }
           else {
               ValidityLabel.setText("Please fill the Form fully with valid Information!");
               ValidityLabel.setTextFill(Color.RED);
           }
            if(First == true){
            if(FirstName.getLength()==0 || LastName.getLength()==0 || 
                    EmailAddress.getLength()==0 ||
                    ConfirmEmailAddress.getLength()==0 ||
                    UserName.getLength()==0 ||
                    CNIC.getLength()==0 ||
                    AddressLine1.getLength()==0 ||
                    AddressLine2.getLength()==0 ||
                    PhoneNumber1.getLength()==0||
                    PhoneNumber2.getLength()==0||
                    City.getLength()==0 ||
                    PostalCode.getLength()==0 ||
                    State.getLength()==0 ||
                    Country.getLength()==0 ||
                    Gender.isArmed() ||
                    DP1.getLength()==0 ||
                    DP2.getLength()==0 ||
                    DP3.getLength()==0 )
            {
                ValidityLabel.setText("Please fill the Form fully with valid Information!");
                ValidityLabel.setTextFill(Color.RED);
            }
            else{
                if(Gender.getValue().equals("none"))
                {
                    ValidityLabel.setText("Please Fill the Form fully with Valid Information!");
                    ValidityLabel.setTextFill(Color.RED);
                    GenderError.setText("You forgot this!");
                    GenderError.setTextFill(Color.RED);
                }
                else{
                    
            
                    ValidityLabel.setText("");
                    GenderError.setText("");
            The_Bank.SceneRightNow = Client_UI_2.SetStage();
            if(NextCheck == true)
            {
                NextCheck=false;
                Client_UI_2.SetChildren();  
            }
                
            (The_Bank.tempStage).setScene(The_Bank.SceneRightNow);
             try {
                 Thread.sleep(1);
             } catch (InterruptedException ex) {
                 Logger.getLogger(Client_UI.class.getName()).log(Level.SEVERE, null, ex);
             }finally{
                 Client_UI_2 JUI2 = new Client_UI_2();
                 JUI2.PlayAll();
             }
                }
            }
            }
        });
        
        
        
        Next1.setOnMouseEntered((MouseEvent e)->{
            
            Next1.setBackground(new Background(new BackgroundFill(Color.DARKGRAY,new CornerRadii(30,30,30,30,false),Insets.EMPTY)));
        });
        Next1.setOnMouseExited((MouseEvent e)->{
            Next1.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(30,30,30,30,false),Insets.EMPTY)));
        });
        
        GoBack1.setTranslateX(1060);
        GoBack1.setTranslateY(620);
        GoBack1.setMinSize(80, 40);
        GoBack1.setFont(Font.font(18));
        GoBack1.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(30,30,30,30,false),Insets.EMPTY)));
        
        GoBack1.setOnAction((ActionEvent e)->{
           The_Bank.SceneRightNow = Login_Portal_User.SetStage();
           The_Bank.tempStage.setScene(The_Bank.SceneRightNow);
        });
        
        GoBack1.setOnMouseEntered((MouseEvent e)->{
                GoBack1.setBackground(new Background(new BackgroundFill(Color.DARKGRAY,new CornerRadii(30,30,30,30,false),Insets.EMPTY)));
        });
        GoBack1.setOnMouseExited((MouseEvent e)->{
                GoBack1.setBackground(new Background(new BackgroundFill(Color.WHITE,new CornerRadii(30,30,30,30,false),Insets.EMPTY)));
        });
        
        
        
        Exit1.setOnAction((ActionEvent e)->{
            (The_Bank.tempStage).setScene(LastScene.lastscene);
            The_Bank.SceneRightNow = scene1;
            
            });
      
        Exit1.setOnMouseEntered((MouseEvent e) -> {
            Exit1.setBackground(new Background(new BackgroundFill(Color.BROWN,new CornerRadii(30),Insets.EMPTY)));
        });
      
        Exit1.setOnMouseExited((MouseEvent e) -> {
            Exit1.setBackground(new Background(new BackgroundFill(Color.TOMATO,new CornerRadii(10,10,10,10,true),Insets.EMPTY)));
        });
        
        
        return scene1;
    }
   static void addOnce(){ 
    Ap.getChildren().addAll(FirstName,LastName,EmailAddress,EmailError,ConfirmEmailAddress,ConfirmEmailError,
                                UserName,CNIC,CNICError,
                                LabelGroup,Gender, DP1,DP2,DP3,DPError,AddressLine1,AddressLine2,PhoneNumber1,
                                PhoneNumber2,City,PostalCode,State,Country,Next1,Exit1,GoBack1,GenderError);
   }
    
    //-------------------------------------------------------------------------------------------------
    //Methods for the Transition
    void FirstNameSize(int i){ 
        FirstName.setMinSize(i,40);
        FirstName.setMaxSize(i,40);
    }  
    void LastNameSize(int i){ 
        LastName.setMinSize(i,40);
        LastName.setMaxSize(i,40);
    }  
    void EmailAddressSize(int i){ 
        EmailAddress.setMinSize(i,40);
        EmailAddress.setMaxSize(i,40);
    }  
    void ConfirmEmailAddressSize(int i){ 
        ConfirmEmailAddress.setMinSize(i,40);
        ConfirmEmailAddress.setMaxSize(i,40);
    }  
    void UserNameSize(int i){ 
        UserName.setMinSize(i,40);
        UserName.setMaxSize(i,40);
    }  
    void CNICSize(int i){ 
        CNIC.setMinSize(i,40);
        CNIC.setMaxSize(i,40);
    }  
    void DP1Size(int i){ 
        DP1.setMinSize(i,40);
        DP1.setMaxSize(i,40);
    }  
    void DP2Size(int i){ 
        DP2.setMinSize(i,40);
        DP2.setMaxSize(i,40);
    }  
    void DP3Size(int i){ 
        DP3.setMinSize(i,40);
        DP3.setMaxSize(i,40);
    }  
    void GenderSize(int i){ 
        Gender.setMinSize(i,40);
        Gender.setMaxSize(i,40);
    }  
    void AddressLine2(int i){ 
        AddressLine2.setMinSize(i,40);
        AddressLine2.setMaxSize(i,40);
    }  
    void PhoneNumber1(int i){ 
        PhoneNumber1.setMinSize(i,40);
        PhoneNumber1.setMaxSize(i,40);
    }  
    
    void PhoneNumber2(int i){ 
        PhoneNumber2.setMinSize(i,40);
        PhoneNumber2.setMaxSize(i,40);
    }  
    
    void AddressLine1(int i){ 
        AddressLine1.setMinSize(i,40);
        AddressLine1.setMaxSize(i,40);
    }  
    void City(int i){ 
        City.setMinSize(i,40);
        City.setMaxSize(i,40);
    }  
    void PostalCode(int i){ 
        PostalCode.setMinSize(i,40);
        PostalCode.setMaxSize(i,40);
    }  
    void State(int i){ 
        State.setMinSize(i,40);
        State.setMaxSize(i,40);
    }  
    void Country(int i){ 
        Country.setMinSize(i,40);
        Country.setMaxSize(i,40);
    }  
    static void SetSizes()
    {
        FirstName.setMinSize(270,40);
        FirstName.setMaxSize(270,40);
        LastName.setMinSize(270,40);
        LastName.setMaxSize(270,40);
        EmailAddress.setMinSize(270,40);
        EmailAddress.setMaxSize(270,40);    
        ConfirmEmailAddress.setMinSize(270,40);
        ConfirmEmailAddress.setMaxSize(270,40);
        UserName.setMinSize(270,40);
        UserName.setMaxSize(270,40);
        CNIC.setMinSize(270,40);
        CNIC.setMaxSize(270,40);
        DP1.setMinSize(75,40);
        DP1.setMaxSize(75,40);
        DP2.setMinSize(75,40);
        DP2.setMaxSize(75,40);
        DP3.setMinSize(75,40);
        DP3.setMaxSize(75,40);
        Gender.setMinSize(270,40);
        Gender.setMaxSize(270,40);
        AddressLine2.setMinSize(270,40);
        AddressLine2.setMaxSize(270,40);
        PhoneNumber1.setMinSize(270,40);
        PhoneNumber1.setMaxSize(270,40);
        PhoneNumber2.setMinSize(270,40);
        PhoneNumber2.setMaxSize(270,40);
        AddressLine1.setMinSize(270,40);
        AddressLine1.setMaxSize(270,40);
        City.setMinSize(270,40);
        City.setMaxSize(270,40);
        PostalCode.setMinSize(270,40);
        PostalCode.setMaxSize(270,40);
        State.setMinSize(270,40);
        State.setMaxSize(270,40);
        Country.setMinSize(270,40);
        Country.setMaxSize(270,40);
    }  
    
    
    
    //Method to Play the Transitions
    
    void PlayALL(){
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

        timeline10.setCycleCount(Animation.INDEFINITE);
        timeline10.play();

        timeline11.setCycleCount(Animation.INDEFINITE);
        timeline11.play();

        timeline12.setCycleCount(Animation.INDEFINITE);
        timeline12.play();
        
        timeline13.setCycleCount(Animation.INDEFINITE);
        timeline13.play();
    
        timeline14.setCycleCount(Animation.INDEFINITE);
        timeline14.play();
    
        timeline15.setCycleCount(Animation.INDEFINITE);
        timeline15.play();
    
        timeline16.setCycleCount(Animation.INDEFINITE);
        timeline16.play();
    
    }
   
    
   
    
    //--------------------------------------------------------------------------------------------------------------------------
}
