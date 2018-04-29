package com.votesapp;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Window.Type;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TimeskipControl extends JFrame {

	private JPanel contentPane;

	public TimeskipControl() throws Exception {
    	setResizable(false);
    	initialize();
    }
	
	
	public void initialize() throws Exception {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Namai\\Documents\\GitHub\\java-votes\\clock.png"));
		setType(Type.POPUP);
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 300, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnPasirinkiteKiekLaiko = new JTextPane();
		txtpnPasirinkiteKiekLaiko.setBackground(Color.LIGHT_GRAY);
		txtpnPasirinkiteKiekLaiko.setEditable(false);
		txtpnPasirinkiteKiekLaiko.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtpnPasirinkiteKiekLaiko.setText("Pasirinkite kiek laiko norite prid\u0117ti:");
		txtpnPasirinkiteKiekLaiko.setBounds(10, 21, 233, 29);
		contentPane.add(txtpnPasirinkiteKiekLaiko);
		
		JTextPane txtpnAddHour = new JTextPane();
		txtpnAddHour.setBackground(Color.LIGHT_GRAY);
		txtpnAddHour.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtpnAddHour.setEditable(false);
		txtpnAddHour.setText("Prid\u0117ti valand\u0105");
		txtpnAddHour.setBounds(10, 80, 95, 20);
		contentPane.add(txtpnAddHour);
		
		JTextPane txtpnAddWeek = new JTextPane();
		txtpnAddWeek.setBackground(Color.LIGHT_GRAY);
		txtpnAddWeek.setEditable(false);
		txtpnAddWeek.setText("Prid\u0117ti savait\u0119");
		txtpnAddWeek.setBounds(10, 120, 95, 20);
		contentPane.add(txtpnAddWeek);
		
		JTextPane txtpnAddmonth = new JTextPane();
		txtpnAddmonth.setEditable(false);
		txtpnAddmonth.setBackground(Color.LIGHT_GRAY);
		txtpnAddmonth.setText("Prid\u0117ti m\u0117nes\u012F");
		txtpnAddmonth.setBounds(10, 160, 95, 20);
		contentPane.add(txtpnAddmonth);
		
		JTextPane txtpnAddyear = new JTextPane();
		txtpnAddyear.setBackground(Color.LIGHT_GRAY);
		txtpnAddyear.setEditable(false);
		txtpnAddyear.setText("Prid\u0117ti metus");
		txtpnAddyear.setBounds(10, 200, 95, 20);
		contentPane.add(txtpnAddyear);
		
		JButton btnHourbutton = new JButton("+1 hour");
		btnHourbutton.setBackground(Color.GRAY);
		btnHourbutton.setBounds(195, 80, 89, 23);
		contentPane.add(btnHourbutton);
		
		JButton btnWeekbutton = new JButton("+1 week");
		btnWeekbutton.setBackground(Color.GRAY);
		btnWeekbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnWeekbutton.setBounds(195, 120, 89, 23);
		contentPane.add(btnWeekbutton);
		
		JButton btnAddmonth = new JButton("+1 month");
		btnAddmonth.setBackground(Color.GRAY);
		btnAddmonth.setBounds(195, 160, 89, 23);
		contentPane.add(btnAddmonth);
		
		JButton btnAddyear = new JButton("+1 year");
		btnAddyear.setBackground(Color.GRAY);
		btnAddyear.setBounds(195, 200, 89, 23);
		contentPane.add(btnAddyear);
	}
	
	public void prepareAndShow() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TimeskipControl frame = new TimeskipControl();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}
}
