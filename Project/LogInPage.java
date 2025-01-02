package Project;
import javax.swing.*;
import Project.ProductFrame;
import Project.SignUpPage;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.awt.*;
import java.awt.event.*;
class Bgm extends JPanel{
	private Image bgImage;
	public Bgm(String imagePath)
	{
		this.bgImage = new ImageIcon(imagePath).getImage();
	}
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		if(bgImage !=null)
	{
		g.drawImage(bgImage,0,0,getWidth(),getHeight(),this);
	}


	}


}
public class LogInPage extends JFrame implements ActionListener{
	JLabel l,l1,l2,l3,l4;
	TextField t,t1;
	JPasswordField pass;
	Font font,f,f1,f2;
	JButton b,b1;
	private String p,q,r;
	public LogInPage()
	{
		setTitle("LogIn Page");
		//setExtendedState(JFrame.MAXIMIZED_BOTH); 
		setBounds(0,0,1100,600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		ImageIcon appIcon = new ImageIcon("mai.png");
        setIconImage(appIcon.getImage());
		Bgm bgImage = new Bgm("Login.png");
		bgImage.setLayout(null);
		font = new Font("Arial",Font.BOLD,25);
		f = new Font("Arial",Font.BOLD,16);
		f1= new Font("Arial",Font.BOLD,14);
		f2= new Font("Arial",Font.BOLD,13);
		l = new JLabel("Sign In");
		l.setBounds(200,220,100,80);
		l.setFont(font);
		l.setForeground(Color.BLACK);
		bgImage.add(l);
		l1 = new JLabel("Email");
		l1.setBounds(130,350,100,16);
		l1.setFont(f);
		l1.setForeground(Color.BLACK);
		bgImage.add(l1);
		t= new TextField("");
		t.setBounds(230,350,150,20);
		t.setBackground(Color.LIGHT_GRAY);
		t.setFont(f1);
		l2 = new JLabel("Password");
		l2.setBounds(130,400,100,16);
		l2.setForeground(Color.BLACK);
		l2.setFont(f);
		l3 = new JLabel("Don't have an account? Sign Up");
		l3.setBounds(150,440,340,16);
		l3.setForeground(Color.BLUE);
		l3.setFont(f2);
		l4 = new JLabel("Name");
		l4.setBounds(130,300,80,16);
		l4.setForeground(Color.BLACK);
		l4.setFont(f);
		t1 = new TextField("");
		t1.setBounds(230,300,150,20);
		t1.setBackground(Color.LIGHT_GRAY);
		t1.setFont(f1);
        
		bgImage.add(t1);
		bgImage.add(l4);
		bgImage.add(l2);
		bgImage.add(t);
		bgImage.add(l3);
		pass = new JPasswordField("");
		pass.setBounds(230,400,150,20);
		pass.setBackground(Color.LIGHT_GRAY);
		pass.setFont(f1);
		bgImage.add(pass);
		b = new JButton("Log In");
		b.setBounds(150,470,90,25);
		b.setBackground(Color.CYAN);
		b.setFont(f1);
		bgImage.add(b);
		b1 = new JButton("Sign Up");
		b1.setBounds(270,470,95,25);
		b1.setBackground(Color.CYAN);
		b1.setFont(f1);
		bgImage.add(b1);

		b.addActionListener(this);
		b1.addActionListener(this);

		add(bgImage);
	
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		String s1,s2;
		s1 = t.getText();
	    s2 = new String(pass.getPassword());
		p = t1.getText();
		if(e.getSource()== b){
			

			if(s1.equals("")||s2.equals("")||p.equals(""))
			{
				JOptionPane.showMessageDialog(null,"Please fill up the form first!","Warning",JOptionPane.WARNING_MESSAGE);

			}
			
			 else 
			{
				loginUser();
				
				

			}
			
			
			
		
		
		//JOptionPane.showMessageDialog(null,"Your Password: "+r,"Password",JOptionPane.INFORMATION_MESSAGE);
		}
		else if(e.getSource()==b1)
		{
			
			openSignUpPage();
		    

		}
	}

	private void loginUser() {
        String enteredEmail = t.getText();
        char[] enteredPasswordChars = pass.getPassword();
        String enteredPassword = new String(enteredPasswordChars);

        try (BufferedReader reader = new BufferedReader(new FileReader("user_data.txt"))) {
            String line;
            boolean found = false;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                   q = parts[0];
                   r = parts[1];

                if (enteredEmail.equals(q) && enteredPassword.equals(r)) {
                    found = true;
                    break;
                }
            }

            if (found) {
                JOptionPane.showMessageDialog(null, "Login successful!");
				JOptionPane.showMessageDialog(null,"Welcome! "+p,"Welcome",JOptionPane.INFORMATION_MESSAGE);
				accountName(p);
				dispose();
			    ProductFrame product = new ProductFrame();
				product.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Invalid email or password. Please try again.","Invalid",JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error during login.");
        }

        t.setText("");
		t1.setText("");
        pass.setText("");
    }
 
	
    private void openSignUpPage() {
		dispose();
        SignUpPage signUpPage = new SignUpPage();

        signUpPage.setVisible(true);
    }
	
	public void setName(String n,String m,String o)
	{
		p=n;
		q=m;
		r=o;
	}
	
	public void accountName(String c)
    {
        
        try{
           
            Formatter formatter = new Formatter("name.txt");
            formatter.format("%s%n",c);
            formatter.close();
            

        }
        catch(IOException e){

            e.printStackTrace();

        }
    }
	
}