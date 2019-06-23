import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Toolkit;

public class AddPlaylist {

	private JFrame frmAddPlaylist;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					AddPlaylist window = new AddPlaylist();
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public AddPlaylist() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAddPlaylist = new JFrame();
		frmAddPlaylist.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Java Codes\\Project\\Spotify.jpg"));
		frmAddPlaylist.setTitle("Add PlayList");
		frmAddPlaylist.setBounds(100, 100, 413, 278);
		frmAddPlaylist.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmAddPlaylist.getContentPane().setLayout(null);
		frmAddPlaylist.setVisible(true);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblName.setBounds(67, 66, 50, 21);
		frmAddPlaylist.getContentPane().add(lblName);
		
		textField = new JTextField();
		textField.setBounds(149, 68, 130, 21);
		frmAddPlaylist.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnCreate = new JButton("Create");
		btnCreate.setBounds(146, 152, 85, 21);
		frmAddPlaylist.getContentPane().add(btnCreate);
	}
}
