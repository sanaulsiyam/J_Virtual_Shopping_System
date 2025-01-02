package Project;
import javax.swing.*;

import Project.Cart;

import java.io.FileWriter;
import java.util.Formatter;
import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.awt.*;
import java.awt.event.*;

class B extends JPanel  {
    private Image background,gif,cel,icon1;
   

    public B (String imagePath) {
        this.background= new ImageIcon(imagePath).getImage();
        this.gif = new ImageIcon(imagePath).getImage();
        this.cel = new ImageIcon(imagePath).getImage();
        this.icon1 = new ImageIcon(imagePath).getImage();
       
       
        

    }

    
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (background != null||gif !=null) {
              g.drawImage(background, 0, 0, getWidth(), getHeight(), this);
              g.drawImage(gif, 0, 0, getWidth(), getHeight(), this);
              g.drawImage(cel, 0, 0, getWidth(), getHeight(), this);
              g.drawImage(icon1, 0, 0, getWidth(), getHeight(), this);
            

        }
    }
}
public class About extends JFrame implements ActionListener{
     private JButton b,b1,b2,b3,b4,b5,b6;
     private Font f;
     private ImageIcon icon;
     private JLabel t,l,l1,l2,l3,l4;
     private Font font = new Font("Times New Roman",Font.BOLD,25);
     private Font f1 = new Font("Times New Roman",Font.BOLD,16);
     private JPanel panel;
     private double balance = 0;
     private TextField t1;
     public About() {
        setTitle("About");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // setExtendedState(JFrame.MAXIMIZED_BOTH); 
        setBounds(0,0,1100,600);
        setLocationRelativeTo(null);
        setResizable(false);
        

        
        B background= new B("1.png");
        background.setLayout(null);
        B gif = new B("anim.gif");
        gif.setBounds(920,20,120,120);
        background.add(gif);
        B cel = new B("cel.gif");
        cel.setBounds(20,50,60,60);
        background.add(cel);
        B icon1 = new B("siyam.jpg");
        icon1.setBounds(0,0,300,300);
        ImageIcon appIcon = new ImageIcon("mai.png");
        setIconImage(appIcon.getImage());
        
        

        panel = new JPanel(null);
        panel.setBounds(220,200,805,300);
        panel.setBackground(Color.lightGray);
        
        t = new JLabel("10% DISCOUNT");
        t.setBounds(100,30,300,90);
        t.setFont(font);
        t.setForeground(Color.WHITE);
        background.add(t);
        

        l= new JLabel("About");
        l.setBounds(550,130,200,90);
        l.setFont(font);
        l.setForeground(Color.BLACK);
        background.add(l);
        
        l1= new JLabel("This Project is Created by -");
        l1.setBounds(440,20,200,30);
        l1.setFont(f1);
        l1.setForeground(Color.BLACK);
        panel.add(l1);

         l2= new JLabel("MD. SANAUL ISLAM SIYAM");
        l2.setBounds(430,60,300,30);
        l2.setFont(f1);
        l2.setForeground(Color.BLACK);
        panel.add(l2);

         l3= new JLabel("BSc. in CSE");
        l3.setBounds(500,90,300,30);
        l3.setFont(f1);
        l3.setForeground(Color.BLACK);
        panel.add(l3);

         l4= new JLabel("American Internationl University-Bangladesh");
        l4.setBounds(390,120,400,30);
        l4.setFont(f1);
        l4.setForeground(Color.BLACK);
        panel.add(l4);



        panel.add(icon1);
       

       

        background.add(panel);

        f = new Font("Arial",Font.BOLD,14);
        b = new JButton("Home");
        b.setBounds(44,184,100,20);
        b.setFont(f);
        b.setBackground(Color.GREEN);
        b.setForeground(Color.BLACK);
        background.add(b);
        b1 = new JButton("Account");
        b1.setBounds(44,238,100,20);
        b1.setFont(f);
        b1.setBackground(Color.YELLOW);
        b1.setForeground(Color.BLACK);
        background.add(b1);
        b2 = new JButton("Cart");
        b2.setBounds(44,292,100,20);
        b2.setFont(f);
        b2.setBackground(Color.WHITE);
        b2.setForeground(Color.BLACK);
        background.add(b2);
        b3 = new JButton("About");
        b3.setBounds(44,350,100,20);
        b3.setFont(f);
        b3.setBackground(Color.CYAN);
        b3.setForeground(Color.BLACK);
        background.add(b3);
        b4 = new JButton("Sign Out");
        b4.setBounds(44,407,100,20);
        b4.setFont(f);
        b4.setBackground(Color.RED);
        b4.setForeground(Color.BLACK);
        background.add(b4);

       

         b.addActionListener(this);
         b1.addActionListener(this);
         b2.addActionListener(this);
         b3.addActionListener(this);
         b4.addActionListener(this);
        
        

       

        
        add(background);
        setVisible(true);


}    
    public void actionPerformed(ActionEvent e)
     {
         
        
        if(e.getSource()==b2)
        {
            dispose();
            Cart cart = new Cart();
            cart.setVisible(true);
        }
        else if(e.getSource()==b1)
        {
            
            dispose();
           Account ac = new Account();
            ac.setVisible(true);

        }
        else if(e.getSource()==b4)
        {
           
            dispose();
             LogInPage logInPage = new LogInPage();

             logInPage.setVisible(true);
            
        }
        
       else if(e.getSource()==b)
        {
           
            dispose();
           ProductFrame product = new ProductFrame ();
           product.setVisible(true);
        }
        
        
      
     }

    




}