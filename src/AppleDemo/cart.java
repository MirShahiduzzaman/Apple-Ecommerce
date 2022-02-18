package AppleDemo;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
//import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;


public class cart extends JFrame
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	public cart()
	{
		//
		// Frame title display
		//
		String titleString = "--- Apple Store - Shopping Cart --- "; 				    
		setTitle(titleString);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		// size of the frame
		//
		setSize(970,520);
		
		//
		// panel title
		//
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new TitledBorder(new EtchedBorder(), 
				              "SHOPPING CART"));;
		setContentPane(contentPane);
			
		
		
		
		//
		//  create a Name Label
		//
		JLabel nameL = new JLabel("Name : ");
		nameL.setFont(new Font("Tahoma", Font.PLAIN, 14));
		nameL.setBounds(30, 30, 200, 23);
		contentPane.add(nameL);
		
		//
		//  create a First Name Label
		//
		JLabel firstNameL = new JLabel("first");
		firstNameL.setFont(new Font("Tahoma", Font.PLAIN, 11));
		firstNameL.setBounds(175, 50, 200, 23);
		contentPane.add(firstNameL);
		
		//
		// field where user first name
		//
		JTextField firstNameF = new JTextField();
		firstNameF.setEditable(true);
		firstNameF.setBounds(110, 35, 150, 20);
		firstNameF.setColumns(30);
		contentPane.add(firstNameF);
		
		//
		//  create a Last Name Label
		//
		JLabel lastNameL = new JLabel("last");
		lastNameL.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lastNameL.setBounds(340, 50, 200, 23);
		contentPane.add(lastNameL);
		
		//
		// field where user last name
		//
		JTextField lastNameF = new JTextField();
		lastNameF.setEditable(true);
		lastNameF.setBounds(270, 35, 150, 20);
		lastNameF.setColumns(30);
		contentPane.add(lastNameF);
		
		
		//
		//  create a phone Label
		//
		JLabel phoneL = new JLabel("Phone : ");
		phoneL.setFont(new Font("Tahoma", Font.PLAIN, 14));
		phoneL.setBounds(30, 75, 200, 20);
		contentPane.add(phoneL);
		
		//
		// field where user phone
		//
		JTextField phoneF = new JTextField();
		phoneF.setEditable(true);
		phoneF.setBounds(100, 80, 150, 20);
		phoneF.setColumns(40);
		contentPane.add(phoneF);
		
		//
		//  create a address Label
		//
		JLabel addressL = new JLabel("Shipping Address : ");
		addressL.setFont(new Font("Tahoma", Font.PLAIN, 14));
		addressL.setBounds(30, 110, 200, 20);
		contentPane.add(addressL);
		
		//
		// field where user street address
		//
		JTextField addressF = new JTextField();
		addressF.setEditable(true);
		addressF.setBounds(150, 115, 200, 20);
		addressF.setColumns(40);
		contentPane.add(addressF);
		
		//
		//  create a street address Label
		//
		JLabel streetL = new JLabel("Street Address");
		streetL.setFont(new Font("Tahoma", Font.PLAIN, 11));
		streetL.setBounds(215, 130, 200, 20);
		contentPane.add(streetL);
		
		//
		// field where user apt #
		//
		JTextField aptF = new JTextField();
		aptF.setEditable(true);
		aptF.setBounds(350, 115, 50, 20);
		aptF.setColumns(40);
		contentPane.add(aptF);
		
		//
		//  create a apt # Label
		//
		JLabel aptL = new JLabel("Apt #");
		aptL.setFont(new Font("Tahoma", Font.PLAIN, 11));
		aptL.setBounds(360, 130, 200, 20);
		contentPane.add(aptL);
		
		//
		//  create a zip Label
		//
		JLabel zipL = new JLabel("Zip : ");
		zipL.setFont(new Font("Tahoma", Font.PLAIN, 14));
		zipL.setBounds(30, 150, 200, 20);
		contentPane.add(zipL);
		
		//
		// field where user zip
		//
		JTextField zipF = new JTextField();
		zipF.setEditable(true);
		zipF.setBounds(70, 155, 200, 20);
		zipF.setColumns(40);
		contentPane.add(zipF);

		//
		//  create a city Label
		//
		JLabel cityL = new JLabel("City : ");
		cityL.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cityL.setBounds(30, 175, 200, 23);
		contentPane.add(cityL);
		
		//
		// field where user city
		//
		JTextField cityF = new JTextField();
		cityF.setEditable(true);
		cityF.setBounds(100, 180, 80, 20);
		cityF.setColumns(40);
		contentPane.add(cityF);
		
		//
		//  create a state Label
		//
		JLabel stateL = new JLabel("State : ");
		stateL.setFont(new Font("Tahoma", Font.PLAIN, 14));
		stateL.setBounds(30, 195, 200, 23);
		contentPane.add(stateL);
		
		//
		// field where user state
		//
		JTextField stateF = new JTextField();
		stateF.setEditable(true);
		stateF.setBounds(100, 200, 40, 20);
		stateF.setColumns(40);
		contentPane.add(stateF);
		
		//
		//  create a card # Label
		//
		JLabel cardNumL = new JLabel("Card # : ");
		cardNumL.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cardNumL.setBounds(30, 220, 200, 23);
		contentPane.add(cardNumL);
		
		//
		// field where user state
		//
		JTextField cardNumF = new JTextField();
		cardNumF.setEditable(true);
		cardNumF.setBounds(100, 225, 200, 20);
		cardNumF.setColumns(40);
		contentPane.add(cardNumF);
		
		//
		//  create a expire Label
		//
		JLabel cExpireL = new JLabel("Expiration : ");
		cExpireL.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cExpireL.setBounds(55, 240, 200, 23);
		contentPane.add(cExpireL);
		
		//
		// field where user month expired
		//
		JTextField mExpireF = new JTextField();
		mExpireF.setEditable(true);
		mExpireF.setBounds(130, 245, 30, 15);
		mExpireF.setColumns(40);
		contentPane.add(mExpireF);
		
		//
		//  create a slash1 Label
		//
		JLabel slashL = new JLabel("/");
		slashL.setFont(new Font("Tahoma", Font.PLAIN, 14));
		slashL.setBounds(162, 240, 200, 23);
		contentPane.add(slashL);
		
		//
		// field where user date expired
		//
		JTextField dExpireF = new JTextField();
		dExpireF.setEditable(true);
		dExpireF.setBounds(170, 245, 30, 15);
		dExpireF.setColumns(40);
		contentPane.add(dExpireF);
		
		//
		//  create a slash2 Label
		//
		JLabel slash2L = new JLabel("/");
		slash2L.setFont(new Font("Tahoma", Font.PLAIN, 14));
		slash2L.setBounds(202, 240, 200, 23);
		contentPane.add(slash2L);
		
		//
		// field where user year expired
		//
		JTextField yExpireF = new JTextField();
		yExpireF.setEditable(true);
		yExpireF.setBounds(210, 245, 30, 15);
		yExpireF.setColumns(40);
		contentPane.add(yExpireF);
		
		//
		//  create a month expire Label
		//
		JLabel mExpireL = new JLabel("mm");
		mExpireL.setFont(new Font("Tahoma", Font.PLAIN, 11));
		mExpireL.setBounds(135, 253, 200, 23);
		contentPane.add(mExpireL);
		
		//
		//  create a date expire Label
		//
		JLabel dExpireL = new JLabel("dd");
		dExpireL.setFont(new Font("Tahoma", Font.PLAIN, 11));
		dExpireL.setBounds(175, 253, 200, 23);
		contentPane.add(dExpireL);
		
		//
		//  create a year expire Label
		//
		JLabel yExpireL = new JLabel("yy");
		yExpireL.setFont(new Font("Tahoma", Font.PLAIN, 11));
		yExpireL.setBounds(215, 253, 200, 23);
		contentPane.add(yExpireL);
		
		//
		//  create a cvv Label
		//
		JLabel cvvL = new JLabel("CVV : ");
		cvvL.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cvvL.setBounds(55, 265, 200, 23);
		contentPane.add(cvvL);
		
		
		
		
		//
		// field where user month expired
		//
		JTextField cvvF = new JTextField();
		cvvF.setEditable(true);
		cvvF.setBounds(95, 270, 30, 15);
		cvvF.setColumns(40);
		contentPane.add(cvvF);
		
		//
		//  create a appleid Label
		//
		JLabel appleidL = new JLabel("Apple ID Email : ");
		appleidL.setFont(new Font("Tahoma", Font.PLAIN, 14));
		appleidL.setBounds(55, 300, 200, 23);
		contentPane.add(appleidL);
		
		//
		// field for appleid
		//
		JTextField appleidF = new JTextField();
		appleidF.setEditable(true);
		appleidF.setBounds(155, 305, 30, 15);
		appleidF.setColumns(40);
		contentPane.add(appleidF);
		
		//
		// list of items that are being bought
		//
		JTextArea textArea = new JTextArea();
		textArea.setBounds(763, 11, 168, 382);
		textArea.setEditable(false);
		contentPane.add(textArea);
		
		//
		//  create a label for total price
		//
		JLabel lblNewLabel = new JLabel("    Total Price   $");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(697, 424, 200, 23);
		contentPane.add(lblNewLabel);
		
		//
		// field where total accumulating price is being displayed
		//
		JTextField textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(807, 420, 124, 34);
		contentPane.add(textField);
		textField.setColumns(10);
		
		//
		//  create a label for status
		//
		JLabel statusLabel = new JLabel("Status : ");
		statusLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		statusLabel.setBounds(30, 330, 100, 23);
		contentPane.add(statusLabel);
		
		//
		// field where to see status information
		//
		JTextField status = new JTextField();
		status.setEditable(false);
		status.setBounds(80, 330, 200, 34);
		contentPane.add(status);
		status.setColumns(40);
		status.setBackground(Color.LIGHT_GRAY);
		
		//
		// EXIT Button
		//
		JButton exit = new JButton("EXIT");
		exit.setFont(new Font("Tahoma", Font.PLAIN, 16));
		exit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{			
                    //
                    //close coupons :-(
                    //
				    dispose();
			}
			
		});
		exit.setBounds(30, 400, 133, 34);
		contentPane.add(exit);		
		
		
		
		
		//
		// SUBMIT Button
		//
		JButton submit = new JButton("SUBMIT");
		submit.setFont(new Font("Tahoma", Font.PLAIN, 16));
		submit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{			
				String nameFieldStr = firstNameF.getText();
				nameFieldStr        = nameFieldStr.trim();
				
				if (nameFieldStr.length() == 0)
				{
					JOptionPane.showMessageDialog(null, 
			                   "ERROR!  Name field is empty!",
			                   "Food Truck Coupons",
			                   JOptionPane.WARNING_MESSAGE);
				}
				
				
				
			}
		});
		submit.setBounds(250, 400, 133, 34);
		contentPane.add(submit);		
		
		
		//
		// HELP Button
		//
		JButton help = new JButton("HELP");
		help.setFont(new Font("Tahoma", Font.PLAIN, 16));
		help.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{			
                   
			}
			
		});
		help.setBounds(450, 400, 133, 34);
		contentPane.add(help);		
		
		//NOT IN USE
		/*
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
		*/
		
		
		
		// user will do the layout
		contentPane.setLayout(null);
		
		// position frame in the middle of the screen
		this.setLocationRelativeTo(null);
	}
}