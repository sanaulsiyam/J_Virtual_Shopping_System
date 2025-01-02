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

class Back extends JPanel  {
    private Image background,gif,cel,icon1;
   

    public Back (String imagePath) {
        this.background= new ImageIcon(imagePath).getImage();
        this.gif = new ImageIcon(imagePath).getImage();
        this.cel = new ImageIcon(imagePath).getImage();
        this.icon1 = new ImageIcon(imagePath).getImage();
       
        

    }

    
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (background != null||gif !=null||cel !=null || icon1 !=null) {
              g.drawImage(background, 0, 0, getWidth(), getHeight(), this);
              g.drawImage(gif, 0, 0, getWidth(), getHeight(), this);
              g.drawImage(cel, 0, 0, getWidth(), getHeight(), this);
              g.drawImage(icon1, 0, 0, getWidth(), getHeight(), this);
            

        }
    }
}
public class Account extends JFrame implements ActionListener{
     private JButton b,b1,b2,b3,b4,b5,b6;
     private Font f;
     private ImageIcon icon;
     private JLabel t,l,l1,l2,l3,l4;
     private Font font = new Font("Arial",Font.BOLD,25);
     private Font f1 = new Font("Times New Roman",Font.BOLD,20);
     private JPanel panel;
     private double balance = 0;
     private TextField t1;
     public Account() {
        setTitle("Account");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setExtendedState(JFrame.MAXIMIZED_BOTH); 
        setBounds(0,0,1100,600);
        setLocationRelativeTo(null);
        setResizable(false);

        
        Back background= new Back("1.png");
        background.setLayout(null);
        Back gif = new Back("anim.gif");
        gif.setBounds(920,20,120,120);
        background.add(gif);
        Back cel = new Back("cel.gif");
        cel.setBounds(20,50,60,60);
        background.add(cel);
        ImageIcon appIcon = new ImageIcon("mai.png");
        setIconImage(appIcon.getImage());
        Back icon1 = new Back ("account.png");
        icon1.setBounds(570,183,100,80);
        background.add(icon1);
        

        panel = new JPanel(null);
        panel.setBounds(425,275,380,230);
        panel.setBackground(Color.lightGray);
        
        t = new JLabel("10% DISCOUNT");
        t.setBounds(100,30,300,90);
        t.setFont(font);
        t.setForeground(Color.WHITE);
        background.add(t);
        

        l= new JLabel("My Account");
        l.setBounds(550,118,200,90);
        l.setFont(font);
        l.setForeground(Color.BLACK);
        background.add(l);

        l1= new JLabel("Name : ");
        l1.setBounds(10,5,350,90);
        l1.setFont(f1);
        l1.setForeground(Color.BLACK);
        panel.add(l1);

        l2= new JLabel("Balance : " +balance);
        l2.setBounds(10,45,300,90);
        l2.setFont(f1);
        l2.setForeground(Color.BLACK);
        panel.add(l2);

      
        l3= new JLabel("Recharge : ");
        l3.setBounds(10,97,100,90);
        l3.setFont(f1);
        l3.setForeground(Color.BLACK);
        panel.add(l3);

        t1 = new TextField();
        t1.setBounds(130,130,70,25);
        t1.setFont(f1);
        panel.add(t1);

        b5 = new JButton("Add");
        b5.setBounds(83,185,70,25);
        panel.add(b5);

        b6 = new JButton("Clear");
        b6.setBounds(187,185,70,25);
        panel.add(b6);
        
       

        background.add(panel);

        f = new Font("Arial",Font.BOLD,12);
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
         b5.addActionListener(this);
         b6.addActionListener(this);
        

        setAccount();
        setAccName();


        
        add(background);
        setVisible(true);


}    
    public void actionPerformed(ActionEvent e)
     {
         if(e.getSource()==b5)
        {
            try{
                double amount = Double.parseDouble(t1.getText());
                balance +=amount;
                
                infoAccount();
                infoAccount(balance);
                
            }
            catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null,"Please, Enter a valid amount.","Error",JOptionPane.ERROR_MESSAGE);

            }
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
            clearAccount();
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
        else if(e.getSource()==b6)
        {
            t1.setText("");
        }
        
      
     }

     private void infoAccount()
     {
        l2.setText("Balance : $"+balance);
        JOptionPane.showMessageDialog(null,"Amount added succesfully!","Success",JOptionPane.INFORMATION_MESSAGE);
     }
      
    private void infoAccount(double x)
    {
        
        try{
            String y = Double.toString(x);
            Formatter formatter = new Formatter("account.txt");
            formatter.format("%s%n",y);
            formatter.close();
            
            

        }
        catch(IOException e){

            e.printStackTrace();

        }
    }
    
    private void setAccount() {
    try {
        File file = new File("account.txt");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNext()) {
            String s = scanner.next();

            double z = Double.parseDouble(s);
            balance = z;
            l2.setText("Balance : $" +balance);
           
        }

        scanner.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}

private void clearAccount() {
    try {
        FileWriter fileWriter = new FileWriter("account.txt", false);
       
        fileWriter.write("");
        fileWriter.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}


 private void setAccName() {
    try {
        File file = new File("name.txt");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNext()) {
            String s = scanner.nextLine();

            l1.setText("Name : "+s);
           
        }

        scanner.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}




}