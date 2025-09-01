import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import static javax.swing.JOptionPane.showMessageDialog;


class Manager extends JFrame implements MouseListener, ActionListener
{
	
	  JLabel userid, title2, imgLabel;
	  JButton addBTN, employeeBTN, patientBTN;
	  JPanel panel;
	  ImageIcon icon, bg;
	  JButton  backBTN;
	   
	  
	  
	  public Manager ()
	  
	  {
		  
		  super ("Manager Page");
		  this.setSize(800,600);
		  
		  panel = new JPanel();
		  panel.setLayout(null);
		  
		//  Imageicon
		icon = new ImageIcon (getClass().getResource("image3.png"));
	    this.setIconImage(icon.getImage());
		  
		  
		  
	    //TITLE DECLARATION...

		  title2 = new JLabel ("Manager Page...");
		  title2.setBounds(280,50, 400,120);
		
		  panel.add(title2);
		  
		
		
		
		
		
		//addBTN DECLARATION...
		  
		   addBTN = new JButton("Add Patient");
		   addBTN.setBounds(280,150, 200,80);
		   addBTN.addMouseListener(this);
		   addBTN.addActionListener(this);
		 
           panel.add(addBTN);

		 
        //employeeBTN DECLARATION...
		
		   employeeBTN = new JButton("Employee Info");
		   employeeBTN.setBounds(280,250, 200,80);
		
		   employeeBTN.addMouseListener(this);
		   employeeBTN.addActionListener(this);
           panel.add(employeeBTN);
		  
		    
		//patientBTN DECLARATION...
		
		   patientBTN = new JButton("Patient Info");
		   patientBTN.setBounds(280,350, 200,80);
		
           panel.add(patientBTN);
		   
		   
		// BackBTN DECLARATION...  
		  backBTN = new JButton("Back");
		  backBTN.setBounds(650,500, 70,30);
		  backBTN.addMouseListener(this);
		  backBTN.addActionListener(this);
          panel.add(backBTN);
		  
		  
		  
		  
		  
		  
          
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
		
		
		
		if(backBTN.getText().equals(cmd)){
		
			Login lo =new Login();
			lo.setVisible(true);
			this.setVisible(false);
			
				  
			}
			
			else if(addBTN.getText().equals(cmd)){
		
		          Patient c= new Patient();
		          c.setVisible(true);
				  this.setVisible(false);
				  
	      }
		   
		   
		   else if(employeeBTN.getText().equals(cmd)){
		
		         Employeeinfo e= new Employeeinfo();
		          e.setVisible(true);
				  this.setVisible(false);
				  
	      }
		   
		   
		   else{}
		   
			
		
		}
		
		
		
        
		  
		  
		  
		  
		  
		  
		  
    
}