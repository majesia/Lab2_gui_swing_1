package tb.soft;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame implements ActionListener {

    JButton bLogin, bCancel;
    JTextField tfLogin, tfPassword;
    public Window(){
        setSize(500,250);
        setTitle("Logowanie");
        setLayout(null);

        bLogin = new JButton("Accept");
        bLogin.setBounds(100,150,100,40);
        add(bLogin);
        bCancel = new JButton("Cancel");
        bCancel.setBounds(300,150,100,40);
        add(bCancel);

    }






    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
