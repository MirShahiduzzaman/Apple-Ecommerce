package AppleDemo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import AppleDemo.fileIO;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Vector;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextArea;

public class cart extends JFrame {

	private JPanel contentPane;
	private JTextField firstNameF;
	private JTextField midNameF;
	private JTextField lastNameF;
	private JTextField phoneF;
	private JTextField addressF;
	private JTextField aptF;
	private JTextField zipF;
	private JTextField cityF;
	private JTextField cardNumF;
	private JTextField cardMonthF;
	private JTextField cardDateF;
	private JTextField cardYearF;
	private JTextField cvvF;
	private JTextField appleIdF;
	private JTextField statusF;
	private JTextField totalF;
	private JTextArea textArea;
//	private String dataStr;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cart frame = new cart();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static double total = 0;
	static Hashtable<String, Double> items = new Hashtable<String, Double>();
	static Hashtable<String, Integer> counts = new Hashtable <String, Integer>();
	static socketUtils su = new socketUtils();
	
	
	/**
	 * Create the frame.
	 */
	public cart() {
		setTitle("--- Apple Store - Shopping Cart ---");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(970,520);
		//setBounds(970, 670, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new TitledBorder(new EtchedBorder(), 
	              "SHOPPING CART"));;
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel fullNameL = new JLabel("Full Name:");
		fullNameL.setFont(new Font("Tahoma", Font.PLAIN, 14));
		fullNameL.setBounds(56, 25, 72, 13);
		contentPane.add(fullNameL);
		
		JLabel phoneL = new JLabel("Phone Number:");
		phoneL.setFont(new Font("Tahoma", Font.PLAIN, 14));
		phoneL.setBounds(22, 60, 104, 13);
		contentPane.add(phoneL);
		
		JLabel shippingL = new JLabel("Shipping Address:");
		shippingL.setFont(new Font("Tahoma", Font.PLAIN, 14));
		shippingL.setBounds(10, 105, 114, 13);
		contentPane.add(shippingL);
		
		JLabel zipL = new JLabel("Zip Code:");
		zipL.setFont(new Font("Tahoma", Font.PLAIN, 14));
		zipL.setBounds(84, 149, 72, 13);
		contentPane.add(zipL);
		
		JLabel cityL = new JLabel("City:");
		cityL.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cityL.setBounds(114, 177, 36, 13);
		contentPane.add(cityL);
		
		/*
		JLabel stateL = new JLabel("State:");
		stateL.setFont(new Font("Tahoma", Font.PLAIN, 14));
		stateL.setBounds(105, 205, 42, 13);
		contentPane.add(stateL);
		*/
		
		JLabel cardNumL = new JLabel("Card Number:");
		cardNumL.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cardNumL.setBounds(22, 245, 93, 13);
		contentPane.add(cardNumL);
		
		JLabel expirationL = new JLabel("Expiration:");
		expirationL.setFont(new Font("Tahoma", Font.PLAIN, 14));
		expirationL.setBounds(69, 273, 72, 13);
		contentPane.add(expirationL);
		
		JLabel cvvL = new JLabel("CVV:");
		cvvL.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cvvL.setBounds(103, 304, 36, 13);
		contentPane.add(cvvL);
		
		JLabel appleIdL = new JLabel("Apple ID Email:");
		appleIdL.setFont(new Font("Tahoma", Font.PLAIN, 14));
		appleIdL.setBounds(27, 333, 104, 13);
		contentPane.add(appleIdL);
		
		JLabel statusL = new JLabel("Status:");
		statusL.setFont(new Font("Tahoma", Font.PLAIN, 14));
		statusL.setBounds(56, 375, 53, 13);
		contentPane.add(statusL);
		
		JLabel totalL = new JLabel("Total:");
		totalL.setFont(new Font("Tahoma", Font.PLAIN, 14));
		totalL.setBounds(731, 407, 42, 13);
		contentPane.add(totalL);
		
		firstNameF = new JTextField();
		firstNameF.setBounds(127, 24, 120, 19);
		contentPane.add(firstNameF);
		firstNameF.setColumns(10);
		
		JLabel fNameL = new JLabel("first");
		fNameL.setFont(new Font("Tahoma", Font.PLAIN, 11));
		fNameL.setBounds(182, 43, 25, 13);
		contentPane.add(fNameL);
		
		midNameF = new JTextField();
		midNameF.setColumns(10);
		midNameF.setBounds(257, 24, 31, 19);
		contentPane.add(midNameF);
		
		JLabel mNameL = new JLabel("M.I.");
		mNameL.setFont(new Font("Tahoma", Font.PLAIN, 11));
		mNameL.setBounds(265, 43, 25, 13);
		contentPane.add(mNameL);
		
		lastNameF = new JTextField();
		lastNameF.setColumns(10);
		lastNameF.setBounds(298, 24, 148, 19);
		contentPane.add(lastNameF);
		
		JLabel lNameL = new JLabel("last");
		lNameL.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lNameL.setBounds(364, 43, 25, 13);
		contentPane.add(lNameL);
		
		phoneF = new JTextField();
		phoneF.setBounds(124, 59, 158, 19);
		contentPane.add(phoneF);
		phoneF.setColumns(10);
		
		addressF = new JTextField();
		addressF.setBounds(124, 104, 175, 19);
		contentPane.add(addressF);
		addressF.setColumns(10);
		
		JLabel streetL = new JLabel("Street Address");
		streetL.setFont(new Font("Tahoma", Font.PLAIN, 11));
		streetL.setBounds(177, 125, 81, 13);
		contentPane.add(streetL);
		
		aptF = new JTextField();
		aptF.setColumns(10);
		aptF.setBounds(307, 104, 42, 19);
		contentPane.add(aptF);
		
		JLabel aptL = new JLabel("Apt #");
		aptL.setFont(new Font("Tahoma", Font.PLAIN, 11));
		aptL.setBounds(317, 125, 32, 13);
		contentPane.add(aptL);
		
		zipF = new JTextField();
		zipF.setBounds(151, 148, 87, 19);
		contentPane.add(zipF);
		zipF.setColumns(10);
		
		cityF = new JTextField();
		cityF.setBounds(151, 176, 96, 19);
		contentPane.add(cityF);
		cityF.setColumns(10);
		
		/*
		JComboBox stateCb = new JComboBox();
		stateCb.setFont(new Font("Tahoma", Font.PLAIN, 13));
		stateCb.setBounds(151, 203, 73, 21);
		contentPane.add(stateCb);
		*/
		
		cardNumF = new JTextField();
		cardNumF.setBounds(117, 244, 108, 19);
		contentPane.add(cardNumF);
		cardNumF.setColumns(10);
		
		cardMonthF = new JTextField();
		cardMonthF.setBounds(139, 272, 27, 19);
		contentPane.add(cardMonthF);
		cardMonthF.setColumns(10);
		
		JLabel cardMonthL = new JLabel("mm");
		cardMonthL.setFont(new Font("Tahoma", Font.PLAIN, 11));
		cardMonthL.setBounds(144, 290, 23, 13);
		contentPane.add(cardMonthL);
		
		JLabel lblExpiration_1 = new JLabel("/");
		lblExpiration_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblExpiration_1.setBounds(168, 275, 6, 13);
		contentPane.add(lblExpiration_1);
		
		cardDateF = new JTextField();
		cardDateF.setColumns(10);
		cardDateF.setBounds(176, 272, 27, 19);
		contentPane.add(cardDateF);
		
		JLabel cardDateL = new JLabel("dd");
		cardDateL.setFont(new Font("Tahoma", Font.PLAIN, 11));
		cardDateL.setBounds(183, 290, 23, 13);
		contentPane.add(cardDateL);
		
		JLabel lblExpiration_1_1 = new JLabel("/");
		lblExpiration_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblExpiration_1_1.setBounds(205, 275, 6, 13);
		contentPane.add(lblExpiration_1_1);
		
		cardYearF = new JTextField();
		cardYearF.setColumns(10);
		cardYearF.setBounds(213, 273, 40, 19);
		contentPane.add(cardYearF);
		
		JLabel cardYearL = new JLabel("yyyy");
		cardYearL.setFont(new Font("Tahoma", Font.PLAIN, 11));
		cardYearL.setBounds(221, 290, 36, 13);
		contentPane.add(cardYearL);
		
		cvvF = new JTextField();
		cvvF.setBounds(139, 303, 47, 19);
		contentPane.add(cvvF);
		cvvF.setColumns(10);
		
		appleIdF = new JTextField();
		appleIdF.setBounds(126, 332, 121, 19);
		contentPane.add(appleIdF);
		appleIdF.setColumns(10);
		
		JButton exitBtn = new JButton("EXIT");
		exitBtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		exitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				setVisible(false);
			}
		});
		exitBtn.setBounds(22, 439, 133, 34);
		contentPane.add(exitBtn);
		
		statusF = new JTextField();
		statusF.setBackground(Color.LIGHT_GRAY);
		statusF.setEditable(false);
		statusF.setBounds(107, 375, 200, 34);
		contentPane.add(statusF);
		statusF.setColumns(10);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(660, 15, 286, 382);
		contentPane.add(textArea);
		
		JButton submitBtn = new JButton("SUBMIT");
		submitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{	
				String dataStr = null;
				dataStr = "appleId" + ",firstName=" + firstNameF.getText() + ",midName=" + midNameF.getText() + ",lastName=" + lastNameF.getText() + 
						",phone=" + phoneF.getText() + ",address=" + addressF.getText() + ",apt=" + aptF.getText() + ",zip=" + zipF.getText() + 
						",city=" + cityF.getText();
				
				fileIO fio = new fileIO();
			
			
				fio.wrTransactionData(dataStr);
				
				
				   
			   if (textArea.getText().trim().length() == 0)
			   {
				   JOptionPane.showMessageDialog(null, 
			                   "ERROR!  No items in shopping cart!",
			       "Apple Shopping Cart",
			                   JOptionPane.WARNING_MESSAGE);
			   }
			   else if (firstNameF.getText().trim().length() == 0)
			   {
				   JOptionPane.showMessageDialog(null, 
			                   "ERROR!  First Name field is empty!",
			       "Apple Shopping Cart",
			                   JOptionPane.WARNING_MESSAGE);
			   }
			   else if (lastNameF.getText().trim().length() == 0)
			   {
				   JOptionPane.showMessageDialog(null, 
			                   "ERROR!  Last Name field is empty!",
			       "Apple Shopping Cart",
			                   JOptionPane.WARNING_MESSAGE);
			   }
			   else if (phoneF.getText().trim().length() == 0)
			   {
				   JOptionPane.showMessageDialog(null, 
			                   "ERROR!  Phone Number field is empty!",
			       "Apple Shopping Cart",
			                   JOptionPane.WARNING_MESSAGE);
			   }
			   else if (addressF.getText().trim().length() == 0)
			   {
				   JOptionPane.showMessageDialog(null, 
			                   "ERROR!  Address field is empty!",
			       "Apple Shopping Cart",
			                   JOptionPane.WARNING_MESSAGE);
			   }
			   else if (aptF.getText().trim().length() == 0)
			   {
				   JOptionPane.showMessageDialog(null, 
			                   "ERROR!  Apt field is empty!",
			       "Apple Shopping Cart",
			                   JOptionPane.WARNING_MESSAGE);
			   }
			   else if (zipF.getText().trim().length() == 0)
			   {
				   JOptionPane.showMessageDialog(null, 
			                   "ERROR!  Zip Code field is empty!",
			       "Apple Shopping Cart",
			                   JOptionPane.WARNING_MESSAGE);
			   }
			   else if (cityF.getText().trim().length() == 0)
			   {
				   JOptionPane.showMessageDialog(null, 
			                   "ERROR!  City field is empty!",
			       "Apple Shopping Cart",
			                   JOptionPane.WARNING_MESSAGE);
			   }
			   else if (cardNumF.getText().trim().length() == 0)
			   {
				   JOptionPane.showMessageDialog(null, 
			                   "ERROR!  Card Number field is empty!",
			       "Apple Shopping Cart",
			                   JOptionPane.WARNING_MESSAGE);
			   }
			   else if (cardMonthF.getText().trim().length() == 0)
			   {
				   JOptionPane.showMessageDialog(null, 
			                   "ERROR!  Card Month field is empty!",
			       "Apple Shopping Cart",
			                   JOptionPane.WARNING_MESSAGE);
			   }
			   else if (cardDateF.getText().trim().length() == 0)
			   {
				   JOptionPane.showMessageDialog(null, 
			                   "ERROR!  Card Date field is empty!",
			       "Apple Shopping Cart",
			                   JOptionPane.WARNING_MESSAGE);
			   }
			   else if (cardYearF.getText().trim().length() == 0)
			   {
				   JOptionPane.showMessageDialog(null, 
			                   "ERROR!  Card Year field is empty!",
			       "Apple Shopping Cart",
			                   JOptionPane.WARNING_MESSAGE);
			   }
			   else if (cvvF.getText().trim().length() == 0)
			   {
				   JOptionPane.showMessageDialog(null, 
			                   "ERROR!  CVV field is empty!",
			       "Apple Shopping Cart",
			                   JOptionPane.WARNING_MESSAGE);
			   }
			   else if (appleIdF.getText().trim().length() == 0)
			   {
				   JOptionPane.showMessageDialog(null, 
			                   "ERROR!  Apple ID field is empty!",
			       "Apple Shopping Cart",
			                   JOptionPane.WARNING_MESSAGE);
			   }
			   else
			   {

				   
					if (su.socketConnect() == true)
					{
						String s = "";
						if(AppleDemo.numOf13Mini  != 0)
						{
							s += "mini = " + AppleDemo.numOf13Mini + " ";
						}
						if(AppleDemo.numOf13Pro != 0)
						{
							s += "pro = " + AppleDemo.numOf13Pro + " ";
						}
						if(AppleDemo.numOf13 != 0)
						{
							s += "regular = " + AppleDemo.numOf13 + " ";
						}
						if(AppleDemo.numOf13ProMax  != 0)
						{
							s += "pro max = " + AppleDemo.numOf13ProMax + " ";
						}
						s += "total=" + total + " ";
						su.sendMessage(s);
						
						s = "QUIT>";
						su.sendMessage(s);
						
						su.closeSocket();
					}
					
				   AppleDemo.numOfItems = 0;
					
				   AppleDemo.numOf13Mini  = 0;
				   AppleDemo.numOf13Pro   = 0;
				   AppleDemo.numOf13 = 0;
				   AppleDemo.numOf13ProMax  = 0;
				   AppleDemo.updateTotal(0);
				
				   AppleDemo.textArea.setText("");
				   AppleDemo.textField.setText("");
				   
				   firstNameF.setText("");
				   midNameF.setText("");
				   lastNameF.setText("");
				   phoneF.setText("");
				   addressF.setText("");
				   aptF.setText("");
				   zipF.setText("");
				   cityF.setText("");
				   cardNumF.setText("");
				   cardMonthF.setText("");
				   cardDateF.setText("");
				   cardYearF.setText("");
				   cvvF.setText("");
				   appleIdF.setText("");
				   statusF.setText("");
				   clearList();
			   }
		   
			}
			
		});
		submitBtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		submitBtn.setBounds(303, 439, 133, 34);
		contentPane.add(submitBtn);
		
		JButton helpBtn = new JButton("HELP");
		helpBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		helpBtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		helpBtn.setBounds(455, 439, 133, 34);
		contentPane.add(helpBtn);
		
		totalF = new JTextField();
		totalF.setFont(new Font("Tahoma", Font.PLAIN, 20));
		totalF.setText("$" + String.format("%.2f", total) + "\r\n");
		totalF.setEditable(false);
		totalF.setBounds(778, 407, 134, 34);
		contentPane.add(totalF);
		totalF.setColumns(10);
		
		// user will do the layout
		contentPane.setLayout(null);
		
		// position frame in the middle of the screen
		this.setLocationRelativeTo(null);
	}
	
	public void setTotal(double val)
	{	
		total = val;
		totalF.setText("$" + String.format("%.2f", total) + "\r\n");
	}
	
	public void appendItem(String item, double price)
	{
		textArea.setText(textArea.getText() + "\n" + item + "\t\t" + price);
		items.put(item, price);
		if(counts.containsKey(item))
		{
			counts.put(item, counts.get(item)+1);
		}
		else
		{
			counts.put(item, 1);
		}
		setTotal(total+price);
	}
	
	public void clearList()
	{
		textArea.setText("");
		setTotal(0);
		items.clear();
		counts.clear();
	}
}