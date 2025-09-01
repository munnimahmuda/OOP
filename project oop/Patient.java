
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import static javax.swing.JOptionPane.showMessageDialog;


class Patient extends JFrame implements MouseListener, ActionListener 
{
	
	  JLabel title, title1, ename, eaddress, ephone, checkin,checkout, imgLabel2;
	  JButton loginBTN, backBTN;
	  JTextField enamebox, eaddressbox, checkinbox, checkoutbox;
	  JPanel panel;
	  JComboBox Box;  
	  JPasswordField passbox;
	  ImageIcon icon, bg2;
	  
	 
	  
	 
	  
	  
	  public Patient()
	  
	{
		  
		  super ("Patient Page ");
		  this.setSize(1000,600);
		  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  
		  //variables
		 
		  
		  

		  
		  panel = new JPanel();
		  panel.setLayout(null);
		
		  String arr[] = {"General","Cabin"," Ac Cabin"};
		  Box = new JComboBox(arr);
		  Box.setBounds(500,150, 100,20);
		  panel.add(Box);
		  
		   // Imageicon
		  
		  icon = new ImageIcon (getClass().getResource("image3.png"));
		  this.setIconImage(icon.getImage());
		  
		  
		  
		  title = new JLabel ("Enter Patient information..");
		  title.setBounds(100,50, 200,30);
		  title.setForeground(Color.WHITE);
		  panel.add(title);
		  
		  title1 = new JLabel ("Choose your Rooms");
		  title1.setBounds(500,100, 200,30);
		  title1.setForeground(Color.WHITE);
		  panel.add(title1);
		  
		  
		  
		  ename = new JLabel("Enter your name ");
		  ename.setBounds(100,150, 100,20);
		  ename.setForeground(Color.WHITE);
		  panel.add(ename);
		  
		  enamebox = new JTextField();
		  enamebox.setBounds(265,150, 100,20);
		  panel.add(enamebox);
		    
		  eaddress = new JLabel("Enter phonenumber ");
		  eaddress.setBounds(100,200, 150,20);
		  eaddress.setForeground(Color.WHITE);
		  panel.add(eaddress);
		  
		  eaddressbox = new JTextField();
		  eaddressbox.setBounds(265,200, 100,20);
		  panel.add(eaddressbox);
		  
		  ephone = new JLabel("Enter password  ");
		  ephone.setBounds(100,250, 250,20);
		  ephone.setForeground(Color.WHITE);
		  panel.add(ephone);
		  
		  passbox = new JPasswordField();
		  passbox.setBounds(265,250, 100,20);
		  panel.add(passbox);
		  
		  
		  checkin = new JLabel("Check in");
		  checkin.setBounds(100,300, 100,20);
		  checkin.setForeground(Color.WHITE);
		  panel.add(checkin);
		  
		  checkinbox = new JTextField();
		  checkinbox.setBounds(265,300, 100,20);
		  panel.add(checkinbox);
		  
		  checkout = new JLabel("Check out");
		  checkout.setBounds(100,350, 100,20);
		  checkout.setForeground(Color.WHITE);
		  panel.add(checkout);
		  
		  checkoutbox = new JTextField();
		  checkoutbox.setBounds(265,350, 100,20);
		  panel.add(checkoutbox);
		
		  loginBTN=new JButton("Submit");
		  loginBTN.setBounds(265,390, 100,40);
		  loginBTN.addMouseListener(this);
		  loginBTN.addActionListener(this);
		  panel.add(loginBTN);
		  
		  backBTN = new JButton("Back");
		  backBTN.setBounds(650,500, 70,30);
		  backBTN.addMouseListener(this);
		  backBTN.addActionListener(this);
          panel.add(backBTN);
		  
		  
		  // Background Image
		  
		  bg2 = new ImageIcon(getClass().getResource("image5.jpeg"));
		  imgLabel2 = new JLabel(bg2);
		  imgLabel2.setBounds(0,0, 1100,650);
		  panel.add(imgLabel2);

          


       
          
          this.add(panel);
		  
		  
		  
	}		  
		  
		  
		  
		  public void mouseClicked(MouseEvent me){}
	      public void mousePressed(MouseEvent me){}
	      public void mouseReleased(MouseEvent me){}
	      public void mouseEntered(MouseEvent me){}
	      public void mouseExited(MouseEvent me){}
		  
	
	      public void actionPerformed(ActionEvent ae)
	    {
		
		String cmd=ae.getActionCommand();
		
		
		//ACCOUNT CREATION.
		
		
		
		
		
		//FOR GOING BACK.
		

		if(backBTN.getText().equals(cmd))
		        {
			Login lo =new Login();
			lo.setVisible(true);
			this.setVisible(false);
		        }
				
				
		else if(loginBTN.getText().equals(cmd))	{
			
				
			String s1=enamebox.getText();
			String s2=eaddressbox.getText();
			String s3=passbox.getText();
			String s4=checkinbox.getText();
			String s5=checkoutbox.getText();
			String s6=Box.getSelectedItem().toString();
			
			
			
				try
				
				{
					FileWriter file= new FileWriter(s2+".txt");
					file.write(s1+"\n"+s2+"\n"+s3+"\n"+s4+"\n"+s5+"\n"+s6+"\n");
					file.close();
					showMessageDialog(null,"Successfully Signed Up!");
					
					Login in =new Login();
					in.setVisible(true);
					this.setVisible(false);
				}
				catch(Exception io)
				   {
					io.printStackTrace();
					}
			
			
			
		}
				
				
				
				
		else{
			
		}
			
		
		
		
        }

		  
		  
		  
		  
		  
		  
		  
		  
    
		  
		 
	
}