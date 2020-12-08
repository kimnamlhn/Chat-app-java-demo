package vn.edu.hcmus.fit.chatapp;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.EventQueue;
import java.awt.event.WindowEvent;

public class Login {

    public static void main() {

        JFrame frame = new JFrame("App chat");

        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel panel = new JPanel();
        frame.add(panel);

        placeComponents(panel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {


        panel.setLayout(null);


        JLabel userLabel = new JLabel("User");

        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);


        JTextField userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);


        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);

        // button login
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(40, 80, 80, 25);
        panel.add(loginButton);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                EventQueue.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            ClientGUI frame = new ClientGUI();
                            frame.setVisible(true);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
                EventQueue.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            ManagerGUI frame = new ManagerGUI();
                            frame.setVisible(true);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        });

        // button register
        JButton registerButton = new JButton("Register");
        registerButton.setBounds(130, 80, 80, 25);
        panel.add(registerButton);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                //chua biet lam gi =))

            }



        });

    }

}