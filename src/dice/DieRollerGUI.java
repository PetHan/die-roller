package dice;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;

public class DieRollerGUI {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DieRollerGUI window = new DieRollerGUI();
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
	public DieRollerGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 325);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnRoll = new JButton("Roll");
		btnRoll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnRoll.setBounds(159, 36, 49, 21);
		frame.getContentPane().add(btnRoll);
		
		JLabel lblDie = new JLabel("Die");
		lblDie.setHorizontalAlignment(SwingConstants.CENTER);
		lblDie.setBounds(7, 11, 27, 14);
		frame.getContentPane().add(lblDie);
		
		JLabel lblNumberRolled = new JLabel("Number");
		lblNumberRolled.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumberRolled.setBounds(44, 11, 46, 14);
		frame.getContentPane().add(lblNumberRolled);
		
		JLabel lblModifier = new JLabel("Modifier");
		lblModifier.setHorizontalAlignment(SwingConstants.CENTER);
		lblModifier.setToolTipText("Add a -X for negative modifiers");
		lblModifier.setBounds(100, 11, 46, 14);
		frame.getContentPane().add(lblModifier);
		
		JLabel lblResult = new JLabel("Result");
		lblResult.setHorizontalAlignment(SwingConstants.CENTER);
		lblResult.setBounds(213, 11, 46, 14);
		frame.getContentPane().add(lblResult);
		
		JLabel lblD = new JLabel("d4");
		lblD.setBounds(7, 36, 27, 14);
		frame.getContentPane().add(lblD);
		
		JLabel lblD_1 = new JLabel("d6");
		lblD_1.setBounds(7, 68, 27, 14);
		frame.getContentPane().add(lblD_1);
		
		JLabel lblD_2 = new JLabel("d8");
		lblD_2.setBounds(7, 99, 27, 14);
		frame.getContentPane().add(lblD_2);
		
		JLabel lblD_3 = new JLabel("d10");
		lblD_3.setBounds(7, 130, 27, 14);
		frame.getContentPane().add(lblD_3);
		
		JLabel lblD_4 = new JLabel("d12");
		lblD_4.setBounds(7, 161, 27, 14);
		frame.getContentPane().add(lblD_4);
		
		JLabel lblD_5 = new JLabel("d20");
		lblD_5.setBounds(7, 192, 27, 14);
		frame.getContentPane().add(lblD_5);
		
		JLabel lblD_6 = new JLabel("d100");
		lblD_6.setBounds(7, 223, 27, 14);
		frame.getContentPane().add(lblD_6);
		
		textField = new JTextField();
		textField.setToolTipText("dX");
		textField.setBounds(7, 250, 27, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setText("1");
		textField_1.setBounds(44, 37, 49, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setText("1");
		textField_2.setColumns(10);
		textField_2.setBounds(44, 65, 49, 20);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setText("1");
		textField_3.setColumns(10);
		textField_3.setBounds(44, 96, 49, 20);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setText("1");
		textField_4.setColumns(10);
		textField_4.setBounds(44, 127, 49, 20);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setText("1");
		textField_5.setColumns(10);
		textField_5.setBounds(44, 158, 49, 20);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setText("1");
		textField_6.setColumns(10);
		textField_6.setBounds(44, 189, 49, 20);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setText("1");
		textField_7.setColumns(10);
		textField_7.setBounds(44, 220, 49, 20);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setText("1");
		textField_8.setColumns(10);
		textField_8.setBounds(44, 251, 49, 20);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_9.setText("0");
		textField_9.setColumns(10);
		textField_9.setBounds(100, 37, 49, 20);
		frame.getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setText("0");
		textField_10.setToolTipText("");
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_10.setColumns(10);
		textField_10.setBounds(100, 65, 49, 20);
		frame.getContentPane().add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setText("0");
		textField_11.setToolTipText("");
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_11.setColumns(10);
		textField_11.setBounds(100, 96, 49, 20);
		frame.getContentPane().add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setText("0");
		textField_12.setToolTipText("");
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		textField_12.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_12.setColumns(10);
		textField_12.setBounds(100, 127, 49, 20);
		frame.getContentPane().add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setText("0");
		textField_13.setToolTipText("");
		textField_13.setHorizontalAlignment(SwingConstants.CENTER);
		textField_13.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_13.setColumns(10);
		textField_13.setBounds(100, 158, 49, 20);
		frame.getContentPane().add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setText("0");
		textField_14.setToolTipText("");
		textField_14.setHorizontalAlignment(SwingConstants.CENTER);
		textField_14.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_14.setColumns(10);
		textField_14.setBounds(100, 189, 49, 20);
		frame.getContentPane().add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setText("0");
		textField_15.setToolTipText("");
		textField_15.setHorizontalAlignment(SwingConstants.CENTER);
		textField_15.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_15.setColumns(10);
		textField_15.setBounds(100, 220, 49, 20);
		frame.getContentPane().add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setText("0");
		textField_16.setToolTipText("");
		textField_16.setHorizontalAlignment(SwingConstants.CENTER);
		textField_16.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_16.setColumns(10);
		textField_16.setBounds(100, 251, 49, 20);
		frame.getContentPane().add(textField_16);
		
		JButton button = new JButton("Roll");
		button.setBounds(159, 64, 49, 21);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("Roll");
		button_1.setBounds(159, 95, 49, 21);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("Roll");
		button_2.setBounds(159, 126, 49, 21);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("Roll");
		button_3.setBounds(159, 157, 49, 21);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("Roll");
		button_4.setBounds(159, 188, 49, 21);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("Roll");
		button_5.setBounds(159, 219, 49, 21);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("Roll");
		button_6.setBounds(159, 250, 49, 21);
		frame.getContentPane().add(button_6);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(283, 36, 141, 235);
		frame.getContentPane().add(textPane);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(213, 36, 49, 20);
		frame.getContentPane().add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(213, 65, 49, 20);
		frame.getContentPane().add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(213, 96, 49, 20);
		frame.getContentPane().add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(213, 127, 49, 20);
		frame.getContentPane().add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(213, 158, 49, 20);
		frame.getContentPane().add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(213, 189, 49, 20);
		frame.getContentPane().add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(213, 220, 49, 20);
		frame.getContentPane().add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(213, 250, 49, 20);
		frame.getContentPane().add(textField_24);
		
		JLabel lblRecord = new JLabel("Record");
		lblRecord.setHorizontalAlignment(SwingConstants.CENTER);
		lblRecord.setBounds(326, 11, 46, 14);
		frame.getContentPane().add(lblRecord);
	}
}
