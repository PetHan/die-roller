package dice;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;

public class DieRollerGUI {

	private JFrame frame;
	private JTextField textField_dX;
	private JTextField textField_d4_num;
	private JTextField textField_d6_num;
	private JTextField textField_d8_num;
	private JTextField textField_d10_num;
	private JTextField textField_d12_num;
	private JTextField textField_d20_num;
	private JTextField textField_d100_num;
	private JTextField textField_dX_num;
	private JTextField textField_d4_mod;
	private JTextField textField_d6_mod;
	private JTextField textField_d8_mod;
	private JTextField textField_d10_mod;
	private JTextField textField_d12_mod;
	private JTextField textField_d20_mod;
	private JTextField textField_d100_mod;
	private JTextField textField_dX_mod;
	private JTextField textField_d4_result;
	private JTextField textField_d6_result;
	private JTextField textField_d8_result;
	private JTextField textField_d10_result;
	private JTextField textField_d12_result;
	private JTextField textField_d20_result;
	private JTextField textField_d100_result;
	private JTextField textField_dX_result;
	protected static JTextField textField_record;

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
		
		JLabel lbl_Die = new JLabel("Die");
		lbl_Die.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Die.setBounds(7, 11, 27, 14);
		frame.getContentPane().add(lbl_Die);
		
		JLabel lbl_NumberRolled = new JLabel("Number");
		lbl_NumberRolled.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_NumberRolled.setBounds(44, 11, 46, 14);
		frame.getContentPane().add(lbl_NumberRolled);
		
		JLabel lbl_Modifier = new JLabel("Modifier");
		lbl_Modifier.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Modifier.setToolTipText("Add a -X for negative modifiers");
		lbl_Modifier.setBounds(100, 11, 46, 14);
		frame.getContentPane().add(lbl_Modifier);
		
		JLabel lbl_Result = new JLabel("Result");
		lbl_Result.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Result.setBounds(213, 11, 46, 14);
		frame.getContentPane().add(lbl_Result);
		
		JLabel lbl_d4 = new JLabel("d4");
		lbl_d4.setBounds(7, 36, 27, 14);
		frame.getContentPane().add(lbl_d4);
		
		JLabel lbl_d6 = new JLabel("d6");
		lbl_d6.setBounds(7, 68, 27, 14);
		frame.getContentPane().add(lbl_d6);
		
		JLabel lbl_d8 = new JLabel("d8");
		lbl_d8.setBounds(7, 99, 27, 14);
		frame.getContentPane().add(lbl_d8);
		
		JLabel lbl_d10 = new JLabel("d10");
		lbl_d10.setBounds(7, 130, 27, 14);
		frame.getContentPane().add(lbl_d10);
		
		JLabel lbl_d12 = new JLabel("d12");
		lbl_d12.setBounds(7, 161, 27, 14);
		frame.getContentPane().add(lbl_d12);
		
		JLabel lbl_d20 = new JLabel("d20");
		lbl_d20.setBounds(7, 192, 27, 14);
		frame.getContentPane().add(lbl_d20);
		
		JLabel lbl_d100 = new JLabel("d100");
		lbl_d100.setBounds(7, 223, 27, 14);
		frame.getContentPane().add(lbl_d100);
		
		textField_dX = new JTextField();
		textField_dX.setToolTipText("dX");
		textField_dX.setBounds(7, 250, 27, 21);
		frame.getContentPane().add(textField_dX);
		textField_dX.setColumns(10);
		
		textField_d4_num = new JTextField();
		textField_d4_num.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_d4_num.setHorizontalAlignment(SwingConstants.CENTER);
		textField_d4_num.setText("1");
		textField_d4_num.setBounds(44, 37, 49, 20);
		frame.getContentPane().add(textField_d4_num);
		textField_d4_num.setColumns(10);
		
		textField_d6_num = new JTextField();
		textField_d6_num.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_d6_num.setHorizontalAlignment(SwingConstants.CENTER);
		textField_d6_num.setText("1");
		textField_d6_num.setColumns(10);
		textField_d6_num.setBounds(44, 65, 49, 20);
		frame.getContentPane().add(textField_d6_num);
		
		textField_d8_num = new JTextField();
		textField_d8_num.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_d8_num.setHorizontalAlignment(SwingConstants.CENTER);
		textField_d8_num.setText("1");
		textField_d8_num.setColumns(10);
		textField_d8_num.setBounds(44, 96, 49, 20);
		frame.getContentPane().add(textField_d8_num);
		
		textField_d10_num = new JTextField();
		textField_d10_num.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_d10_num.setHorizontalAlignment(SwingConstants.CENTER);
		textField_d10_num.setText("1");
		textField_d10_num.setColumns(10);
		textField_d10_num.setBounds(44, 127, 49, 20);
		frame.getContentPane().add(textField_d10_num);
		
		textField_d12_num = new JTextField();
		textField_d12_num.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_d12_num.setHorizontalAlignment(SwingConstants.CENTER);
		textField_d12_num.setText("1");
		textField_d12_num.setColumns(10);
		textField_d12_num.setBounds(44, 158, 49, 20);
		frame.getContentPane().add(textField_d12_num);
		
		textField_d20_num = new JTextField();
		textField_d20_num.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_d20_num.setHorizontalAlignment(SwingConstants.CENTER);
		textField_d20_num.setText("1");
		textField_d20_num.setColumns(10);
		textField_d20_num.setBounds(44, 189, 49, 20);
		frame.getContentPane().add(textField_d20_num);
		
		textField_d100_num = new JTextField();
		textField_d100_num.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_d100_num.setHorizontalAlignment(SwingConstants.CENTER);
		textField_d100_num.setText("1");
		textField_d100_num.setColumns(10);
		textField_d100_num.setBounds(44, 220, 49, 20);
		frame.getContentPane().add(textField_d100_num);
		
		textField_dX_num = new JTextField();
		textField_dX_num.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_dX_num.setHorizontalAlignment(SwingConstants.CENTER);
		textField_dX_num.setText("1");
		textField_dX_num.setColumns(10);
		textField_dX_num.setBounds(44, 251, 49, 20);
		frame.getContentPane().add(textField_dX_num);
		
		textField_d4_mod = new JTextField();
		textField_d4_mod.setHorizontalAlignment(SwingConstants.CENTER);
		textField_d4_mod.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_d4_mod.setText("0");
		textField_d4_mod.setColumns(10);
		textField_d4_mod.setBounds(100, 37, 49, 20);
		frame.getContentPane().add(textField_d4_mod);
		
		textField_d6_mod = new JTextField();
		textField_d6_mod.setText("0");
		textField_d6_mod.setToolTipText("");
		textField_d6_mod.setHorizontalAlignment(SwingConstants.CENTER);
		textField_d6_mod.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_d6_mod.setColumns(10);
		textField_d6_mod.setBounds(100, 65, 49, 20);
		frame.getContentPane().add(textField_d6_mod);
		
		textField_d8_mod = new JTextField();
		textField_d8_mod.setText("0");
		textField_d8_mod.setToolTipText("");
		textField_d8_mod.setHorizontalAlignment(SwingConstants.CENTER);
		textField_d8_mod.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_d8_mod.setColumns(10);
		textField_d8_mod.setBounds(100, 96, 49, 20);
		frame.getContentPane().add(textField_d8_mod);
		
		textField_d10_mod = new JTextField();
		textField_d10_mod.setText("0");
		textField_d10_mod.setToolTipText("");
		textField_d10_mod.setHorizontalAlignment(SwingConstants.CENTER);
		textField_d10_mod.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_d10_mod.setColumns(10);
		textField_d10_mod.setBounds(100, 127, 49, 20);
		frame.getContentPane().add(textField_d10_mod);
		
		textField_d12_mod = new JTextField();
		textField_d12_mod.setText("0");
		textField_d12_mod.setToolTipText("");
		textField_d12_mod.setHorizontalAlignment(SwingConstants.CENTER);
		textField_d12_mod.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_d12_mod.setColumns(10);
		textField_d12_mod.setBounds(100, 158, 49, 20);
		frame.getContentPane().add(textField_d12_mod);
		
		textField_d20_mod = new JTextField();
		textField_d20_mod.setText("0");
		textField_d20_mod.setToolTipText("");
		textField_d20_mod.setHorizontalAlignment(SwingConstants.CENTER);
		textField_d20_mod.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_d20_mod.setColumns(10);
		textField_d20_mod.setBounds(100, 189, 49, 20);
		frame.getContentPane().add(textField_d20_mod);
		
		textField_d100_mod = new JTextField();
		textField_d100_mod.setText("0");
		textField_d100_mod.setToolTipText("");
		textField_d100_mod.setHorizontalAlignment(SwingConstants.CENTER);
		textField_d100_mod.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_d100_mod.setColumns(10);
		textField_d100_mod.setBounds(100, 220, 49, 20);
		frame.getContentPane().add(textField_d100_mod);
		
		textField_dX_mod = new JTextField();
		textField_dX_mod.setText("0");
		textField_dX_mod.setToolTipText("");
		textField_dX_mod.setHorizontalAlignment(SwingConstants.CENTER);
		textField_dX_mod.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_dX_mod.setColumns(10);
		textField_dX_mod.setBounds(100, 251, 49, 20);
		frame.getContentPane().add(textField_dX_mod);
		
//-----------------------------------------------------------------------------------------------	
		//Rolls
//-----------------------------------------------------------------------------------------------		

		JButton btnRoll_d4 = new JButton("Roll");
		btnRoll_d4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int dieNumber, dieModifier, result;
				try {
					dieNumber = Integer.parseInt(textField_d4_num.getText());
					dieModifier = Integer.parseInt(textField_d4_mod.getText());
					result = DieRoller.rollD4(dieNumber, dieModifier);
					textField_d4_result.setText(Integer.toString(result));
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Please enter a valid number");
				}
			}
		});
		btnRoll_d4.setBounds(159, 36, 49, 21);
		frame.getContentPane().add(btnRoll_d4);
		
		
		JButton btnRoll_d6 = new JButton("Roll");
		btnRoll_d6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int dieNumber, dieModifier, result;
				try {
					dieNumber = Integer.parseInt(textField_d6_num.getText());
					dieModifier = Integer.parseInt(textField_d6_mod.getText());
					result = DieRoller.rollD6(dieNumber, dieModifier);
					textField_d6_result.setText(Integer.toString(result));
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Please enter a valid number");
				}
			}
		});
		btnRoll_d6.setBounds(159, 64, 49, 21);
		frame.getContentPane().add(btnRoll_d6);
		
		
		JButton btnRoll_d8 = new JButton("Roll");
		btnRoll_d8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int dieNumber, dieModifier, result;
				try {
					dieNumber = Integer.parseInt(textField_d8_num.getText());
					dieModifier = Integer.parseInt(textField_d8_mod.getText());
					result = DieRoller.rollD8(dieNumber, dieModifier);
					textField_d8_result.setText(Integer.toString(result));
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Please enter a valid number");
				}
			}
		});
		btnRoll_d8.setBounds(159, 95, 49, 21);
		frame.getContentPane().add(btnRoll_d8);
		
		
		JButton btnRoll_d10 = new JButton("Roll");
		btnRoll_d10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int dieNumber, dieModifier, result;
				try {
					dieNumber = Integer.parseInt(textField_d10_num.getText());
					dieModifier = Integer.parseInt(textField_d10_mod.getText());
					result = DieRoller.rollD10(dieNumber, dieModifier);
					textField_d10_result.setText(Integer.toString(result));
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Please enter a valid number");
				}
			}
		});
		btnRoll_d10.setBounds(159, 126, 49, 21);
		frame.getContentPane().add(btnRoll_d10);
		
		
		JButton btnRoll_d12 = new JButton("Roll");
		btnRoll_d12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int dieNumber, dieModifier, result;
				try {
					dieNumber = Integer.parseInt(textField_d12_num.getText());
					dieModifier = Integer.parseInt(textField_d12_mod.getText());
					result = DieRoller.rollD12(dieNumber, dieModifier);
					textField_d12_result.setText(Integer.toString(result));
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Please enter a valid number");
				}
			}
		});
		btnRoll_d12.setBounds(159, 157, 49, 21);
		frame.getContentPane().add(btnRoll_d12);
		
		
		JButton btnRoll_d20 = new JButton("Roll");
		btnRoll_d20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int dieNumber, dieModifier, result;
				try {
					dieNumber = Integer.parseInt(textField_d20_num.getText());
					dieModifier = Integer.parseInt(textField_d20_mod.getText());
					result = DieRoller.rollD20(dieNumber, dieModifier);
					textField_d20_result.setText(Integer.toString(result));
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Please enter a valid number");
				}
			}
		});
		btnRoll_d20.setBounds(159, 188, 49, 21);
		frame.getContentPane().add(btnRoll_d20);
		
		
		JButton btnRoll_d100 = new JButton("Roll");
		btnRoll_d100.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int dieNumber, dieModifier, result;
				try {
					dieNumber = Integer.parseInt(textField_d100_num.getText());
					dieModifier = Integer.parseInt(textField_d100_mod.getText());
					result = DieRoller.rollD100(dieNumber, dieModifier);
					textField_d100_result.setText(Integer.toString(result));
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Please enter a valid number");
				}
			}
		});
		btnRoll_d100.setBounds(159, 219, 49, 21);
		frame.getContentPane().add(btnRoll_d100);
		
		
		JButton btnRoll_dX = new JButton("Roll");
		btnRoll_dX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int dieNumber, dieModifier, dX, result;
				try {
					dieNumber = Integer.parseInt(textField_dX_num.getText());
					dieModifier = Integer.parseInt(textField_dX_mod.getText());
					dX = Integer.parseInt(textField_dX.getText());
					result = DieRoller.rollDX(dieNumber, dieModifier, dX);
					textField_dX_result.setText(Integer.toString(result));
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Please enter a valid number");
				}
			}
		});
		btnRoll_dX.setBounds(159, 250, 49, 21);
		frame.getContentPane().add(btnRoll_dX);
		
		textField_d4_result = new JTextField();
		textField_d4_result.setColumns(10);
		textField_d4_result.setBounds(213, 36, 49, 20);
		frame.getContentPane().add(textField_d4_result);
		
		textField_d6_result = new JTextField();
		textField_d6_result.setColumns(10);
		textField_d6_result.setBounds(213, 65, 49, 20);
		frame.getContentPane().add(textField_d6_result);
		
		textField_d8_result = new JTextField();
		textField_d8_result.setColumns(10);
		textField_d8_result.setBounds(213, 96, 49, 20);
		frame.getContentPane().add(textField_d8_result);
		
		textField_d10_result = new JTextField();
		textField_d10_result.setColumns(10);
		textField_d10_result.setBounds(213, 127, 49, 20);
		frame.getContentPane().add(textField_d10_result);
		
		textField_d12_result = new JTextField();
		textField_d12_result.setColumns(10);
		textField_d12_result.setBounds(213, 158, 49, 20);
		frame.getContentPane().add(textField_d12_result);
		
		textField_d20_result = new JTextField();
		textField_d20_result.setColumns(10);
		textField_d20_result.setBounds(213, 189, 49, 20);
		frame.getContentPane().add(textField_d20_result);
		
		textField_d100_result = new JTextField();
		textField_d100_result.setColumns(10);
		textField_d100_result.setBounds(213, 220, 49, 20);
		frame.getContentPane().add(textField_d100_result);
		
		textField_dX_result = new JTextField();
		textField_dX_result.setColumns(10);
		textField_dX_result.setBounds(213, 250, 49, 20);
		frame.getContentPane().add(textField_dX_result);
		
		JLabel lbl_Record = new JLabel("Record");
		lbl_Record.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Record.setBounds(326, 11, 46, 14);
		frame.getContentPane().add(lbl_Record);
		
		textField_record = new JTextField();
		textField_record.setBounds(286, 36, 138, 235);
		frame.getContentPane().add(textField_record);
		textField_record.setColumns(10);
	}
	
}
