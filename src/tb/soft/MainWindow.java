package tb.soft;

import javax.swing.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * klasa główna zawierająca metodę statyczną main
 */

/*
jframe

guziki ok oraz clear (Login/cancel)
okienko logowania (textfieldy login, haslo (zahaslowane JPasswordField))
funkcja main odpowiednio mała, invokeLater wywolywany


login powinien sprawdzic w "bazie danych" (kolekcji, mapa spk)
jesli login i haslo poprawne to tlo okienka zmienia sie na zielone
jesli nie zgadzaja to sie robi czerwone i np dostajemy druga probe. Po 3 probach cala aplikacja sie zamyka.
clear - reset i kolejna proba, zamkniecie aplikacji krzyzykiem

kontrolka hasla nie mma operacji gettext i nie wolno pobierac z tego textu dlatego ze string pamieta sie w pamieci nawet op zamknieciu aplikacji
getpassword zamiast tego

porownujemy hasla znak po znaku
*/

public class MainWindow {
    public static void main(String[] args) {

        Window okno= new Window();
        okno.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        okno.setVisible(true);
    }
}
