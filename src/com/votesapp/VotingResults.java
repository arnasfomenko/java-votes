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
import java.io.IOException;

import javax.swing.JFormattedTextField;
import javax.swing.JButton;

public class VotingResults extends JFrame {

	private JPanel contentPane;
	
	public VotingResults() throws IOException {
		initialize();
	}

	public void initialize() throws IOException {
		ReadFile reader = new ReadFile();
        String info2 = reader.reader("klausimai.txt");
        String[] klausimai = info2.split("/");
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
		txtpnApklausa.setText(klausimai[0]);
		txtpnApklausa.setBounds(10, 95, 255, 30);
		contentPane.add(txtpnApklausa);
		
		JTextPane txtpnApklausa_1 = new JTextPane();
		txtpnApklausa_1.setText(klausimai[5]);
		txtpnApklausa_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnApklausa_1.setEditable(false);
		txtpnApklausa_1.setBackground(Color.LIGHT_GRAY);
		txtpnApklausa_1.setBounds(10, 195, 255, 30);
		contentPane.add(txtpnApklausa_1);
		
		JTextPane txtpnApklausa_2 = new JTextPane();
		txtpnApklausa_2.setText(klausimai[10]);
		txtpnApklausa_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnApklausa_2.setEditable(false);
		txtpnApklausa_2.setBackground(Color.LIGHT_GRAY);
		txtpnApklausa_2.setBounds(10, 295, 255, 30);
		contentPane.add(txtpnApklausa_2);
		
		JFormattedTextField frmtdxtfldResultfield = new JFormattedTextField();
		frmtdxtfldResultfield.setFont(new Font("Tahoma", Font.PLAIN, 12));
		frmtdxtfldResultfield.setBackground(Color.LIGHT_GRAY);
		frmtdxtfldResultfield.setEditable(false);
		String[] result = this.countFirstVotes();
		frmtdxtfldResultfield.setText("Pirma vieta : " + result[1] + " su " + result[0] + " balsu!");
		frmtdxtfldResultfield.setBounds(310, 75, 300, 50);
		contentPane.add(frmtdxtfldResultfield);
		
		JFormattedTextField frmtdxtfldResultfield2 = new JFormattedTextField();
		frmtdxtfldResultfield2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		frmtdxtfldResultfield2.setEditable(false);
		frmtdxtfldResultfield2.setBackground(Color.LIGHT_GRAY);
		frmtdxtfldResultfield2.setBounds(310, 175, 300, 50);
		String[] result2 = this.countSecondVotes();
		frmtdxtfldResultfield2.setText("Pirma vieta : " + result2[1] + " su " + result2[0] + " balsu!");
		contentPane.add(frmtdxtfldResultfield2);
		
		JFormattedTextField frmtdxtfldResultfield3 = new JFormattedTextField();
		frmtdxtfldResultfield3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		frmtdxtfldResultfield3.setEditable(false);
		frmtdxtfldResultfield3.setBackground(Color.LIGHT_GRAY);
		frmtdxtfldResultfield3.setBounds(310, 275, 300, 50);
		String[] result3 = this.countThirdVotes();
		frmtdxtfldResultfield3.setText("Pirma vieta : " + result3[1] + " su " + result3[0] + " balsu!");
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
	
	public String[] countFirstVotes() throws IOException {
		
		ReadFile reader = new ReadFile();
		String info = reader.reader("balsai.txt");
		String[] balsai = info.split("/");
        String info2 = reader.reader("klausimai.txt");
        String[] klausimai = info2.split("/");
		
		int firstOption = 0;
		int secondOption = 0;
		int thirdOption = 0;
		
		for(int i = 0; i < balsai.length; i++) {
			if(balsai[i].equals(klausimai[0])) {
				if(balsai[i+1].equals(klausimai[1])) {
					firstOption += 1;
				} else if(balsai[i+1].equals(klausimai[2])) {
					secondOption += 1;
				} else if(balsai[i+1].equals(klausimai[3])) {
					thirdOption += 1;
				}
			}
		
		}
		
		String[] result = new String[10];
		
		if(firstOption > secondOption & firstOption > thirdOption) {
			String winner = Integer.toString(firstOption);
			result[0] = winner;
			result[1] = klausimai[1];
		} else if (secondOption > firstOption & secondOption > thirdOption) {
			String winner = Integer.toString(secondOption);
			result[0] = winner;
			result[1] = klausimai[2];
		} else if (thirdOption > firstOption & thirdOption > secondOption) {
			String winner = Integer.toString(thirdOption);
			result[0] = winner;
			result[1] = klausimai[3];
		}
		
		return result;
		
	}
	
	public String[] countSecondVotes() throws IOException {
		
		ReadFile reader = new ReadFile();
		String info = reader.reader("balsai.txt");
		String[] balsai = info.split("/");
        String info2 = reader.reader("klausimai.txt");
        String[] klausimai = info2.split("/");
		
		int firstOption = 0;
		int secondOption = 0;
		int thirdOption = 0;
		
		for(int i = 0; i < balsai.length; i++) {
			if(balsai[i].equals(klausimai[5])) {
				if(balsai[i+1].equals(klausimai[6])) {
					firstOption += 1;
				} else if(balsai[i+1].equals(klausimai[7])) {
					secondOption += 1;
				} else if(balsai[i+1].equals(klausimai[8])) {
					thirdOption += 1;
				}
			}
		
		}
		
		String[] result = new String[10];
		
		if(firstOption > secondOption & firstOption > thirdOption) {
			String winner = Integer.toString(firstOption);
			result[0] = winner;
			result[1] = klausimai[6];
		} else if (secondOption > firstOption & secondOption > thirdOption) {
			String winner = Integer.toString(secondOption);
			result[0] = winner;
			result[1] = klausimai[7];
		} else if (thirdOption > firstOption & thirdOption > secondOption) {
			String winner = Integer.toString(thirdOption);
			result[0] = winner;
			result[1] = klausimai[8];
		}
		
		return result;
		
	}
	
	public String[] countThirdVotes() throws IOException {
		
		ReadFile reader = new ReadFile();
		String info = reader.reader("balsai.txt");
		String[] balsai = info.split("/");
        String info2 = reader.reader("klausimai.txt");
        String[] klausimai = info2.split("/");
		
		int firstOption = 0;
		int secondOption = 0;
		int thirdOption = 0;
		
		for(int i = 0; i < balsai.length; i++) {
			if(balsai[i].equals(klausimai[10])) {
				if(balsai[i+1].equals(klausimai[11])) {
					firstOption += 1;
				} else if(balsai[i+1].equals(klausimai[12])) {
					secondOption += 1;
				} else if(balsai[i+1].equals(klausimai[13])) {
					thirdOption += 1;
				}
			}
		
		}
		
		String[] result = new String[10];
		
		if(firstOption > secondOption & firstOption > thirdOption) {
			String winner = Integer.toString(firstOption);
			result[0] = winner;
			result[1] = klausimai[11];
		} else if (secondOption > firstOption & secondOption > thirdOption) {
			String winner = Integer.toString(secondOption);
			result[0] = winner;
			result[1] = klausimai[12];
		} else if (thirdOption > firstOption & thirdOption > secondOption) {
			String winner = Integer.toString(thirdOption);
			result[0] = winner;
			result[1] = klausimai[13];
		}
		
		return result;
		
	}
	
	
}
