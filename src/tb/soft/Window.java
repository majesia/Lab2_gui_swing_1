package tb.soft;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame implements ActionListener {

    JButton bLogin, bCancel;
    JTextField tfLogin, tfPassword;
    JLabel lLogin, lPassword;
    public Window(){
        setSize(500,250);
        setTitle("Logowanie");
        setLayout(null);
        //przycisk akceptacji
        bLogin = new JButton("Accept");
        bLogin.setBounds(100,150,100,40);
        add(bLogin);
        //przycisk wyjscia
        bCancel = new JButton("Cancel");
        bCancel.setBounds(300,150,100,40);
        add(bCancel);
        //login
        lLogin= new JLabel("Login:");
        lLogin.setBounds(100,70,70,20);
        add(lLogin);

        tfLogin = new JTextField();
        tfLogin.setBounds(180,70,220,20);
        add(tfLogin);

        //haslo
        lPassword= new JLabel("Password:");
        lPassword.setBounds(100,100,70,20);
        add(lPassword);

        tfPassword = new JTextField();
        tfPassword.setBounds(180,100,220,20);
        add(tfPassword);
    }






    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
