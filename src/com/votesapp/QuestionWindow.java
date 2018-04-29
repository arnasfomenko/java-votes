package com.votesapp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.SystemColor;

public class QuestionWindow extends JFrame {

	private static final long serialVersionUID = 2666389299057740536L;
	private JPanel contentPane;

	public QuestionWindow() {
		setResizable(false);
		initialize();
	}

	/**
	 * Create the frame.
	 */
	public void initialize() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 480);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnGeriausiasPavadinimasGruopei = new JTextPane();
		txtpnGeriausiasPavadinimasGruopei.setEditable(false);
		txtpnGeriausiasPavadinimasGruopei.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtpnGeriausiasPavadinimasGruopei.setBackground(Color.LIGHT_GRAY);
		txtpnGeriausiasPavadinimasGruopei.setText("Geriausias pavadinimas grupei?");
		txtpnGeriausiasPavadinimasGruopei.setBounds(0, 0, 229, 26);
		contentPane.add(txtpnGeriausiasPavadinimasGruopei);
		
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textPane.setBackground(Color.LIGHT_GRAY);
		textPane.setEditable(false);
		textPane.setText("1.");
		textPane.setBounds(0, 53, 18, 20);
		contentPane.add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setText("2.");
		textPane_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textPane_1.setEditable(false);
		textPane_1.setBackground(Color.LIGHT_GRAY);
		textPane_1.setBounds(0, 84, 18, 20);
		contentPane.add(textPane_1);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setText("3.");
		textPane_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textPane_2.setEditable(false);
		textPane_2.setBackground(Color.LIGHT_GRAY);
		textPane_2.setBounds(0, 115, 18, 20);
		contentPane.add(textPane_2);
		
		JTextPane txtpnPirmasPasirinkimas = new JTextPane();
		txtpnPirmasPasirinkimas.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtpnPirmasPasirinkimas.setBackground(Color.LIGHT_GRAY);
		txtpnPirmasPasirinkimas.setText("Pirmas pasirinkimas");
		txtpnPirmasPasirinkimas.setEditable(false);
		txtpnPirmasPasirinkimas.setBounds(21, 53, 131, 26);
		contentPane.add(txtpnPirmasPasirinkimas);
		
		JTextPane txtpnAntrasPasirinkimas = new JTextPane();
		txtpnAntrasPasirinkimas.setText("Antras pasirinkimas");
		txtpnAntrasPasirinkimas.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtpnAntrasPasirinkimas.setEditable(false);
		txtpnAntrasPasirinkimas.setBackground(Color.LIGHT_GRAY);
		txtpnAntrasPasirinkimas.setBounds(21, 84, 131, 26);
		contentPane.add(txtpnAntrasPasirinkimas);
		
		JTextPane txtpnTreiasPasirinkimas = new JTextPane();
		txtpnTreiasPasirinkimas.setText("Tre\u010Dias pasirinkimas");
		txtpnTreiasPasirinkimas.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtpnTreiasPasirinkimas.setEditable(false);
		txtpnTreiasPasirinkimas.setBackground(Color.LIGHT_GRAY);
		txtpnTreiasPasirinkimas.setBounds(21, 115, 131, 26);
		contentPane.add(txtpnTreiasPasirinkimas);
		
		JButton btnNewButton = new JButton("Gr\u012F\u017Eti");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBackground(SystemColor.inactiveCaption);
		btnNewButton.setBounds(0, 403, 131, 46);
		contentPane.add(btnNewButton);
		
		JButton btnBalsuoti = new JButton("Balsuoti");
		btnBalsuoti.setBackground(Color.GRAY);
		btnBalsuoti.setBounds(535, 50, 89, 23);
		contentPane.add(btnBalsuoti);
		
		JButton button = new JButton("Balsuoti");
		button.setBackground(Color.GRAY);
		button.setBounds(535, 81, 89, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Balsuoti");
		button_1.setBackground(Color.GRAY);
		button_1.setBounds(535, 112, 89, 23);
		contentPane.add(button_1);
		
		JTextPane txtpnGaliojaIki = new JTextPane();
		txtpnGaliojaIki.setBackground(Color.LIGHT_GRAY);
		txtpnGaliojaIki.setEditable(false);
		txtpnGaliojaIki.setText("Balsuoti galima iki:");
		txtpnGaliojaIki.setBounds(21, 205, 193, 26);
		contentPane.add(txtpnGaliojaIki);
	}
	
	public void prepareAndShow() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuestionWindow frame = new QuestionWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
}
