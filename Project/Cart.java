package Project;
import javax.swing.*;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.Formatter;
import java.util.Scanner;
import java.util.Random;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;

class Background extends JPanel  {
    private Image background,gif,cel;
   

    public Background (String imagePath) {
        this.background= new ImageIcon(imagePath).getImage();
        this.gif = new ImageIcon(imagePath).getImage();
        this.cel = new ImageIcon(imagePath).getImage();
        
       
        

    }

    
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (background != null||gif !=null ||cel !=null) {
              g.drawImage(background, 0, 0, getWidth(), getHeight(), this);
              g.drawImage(gif, 0, 0, getWidth(), getHeight(), this);
              g.drawImage(cel, 0, 0, getWidth(), getHeight(), this);
             
            

        }
    }
}
public class Cart extends JFrame implements ActionListener{
     private JButton b,b1,b2,b3,b4,b5,b6,b7,b8;
     private Font f = new Font("Arial",Font.BOLD,12);;
     private ImageIcon icon;
     private JLabel t,l,l1,l2,l3,l4,l5,l6;
     private Font font = new Font("Arial",Font.BOLD,25);
     private Font f1 = new Font("Times New Roman",Font.BOLD,20);
     private Font f2 = new Font("Arial",Font.BOLD,14);
     private JPanel panel,panel1;
     private double balance = 0;
     private TextField t1;
     private JTable table;
     private DefaultTableModel model;
     private double payment=0;
     private double Balance;
     private JComboBox combo;
     private int number,number1;
     private TextField text;
     
     
     public Cart() {
        setTitle("Cart");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setExtendedState(JFrame.MAXIMIZED_BOTH); 
        setBounds(0,0,1100,600);
        setLocationRelativeTo(null);
        setResizable(false);

        
        Background background= new Background("1.png");
        background.setLayout(null);
        Background gif = new Background("anim.gif");
        gif.setBounds(920,20,120,120);
        background.add(gif);
        Background cel = new Background("cel.gif");
        cel.setBounds(20,50,60,60);
        background.add(cel);
        ImageIcon appIcon = new ImageIcon("mai.png");
        setIconImage(appIcon.getImage());
      
        panel1 = new JPanel(null);
        panel1.setBounds(660,220,400,250);
        panel1.setBackground(Color.PINK);

        b7 = new JButton("PLAY");
        b7.setBounds(140,220,100,20);
        b7.setFont(f2);
        b7.setBackground(Color.GREEN);
        b7.setForeground(Color.BLACK);
        panel1.add(b7);

        text = new TextField();
        text.setBounds(250,165,100,25);
        text.setFont(f2);
        text.setBackground(Color.LIGHT_GRAY);
        text.setForeground(Color.BLACK);
        panel1.add(text);

        l6 = new JLabel("Enter a guessing number (1 to 5)");
        l6.setBounds(10,165,250,25);
        l6.setFont(f);
        l6.setForeground(Color.BLACK);
        panel1.add(l6);


        panel = new JPanel(null);
        panel.setBounds(190,220,400,250);
        panel.setBackground(Color.LIGHT_GRAY);

        String [] method = {"Select","bKash","Nagad","Credit Card","Cash"};
		 combo = new JComboBox(method);
		 combo.setBounds(190,120,130,25);
		 panel1.add(combo);

         l4 = new JLabel("Payment Method");
         l4.setBounds(10,120,150,25);
         l4.setFont(f2);
         l4.setForeground(Color.BLACK);
         panel1.add(l4);

        String[] col = {"Product Name","Quantity","Price","Total Price"};
        
        model = new DefaultTableModel(col,0);

        table = new JTable(model);
        JScrollPane scrollpane = new JScrollPane(table);
        scrollpane.setBounds(0,0,400,250);
        panel.add(scrollpane);
        

        
        t = new JLabel("10% DISCOUNT");
        t.setBounds(100,30,300,90);
        t.setFont(font);
        t.setForeground(Color.WHITE);
        background.add(t);
        

        l= new JLabel("Cart");
        l.setBounds(594,130,200,90);
        l.setFont(font);
        l.setForeground(Color.BLACK);
        background.add(l);
        
        l1= new JLabel("Total Cost : $"+payment);
        l1.setBounds(10,0,350,30);
        l1.setFont(f2);
        l1.setForeground(Color.BLACK);
        panel1.add(l1);

        l2= new JLabel("Discount : $"+payment);
        l2.setBounds(10,35,350,30);
        l2.setFont(f2);
        l2.setForeground(Color.BLACK);
        panel1.add(l2);

        l3= new JLabel("Payment : $"+payment);
        l3.setBounds(10,70,350,30);
        l3.setFont(f2);
        l3.setForeground(Color.BLACK);
        panel1.add(l3);

        b6 = new JButton("Proceed");
        b6.setBounds(800,500,100,20);
        b6.setFont(f2);
        b6.setBackground(Color.CYAN);
        b6.setForeground(Color.BLACK);
        background.add(b6);

        
        background.add(panel1);
        background.add(panel);

        
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

        b5 = new JButton("Confirm");
        b5.setBounds(260,500,100,20);
        b5.setFont(f2);
        b5.setBackground(Color.GREEN);
        b5.setForeground(Color.BLACK);
        background.add(b5);

        b8 = new JButton("Reset");
        b8.setBounds(410,500,100,20);
        b8.setFont(f2);
        b8.setBackground(Color.RED);
        b8.setForeground(Color.BLACK);
        background.add(b8);


        

         b.addActionListener(this);
         b1.addActionListener(this);
        
         b3.addActionListener(this);
         b4.addActionListener(this);
         b5.addActionListener(this);
         b6.addActionListener(this);
         b7.addActionListener(this);
         b8.addActionListener(this);
         combo.addActionListener(this);
         loadDataFromFile("cart.txt");
        
         
        add(background);
        setVisible(true);

       

}    
    public void actionPerformed(ActionEvent e)
     {
        
         if(e.getSource()==b)
        {
            dispose();
           ProductFrame product = new ProductFrame();
           product.setVisible(true);
        }
         else if(e.getSource()==b1)
        {
            dispose();
             Account acc = new Account();

             acc.setVisible(true);
            
        }
        
        else if(e.getSource()==b3)
        {
            dispose();
            About about = new About();
            about.setVisible(true);

        }
        else if(e.getSource()==b4)
        {
            cleanAccount();
            dispose();
             LogInPage logInPage = new LogInPage();

             logInPage.setVisible(true);
            
        }
        else if(e.getSource()==b5)
        {
            l1.setText("Total Cost : $"+payment);
            JOptionPane.showMessageDialog(null,"You've a chance to win 10% discount by playing number guessing game.","Game",JOptionPane.INFORMATION_MESSAGE);
            
           
            
        }

        else if(e.getSource()==b7)
        {
            try{
                 number1 = Integer.parseInt(text.getText());
                 JOptionPane.showMessageDialog(null,"Your guessing number "+number1,"Wrong",JOptionPane.INFORMATION_MESSAGE);
                 randomNumber();
                 if(number1 == number)
                 {
                    JOptionPane.showMessageDialog(null,"Congratulation! You've won 10% discount.","Congratulation",JOptionPane.INFORMATION_MESSAGE);
                    
                    l2.setText("Discount : $"+(payment*0.1));
                     l3.setText("Payment : $"+(payment-(payment*0.1)));
                     payment = (payment -(payment*0.1));
                 }
                 else{
                    JOptionPane.showMessageDialog(null,"Sorry, better luck next time!","Wrong",JOptionPane.ERROR_MESSAGE);
                    
                 }
            }
            catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null,"Please, Enter a valid amount.","Error",JOptionPane.ERROR_MESSAGE);
                

            }
           
            
        }

       
         else if(e.getSource()==b6)
        {    
            String box = (String)combo.getSelectedItem();
            if("Select".equals(box))
            {
                 JOptionPane.showMessageDialog(null,"Please Select a Payment Method!","Invalid",JOptionPane.ERROR_MESSAGE);
            }
            else{
               readAccount();
            if(Balance>=payment)
            {
                 
                readAccount(payment = (Balance-payment));
                 JOptionPane.showMessageDialog(null,"Successfully Purchased!","Success",JOptionPane.INFORMATION_MESSAGE);
                 
               
                clearFile();
            }
            else{
                JOptionPane.showMessageDialog(null,"Insufficient Balance \nPlease go to Account & recharge first!","Insufficient balance",JOptionPane.ERROR_MESSAGE);
            }
        }
            
        }
        else if(e.getSource()==b8)
        {
            
            clearFile();
            dispose();
            Cart c = new Cart();
            c.setVisible(true);
        }
        
       
        
     }

    
private void loadDataFromFile(String filePath) {
    try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
        String line;
        
        while ((line = br.readLine()) != null) {
            String[] data = line.split(" ");
            if (data.length == 3) {
                String productName = data[0];
                int quantity = Integer.parseInt(data[1]);
                double price = Double.parseDouble(data[2]);

                // Calculate total price
                double totalPrice = quantity * price;
                payment+=totalPrice;

                // Add data to the table
                Object[] row = {productName, quantity, price, totalPrice};
                model.addRow(row);
                
                
            } else {
                System.out.println("Invalid data format: " + line);
            }
        }
        
    } catch (IOException | NumberFormatException e) {
        e.printStackTrace();
    }
}
  
private void clearFile() {
    try {
        FileWriter fileWriter = new FileWriter("cart.txt", false);
       
        fileWriter.write("");
        fileWriter.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}
private void cleanAccount() {
    try {
        FileWriter fileWriter = new FileWriter("account.txt", false);
       
        fileWriter.write("");
        fileWriter.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}
private void readAccount()
{
    try{
        File file = new File("account.txt");
        Scanner scanner = new Scanner(file);
        while(scanner.hasNext())
        {
            
            String amount = scanner.next();

            Balance = Double.parseDouble(amount);
           

        }
        scanner.close();
    }
    catch(IOException e)
    {
        e.printStackTrace();
    }

}

 private void readAccount(double z)
    {
        
        try{
            String y = Double.toString(z);
            Formatter formatter = new Formatter("account.txt");
            formatter.format("%s%n",y);
            formatter.close();
            

        }
        catch(IOException e){

            e.printStackTrace();

        }
    }
    



    private void randomNumber()
    {
        Random rand = new Random();
        number = (rand.nextInt(4))+1;
        JOptionPane.showMessageDialog(null,"The random number is "+number,"Game",JOptionPane.INFORMATION_MESSAGE);
    }

     

   
    
    
    

 


}