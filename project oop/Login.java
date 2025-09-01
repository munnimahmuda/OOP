
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import static javax.swing.JOptionPane.showMessageDialog;


class Login extends JFrame implements MouseListener, ActionListener{
	
	  JLabel title, userid, password, title2, imgLabel;
	  JButton btnup, btnlog, addminBTN;
	  JTextField usertext; 
	  JPasswordField passwordtext;
	  JPanel panel;
	  ImageIcon icon, bg;
	   
	  
	  
	  public Login (){
		  
		  super ("MAHMUDA HOSPITAL - Login Page ");
		  this.setSize(800,600);
		  
		  panel = new JPanel();
		  panel.setLayout(null);
		  
		  // Imageicon
		  
		  icon = new ImageIcon (getClass().getResource("image3.png"));
		  this.setIconImage(icon.getImage());
		  
		  
		  
		
		  
		  
	//TITLE DECLARATION...

	
		  title2 = new JLabel ("Sign In Here ");
		  title2.setBounds(280,160, 200,50);
		  title2.setForeground(Color.WHITE);
		  panel.add(title2);
		  
		
		  
		  
		  
		  title = new JLabel ("New Patient ? ");
		  title.setBounds(100,50, 200,30);
		  title.setForeground(Color.WHITE);
		  panel.add(title);
		  
		  btnup = new JButton("Sign Up");
		  btnup.setBounds(100,100, 100,20);
		  btnup.addMouseListener(this);
		  btnup.addActionListener(this);
		 
          panel.add(btnup);
		  
		  userid = new JLabel("Phone Number : ");
		  userid.setBounds(280,250, 100,20);
		  userid.setForeground(Color.WHITE);
		  panel.add(userid);
		  
		  
		  usertext = new JTextField();
		  usertext.setBounds(420,250, 100,20);
		  panel.add(usertext);
		  
		  
		  password = new JLabel("Password : ");
		  password.setBounds(280,300, 100,20);
		  password.setForeground(Color.WHITE);
		  panel.add(password);
		  
		   passwordtext = new JPasswordField();
		  passwordtext.setBounds(420,300, 100,20);
		  panel.add(passwordtext);
		  
		  btnlog = new JButton("Login ");
		  btnlog.setBounds(280,350, 100,20);
		
		  btnlog.addMouseListener(this);
		  btnlog.addActionListener(this);
          panel.add(btnlog);
		  
//       For admin
        
          addminBTN = new JButton("Admin ");
		  addminBTN.setBounds(220,100, 100,20);
		 
		  addminBTN.addMouseListener(this);
		  addminBTN.addActionListener(this);
          panel.add(addminBTN);		
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  // Background Image
		  
		  bg = new ImageIcon(getClass().getResource("image2.jpg"));
		  imgLabel = new JLabel(bg);
		  imgLabel.setBounds(0,0, 800,600);
		  panel.add(imgLabel);
		  
		  
          
		  this.add(panel);
    
}

          public void mouseClicked (MouseEvent me){}
		  public void mousePressed (MouseEvent me){}
		  public void mouseReleased(MouseEvent me){}
		  public void mouseEntered(MouseEvent me){}
		  public void mouseExited (MouseEvent me){}
		  
		  
		  public void actionPerformed(ActionEvent ae){
			  String cmd=ae.getActionCommand();
			  
			  
			 
			if(btnup.getText().equals(cmd))
			{
		
			      Patient c= new Patient();
		          c.setVisible(true);
				  this.setVisible(false);
				  
			}
			
			else if (addminBTN.getText().equals(cmd))
			{
				ManLogin m = new ManLogin();
		        m.setVisible(true);
				this.setVisible(false);
				
			}
			
			
			

			else if(btnlog.getText().equals(cmd)){
				
				        String line1="";
						String line2="";
						String line3="";
						String line4="";
						String line5="";		
						String line6="";
						
						
						try{
						FileReader fr= new FileReader(usertext.getText()+".txt");
						Scanner sc = new Scanner(fr);
						
						while(sc.hasNext())
						{
						 line1 = sc.nextLine();//name
						 line2 = sc.nextLine();//number
						 line3 = sc.nextLine();//password
						 line4 = sc.nextLine();//checkin
						 line5 = sc.nextLine();//checkout
						 line6 = sc.nextLine();//room crieteria
						
					   if(line2.equals(usertext.getText()) && line3.equals(passwordtext.getText()))
						{
							PatientInfo c= new PatientInfo(line1,line2,line3,line4,line5,line6);
							c.setVisible(true);
							this.setVisible(false);
						}

						
	
					  
			

						else{
							
							
							
							showMessageDialog(null, "Wrong Username or Password");
							}
						
					
						}
						
						
						fr.close();
						}
						
						catch(Exception io){
							
							io.printStackTrace();
						}
				
				
				
			}
			
		
			
			else
			{
				
				
			}
 
    
	
	
	
        }// Method




}// For class