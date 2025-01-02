package Project;
import Project.Account;
import Project.Cart;

import java.io.File;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;


class BackgroundPanel extends JPanel  {
    private Image backgroundImage,gif,cel;
   

    public BackgroundPanel(String imagePath) {
        this.backgroundImage = new ImageIcon(imagePath).getImage();
        this.gif = new ImageIcon(imagePath).getImage();
        this.cel = new ImageIcon(imagePath).getImage();
       
        

    }

    
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (backgroundImage != null||gif !=null ||cel !=null) {
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
            g.drawImage(gif, 0, 0, getWidth(), getHeight(), this);
             g.drawImage(cel, 0, 0, getWidth(), getHeight(), this);
            

        }
    }
}
public class ProductFrame extends JFrame implements ActionListener{
     private JButton b,b1,b2,b3,b4,p,p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12;
     private Font f,f1;
     private ImageIcon icon,icon1,icon2,icon3,icon4,icon5,icon6,icon7,icon8,icon9,icon10,icon11,icon12;
     private JLabel t,l,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,l25,l26,l27,l28,l29,l30,m1,m2,m3,m5,m4,m6,m7,m8,m9;
     private Font font = new Font("Times New Roman",Font.BOLD,25);
     private Cart cart;
     public ProductFrame() {
        setTitle("Product Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setExtendedState(JFrame.MAXIMIZED_BOTH); 
        setSize(1100,600);
        setLocationRelativeTo(null);
        setResizable(false);

        
        BackgroundPanel backgroundPanel = new BackgroundPanel("1.png");
        backgroundPanel.setLayout(null);
        BackgroundPanel gif = new BackgroundPanel("anim.gif");
        gif.setBounds(920,20,120,120);
        backgroundPanel.add(gif);
        BackgroundPanel cel = new BackgroundPanel("cel.gif");
        cel.setBounds(20,50,60,60);
        backgroundPanel.add(cel);
        ImageIcon appIcon = new ImageIcon("mai.png");
        setIconImage(appIcon.getImage());

        
        t = new JLabel("10% DISCOUNT");
        t.setBounds(100,30,300,90);
        t.setFont(font);
        t.setForeground(Color.WHITE);
        backgroundPanel.add(t);

        f = new Font("Arial",Font.BOLD,12);
        b = new JButton("Home");
        b.setBounds(44,184,100,20);
        b.setFont(f);
        b.setBackground(Color.GREEN);
        b.setForeground(Color.BLACK);
        backgroundPanel.add(b);
        b1 = new JButton("Account");
        b1.setBounds(44,238,100,20);
        b1.setFont(f);
        b1.setBackground(Color.YELLOW);
        b1.setForeground(Color.BLACK);
        backgroundPanel.add(b1);
        b2 = new JButton("Cart");
        b2.setBounds(44,292,100,20);
        b2.setFont(f);
        b2.setBackground(Color.WHITE);
        b2.setForeground(Color.BLACK);
        backgroundPanel.add(b2);
        b3 = new JButton("About");
        b3.setBounds(44,350,100,20);
        b3.setFont(f);
        b3.setBackground(Color.CYAN);
        b3.setForeground(Color.BLACK);
        backgroundPanel.add(b3);
        b4 = new JButton("Sign Out");
        b4.setBounds(44,407,100,20);
        b4.setFont(f);
        b4.setBackground(Color.RED);
        b4.setForeground(Color.BLACK);
        backgroundPanel.add(b4);
        
        icon = new ImageIcon("shoe.jpg");
        l = new JLabel(icon);
        l.setBounds(110,100,240,240);
        backgroundPanel.add(l);
        f1 = new Font("Arial",Font.BOLD,14);
        l1 = new JLabel("$500");
        l1.setBounds(210,285,70,25);
        l1.setForeground(Color.BLACK);
        l1.setFont(f1);
        l5 = new JLabel("Shoe");
        l5.setBounds(210,300,70,25);
        l5.setForeground(Color.BLACK);
        backgroundPanel.add(l5);
        backgroundPanel.add(l1);
        p = new JButton("Add to cart");
        p.setBounds(180,320,100,20);
        p.setFont(f);
        p.setBackground(Color.ORANGE);
        p.setForeground(Color.BLACK);
        backgroundPanel.add(p);

        icon1 = new ImageIcon("shirt.jpg");
        l2 = new JLabel(icon1);
        l2.setBounds(260,100,240,240);
        backgroundPanel.add(l2);
        l3 = new JLabel("$420");
        l3.setBounds(360,285,70,25);
        l3.setForeground(Color.BLACK);
        l3.setFont(f1);
        backgroundPanel.add(l3);
        p1 = new JButton("Add to cart");
        p1.setBounds(320,320,100,20);
        p1.setFont(f);
        p1.setBackground(Color.ORANGE);

        p1.setForeground(Color.BLACK);
        backgroundPanel.add(p1);
        l4 = new JLabel("Shirt");
        l4.setBounds(360,300,70,25);
        l4.setForeground(Color.BLACK);
        backgroundPanel.add(l4);

        icon2 = new ImageIcon("camera.jpg");
        l6 = new JLabel(icon2);
        l6.setBounds(410,100,240,240);
        backgroundPanel.add(l6);
        l7 = new JLabel("$756");
        l7.setBounds(500,285,70,25);
        l7.setForeground(Color.BLACK);
        l7.setFont(f1);
        backgroundPanel.add(l7);
        p3 = new JButton("Add to cart");
        p3.setBounds(470,320,100,20);
        p3.setFont(f);
        p3.setBackground(Color.ORANGE);
        p3.setForeground(Color.BLACK);
        backgroundPanel.add(p3);
        l8 = new JLabel("Camera");
        l8.setBounds(500,300,70,25);
        l8.setForeground(Color.BLACK);
        backgroundPanel.add(l8);

        icon3 = new ImageIcon("hat.jpg");
        l9 = new JLabel(icon3);
        l9.setBounds(560,100,240,240);
        backgroundPanel.add(l9);
        l10 = new JLabel("$115");
        l10.setBounds(650,285,70,25);
        l10.setForeground(Color.BLACK);
        l10.setFont(f1);
        backgroundPanel.add(l10);
        p4 = new JButton("Add to cart");
        p4.setBounds(620,320,100,20);
        p4.setFont(f);
        p4.setBackground(Color.ORANGE);
        p4.setForeground(Color.BLACK);
        backgroundPanel.add(p4);
        l11 = new JLabel("Hat");
        l11.setBounds(650,300,70,25);
        l11.setForeground(Color.BLACK);
        backgroundPanel.add(l11);

        icon4 = new ImageIcon("perfume.jpg");
        l12 = new JLabel(icon4);
        l12.setBounds(710,100,240,240);
        backgroundPanel.add(l12);
        l13 = new JLabel("$257");
        l13.setBounds(800,285,70,25);
        l13.setForeground(Color.BLACK);
        l13.setFont(f1);
        backgroundPanel.add(l13);
        p5 = new JButton("Add to cart");
        p5.setBounds(770,320,100,20);
        p5.setFont(f);
        p5.setBackground(Color.ORANGE);
        p5.setForeground(Color.BLACK);
        backgroundPanel.add(p5);
        l14 = new JLabel("Perfume");
        l14.setBounds(800,300,70,25);
        l14.setForeground(Color.BLACK);
        backgroundPanel.add(l14);

        icon5 = new ImageIcon("bag.jpg");
        l15 = new JLabel(icon5);
        l15.setBounds(860,100,240,240);
        backgroundPanel.add(l15);
        l16 = new JLabel("$250");
        l16.setBounds(955,285,70,25);
        l16.setForeground(Color.BLACK);
        l16.setFont(f1);
        backgroundPanel.add(l16);
        p6 = new JButton("Add to cart");
        p6.setBounds(920,320,100,20);
        p6.setFont(f);
        p6.setBackground(Color.ORANGE);
        p6.setForeground(Color.BLACK);
        backgroundPanel.add(p6);
        l17 = new JLabel("Hand Bag");
        l17.setBounds(955,300,70,25);
        l17.setForeground(Color.BLACK);
        backgroundPanel.add(l17);

        icon6 = new ImageIcon("bornvita.jpg");
        l18 = new JLabel(icon6);
        l18.setBounds(110,305,240,240);
        backgroundPanel.add(l18);
        l19 = new JLabel("$150");
        l19.setBounds(210,490,70,25);
        l19.setForeground(Color.BLACK);
        l19.setFont(f1);
        backgroundPanel.add(l19);
        p7 = new JButton("Add to cart");
        p7.setBounds(180,530,100,20);
        p7.setFont(f);
        p7.setBackground(Color.ORANGE);
        p7.setForeground(Color.BLACK);
        backgroundPanel.add(p7);
        l20 = new JLabel("Bornvita");
        l20.setBounds(210,505,70,25);
        l20.setForeground(Color.BLACK);
        backgroundPanel.add(l20);

        icon7 = new ImageIcon("headphone.jpg");
        l21 = new JLabel(icon7);
        l21.setBounds(260,305,240,240);
        backgroundPanel.add(l21);
        l22 = new JLabel("$350");
        l22.setBounds(360,490,70,25);
        l22.setForeground(Color.BLACK);
        l22.setFont(f1);
        backgroundPanel.add(l22);
        p8 = new JButton("Add to cart");
        p8.setBounds(320,530,100,20);
        p8.setFont(f);
        p8.setBackground(Color.ORANGE);
        p8.setForeground(Color.BLACK);
        backgroundPanel.add(p8);
        l23 = new JLabel("Headphone");
        l23.setBounds(350,505,70,25);
        l23.setForeground(Color.BLACK);
        backgroundPanel.add(l23);

        icon8 = new ImageIcon("sweater.jpg");
        l24 = new JLabel(icon8);
        l24.setBounds(410,305,240,240);
        backgroundPanel.add(l24);
        l25 = new JLabel("$256");
        l25.setBounds(500,490,70,25);
        l25.setForeground(Color.BLACK);
        l25.setFont(f1);
        backgroundPanel.add(l25);
        p9 = new JButton("Add to cart");
        p9.setBounds(470,530,100,20);
        p9.setFont(f);
        p9.setBackground(Color.ORANGE);
        p9.setForeground(Color.BLACK);
        backgroundPanel.add(p9);
        l26 = new JLabel("Sweater");
        l26.setBounds(500,505,70,25);
        l26.setForeground(Color.BLACK);
        backgroundPanel.add(l26);

        icon9 = new ImageIcon("hil.jpg");
        l27 = new JLabel(icon9);
        l27.setBounds(560,305,240,240);
        backgroundPanel.add(l27);
        l28 = new JLabel("$400");
        l28.setBounds(650,490,70,25);
        l28.setForeground(Color.BLACK);
        l28.setFont(f1);
        backgroundPanel.add(l28);
        p10 = new JButton("Add to cart");
        p10.setBounds(620,530,100,20);
        p10.setFont(f);
        p10.setBackground(Color.ORANGE);
        p10.setForeground(Color.BLACK);
        backgroundPanel.add(p10);
        l29 = new JLabel("Heel");
        l29.setBounds(650,505,70,25);
        l29.setForeground(Color.BLACK);
        backgroundPanel.add(l29);

        icon10 = new ImageIcon("phone.jpg");
        l30 = new JLabel(icon10);
        l30.setBounds(710,305,240,240);
        backgroundPanel.add(l30);
        m1 = new JLabel("$1257");
        m1.setBounds(800,490,70,25);
        m1.setForeground(Color.BLACK);
        m1.setFont(f1);
        backgroundPanel.add(m1);
        p11 = new JButton("Add to cart");
        p11.setBounds(770,530,100,20);
        p11.setFont(f);
        p11.setBackground(Color.ORANGE);
        p11.setForeground(Color.BLACK);
        backgroundPanel.add(p11);
        m2 = new JLabel("S23-Ultra");
        m2.setBounds(800,505,70,25);
        m2.setForeground(Color.BLACK);
        backgroundPanel.add(m2);

        icon12 = new ImageIcon("Laptop.jpg");
        m3 = new JLabel(icon12);
        m3.setBounds(860,305,240,240);
        backgroundPanel.add(m3);
        m4 = new JLabel("$1950");
        m4.setBounds(955,490,70,25);
        m4.setForeground(Color.BLACK);
        m4.setFont(f1);
        backgroundPanel.add(m4);
        p12 = new JButton("Add to cart");
        p12.setBounds(920,530,100,20);
        p12.setFont(f);
        p12.setBackground(Color.ORANGE);
        p12.setForeground(Color.BLACK);
        backgroundPanel.add(p12);
        m5 = new JLabel("Laptop");
        m5.setBounds(955,505,70,25);
        m5.setForeground(Color.BLACK);
        backgroundPanel.add(m5);

         
         b1.addActionListener(this);
         b2.addActionListener(this);
         b3.addActionListener(this);
         b4.addActionListener(this);

         p.addActionListener(this);
         p1.addActionListener(this);
         
         p3.addActionListener(this);
         p4.addActionListener(this);
         p5.addActionListener(this);
         p6.addActionListener(this);
         p7.addActionListener(this);
         p8.addActionListener(this);
         p9.addActionListener(this);
         p10.addActionListener(this);
         p11.addActionListener(this);
         p12.addActionListener(this);

      
      
        add(backgroundPanel);
        setVisible(true);


}    

    public void actionPerformed(ActionEvent e)
     {
        if(e.getSource()==b1)
        {
            dispose();
        Account acc = new Account();

        acc.setVisible(true);
          
            
        }
        else if(e.getSource()==b2)
        {
           dispose();
            Cart cart = new Cart();
            cart.setVisible(true);
        }
        else if(e.getSource()==b3)
        {
           dispose();
           About about = new About();
            about.setVisible(true);

        }
        else if(e.getSource()==b4)
        {
           eraseAccount();
           dispose();
         dispose();
        LogInPage logInPage = new LogInPage();

        logInPage.setVisible(true);
        }
        else if(e.getSource()==p)
        {
          
          file("Shoe","1","500");
         
           JOptionPane.showMessageDialog(null,"Added to cart successfully","Successful",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(e.getSource()==p1)
        {
           file("Shirt","1","420");
           JOptionPane.showMessageDialog(null,"Added to cart successfully","Successful",JOptionPane.INFORMATION_MESSAGE);
        }
       
        else if(e.getSource()==p3)
        {
           file("Camera","1","756");
           JOptionPane.showMessageDialog(null,"Added to cart successfully","Successful",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(e.getSource()==p4)
        {
          file("Hat","1","115");
           JOptionPane.showMessageDialog(null,"Added to cart successfully","Successful",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(e.getSource()==p5)
        {  
           file("Perfume","1","257");
           JOptionPane.showMessageDialog(null,"Added to cart successfully","Successful",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(e.getSource()==p6)
        {
           file("HandBag","1","250");
           JOptionPane.showMessageDialog(null,"Added to cart successfully","Successful",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(e.getSource()==p7)
        {
           file("Bornvita","1","150");
           JOptionPane.showMessageDialog(null,"Added to cart successfully","Successful",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(e.getSource()==p8)
        {  
           file("HeadPhone","1","350");
           JOptionPane.showMessageDialog(null,"Added to cart successfully","Successful",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(e.getSource()==p9)
        {
           file("Sweater","1","256");
           JOptionPane.showMessageDialog(null,"Added to cart successfully","Successful",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(e.getSource()==p10)
        {  
          file("Heel","1","400");
           JOptionPane.showMessageDialog(null,"Added to cart successfully","Successful",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(e.getSource()==p11)
        {
           file("S23-Ultra","1","1257");
           JOptionPane.showMessageDialog(null,"Added to cart successfully","Successful",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(e.getSource()==p12)
        {
           file("Laptop","1","1950");
           JOptionPane.showMessageDialog(null,"Added to cart successfully","Successful",JOptionPane.INFORMATION_MESSAGE);
        }
        
     }
   

 
     
      private void file( String x, String y, String z)
      {
         try{
            FileWriter fileWriter= new FileWriter("cart.txt",true);
            fileWriter.write(String.format("%s %s %s%n",x,y,z));
            fileWriter.close();
         }
         
         catch (IOException e) {
            e.printStackTrace();
        }
      }
      public void eraseAccount() {
         try {
             FileWriter fileWriter = new FileWriter("account.txt", false);
            
             fileWriter.write("");
             fileWriter.close();
         } catch (IOException e) {
             e.printStackTrace();
         }
     }
     
    

  

}