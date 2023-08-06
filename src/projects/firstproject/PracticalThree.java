package projects.firstproject;

import javax.swing.*;

public class PracticalThree extends JFrame {
//    JFrame f1;
    JLabel lbl1, lbl2, lbl3, lbl4, lbl5, lbl6, lbl7, lbl8, lbl9, lbl10, lbl11;
    JButton btn1;

    PracticalThree() {
//        f1 = new JFrame("Third Practical");
        add(btn1);
        add(lbl1);
        add(lbl2);
        add(lbl3);
        add(lbl4);
        add(lbl5);
        add(lbl6);
        add(lbl7);
        add(lbl8);
        add(lbl9);
        add(lbl10);
        add(lbl11);
        setTitle("Third Practical");
        setVisible(true);
        setSize(500, 550);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new PracticalThree();
    }
}
