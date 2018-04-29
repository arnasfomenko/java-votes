package com.votesapp;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Window extends JFrame {

    /**
	 * 
	 */
	private JPanel contentPane;
    
    public Window() throws Exception {
    	setResizable(false);
    	initialize();
    }
    
    public void initialize() throws Exception {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 640, 480);
        contentPane = new JPanel();
        contentPane.setBackground(Color.LIGHT_GRAY);
        contentPane.setAutoscrolls(true);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JTextPane txtpnBalsavimai = new JTextPane();
        txtpnBalsavimai.setEditable(false);
        txtpnBalsavimai.setText("Balsavimai");
        txtpnBalsavimai.setBounds(0, 0, 138, 32);
        txtpnBalsavimai.setBackground(Color.LIGHT_GRAY);
        contentPane.add(txtpnBalsavimai);
        
        ReadFile readFile = new ReadFile();
        String info = readFile.reader("klausimai.txt");
        String[] klausimai = info.split("/");

        JTextPane txtpnApklausa = new JTextPane();
        txtpnApklausa.setEditable(false);
        txtpnApklausa.setText(klausimai[0]);
        txtpnApklausa.setBounds(0, 50, 300, 23);
        txtpnApklausa.setBackground(Color.LIGHT_GRAY);
        contentPane.add(txtpnApklausa);

        JTextPane txtpnApklausa_1 = new JTextPane();
        txtpnApklausa_1.setEditable(false);
        txtpnApklausa_1.setText(klausimai[5]);
        txtpnApklausa_1.setBounds(0, 92, 300, 32);
        txtpnApklausa_1.setBackground(Color.LIGHT_GRAY);
        contentPane.add(txtpnApklausa_1);

        JTextPane txtpnApklausa_2 = new JTextPane();
        txtpnApklausa_2.setEditable(false);
        txtpnApklausa_2.setText(klausimai[10]);
        txtpnApklausa_2.setBounds(0, 135, 300, 32);
        txtpnApklausa_2.setBackground(Color.LIGHT_GRAY);
        contentPane.add(txtpnApklausa_2);

        JButton btnEitiApklaus = new JButton("Eiti \u012F apklaus\u0105");
        btnEitiApklaus.setBounds(500, 50, 114, 23);
        btnEitiApklaus.setBackground(Color.GRAY);
        contentPane.add(btnEitiApklaus);
        btnEitiApklaus.addActionListener(new ActionListener() { 
      	  public void actionPerformed(ActionEvent e) { 
	      			QuestionWindow question;
					try {
						question = new QuestionWindow();
						question.prepareAndShow();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
      	  		}
      		} 
        );

        JButton btnEitiApklaus_1 = new JButton("Eiti \u012F apklaus\u0105");
        btnEitiApklaus_1.setBounds(500, 92, 114, 23);
        btnEitiApklaus_1.setBackground(Color.GRAY);
        contentPane.add(btnEitiApklaus_1);
        btnEitiApklaus_1.addActionListener(new ActionListener() { 
        	  public void actionPerformed(ActionEvent e) { 
  	      			QuestionWindow2 question2;
  					try {
  						question2 = new QuestionWindow2();
  						question2.prepareAndShow();
  					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
        	  		}
        		} 
          );

        JButton btnNewButton = new JButton("Eiti \u012F apklaus\u0105");
        btnNewButton.setBounds(500, 135, 114, 23);
        btnNewButton.setBackground(Color.GRAY);
        contentPane.add(btnNewButton);
        btnNewButton.addActionListener(new ActionListener() { 
      	  public void actionPerformed(ActionEvent e) { 
	      			QuestionWindow3 question3;
					try {
						question3 = new QuestionWindow3();
						question3.prepareAndShow();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
      	  		}
      		} 
        );

        JButton btnNewButton_2 = new JButton("Pasibaigusios apklausos");
        btnNewButton_2.setBounds(0, 405, 315, 46);
        contentPane.add(btnNewButton_2);

        JButton btnNewButton_3 = new JButton("Keisti sistemos laik\u0105");
        btnNewButton_3.setBounds(312, 405, 322, 46);
        contentPane.add(btnNewButton_3);
        
        Timestamp ts = new Timestamp();
        JTextPane txtpnTime = new JTextPane();
        txtpnTime.setEditable(false);
        txtpnTime.setText(" " + ts.showDate(0));
        txtpnTime.setBounds(369, 0, 255, 23);
        txtpnTime.setBackground(Color.LIGHT_GRAY);
        contentPane.add(txtpnTime);
    }
    
    public void prepareAndShow() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	Window frame = new Window();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public void dontShow() throws Exception {
    	Window frame = new Window();
        frame.setVisible(false);
    }
}