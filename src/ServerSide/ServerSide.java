package ServerSide;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.NumberFormatter;

import java.awt.Font;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Date;

import ServerSide.socketServer;

public class ServerSide {

	private JFrame frame;
	public static JTextArea TransactionTA;
	public static JTextArea textArea;
	public static JTextField iPhoneSoldTF;
	public static JTextField iPadSoldTF;
	public static JTextField MacBookSoldTF;
	public static JTextField AirPodSoldTF;
	public static JTextField TtlProductSoldTF;
	public static JTextField AppleCareTF;
	public static JTextField TtlProfitsTF;
	public static JTextField CustSupportTF;
	public static JTextField currIpTF;
	public static JTextField portNumTF;

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

		//
		// Frame title display current time
		//
		Date  date = new Date();
		String str = String.format("%tc", date);
		
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		frame.setTitle(str);
		//Transaction *****************************************************************************
		JLabel OrdersL = new JLabel("Orders Placed: ");
		OrdersL.setFont(new Font("Tahoma", Font.BOLD, 20));
		OrdersL.setBounds(35, 35, 175, 20);
		frame.getContentPane().add(OrdersL);
		
		//Transaction Log Text Field
		TransactionTA = new JTextArea();
		TransactionTA.setEditable(false);
		TransactionTA.setBounds(35, 70, 500, 650);
		frame.getContentPane().add(TransactionTA);
		TransactionTA.setColumns(10);
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
		startSockServer();
		
		
		
		
		
		//
		// lights, camera, action
		//
		frame.getContentPane().setLayout(null);
		
		textArea = new JTextArea();
		textArea.setBounds(600, 499, 313, 221);
		frame.getContentPane().add(textArea);
		
		JLabel currIpL = new JLabel("Current IP:");
		currIpL.setFont(new Font("Tahoma", Font.PLAIN, 14));
		currIpL.setBounds(35, 10, 71, 20);
		frame.getContentPane().add(currIpL);
		
		currIpTF = new JTextField();
		currIpTF.setFont(new Font("Tahoma", Font.PLAIN, 14));
		currIpTF.setEditable(false);
		currIpTF.setColumns(10);
		currIpTF.setBounds(108, 13, 95, 20);
		frame.getContentPane().add(currIpTF);
		
		JLabel portNumL = new JLabel("Port Number:");
		portNumL.setFont(new Font("Tahoma", Font.PLAIN, 14));
		portNumL.setBounds(266, 10, 95, 20);
		frame.getContentPane().add(portNumL);
		
		portNumTF = new JTextField();
		portNumTF.setFont(new Font("Tahoma", Font.PLAIN, 14));
		portNumTF.setEditable(false);
		portNumTF.setColumns(10);
		portNumTF.setBounds(354, 13, 95, 20);
		frame.getContentPane().add(portNumTF);
		
		InetAddress localhost;
		try {
			localhost = InetAddress.getLocalHost();
	        System.out.println("System IP Address : " +
	                      (localhost.getHostAddress()).trim());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 
		// call thread to update date and time
		//
		refreshTitleBar();
//		this.setLocationRelativeTo(null);
	
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
              	   
				   String titleString = "--- Apple Server --- " + str; 				 
				   
				   frame.setTitle(titleString);
					 
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
	
	/*
	   * Thread to update weather info for NYC and Boston    
	   */     
	  private void startSockServer()
	  {	
		 Thread refreshWeatherThread = new Thread()
		 {
		    public void run()
			  { 	
				  socketServer.runSockServer();
		      }
		 };
	
	    refreshWeatherThread.start();
	  }
	
	public void setTotal(double val)
	{
		total = val;
		iPhoneSoldTF.setText("$" + String.format("%.2f", total) + "\r\n");
		TtlProfitsTF.setText("$" + String.format("%.2f", total) + "\r\n");
	}
}
