package quiz.app;

import java.awt.*;
        import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Login extends JFrame implements ActionListener {
    JTextField text;
    JButton Next, back;
    Login() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/login.png"));

        Image i = i1.getImage().getScaledInstance(550, 500, Image.SCALE_AREA_AVERAGING);
        ImageIcon i2 = new ImageIcon(i);

        JLabel image = new JLabel(i2);
        image.setBounds(450, 30, 550, 500);
        add(image); 

        JLabel heading = new JLabel("QUIZ TEST");
        heading.setBounds(120,70,300,45);
        heading.setFont(new Font("Times New Roman", Font.BOLD, 40));
        heading.setForeground(new Color(22,99,54));
        add(heading);

        JLabel name = new JLabel("Enter your name");
        name.setBounds(160,130,300,20);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD,18));
        name.setForeground(new Color(22,99,54));
        add(name);

        text = new JTextField();
        text.setBounds(80,180,300,25);
        text.setFont(new Font("Times New Roman",Font.BOLD,18));
        add(text);

        Next = new JButton("NEXT");
        Next.setBounds(100,230,120,25);
        Next.setBackground(new Color(22,99,54));
        Next.setForeground(Color.WHITE);
        Next.addActionListener(this);
        add(Next);

        back = new JButton("BACK");
        back.setBounds(250,230,120,25);
        back.setBackground(new Color(22,99,54));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);


        setSize(1000, 500);
        setLocation(150, 150);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == Next){
            String name = text.getText();
            setVisible(false);
            new Rules(name);

        }else if (e.getSource() == back){
            System.exit(50);
        }

    }

    public static void main(String[] args) {
        new Login();
    }
}

