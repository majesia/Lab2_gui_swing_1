package tb.soft;

import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import javax.swing.text.StyledEditorKit;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.FeatureDescriptor;
import java.util.ArrayList;
import java.util.Objects;

public class Window extends JFrame implements ActionListener {
    
    ArrayList<User> users = new ArrayList<>();
    User user1 = new User();
    JButton bLogin, bCancel;
    JTextField tfLogin;
    JLabel lLogin,lPassword;
    JPasswordField pfPassword;
    public Window(){
        setSize(500,250);
        setTitle("Logowanie");
        setLayout(null);
        getContentPane().setBackground(new Color(160,100,100));

        //przycisk akceptacji
        bLogin = new JButton("Accept");
        bLogin.setBounds(100,150,100,40);
        bLogin.setFont(new Font("Dialog",Font.HANGING_BASELINE,20));
        bLogin.setBackground(new Color(20,40,40));
        add(bLogin);
        bLogin.addActionListener(this);

        //przycisk wyjscia
        bCancel = new JButton("Cancel");
        bCancel.setBounds(300,150,100,40);
        bCancel.setFont(new Font("Dialog",Font.HANGING_BASELINE,20));
        bCancel.setBackground(new Color(20,40,40));

        add(bCancel);
        bCancel.addActionListener(this);

        //login
        lLogin= new JLabel("Login:");
        lLogin.setBounds(100,70,70,20);
        add(lLogin);
        //bLogin.addActionListener(this);

        tfLogin = new JTextField();
        tfLogin.setBounds(180,70,220,20);
        add(tfLogin);
        tfLogin.addActionListener(this);

        //haslo
        lPassword= new JLabel("Password:");
        lPassword.setBounds(100,100,70,20);
        add(lPassword);

        pfPassword = new JPasswordField();
        pfPassword.setBounds(180,100,220,20);
        add(pfPassword);
        pfPassword.addActionListener(this);

        char[] tab= new char[]{'1','2'};

        user1.setLogin("wika");
        user1.setPassword(tab);
        users.add(user1);

        User user2 = new User();
        user2.setLogin("elo");
        user2.setPassword(new char[]{'1', 'a', '1'});
        users.add(user2);
    }

    static void changeColor(Color color){

    }

    String login;
    char[] passoword = new char[0];
    ArrayList<User> usersWithTheSameLogin = new ArrayList<>() ;
    @Override
    public void actionPerformed(ActionEvent e) {

        boolean isUserFound = false, isPasswordCorrect = false;


        Object source = e.getSource();


        if(source==tfLogin) {
            login=tfLogin.getText();
            System.out.println(login);
        }
        if (source==pfPassword) {
            passoword= pfPassword.getPassword();
            System.out.println(passoword);
        }

        if(source==bLogin){
            for (User user:users) {
                if(Objects.equals(login, user.login)) {
                    usersWithTheSameLogin.add(user);
                }
            }


            for (User user:usersWithTheSameLogin) {
                System.out.println(user.password);
                int loops = 0;

                if (user.password.length != passoword.length) {
                    System.out.println("niezgodna dlugosc hasel");
                    break;
                }
                for (char znak : passoword) {
                    int number = user.password.length;
                    if (znak == user.password[loops]) {
                        isPasswordCorrect = true;
                    } else {
                        Window.this.setBackground(Color.red);
                        isPasswordCorrect = false;
                        break;
                    }
                    System.out.println(isPasswordCorrect);
                    loops += 1;
                }
                System.out.println(isPasswordCorrect);
                if (isPasswordCorrect) {
                    if (user.password.length == passoword.length) {
                        getContentPane().setBackground(new Color(10,150,80));
                        isUserFound = true;
                        System.out.println("poprawne haslo");
                    }
                    else {
                        System.out.println("haslo niepoprawne");
                        getContentPane().setBackground(new Color(200,40,50));

                        isPasswordCorrect = false;
                        break;
                    }
                }
            }

            }

        if (source==bCancel){
            dispose();
        }
        }
    }







