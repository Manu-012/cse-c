package cse_project1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;

public class reg {

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					reg window = new reg();
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
	public reg() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registration");
		lblNewLabel.setBounds(178, 11, 67, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel fn = new JLabel("Full Name");
		fn.setBounds(10, 50, 58, 14);
		frame.getContentPane().add(fn);
		
		t1 = new JTextField();
		t1.setBounds(94, 47, 86, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JRadioButton r1 = new JRadioButton("Male");
		r1.setBounds(73, 82, 58, 23);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("Female");
		r2.setBounds(140, 82, 67, 23);
		frame.getContentPane().add(r2);
		
		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"java", "python", "c", "c++"}));
		c1.setBounds(94, 162, 79, 22);
		frame.getContentPane().add(c1);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String fn=t1.getText();
				String pn=t2.getText();
				String e=t3.getText();
				
				String i=(String) c1.getSelectedItem();
				if(r1.isSelected())
				{
					JOptionPane.showMessageDialog(btnNewButton,"selected:Male");
					
				}
				else if(r2.isSelected())
				{
					JOptionPane.showMessageDialog(btnNewButton,"selected:Female");
				}
				
				JOptionPane.showMessageDialog(btnNewButton,"selected: "+i);
			  
			}
		});
		btnNewButton.setBounds(156, 227, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("Gender");
		lblNewLabel_3.setBounds(10, 86, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		
		
		JLabel pn = new JLabel("PhNo");
		pn.setBounds(10, 127, 46, 14);
		frame.getContentPane().add(pn);
		
		t2 = new JTextField();
		t2.setBounds(94, 124, 86, 20);
		frame.getContentPane().add(t2);
		t2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Fav Prgm");
		lblNewLabel_4.setBounds(10, 166, 58, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel e = new JLabel("Email");
		e.setBounds(10, 201, 46, 14);
		frame.getContentPane().add(e);
		
		t3 = new JTextField();
		t3.setBounds(94, 196, 86, 20);
		frame.getContentPane().add(t3);
		t3.setColumns(10);
		
		
	}
}
