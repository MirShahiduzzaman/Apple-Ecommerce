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

import java.awt.EventQueue;

public class AppleHomeDemo {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppleHomeDemo window = new AppleHomeDemo();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AppleHomeDemo() {
		
		Date  date = new Date();
		String str = String.format("%tc", date);
		   
   	   
		String titleString = "--- Apple Store --- " + str; 				    
		//setTitle(titleString);
		
		NumberFormat formatter = new DecimalFormat("#0.00");
		
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		//Miscellaneous Buttons *******************************************************************
		//Exit Button
		JButton H_ExitButton = new JButton("EXIT");
		H_ExitButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		H_ExitButton.setBounds(25, 675, 150, 75);
		frame.getContentPane().add(H_ExitButton);
		H_ExitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int result = JOptionPane.showConfirmDialog(null,
                        "Do you really want to exit the Apple Store?",
                        "Apple Store",
                        JOptionPane.INFORMATION_MESSAGE);

			
           if (result == JOptionPane.OK_OPTION)
           {   
               //End Apple Store
			    System.exit(0);
			    
			    //Plan: If the user exits, save cart. 
	     	}
			}
		});
		
		//Help Button
		JButton H_HelpButton = new JButton("HELP");
		H_HelpButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		H_HelpButton.setBounds(800, 675, 150, 75);
		frame.getContentPane().add(H_HelpButton);
		H_HelpButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null,
						"Welcome to the Apple Store!\nThis page is currently under construction.\nExpect a Drop Down Menu of commonly asked questions!",
                        "Apple Store Help",
                        JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		//*****************************************************************************************
		
		//Suggested Items *************************************************************************
		//Promotion Label
		JLabel H_PromotionLabel = new JLabel("Check Out These Items!");
		H_PromotionLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		H_PromotionLabel.setBounds(50, 225, 350, 30);
		frame.getContentPane().add(H_PromotionLabel);
		
		//Item Suggestion 1
		JButton H_SugItem1 = new JButton("iPhone 13 Pro Max");
		H_SugItem1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		H_SugItem1.setBounds(50, 300, 250, 250);
		frame.getContentPane().add(H_SugItem1);
		H_SugItem1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null,
						"Welcome to the Apple Store!\nThis page is currently under construction.\nExpect this button to have an icon and to lead you to the product's page!",
                        "Apple Store",
                        JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		//Item Suggestion 2
		JButton H_SugItem2 = new JButton("Air Pods Generation 3");
		H_SugItem2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		H_SugItem2.setBounds(375, 300, 250, 250);
		frame.getContentPane().add(H_SugItem2);
		H_SugItem2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null,
						"Welcome to the Apple Store!\nThis page is currently under construction.\nExpect this button to have an icon and to lead you to the product's page!",
                        "Apple Store",
                        JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		//Item Suggestion 3
		JButton H_SugItem3 = new JButton("Apple Watch Series 7");
		H_SugItem3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		H_SugItem3.setBounds(700, 300, 250, 250);
		frame.getContentPane().add(H_SugItem3);
		H_SugItem3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null,
						"Welcome to the Apple Store!\nThis page is currently under construction.\nExpect this button to have an icon and to lead you to the product's page!",
                        "Apple Store",
                        JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		//*****************************************************************************************
		
		//Top Panel ******************************************************************************
		//Home Button
		JButton H_HomeButton = new JButton("Home");
		H_HomeButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		H_HomeButton.setIcon(null);
		H_HomeButton.setBounds(0, 0, 125, 100);
		frame.getContentPane().add(H_HomeButton);
		H_HomeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null,
						"Welcome to the Apple Store!\nThis page is currently under construction.\nExpect a Logo that will count as the Home Button!",
                        "Apple Store",
                        JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		//Log In Button
		JButton H_LogInButton = new JButton("Log Into Your AppleID");
		H_LogInButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		H_LogInButton.setBounds(125, 0, 150, 100);
		frame.getContentPane().add(H_LogInButton);
		H_LogInButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,
						"Welcome to the Apple Store!\nThis page is currently under construction.\nExpect this tab to lead you to the login page!",
                        "Apple Store",
                        JOptionPane.INFORMATION_MESSAGE);
			}
		});

		//Mac Button
		JButton H_MacButton = new JButton("Mac");
		H_MacButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		H_MacButton.setBounds(275, 0, 150, 100);
		frame.getContentPane().add(H_MacButton);
		H_MacButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null,
						"Welcome to the Apple Store!\nThis page is currently under construction.\nExpect this tab to lead you to the Mac Products Page!",
                        "Apple Store",
                        JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		//iPhone Button
		JButton H_iPhoneButton = new JButton("iPhone");
		H_iPhoneButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		H_iPhoneButton.setBounds(425, 0, 150, 100);
		frame.getContentPane().add(H_iPhoneButton);
		H_iPhoneButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null,
						"Welcome to the Apple Store!\nThis page is currently under construction.\nExpect this tab to lead you to the iPhone Products Page!",
                        "Apple Store",
                        JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		//iPad Button
		JButton H_iPadButton = new JButton("iPad");
		H_iPadButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		H_iPadButton.setBounds(575, 0, 150, 100);
		frame.getContentPane().add(H_iPadButton);
		H_iPadButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null,
						"Welcome to the Apple Store!\nThis page is currently under construction.\nExpect this tab to lead you to the iPad Products Page!",
                        "Apple Store",
                        JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		//Accessories Button
		JButton H_AcessoriesButton = new JButton("Accessories");
		H_AcessoriesButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		H_AcessoriesButton.setBounds(725, 0, 150, 100);
		frame.getContentPane().add(H_AcessoriesButton);
		H_AcessoriesButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null,
						"Welcome to the Apple Store!\nThis page is currently under construction.\nExpect this tab to lead you to the Accessories Products Page!",
                        "Apple Store",
                        JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		//Cart Button.
		JButton H_CartButton = new JButton("Cart");
		H_CartButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		H_CartButton.setBounds(875, 0, 125, 100);
		frame.getContentPane().add(H_CartButton);
		H_CartButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null,
						"Welcome to the Apple Store!\nThis page is currently under construction.\nExpect this tab to lead you to the Cart Products Page with the cart icon!",
                        "Apple Store",
                        JOptionPane.INFORMATION_MESSAGE);
			}
		});
		//*****************************************************************************************
	
	}
}