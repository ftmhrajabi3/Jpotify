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

public class SignUp {

	public SignUp() {
		
		
		JLabel nameLabel = new JLabel("Name:");
		nameLabel.setBounds(20, 50, 80, 30);
	    JTextField name = new JTextField();
	    name.setBounds(100, 50, 140, 30);
		name.setToolTipText("Enter your name");
	    
	    JLabel emailLabel = new JLabel("Email:");
	    emailLabel.setBounds(20, 100, 80, 30);
	    JTextField email = new JTextField();
	    email.setBounds(100, 100, 140, 30);
	    email.setToolTipText("Enter your Email");
	    
	    
	    JLabel passLable = new JLabel("Password:");
	    passLable.setBounds(10,150, 80,30);
	    JPasswordField password = new JPasswordField();
	    password.setBounds(100, 150, 140, 30);
	    password.setToolTipText("Enter your Password");
	    
	    
	    JButton signUpButton = new JButton("Register");
	    signUpButton.setBounds(100, 260, 100, 30);
	    signUpButton.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				User newUser = new User(email.getText(), password.getText());
				System.out.println(newUser.toString());
				
			}
		});
	    
	    
	    JFrame frame = new JFrame("Login");
		ImageIcon image = new ImageIcon("D:\\Java Codes\\Project\\Spotify.jpg");
		frame.setIconImage(image.getImage());
		frame.setBounds(600, 200, 300, 400);
	    frame.setLayout(null);
		frame.add(nameLabel);
		frame.add(name);
		frame.add(emailLabel);
		frame.add(email);
	    frame.add(passLable);
	    frame.add(password);
	    frame.add(signUpButton);
	    frame.setVisible(true);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	}
}
