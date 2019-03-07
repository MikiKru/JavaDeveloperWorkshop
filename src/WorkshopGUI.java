import javax.swing.*;
// https://github.com/MikiKru/JavaDeveloperWorkshop

// psvm -> public static void main(){}
// ALT + ENTER -> auto-podpowiedź
// CTRL + SHIFT + F10 - run
// CTRL + D -> duplicate
public class WorkshopGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Naucz się programowania");
        //UTWORZENIE I USTAWIENIE OBIEKTÓW---------------------
        JLabel lblName = new JLabel("Imię i nazwisko");
        lblName.setBounds(20, 20, 150, 20);
        JTextField tfName = new JTextField();
        tfName.setBounds(20, 50, 150, 20);
        // ----------------------------------------------------
        JLabel lblEmail = new JLabel("Email");
        lblEmail.setBounds(20, 80, 150, 20);
        JTextField tfEmail = new JTextField();
        tfEmail.setBounds(20,110, 150, 20);
        // ----------------------------------------------------
        JLabel lblGender = new JLabel("Płeć");
        lblGender.setBounds(20, 140, 150, 20);
        // POLA WYOBRU-----------------------------------------
        JRadioButton rbFemale = new JRadioButton("kobieta");
        rbFemale.setBounds(20, 170, 150, 20);
        JRadioButton rbMale = new JRadioButton("meżczyzna");
        rbMale.setBounds(20, 200, 150, 20);
        // Agregacja obiektów RB -------------------------------
        ButtonGroup bgGender = new ButtonGroup();
        bgGender.add(rbFemale);
        bgGender.add(rbMale);

        //DODAWANIE OBIEKTÓW DO OKNA----------------------------
        frame.add(lblName); frame.add(lblEmail); frame.add(lblGender);
        frame.add(tfName); frame.add(tfEmail);
        frame.add(rbFemale); frame.add(rbMale);
        // ----------------------------------------------------
        frame.setSize(300,300);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
