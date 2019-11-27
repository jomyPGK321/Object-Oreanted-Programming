package csae_studys;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.DropMode;

public class Sample {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sample window = new Sample();
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
	public Sample() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 51, 102));
		frame.getContentPane().setForeground(Color.WHITE);
		frame.setBounds(100, 100, 608, 432);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUserName = new JLabel("USER NAME");
		lblUserName.setForeground(Color.WHITE);
		lblUserName.setToolTipText("");
		lblUserName.setLabelFor(frame);
		lblUserName.setBackground(Color.BLACK);
		lblUserName.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblUserName.setBounds(30, 39, 133, 41);
		frame.getContentPane().add(lblUserName);
		
		JLabel lblPassWord = new JLabel("PASS WORD");
		lblPassWord.setBackground(Color.PINK);
		lblPassWord.setForeground(Color.WHITE);
		lblPassWord.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblPassWord.setBounds(30, 127, 133, 41);
		frame.getContentPane().add(lblPassWord);
		
		textField = new JTextField();
		textField.setBounds(243, 38, 193, 41);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JPasswordField();
		textField_1.setDropMode(DropMode.INSERT);
		textField_1.setToolTipText("");
		textField_1.setBounds(243, 130, 193, 41);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnSignIn = new JButton("SIGN IN");
		btnSignIn.setBackground(new Color(255, 255, 255));
		btnSignIn.setForeground(new Color(102, 51, 102));
		btnSignIn.setFont(new Font("Castellar", Font.BOLD, 23));
		btnSignIn.setBounds(115, 286, 167, 41);
		frame.getContentPane().add(btnSignIn);
		
		JButton btnNewButton_1 = new JButton("SIGN UP");
		btnNewButton_1.setForeground(new Color(102, 51, 102));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setFont(new Font("Castellar", Font.BOLD, 23));
		btnNewButton_1.setBounds(316, 286, 167, 41);
		frame.getContentPane().add(btnNewButton_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Renainder");
		chckbxNewCheckBox.setBounds(243, 214, 194, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
	}
}
