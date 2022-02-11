package AppleDemo;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
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
		setSize(970,670);
		
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
		
		
//		//
//		//  create a email Label
//		//
//		JLabel emailL = new JLabel("    Email : ");
//		emailL.setFont(new Font("Tahoma", Font.PLAIN, 14));
//		emailL.setBounds(30, 330, 200, 23);
//		contentPane.add(emailL);
//		
//		//
//		// field where user email
//		//
//		JTextField emailF = new JTextField();
//		emailF.setEditable(true);
//		emailF.setBounds(100, 330, 150, 34);
//		emailF.setColumns(40);
//		contentPane.add(emailF);
		
		
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
		
		
		
		
		
		// user will do the layout
		contentPane.setLayout(null);
		
		// position frame in the middle of the screen
		this.setLocationRelativeTo(null);
	}
}