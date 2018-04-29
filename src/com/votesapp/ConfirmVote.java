package com.votesapp;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

public class ConfirmVote extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfirmVote frame = new ConfirmVote();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ConfirmVote() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 200);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnveskitSavoVard = new JTextPane();
		txtpnveskitSavoVard.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtpnveskitSavoVard.setBackground(Color.LIGHT_GRAY);
		txtpnveskitSavoVard.setEditable(false);
		txtpnveskitSavoVard.setText("\u012Eveskite savo vard\u0105 ir pavard\u0119");
		txtpnveskitSavoVard.setBounds(10, 0, 261, 44);
		contentPane.add(txtpnveskitSavoVard);
		
		textField = new JTextField();
		textField.setToolTipText("Vardas, pavard\u0117");
		textField.setBounds(10, 85, 261, 31);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Balsuoti");
		btnNewButton.setBounds(305, 89, 89, 23);
		contentPane.add(btnNewButton);
	}
}
