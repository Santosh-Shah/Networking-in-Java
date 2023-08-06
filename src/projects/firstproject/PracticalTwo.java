package projects.firstproject;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;

public class PracticalTwo extends JFrame{
    JFrame f1;
    JLabel lbl1;
    JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10;
    JTextField txt1, txt2;
    PracticalTwo() {
        f1=new JFrame("Home Page");
        f1.setSize(300,300);
        f1.setLayout(null);
//        btn3= new JButton("Go Back");

        lbl1= new JLabel("Practical Two");
        txt1 = new JTextField();
        btn1 = new JButton("Any Local?");
        btn2 = new JButton("Link Local?");
        btn3 = new JButton("Loop Back?");
        btn4 = new JButton("Any Local?");
        btn5 = new JButton("MC: Global?");
        btn6 = new JButton("MC: Link Local?");
        btn7 = new JButton("MC: Node Local?");
        btn8 = new JButton("MC: org Local?");
        btn9 = new JButton("Multicast Address?");
        btn10 = new JButton("Is Reachable?");

        txt2 = new JTextField();
        lbl1.setBounds(50, 20, 240, 30);

        btn1.setBounds(50, 140, 240, 30);
        btn2.setBounds(50, 180, 240, 30);
        btn3.setBounds(50, 220, 240, 30);
        btn4.setBounds(50, 260, 240, 30);
        btn5.setBounds(50, 300, 240, 30);
        btn6.setBounds(50, 340, 240, 30);
        btn7.setBounds(50, 380, 240, 30);
        btn8.setBounds(50, 420, 240, 30);
        btn9.setBounds(50, 460, 240, 30);
        btn10.setBounds(50, 500, 240, 30);


        txt1.setBounds(50,90,420,30);
        txt2.setBounds(50,90,420,30);


        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    InetAddress ip = InetAddress.getByName(txt1.getText());
                    txt2.setText("Any Local Address" + ip.isLinkLocalAddress());
                } catch (Exception exception) {
                }
            }
        });

        //adding components
        add(lbl1);
        add(txt1);
        add(txt2);
        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);
        add(btn6);
        add(btn7);
        add(btn8);
        add(btn9);
        add(btn10);
        setLayout(null);
        setSize(500,600);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new PracticalTwo();
    }
}
