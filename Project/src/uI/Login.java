package uI;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import users.User;

public class Login {
	
	public Login(){
		JFrame frame = new JFrame("Login");
		ImageIcon image = new ImageIcon("D:\\Java Codes\\Project\\Spotify.jpg");
		frame.setIconImage(image.getImage());
	    JPasswordField password = new JPasswordField();
	    password.setBounds(100, 100, 140, 30);
	    password.setToolTipText("Enter your Password");
	    JLabel passLable = new JLabel("Password:");
	    passLable.setBounds(10,100, 80,30);
	    JTextField email = new JTextField();
	    email.setBounds(100, 50, 140, 30);
	    email.setToolTipText("Enter your Email");
	    JLabel emailLabel = new JLabel("Email:");
	    emailLabel.setBounds(20, 50, 80, 30);
	    JButton button = new JButton("Login");
	    button.setBounds(100, 200, 100, 30);
	    button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				User newUser = new User(email.getText(), password.getText());
				System.out.println(newUser.toString());
				
			}
		});
	    
	    frame.add(email);
	    frame.add(emailLabel);
	    frame.add(password);
	    frame.add(passLable);
	    frame.add(button);
	    frame.setSize(300,300);
	    frame.setLayout(null);
	    frame.setVisible(true);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
