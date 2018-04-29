package com.votesapp;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFormattedTextField;
import javax.swing.JButton;

public class VotingResults extends JFrame {

	private JPanel contentPane;
	
	public VotingResults() {
		initialize();
	}

	public void initialize() {
		setBackground(Color.WHITE);
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 640, 480);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnResults = new JTextPane();
		txtpnResults.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnResults.setEditable(false);
		txtpnResults.setBackground(Color.LIGHT_GRAY);
		txtpnResults.setText("Apklaus\u0173 rezultatai");
		txtpnResults.setBounds(10, 11, 124, 30);
		contentPane.add(txtpnResults);
		
		JTextPane txtpnApklausa = new JTextPane();
		txtpnApklausa.setBackground(Color.LIGHT_GRAY);
		txtpnApklausa.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnApklausa.setEditable(false);
		txtpnApklausa.setText("Apklausa1");
		txtpnApklausa.setBounds(10, 95, 255, 30);
		contentPane.add(txtpnApklausa);
		
		JTextPane txtpnApklausa_1 = new JTextPane();
		txtpnApklausa_1.setText("Apklausa2");
		txtpnApklausa_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnApklausa_1.setEditable(false);
		txtpnApklausa_1.setBackground(Color.LIGHT_GRAY);
		txtpnApklausa_1.setBounds(10, 195, 255, 30);
		contentPane.add(txtpnApklausa_1);
		
		JTextPane txtpnApklausa_2 = new JTextPane();
		txtpnApklausa_2.setText("Apklausa3");
		txtpnApklausa_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnApklausa_2.setEditable(false);
		txtpnApklausa_2.setBackground(Color.LIGHT_GRAY);
		txtpnApklausa_2.setBounds(10, 295, 255, 30);
		contentPane.add(txtpnApklausa_2);
		
		JFormattedTextField frmtdxtfldResultfield = new JFormattedTextField();
		frmtdxtfldResultfield.setFont(new Font("Tahoma", Font.PLAIN, 12));
		frmtdxtfldResultfield.setBackground(Color.LIGHT_GRAY);
		frmtdxtfldResultfield.setEditable(false);
		frmtdxtfldResultfield.setText("Pirma vieta : ---, Antra vieta: ---, Tre\u010Dia vieta: --");
		frmtdxtfldResultfield.setBounds(310, 75, 300, 50);
		contentPane.add(frmtdxtfldResultfield);
		
		JFormattedTextField frmtdxtfldResultfield2 = new JFormattedTextField();
		frmtdxtfldResultfield2.setText("Pirma vieta : ---, Antra vieta: ---, Tre\u010Dia vieta: --");
		frmtdxtfldResultfield2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		frmtdxtfldResultfield2.setEditable(false);
		frmtdxtfldResultfield2.setBackground(Color.LIGHT_GRAY);
		frmtdxtfldResultfield2.setBounds(310, 175, 300, 50);
		contentPane.add(frmtdxtfldResultfield2);
		
		JFormattedTextField frmtdxtfldResultfield3 = new JFormattedTextField();
		frmtdxtfldResultfield3.setText("Pirma vieta : ---, Antra vieta: ---, Tre\u010Dia vieta: --");
		frmtdxtfldResultfield3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		frmtdxtfldResultfield3.setEditable(false);
		frmtdxtfldResultfield3.setBackground(Color.LIGHT_GRAY);
		frmtdxtfldResultfield3.setBounds(310, 275, 300, 50);
		contentPane.add(frmtdxtfldResultfield3);
		
		JButton btnNewButton = new JButton("Gr\u012F\u017Eti");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(0, 403, 131, 46);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
	}

	public void prepareAndShow() {
	EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				VotingResults frame = new VotingResults();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	});
	}
}
