import javax.swing.*;
// https://github.com/MikiKru/JavaDeveloperWorkshop

// psvm -> public static void main(){}
// ALT + ENTER -> auto-podpowiedź
// CTRL + SHIFT + F10 - run
// CTRL + D -> duplicate
public class WorkshopGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Naucz się programowania");
        // ----------------------------------------------------
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


        frame.setSize(300,300);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
