package data_objects;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.MatteBorder;
import java.awt.TextField;
import javax.swing.border.EtchedBorder;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import java.awt.Label;
import javax.swing.JMenuBar;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;

public class Login_Window {

	private static JFrame frame;
	private JTextField txtUser;
	private JTextField txtPassword;
	private JPanel panel;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		if (!new File(System.getProperty("user.home"), "MarkhamQuiznet").exists())
		{
			if (new File(System.getProperty("user.home"), "MarkhamQuiznet").mkdir())
				System.out.println("Resources directory created.");
			if (new File(System.getProperty("user.home"), "MarkhamQuiznet/Databases").mkdir())
				System.out.println("Databases directory created.");
			if (new File(System.getProperty("user.home"), "MarkhamQuiznet/Images").mkdir())
				System.out.println("Images directory created.");
			try
			{
				if (new File(System.getProperty("user.home") + "/MarkhamQuiznet/Databases/", "Student Database.txt").createNewFile())
					System.out.println("Student file created.");
				if (new File(System.getProperty("user.home") + "/MarkhamQuiznet/Databases/", "Teacher Database.txt").createNewFile())
					System.out.println("Teacher file created.");
				if (new File(System.getProperty("user.home") + "/MarkhamQuiznet/Databases/", "Quizzes Database.txt").createNewFile())
					System.out.println("Quizzes file created.");
				if (new File(System.getProperty("user.home") + "/MarkhamQuiznet/Databases/", "Marks Database.txt").createNewFile())
					System.out.println("Marks file created.");
				if (new File(System.getProperty("user.home") + "/MarkhamQuiznet/Databases/", "Revision Database.txt").createNewFile())
					System.out.println("Revision file created.");
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_Window window = new Login_Window();
					frame.setUndecorated(true);
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	/**
	 * Create the application.
	 */
	public Login_Window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\tlali\\Downloads\\Markham_College_Shield.png"));
		frame.setBounds(100, 100, 543, 391);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBackground(new Color(233, 150, 122));
		panel.setBounds(0, 0, 256, 391);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		
		
		txtUser = new JTextField();
		txtUser.setBounds(285, 105, 174, 26);
		frame.getContentPane().add(txtUser);
		txtUser.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setBounds(285, 179, 174, 26);
		frame.getContentPane().add(txtPassword);
		txtPassword.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Mongolian Baiti", Font.PLAIN, 11));
		btnLogin.setBackground(Color.WHITE);
		btnLogin.setBounds(320, 242, 105, 23);
		frame.getContentPane().add(btnLogin);
		
		JLabel lblNewLabel_1 = new JLabel("PASSWORD");
		lblNewLabel_1.setBounds(285, 154, 67, 14);
		frame.getContentPane().add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("DialogInput", Font.PLAIN, 11));
		
		JLabel lblNewLabel = new JLabel("USER");
		lblNewLabel.setBounds(285, 78, 28, 16);
		frame.getContentPane().add(lblNewLabel);
		lblNewLabel.setFont(new Font("DialogInput", Font.PLAIN, 11));
		
		JSeparator separator = new JSeparator();
		separator.setBounds(285, 205, 174, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(285, 131, 174, 26);
		frame.getContentPane().add(separator_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblNewLabel_1_1.setIcon(new ImageIcon(Login_Window.class.getResource("/pic/Webp.net-resizeimage (2).png")));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("DialogInput", Font.PLAIN, 11));
		lblNewLabel_1_1.setBounds(515, 0, 26, 25);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Login_Window window = new Login_Window();
				frame.setState(frame.NORMAL);
				
			}
			
		});
		lblNewLabel_1_1_1.setIcon(new ImageIcon(Login_Window.class.getResource("/pic/Webp.net-resizeimage.png")));
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1.setFont(new Font("DialogInput", Font.PLAIN, 11));
		lblNewLabel_1_1_1.setBounds(495, 0, 26, 25);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1_1.setIcon(new ImageIcon(Login_Window.class.getResource("/pic/Webp.net-resizeimage (1).png")));
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1.setFont(new Font("DialogInput", Font.PLAIN, 11));
		lblNewLabel_1_1_1_1.setBounds(475, 0, 26, 25);
		frame.getContentPane().add(lblNewLabel_1_1_1_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_1.setBounds(254, -11, 300, 36);
		frame.getContentPane().add(panel_1);
		btnLogin.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				
		Login_Process LG_Proc = new Login_Process();
			LG_Proc.initialize();
			int validation = Login_Process.find_user_and_password(txtUser.getText(),txtPassword.getText());
			if(validation != -1) {
					
				System.out.println("Access Granted");
				frame.setVisible(false);
				frame.dispose();
			
				Main_Page window = new Main_Page();
			
						
				}
				else {
					System.out.println("Error your username or password is wrong");
				}
			}
		});
	}


	protected void setState(int iconified) {
		// TODO Auto-generated method stub
		
	}
}
