package com.votesapp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Window extends JFrame {

    private JPanel contentPane;

    /**
     * Launch the application.
     * @throws Exception 
     */
    public static void main(String[] args) throws Exception {
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

        Timestamp timestamp = new Timestamp();
        timestamp.printTime();
        
        ReadFile readFile = new ReadFile();
        readFile.reader("klausimai.txt");
        
        StoreInfo storeInfo = new StoreInfo();
        storeInfo.writer("pavadinimas.txt","Informacija irasoma i faila");
    }

    /**
     * Create the frame.
     */
    public Window() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 640, 480);
        contentPane = new JPanel();
        contentPane.setBackground(Color.WHITE);
        contentPane.setAutoscrolls(true);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JTextPane txtpnBalsavimai = new JTextPane();
        txtpnBalsavimai.setEditable(false);
        txtpnBalsavimai.setText("Balsavimai");
        txtpnBalsavimai.setBounds(0, 0, 138, 32);
        contentPane.add(txtpnBalsavimai);

        JTextPane txtpnApklausa = new JTextPane();
        txtpnApklausa.setEditable(false);
        txtpnApklausa.setText("Apklausa 1");
        txtpnApklausa.setBounds(0, 50, 160, 23);
        contentPane.add(txtpnApklausa);

        JTextPane txtpnApklausa_1 = new JTextPane();
        txtpnApklausa_1.setEditable(false);
        txtpnApklausa_1.setText("Apklausa 2");
        txtpnApklausa_1.setBounds(0, 92, 160, 32);
        contentPane.add(txtpnApklausa_1);

        JTextPane txtpnApklausa_2 = new JTextPane();
        txtpnApklausa_2.setEditable(false);
        txtpnApklausa_2.setText("Apklausa 3");
        txtpnApklausa_2.setBounds(0, 135, 160, 32);
        contentPane.add(txtpnApklausa_2);

        JButton btnEitiApklaus = new JButton("Eiti \u012F apklaus\u0105");
        btnEitiApklaus.setBounds(170, 50, 114, 23);
        contentPane.add(btnEitiApklaus);

        JButton btnEitiApklaus_1 = new JButton("Eiti \u012F apklaus\u0105");
        btnEitiApklaus_1.setBounds(170, 92, 114, 23);
        contentPane.add(btnEitiApklaus_1);

        JButton btnNewButton = new JButton("Eiti \u012F apklaus\u0105");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            }
        });
        btnNewButton.setBounds(170, 135, 114, 23);
        contentPane.add(btnNewButton);

        JButton btnNewButton_1 = new JButton("Sukurti nauj\u0105 apklaus\u0105");
        btnNewButton_1.setBounds(0, 395, 148, 46);
        contentPane.add(btnNewButton_1);

        JButton btnNewButton_2 = new JButton("Pasibaigusios apklausos");
        btnNewButton_2.setBounds(147, 395, 148, 46);
        contentPane.add(btnNewButton_2);

        JButton btnNewButton_3 = new JButton("Keisti sistemos laik\u0105");
        btnNewButton_3.setBounds(294, 395, 125, 46);
        contentPane.add(btnNewButton_3);
    }
}