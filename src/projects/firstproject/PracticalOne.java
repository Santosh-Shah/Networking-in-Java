package projects.firstproject;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;

public class PracticalOne extends JFrame {
    JFrame f1;
    JLabel lbl1;
    JButton btn1,btn2,btn3;
    JTextField txt1, txt2;
    public PracticalOne(){
        f1=new JFrame("Home Page");
        f1.setSize(300,300);
        f1.setLayout(null);
        btn3= new JButton("Go Back");

        lbl1= new JLabel("Network Programming Practical");
        txt1 = new JTextField();
        btn1 = new JButton("Find IP");
        btn2=new JButton("Find URL");
        txt2= new JTextField();
        lbl1.setBounds(50,20,240,30);
        btn1.setBounds(50,50,120,30);
        btn2.setBounds(190,50,120,30);
        txt1.setBounds(50,90,120,30);
        txt2.setBounds(50,120,120,30);
        btn3.setBounds(100,100,100,100);

        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.setVisible(false);
                setVisible(true);
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt2.setText("Hello");
            }
        });
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if(txt1.getText().equals("")) {
                        JOptionPane.showMessageDialog(PracticalOne.this, "Enter the URL");

                    }
                    else{
                        InetAddress ip = InetAddress.getByName(txt1.getText());
                        txt2.setText(ip.getHostAddress());

                        f1.setVisible(true);
                        setVisible(false);
                        f1.setTitle(ip.getHostAddress());
                    }

                }catch(Exception ex){

                }
            }
        });


        //adding components
        add(lbl1);
        add(txt1);
        add(btn1);
        add(btn2);
        add(txt2);
        f1.add(btn3);
        setLayout(null);
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


    }
    public static void main(String[] args) {
        new PracticalOne();
    }
}
