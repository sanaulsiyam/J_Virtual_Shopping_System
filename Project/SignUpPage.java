package Project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

class SignUpBackgroundPanel extends JPanel {
    private Image backgroundImage;

    public SignUpBackgroundPanel(String imagePath) {
        this.backgroundImage = new ImageIcon(imagePath).getImage();
    }

    
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (backgroundImage != null) {
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }
    }
}

public class SignUpPage extends JFrame implements ActionListener{
    TextField t, t1;
    JPasswordField t2,t3;
    JLabel l,l1, l2, l3, l4, l5, l6;  
    JPanel panel;
    JButton b1, b2, b3;
    Font font = new Font("Arial", Font.BOLD,16 );
    Font font1 = new Font("Arial", Font.BOLD,20 );
    Font f = new Font ("Arial",Font.BOLD,15);
    private String s3,s4,s5,s6;
   
	
	

    public SignUpPage() {
        setTitle("Sign Up Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setExtendedState(JFrame.MAXIMIZED_BOTH); 
        setSize(1100,600);
        setLocationRelativeTo(null);
        setResizable(false);

        ImageIcon appIcon = new ImageIcon("mai.png");
        setIconImage(appIcon.getImage());
        SignUpBackgroundPanel backgroundPanel = new SignUpBackgroundPanel("sign.png");
        backgroundPanel.setLayout(null);
        l= new JLabel("Create New Account");
        l.setBounds(630,190,350,30);
        l.setFont(font1);
        l.setForeground(Color.CYAN);
        backgroundPanel.add(l);

        l1 = new JLabel("Full Name");
        l1.setBounds(550,270, 150, 20);
        l1.setFont(font);
        l1.setForeground(Color.WHITE);
        backgroundPanel.add(l1);

        l2 = new JLabel("Email");
        l2.setBounds(550, 310, 150, 20);
        l2.setFont(font);
        l2.setForeground(Color.WHITE);
        backgroundPanel.add(l2);

        l3 = new JLabel("New Password");
        l3.setBounds(550, 350, 150, 20);
        l3.setFont(font);
        l3.setForeground(Color.WHITE);
        backgroundPanel.add(l3);

        l4 = new JLabel("Retype Password");
        l4.setBounds(550,390,150, 20);
        l4.setFont(font);
        l4.setForeground(Color.WHITE);
        backgroundPanel.add(l4);


        t = new TextField(25);
        t.setBounds(700, 270, 200, 20);
        t.setFont(f);
        t.setBackground(Color.LIGHT_GRAY);
        backgroundPanel.add(t);

        t1 = new TextField(25);
        t1.setBounds(700, 310, 200, 20);
        t1.setFont(f);
        t1.setBackground(Color.LIGHT_GRAY);
        backgroundPanel.add(t1);

        t2 = new JPasswordField(25);
        t2.setBounds(700, 350, 200, 20);
        t2.setFont(f);
        t2.setBackground(Color.LIGHT_GRAY);
        backgroundPanel.add(t2);

        t3 = new JPasswordField(25);
        t3.setBounds(700, 390, 200, 20);
        t3.setFont(f);
        t3.setBackground(Color.LIGHT_GRAY);
        backgroundPanel.add(t3);
        
    
        b1 = new JButton("Sign Up");
        b1.setBounds(670, 480, 95, 20);
        b1.setFont(f);
        b1.setBackground(Color.GREEN);
       
        backgroundPanel.add(b1);

        b2 = new JButton("Reset");
        b2.setBounds(810, 480, 95, 20);
        b2.setFont(f);
        b2.setBackground(Color.ORANGE);
        
        backgroundPanel.add(b2);

         b3 = new JButton("Exit");
        b3.setBounds(740,530, 95, 20);
        b3.setFont(f);
        b3.setBackground(Color.RED);
       
        backgroundPanel.add(b3);

        setContentPane(backgroundPanel);
        setVisible(true);
         b1.addActionListener(this);
         b2.addActionListener(this);
         b3.addActionListener(this);
    }
    private void openLogInPage() {
		dispose();
        LogInPage logInPage = new LogInPage();
        logInPage.setName(getName(),getEmail(),getPass());
        logInPage.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
         s3 = t.getText();
         s4 = t1.getText();
         s5 = t2.getText();
         s6 = t3.getText();

       
        
        if(e.getSource()==b1)
        {
            if(s3.equals("")||s4.equals("")||s5.equals(""))
            {
                 JOptionPane.showMessageDialog(null,"Please fill up the form first!","Warning",JOptionPane.WARNING_MESSAGE);
            }
             else if(s5.equals(s6))
            {
                    JOptionPane.showMessageDialog(null,"Registration successfully done.","Successful",JOptionPane.INFORMATION_MESSAGE);
                    registerUser();
                     openLogInPage();
                

            }
            else{
                
                 JOptionPane.showMessageDialog(null,"Password doesn't match!","Warning",JOptionPane.WARNING_MESSAGE);
                     
            }
            

           
        }
        else if(e.getSource()==b2){
           t.setText("");
           t1.setText("");
           t2.setText("");
           t3.setText("");
        }
        else if(e.getSource()==b3)
        {
            System.exit(0);
        }
    }


    private void registerUser() {
        String email = t1.getText();
        char[] passwordChars = t2.getPassword();
        String password = new String(passwordChars);

        try (PrintWriter writer = new PrintWriter(new FileWriter("user_data.txt", true))) {
            writer.println(email + "," + password);
            
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error during registration.");
        }

    }

    public String getName()
    {
        return s3;
    }
    public String getEmail()
    {
        return s4;
    }
    public String getPass()
    {
        return s5;
    }




  
}
