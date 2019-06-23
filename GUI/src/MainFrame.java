import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.Toolkit;
import javax.swing.JScrollBar;
import javax.swing.JToggleButton;
import javax.swing.JSlider;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtSongSearch;
	private String filePath;
	private Play play;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Java Codes\\Project\\Spotify.jpg"));
		setTitle("Jpotify");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1148, 658);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSearch = new JLabel("Search");
		lblSearch.setBounds(277, 4, 73, 20);
		lblSearch.setIcon(new ImageIcon("D:\\Java Codes\\Project\\search.png"));
		contentPane.add(lblSearch);
		
		txtSongSearch = new JTextField();
		txtSongSearch.setText("song search");
		txtSongSearch.setBounds(343, 5, 109, 19);
		contentPane.add(txtSongSearch);
		txtSongSearch.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(459, 4, 85, 21);
		contentPane.add(btnSearch);
		
		JLabel lblFreiendActivity = new JLabel("Freind Activity");
		lblFreiendActivity.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblFreiendActivity.setBounds(994, 45, 128, 28);
		contentPane.add(lblFreiendActivity);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(3, 34, 1130, 5);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(982, 34, 5, 500);
		contentPane.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(150, 34, 5, 500);
		contentPane.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(3, 534, 1130, 5);
		contentPane.add(separator_3);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu addMenu = new JMenu("New");
		menuBar.add(addMenu);
		
		JMenuItem addSong = new JMenuItem("Add Song");
		addSong.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser();
				FileNameExtensionFilter filter = new FileNameExtensionFilter("WAV Audio", "wav");
				fileChooser.setFileFilter(filter);
				int i = fileChooser.showOpenDialog(MainFrame.this);
				if(i == JFileChooser.APPROVE_OPTION)
					filePath = fileChooser.getSelectedFile().getPath();
			}
		});
		addMenu.add(addSong);
		
		JMenuItem addPlaylist = new JMenuItem("Add Playlist");
		addMenu.add(addPlaylist);
		addPlaylist.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new AddPlaylist();
			}
		});
		
		JMenu userMenu = new JMenu("User Info");
		menuBar.add(userMenu);
		
		JMenuItem findFriend = new JMenuItem("Find Friend");
		findFriend.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new FindFriend();
				
			}
		});
		userMenu.add(findFriend);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(140, 34, 10, 500);
		contentPane.add(scrollBar);
		
		JButton btnHome = new JButton("Home");
		btnHome.setBounds(26, 51, 85, 21);
		contentPane.add(btnHome);
		
		JButton btnLibrary = new JButton("Library");
		btnLibrary.setBounds(26, 82, 85, 21);
		contentPane.add(btnLibrary);
		
		JButton btnPlay = new JButton("Album");
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPlay.setBounds(26, 113, 85, 21);
		contentPane.add(btnPlay);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("D:\\Java Codes\\Practice\\images\\Play.gif"));
		btnNewButton.setBounds(534, 539, 26, 27);
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if((play == null) || !(play.getFilePath().equals(filePath)))
					play = new Play(filePath);
				else
					play.continueSong();
			}
		});
		contentPane.add(btnNewButton);
		
		JSlider slider = new JSlider();
		slider.setValue(0);
		slider.setBackground(Color.PINK);
		slider.setBounds(405, 569, 289, 22);
		contentPane.add(slider);
		
		JSlider slider_1 = new JSlider();
		slider_1.setBounds(1037, 566, 85, 15);
		contentPane.add(slider_1);
		
		JToggleButton tglbtnPlaylist = new JToggleButton("Playlist");
		tglbtnPlaylist.setBounds(26, 144, 85, 21);
		contentPane.add(tglbtnPlaylist);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon("D:\\Java Codes\\Practice\\images\\Pause.png"));
		button.setBounds(560, 539, 27, 26);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				play.stopSong();
			}
		});
		contentPane.add(button);
	}
}
