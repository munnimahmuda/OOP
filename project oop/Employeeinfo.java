
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;



class Employeeinfo extends JFrame implements MouseListener, ActionListener{
	
	  JLabel title, title2, title3, title4, title5, title6;
	  JButton backBTN;
	  JPanel panel;
	  ImageIcon icon;
	   
	  
	  
	  public Employeeinfo ()
	  
	  {
		  
		  super ("Employee Information ");
		  this.setSize(800,600);
		  
		  panel = new JPanel();
		  panel.setLayout(null);
		  
		  // Imageicon
		  
		  icon = new ImageIcon (getClass().getResource("image3.png"));
		  this.setIconImage(icon.getImage());
		  
		  
		  
		
		  
		  
          title = new JLabel ("Total Employee");
		  title.setBounds(100,50, 200,30);
		 
		  panel.add(title);

	
		  title2 = new JLabel (": 100 ");
		  title2.setBounds(350,50, 200,50);
		  panel.add(title2);
		  
		
		  title3 = new JLabel ("Working Employee");
		  title3.setBounds(100,200, 200,50);
		 
		  panel.add(title3);
		  
		 
		  title4 = new JLabel (": 96");
		  title4.setBounds(350,200, 200,50);
		
		  panel.add(title4);
		  
		  title5 = new JLabel ("Current Salry ");
		  title5.setBounds(100,350, 200,50);
		
		  panel.add(title5);
		  
		  title6 = new JLabel (": 20000 tk");
		  title6.setBounds(350,350, 200,50);
		 
		  panel.add(title6);
		  
        
          backBTN = new JButton("Back");
		  backBTN.setBounds(650,500, 70,30);
		 
		  backBTN.addMouseListener(this);
		  backBTN.addActionListener(this);
          panel.add(backBTN);		
		  
		  
		  
		  
		
		  
		  
          
		  this.add(panel);
    
     }



          public void mouseClicked (MouseEvent me){}
		  public void mousePressed (MouseEvent me){}
		  public void mouseReleased(MouseEvent me){}
		  public void mouseEntered(MouseEvent me){}
		  public void mouseExited (MouseEvent me){}
		  
		  
		  public void actionPerformed(ActionEvent ae){
			  String cmd=ae.getActionCommand();
			  
			  
			 
			
				
		
			Manager lo =new Manager();
			lo.setVisible(true);
			this.setVisible(false);
			
				  
			}
			
			
			
		
		
























}