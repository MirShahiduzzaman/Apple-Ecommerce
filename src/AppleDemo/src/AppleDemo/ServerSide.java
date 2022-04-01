package AppleDemo;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JTextField;
import javax.swing.text.NumberFormatter;
import javax.swing.JFormattedTextField;

public class ServerSide {

	private JFrame frame;
	private JTextField TransactionTF;
	private JTextField iPhoneSoldTF;
	private JTextField iPadSoldTF;
	private JTextField MacBookSoldTF;
	private JTextField AirPodSoldTF;
	private JTextField TtlProductSoldTF;
	private JTextField AppleCareTF;
	private JTextField TtlProfitsTF;
	private JTextField CustSupportTF;

	/**
	 * Launch the application.
	 */
	
	static double total = 0;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ServerSide window = new ServerSide();
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
	public ServerSide() {
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
		
		//Transaction *****************************************************************************
		JLabel OrdersL = new JLabel("Orders Placed: ");
		OrdersL.setFont(new Font("Tahoma", Font.BOLD, 20));
		OrdersL.setBounds(35, 35, 175, 20);
		frame.getContentPane().add(OrdersL);
		
		//Transaction Log Text Field
		TransactionTF = new JTextField();
		TransactionTF.setEditable(false);
		TransactionTF.setBounds(35, 70, 500, 650);
		frame.getContentPane().add(TransactionTF);
		TransactionTF.setColumns(10);
		//*****************************************************************************************
		
		//Sales Analysis **************************************************************************
		JLabel ProductL = new JLabel("Product Sold:");
		ProductL.setFont(new Font("Tahoma", Font.BOLD, 20));
		ProductL.setBounds(600, 35, 150, 20);
		frame.getContentPane().add(ProductL);
		
		//Products Info --------------------------------------------------
		//iPhone
		JLabel iPhoneSoldL = new JLabel("iPhones Sold:");
		iPhoneSoldL.setFont(new Font("Tahoma", Font.PLAIN, 14));
		iPhoneSoldL.setBounds(600, 70, 100, 20);
		frame.getContentPane().add(iPhoneSoldL);
		
		iPhoneSoldTF = new JTextField();
		iPhoneSoldTF.setEditable(false);
		iPhoneSoldTF.setFont(new Font("Tahoma", Font.PLAIN, 14));
		iPhoneSoldTF.setBounds(700, 70, 95, 20);
		frame.getContentPane().add(iPhoneSoldTF);
		iPhoneSoldTF.setColumns(10);
		
		//iPad
		JLabel iPadSoldL = new JLabel("iPads Sold:");
		iPadSoldL.setFont(new Font("Tahoma", Font.PLAIN, 14));
		iPadSoldL.setBounds(600, 100, 100, 20);
		frame.getContentPane().add(iPadSoldL);
		
		iPadSoldTF = new JTextField();
		iPadSoldTF.setEditable(false);
		iPadSoldTF.setFont(new Font("Tahoma", Font.PLAIN, 14));
		iPadSoldTF.setBounds(700, 100, 95, 20);
		frame.getContentPane().add(iPadSoldTF);
		iPadSoldTF.setColumns(10);
		
		//MacBook
		JLabel MacBookSoldL = new JLabel("MacBooks Sold:");
		MacBookSoldL.setFont(new Font("Tahoma", Font.PLAIN, 14));
		MacBookSoldL.setBounds(600, 130, 100, 20);
		frame.getContentPane().add(MacBookSoldL);
		
		MacBookSoldTF = new JTextField();
		MacBookSoldTF.setEditable(false);
		MacBookSoldTF.setFont(new Font("Tahoma", Font.PLAIN, 14));
		MacBookSoldTF.setBounds(700, 130, 95, 20);
		frame.getContentPane().add(MacBookSoldTF);
		MacBookSoldTF.setColumns(10);
		
		//AirPods 
		JLabel AirPodSoldL = new JLabel("Air Pods Sold:");
		AirPodSoldL.setFont(new Font("Tahoma", Font.PLAIN, 14));
		AirPodSoldL.setBounds(600, 160, 100, 20);
		frame.getContentPane().add(AirPodSoldL);
		
		AirPodSoldTF = new JTextField();
		AirPodSoldTF.setFont(new Font("Tahoma", Font.PLAIN, 14));
		AirPodSoldTF.setEditable(false);
		AirPodSoldTF.setBounds(700, 160, 95, 20);
		frame.getContentPane().add(AirPodSoldTF);
		AirPodSoldTF.setColumns(10);
		
		//Overall Products Info-----------------------------------------------
		//Total Products Sold
		JLabel TtlProductSoldL = new JLabel("Total Products Sold:");
		TtlProductSoldL.setFont(new Font("Tahoma", Font.PLAIN, 14));
		TtlProductSoldL.setBounds(600, 245, 145, 20);
		frame.getContentPane().add(TtlProductSoldL);
		
		TtlProductSoldTF = new JTextField();
		TtlProductSoldTF.setFont(new Font("Tahoma", Font.PLAIN, 14));
		TtlProductSoldTF.setEditable(false);
		TtlProductSoldTF.setBounds(760, 245, 95, 20);
		frame.getContentPane().add(TtlProductSoldTF);
		TtlProductSoldTF.setColumns(10);
		
		
		//Total Profits 
		JLabel TtlProfitsL = new JLabel("Total Profits:");
		TtlProfitsL.setFont(new Font("Tahoma", Font.PLAIN, 14));
		TtlProfitsL.setBounds(600, 275, 145, 20);
		frame.getContentPane().add(TtlProfitsL);
		
		TtlProfitsTF = new JTextField();
		TtlProfitsTF.setEditable(false);
		TtlProfitsTF.setFont(new Font("Tahoma", Font.PLAIN, 14));
		TtlProfitsTF.setBounds(760, 275, 95, 20);
		frame.getContentPane().add(TtlProfitsTF);
		TtlProfitsTF.setColumns(10);		
		
		//Apple Care Connected
		JLabel AppleCareL = new JLabel("Apple Care Connected:");
		AppleCareL.setFont(new Font("Tahoma", Font.PLAIN, 14));
		AppleCareL.setBounds(605, 301, 145, 20);
		frame.getContentPane().add(AppleCareL);
		

		AppleCareTF = new JTextField();
		AppleCareTF.setEditable(false);
		AppleCareTF.setFont(new Font("Tahoma", Font.PLAIN, 14));
		AppleCareTF.setBounds(760, 300, 95, 20);
		frame.getContentPane().add(AppleCareTF);
		AppleCareTF.setColumns(10);
		
		//*****************************************************************************************
		
		
		//Customer Support Analysis ***************************************************************
		JLabel SupportL = new JLabel("Support Contact:");
		SupportL.setFont(new Font("Tahoma", Font.BOLD, 20));
		SupportL.setBounds(600, 375, 175, 20);
		frame.getContentPane().add(SupportL);
		
		//Contacted Support ----------------------------------------------
		JLabel CustSupportL = new JLabel("Customers Requesting Support:");
		CustSupportL.setFont(new Font("Tahoma", Font.PLAIN, 14));
		CustSupportL.setBounds(600, 440, 200, 20);
		frame.getContentPane().add(CustSupportL);
		
		CustSupportTF = new JTextField();
		CustSupportTF.setEditable(false);
		CustSupportTF.setFont(new Font("Tahoma", Font.PLAIN, 14));
		CustSupportTF.setBounds(810, 440, 95, 20);
		frame.getContentPane().add(CustSupportTF);
		CustSupportTF.setColumns(10);
		
		//Customer Satisfaction -----------------------------------------
		JLabel CustSatisfactionL = new JLabel("Customer Satisfaction:");
		CustSatisfactionL.setFont(new Font("Tahoma", Font.PLAIN, 14));
		CustSatisfactionL.setBounds(600, 410, 150, 20);
		frame.getContentPane().add(CustSatisfactionL);
		
		//Creating Formatter
		NumberFormat percFormat = new DecimalFormat("00.00%"); 
		NumberFormatter  percFormatter  = new NumberFormatter(percFormat);
		
		JFormattedTextField CustSatisfactionFTF = new JFormattedTextField(percFormatter);
		CustSatisfactionFTF.setFont(new Font("Tahoma", Font.PLAIN, 14));
		CustSatisfactionFTF.setEditable(false);
		CustSatisfactionFTF.setBounds(810, 410, 95, 20);
		frame.getContentPane().add(CustSatisfactionFTF);
		
		//Visual Representation of Satisfaction
		String custSatisf = CustSatisfactionFTF.getText();
		float custSatisfF = 74;
		
		if(custSatisfF >= 90.00)
		{
			CustSatisfactionFTF.setBackground(Color.green);
		}
		else if((custSatisfF > 60.00) && (custSatisfF < 90.00))
		{
			CustSatisfactionFTF.setBackground(Color.yellow);
		}
		else
		{
			CustSatisfactionFTF.setBackground(Color.red);
		}
		
		//*****************************************************************************************
	}
	
	public void setTotal(double val)
	{
		total = val;
		iPhoneSoldTF.setText("$" + String.format("%.2f", total) + "\r\n");
		TtlProfitsTF.setText("$" + String.format("%.2f", total) + "\r\n");
	}
}
