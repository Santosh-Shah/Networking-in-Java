package projects.firstproject;

import javax.swing.*;

public class FirstProject extends JFrame {
    JFrame jFrame;
    JLabel jLbl;
    JTextField jTxt1;
    JTextField jTxt2;
    JButton jBtn1, jBtn2;

    FirstProject() {
        // for JFrame
        jFrame = new JFrame("IP Address and URL finder");

        // For JLabel component
        jLbl = new JLabel("First Project of Network Programming");
        jLbl.setBounds(80, 15, 300,150);
        jFrame.add(jLbl);

        // For JButton component
        jBtn1 = new JButton("Find IP Address");
        jBtn2 = new JButton("Find URL");
        jBtn1.setBounds(50, 150, 130, 30);
        jBtn2.setBounds(250, 100, 150, 50);
        jFrame.add(jBtn1);
        jFrame.add(jBtn2);



        jFrame.setSize(500, 500);



        // for JFrame
        jFrame.setLayout(null);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {
            new FirstProject();
    }
}
