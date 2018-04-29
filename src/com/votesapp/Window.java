package com.votesapp;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JTextPane;
import javax.swing.JButton;

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
        txtpnApklausa.setText(klausimai[0] + "\nGalioja iki: " + klausimai[4]);
        txtpnApklausa.setBounds(0, 69, 300, 46);
        txtpnApklausa.setBackground(Color.LIGHT_GRAY);
        contentPane.add(txtpnApklausa);

        JTextPane txtpnApklausa_1 = new JTextPane();
        txtpnApklausa_1.setEditable(false);
        txtpnApklausa_1.setText(klausimai[5] + "\nGalioja iki: " + klausimai[9]);
        txtpnApklausa_1.setBounds(0, 126, 300, 46);
        txtpnApklausa_1.setBackground(Color.LIGHT_GRAY);
        contentPane.add(txtpnApklausa_1);

        JTextPane txtpnApklausa_2 = new JTextPane();
        txtpnApklausa_2.setEditable(false);
        txtpnApklausa_2.setText(klausimai[10]+ "\nGalioja iki: " + klausimai[14]);
        txtpnApklausa_2.setBounds(0, 183, 300, 46);
        txtpnApklausa_2.setBackground(Color.LIGHT_GRAY);
        contentPane.add(txtpnApklausa_2);

        JButton btnEitiApklaus = new JButton("Eiti \u012F apklaus\u0105");
        btnEitiApklaus.setBounds(500, 69, 114, 23);
        btnEitiApklaus.setBackground(Color.GRAY);
        contentPane.add(btnEitiApklaus);
        btnEitiApklaus.addActionListener(new ActionListener() { 
      	  public void actionPerformed(ActionEvent e) { 
	      			QuestionWindow question;
					try {
						question = new QuestionWindow();
						question.prepareAndShow();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
      	  		}
      		} 
        );

        JButton btnEitiApklaus_1 = new JButton("Eiti \u012F apklaus\u0105");
        btnEitiApklaus_1.setBounds(500, 126, 114, 23);
        btnEitiApklaus_1.setBackground(Color.GRAY);
        contentPane.add(btnEitiApklaus_1);
        btnEitiApklaus_1.addActionListener(new ActionListener() { 
        	  public void actionPerformed(ActionEvent e) { 
  	      			QuestionWindow2 question2;
  					try {
  						question2 = new QuestionWindow2();
  						question2.prepareAndShow();
  					} catch (Exception e1) {
						e1.printStackTrace();
					}
        	  		}
        		} 
          );

        JButton btnNewButton = new JButton("Eiti \u012F apklaus\u0105");
        btnNewButton.setBounds(500, 183, 114, 23);
        btnNewButton.setBackground(Color.GRAY);
        contentPane.add(btnNewButton);
        btnNewButton.addActionListener(new ActionListener() { 
      	  public void actionPerformed(ActionEvent e) { 
	      			QuestionWindow3 question3;
					try {
						question3 = new QuestionWindow3();
						question3.prepareAndShow();
					} catch (Exception e1) {
						e1.printStackTrace();
					}
      	  		}
      		} 
        );

        JButton btnNewButton_2 = new JButton("Apklaus\u0173 rezultatai");
        btnNewButton_2.setBounds(0, 405, 315, 46);
        contentPane.add(btnNewButton_2);

        JButton btnNewButton_3 = new JButton("Keisti sistemos laik\u0105");
        btnNewButton_3.setBounds(312, 405, 322, 46);
        contentPane.add(btnNewButton_3);
        btnNewButton_3.addActionListener(new ActionListener() { 
        	  public void actionPerformed(ActionEvent e) { 
        		  	TimeskipControl TsControl;
						try {
							TsControl = new TimeskipControl();
							TsControl.prepareAndShow();
						} catch (Exception e1) {
							e1.printStackTrace();
						}
        	  		}
        		} 
          );
        
        JTextPane txtpnTime = new JTextPane();
        txtpnTime.setEditable(false);
        Timer t = new Timer();
        t.schedule(new TimerTask() {
            @Override 
            public void run() {
            	Timestamp ts = new Timestamp();
            	Date generatedDate;
				try {
					generatedDate = (Date) ts.generateDate();
					txtpnTime.setText(" " + generatedDate);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
            }
        }, 0L, 1000L);
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
                    frame.addWindowListener(new java.awt.event.WindowAdapter() {
                        @Override
                        public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                            long numericTime = (long) 1525132800;
                    		Timestamp ts = new Timestamp();
                    		ts.writeTime(numericTime);
                        }
                    });
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public Date getGeneratedDate() throws IOException {
    	Timestamp ts = new Timestamp();
    	Date generatedDate = (Date) ts.generateDate();
		return generatedDate;
    }
    
}