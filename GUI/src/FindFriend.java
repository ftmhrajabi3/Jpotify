import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JScrollBar;

public class FindFriend {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					FindFriend window = new FindFriend();
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public FindFriend() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Find Friend");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Java Codes\\Project\\Spotify.jpg"));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(330, 232, 85, 21);
		frame.getContentPane().add(btnAdd);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(419, 10, 17, 250);
		frame.getContentPane().add(scrollBar);
		frame.setVisible(true);
	}
}
