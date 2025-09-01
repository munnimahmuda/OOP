import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import static javax.swing.JOptionPane.showMessageDialog;


class PatientInfo extends JFrame implements MouseListener, ActionListener 
{
	
	  JLabel room1, title, title1,title2,title3,title4,title5, title6, ename, eaddress, ephone, checkin,checkout;
	  JPanel panel;
	  ImageIcon icon;

	  JButton backBTN;
	  
	  private String name;
	  private String phone;
	  private String password;
	  private String checkin2;
	  private String checkout2;
	  private String room;
	  
	 
	  
	  
	  public PatientInfo( String name,String phone,String password, String checkin1,String checkout1, String room)
	  
	{
		  
		  super ("Patient Page ");
		  this.setSize(1000,600);
		  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  
		  //variables
		  this.name=name;
		  this.phone=phone;
		  this.password=password;
		  this.checkin2=checkin1;
		  this.checkout2=checkout1;
		  this.room=room;
		  
		  
		  
		   // Imageicon
		  
		  icon = new ImageIcon (getClass().getResource("image3.png"));
		  this.setIconImage(icon.getImage());
		  
		  
		  

		  
		  panel = new JPanel();
		  panel.setLayout(null);
		
		  
		  
	
		  
		  title = new JLabel ("Your Information");
		  title.setBounds(100,50, 200,30);
		  panel.add(title);
		  
		  
		  
		  
		  
		  ename = new JLabel("Enter your name ");
		  ename.setBounds(100,150, 100,20);
		  panel.add(ename);
		  
		  title1 = new JLabel (name);
		  title1.setBounds(300,150, 200,30);
		  panel.add(title1);
		  
		  
		  
		    
		  eaddress = new JLabel("Enter phonenumber ");
		  eaddress.setBounds(100,200, 150,20);
		  panel.add(eaddress);
		  
		  title2 = new JLabel (phone);
		  title2.setBounds(300,200, 200,30);
		  panel.add(title2);
		  
		 
		  ephone = new JLabel("Enter password  ");
		  ephone.setBounds(100,250, 250,20);
		  panel.add(ephone);
		  
		  title3 = new JLabel (password);
		  title3.setBounds(300,250, 200,30);
		  panel.add(title3);
		  
		  
		  
		 
		  
		  checkin = new JLabel("Check in");
		  checkin.setBounds(100,300, 100,20);
		  panel.add(checkin);
		  
		  title4 = new JLabel (checkin1);
		  title4.setBounds(300,300, 200,30);
		  panel.add(title4);
		  
		 
		  checkout = new JLabel("Check out");
		  checkout.setBounds(100,350, 100,20);
		  panel.add(checkout);
		  
		  title5 = new JLabel (checkout1);
		  title5.setBounds(300,350, 200,30);
		  panel.add(title5);
		  
		  
		  room1 = new JLabel("Room ");
		  room1.setBounds(100,400, 100,20);
		  panel.add(room1);
		  
		  title6 = new JLabel(room);
		  title6.setBounds(300,400, 200,30);
		  panel.add(title6);
		  
		  //BackButton
		  
		  backBTN = new JButton("Back");
		  backBTN.setBounds (750,460, 70,30);
		  panel.add(backBTN);
		  backBTN.addActionListener(this);
		  backBTN.addMouseListener(this);
		  
		  

          


       
          
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
			
			if(backBTN.getText().equals(cmd))
		    {
			Login lo =new Login();
			lo.setVisible(true);
			this.setVisible(false);
		    }
		         else
			     {
			 	
			     }
	
	
	
	
		}
	
	
	
	
	
	
}	