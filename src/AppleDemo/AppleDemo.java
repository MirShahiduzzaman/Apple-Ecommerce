package AppleDemo;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;


public class AppleDemo extends JFrame
{
	   /**
	    * 
	    */
 	    private static final long serialVersionUID = 1L;
 	    
		/**
		 * 
		 */
		double total        = 0.0;
		int    numOfItems   = 0;
		
		int    numOf13Mini  = 0;
		int    numOf13Pro   = 0;
		int    numOf13 = 0;
		int    numOf13ProMax  = 0;
		
		String idNumStr=null;
		
		/**
		 * Launch the application.
		 */
		public static void main(String[] args)
		{
			AppleDemo frame = new AppleDemo();
			
			frame.setVisible(true);
		}

		/**
		 * Create the frame.
		 */
		public AppleDemo() 
		{
			//
			// Frame title display current time
			//
			Date  date = new Date();
			String str = String.format("%tc", date);
			   
       	   
			String titleString = "--- Apple Store --- " + str; 				    
			setTitle(titleString);
			
			NumberFormat formatter = new DecimalFormat("#0.00");
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			
			// size of the frame
			//
			setSize(970,670);
			
			//
			// panel title
			//
			JPanel contentPane = new JPanel();
			contentPane.setBorder(new TitledBorder(new EtchedBorder(), 
					              "Apple Store      v. 0.01"));;
			setContentPane(contentPane);
			
			/*
			
			// WHERE SHOPPING CART LABEL WAS
			//  create a shopping cart label
			//
			JLabel cartLabel = new JLabel("Shopping Cart : ");
			cartLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
			cartLabel.setBounds(650, 20, 150, 23);
			contentPane.add(cartLabel);
			
			*/
			
			
			//
			//  create a label for appleid
			//
			JLabel idNumLabel = new JLabel("Enter your AppleID: ");
			idNumLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
			idNumLabel.setBounds(30, 525, 200, 23);
			contentPane.add(idNumLabel);
			
			//
			// field where user puts in appleid
			//
			JTextField idNum = new JTextField();
			idNum.setEditable(true);
			idNum.setBounds(200, 525, 150, 34);
			contentPane.add(idNum);
			idNum.setColumns(20);
			
			
			//
			//  create a label for status
			//
			JLabel statusLabel = new JLabel("Status");
			statusLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
			statusLabel.setBounds(725, 100, 150, 23);
			contentPane.add(statusLabel);
			
			//
			// field where to see status information
			//
			JTextField status = new JTextField();
			status.setEditable(false);
			status.setBounds(725, 65, 200, 34);
			contentPane.add(status);
			status.setColumns(40);
			status.setBackground(Color.LIGHT_GRAY);
			
			
			
			
			// WHERE ORIGINAL WHITE SHOPPING LIST BOX WAS
			// list of items that are being bought
			//
			JTextArea textArea = new JTextArea();
			//textArea.setBounds(550, 40, 168, 382);
			//textArea.setBounds(763, 11, 168, 382);
			textArea.setEditable(false);
			contentPane.add(textArea);
			
		
			
			//
			// field where total accumulating price is being displayed
			//
			JTextField textField = new JTextField();
			textField.setEditable(false);
			textField.setBounds(807, 525, 124, 34);
			contentPane.add(textField);
			textField.setColumns(10);
			
			//textField.setBounds(807, 420, 124, 34); original price placement
			
			
			//
			// iPhone 13 mini Button
			//
			JButton btnNewButton = new JButton("iPhone 13 Mini");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					numOfItems++;
					numOf13++;
					
					textArea.append("iPhone 13 Mini         699\r\n");
					total = total + 699;
					
					textField.setText(formatter.format(total));
					textField.repaint();
					
					status.setText("");
					status.setBackground(Color.LIGHT_GRAY);
				}
			});
					
			btnNewButton.setIcon(new ImageIcon("https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/iphone-13-mini-blue-select-2021?wid=470&hei=556&fmt=jpeg&qlt=95&.v=1629842711000"));
			btnNewButton.setBounds(200, 41, 231, 200);
			contentPane.add(btnNewButton);

			//
     		// iPhone 13 Button
			//
			JButton btnNewButton_1 = new JButton("iPhone 13");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) 
				{
					numOfItems++;
					numOf13Mini++;
					
					textArea.append("iPhone 13          799\r\n");
					total = total + 799;
					
					textField.setText(formatter.format(total));
					textArea.repaint();
					
					status.setText("");
					status.setBackground(Color.LIGHT_GRAY);
				}
			});
			btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\nkounavelis\\Desktop\\Kiosk-iPhone 13.jpg"));
			btnNewButton_1.setBounds(200, 290, 231, 200);
			contentPane.add(btnNewButton_1);

			
			//
			// iPhone 13 Pro Button
			//
			JButton btnNewButton_2 = new JButton("iPhone 13 Pro");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					numOfItems++;
					numOf13Pro++;
					
					textArea.append("iPhone 13 Pro           999\r\n");
					total = total + 999;
					
					textField.setText(formatter.format(total));
					textArea.repaint();
					
					status.setText("");
					status.setBackground(Color.LIGHT_GRAY);
				}
			});
			btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\nkounavelis\\Desktop\\Kiosk-iPhone 13 Pro.jpg"));
			btnNewButton_2.setBounds(450, 41, 231, 200);
			//btnNewButton_2.setBounds(250, 41, 187, 200); original size
			contentPane.add(btnNewButton_2);
			
			
			//
			// iPhone 13 Pro Max Button
			//
			JButton btnNewButton_4 = new JButton("iPhone 13 Pro Max");
			btnNewButton_4.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e) 
				{
					numOfItems++;
					numOf13ProMax++;
					
					textArea.append("iPhone 13 Pro Max           1099\r\n");
					total = total + 1099;
										
					textField.setText(formatter.format(total));
					textArea.repaint();
					
					status.setText("");
					status.setBackground(Color.LIGHT_GRAY);
				}
			});
			btnNewButton_4.setIcon(new ImageIcon("C:\\Users\\nkounavelis\\Desktop\\Kiosk-iPhone 13 Pro Max.jpg"));
			btnNewButton_4.setBounds(450, 290, 231, 200);
			//original size btnNewButton_4.setBounds(250, 290, 187, 200);
			contentPane.add(btnNewButton_4);
			
			
			//
			//  create a label for total price
			//
			JLabel lblNewLabel = new JLabel("    TOTAL : ");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel.setBounds(697, 525, 100, 23);
			contentPane.add(lblNewLabel);
			
			//
			// CART Button
			//
			JButton cart = new JButton("Cart");
			cart.setFont(new Font("Tahoma", Font.PLAIN, 16));
			cart.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					cart coup = new cart();
					coup.setVisible(true);
				}
			});
			cart.setBounds(800, 20, 133, 34);
			contentPane.add(cart);
			
			//
			// EXIT Button
			//
			JButton btnNewButton_3 = new JButton("EXIT");
			btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
			btnNewButton_3.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent arg0)
				{				
					int result = JOptionPane.showConfirmDialog(null,
	                             "Do you really want to exit the Apple Store Client Screen?",
	                             "Apple Store",
		                         JOptionPane.INFORMATION_MESSAGE);

					
	                if (result == JOptionPane.OK_OPTION)
	                {   
	                    //
	                    //close shop :-(
	                    //
					    dispose();
					    System.exit(0);
			     	}
				}
				
			});
			btnNewButton_3.setBounds(30, 570, 133, 34);
			contentPane.add(btnNewButton_3);
			
			
			
			//
			// SUBMIT Button
			//
			JButton submit = new JButton("SUBMIT");
			submit.setFont(new Font("Tahoma", Font.PLAIN, 16));
			submit.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					if (numOfItems != 0)
					{
						idNumStr= idNum.getText();
						idNumStr = idNumStr.trim();
						
						if (idNumStr == "" || idNumStr == null || idNumStr.length() == 0)
						{
							JOptionPane.showMessageDialog(null, 
					                   "Sorry! ID# string field is empty!",
					                   "Apple Store",
					                   JOptionPane.WARNING_MESSAGE);
						}
						else
						{
						   String dataStr = null;
						
						   dataStr=idNumStr + ",A=" + numOf13Mini + ",G=" + numOf13ProMax + ",O=" + numOf13 + ",P=" + numOf13Pro + "," + numOfItems + "," + total; 
						
						   fileIO fio = new fileIO();
						   fio.wrTransactionData(dataStr);
						
						   numOfItems = 0;
						
						   numOf13Mini  = 0;
						   numOf13Pro   = 0;
						   numOf13 = 0;
						   numOf13ProMax  = 0;
				
						   textArea.setText("");
						   textField.setText("");
						   idNum.setText("");
						   
						   status.setText("Success!");
						   status.setBackground(Color.GREEN);
						}
					}
					else
					{
						JOptionPane.showMessageDialog(null, 
				                   "Sorry! Your shopping cart is empty now!",
				                   "Apple Store",
				                   JOptionPane.WARNING_MESSAGE);
					}	
				}
			});
			submit.setBounds(800, 570, 133, 34);
			contentPane.add(submit);
			///800, 570, 133, 34 new loc
			///200, 570, 133, 34 old loc

			
			//
			// CLEAR Button
			//
			JButton clear = new JButton("CLEAR");
			clear.setFont(new Font("Tahoma", Font.PLAIN, 16));
			clear.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					if (numOfItems != 0)
					{
					    int result = JOptionPane.showConfirmDialog(null,
                            "Do you really want to clear all items in your cart?",
                            "Apple Store",
	                         JOptionPane.INFORMATION_MESSAGE);

				
                        if (result == JOptionPane.OK_OPTION)
                        {   
                    	   numOfItems = 0;
 						
						   numOf13Mini  = 0;
						   numOf13Pro   = 0;
						   numOf13 = 0;
						   numOf13ProMax  = 0;
						   total = 0;
				
						   textArea.setText("");
						   textField.setText("");
						   idNum.setText("");
                      }
		           }	
				}
			});
			clear.setBounds(600, 570, 133, 34);
			contentPane.add(clear);
			
			
			
			
			//
			// HELP Button
			//
			JButton help = new JButton("Need help?");
			help.setFont(new Font("Tahoma", Font.PLAIN, 16));
			help.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
						
				}
			});
			help.setBounds(200, 570, 133, 34);
			contentPane.add(help);
			
			///200, 570, 133, 34
			///800, 570, 133, 34
			
			
			
			
			//
			// labels for each product button
			//
			JLabel lblNewLabel_1 = new JLabel("iPhone 13 Mini : $699");
			lblNewLabel_1.setBounds(200, 260, 194, 14);
			contentPane.add(lblNewLabel_1);
			
			JLabel lblNewLabel_3 = new JLabel("iPhone 13 : $799");
			lblNewLabel_3.setBounds(200, 500, 200, 14);
			contentPane.add(lblNewLabel_3);
			
			JLabel lblNewLabel_2 = new JLabel("iPhone 13 Pro : $999");
			lblNewLabel_2.setBounds(450, 260, 200, 14);
			contentPane.add(lblNewLabel_2);
		
			JLabel lblNewLabel_4 = new JLabel("iPhone 13 Pro Max : $1099");
			lblNewLabel_4.setBounds(450, 500, 300, 14);
			contentPane.add(lblNewLabel_4);
		
            // 
			// call thread to update date and time
			//
			refreshTitleBar();
			
			
			// user will do the layout
			contentPane.setLayout(null);
			
			// position frame in the middle of the screen
			this.setLocationRelativeTo(null);
		}
		
		
	    //
	    // Thread to update TITLE BAR, date, and time     
	    //     
	    private void refreshTitleBar()
	    {	
		   Thread refreshAllTitleBar = new Thread()
		   {
			  public void run()
			  { 
				 while (true)
				 {
					 try 
					 {
					   //
					   // display current time
					   //
					   Date  date = new Date();
					   String str = String.format("%tc", date);
	              	   
					   String titleString = "--- Apple Store --- " + str; 				 
					   
					   setTitle(titleString);
						 
					   sleep(5000L);                   // sleep for 5 seconds or 5,000 milliseconds
					   
	                 } // end try block
				  
			         catch (InterruptedException e) 
			         {
			        	 JOptionPane.showMessageDialog(null, 
	                              "ERROR. Interrupt Exception! Check Internet Connection!",
	                              "Title Top Bar",
	                              JOptionPane.WARNING_MESSAGE);
			        	 
			        	 continue;
				     }
			         finally
			         {
				   
			         }
				 } // end while true
		     }
		  };

	      refreshAllTitleBar.start();
	    }
}