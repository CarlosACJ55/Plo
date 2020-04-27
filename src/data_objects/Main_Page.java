package data_objects;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import java.awt.Panel;
import java.awt.List;
import java.awt.TextField;
import java.awt.TextArea;
import java.awt.Label;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.ScrollPane;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Scrollbar;
import java.awt.Choice;
import javax.swing.JMenuBar;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

public class Main_Page {

	private static JFrame frmMarkhamQuiznet;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_Page window = new Main_Page();
					frmMarkhamQuiznet.setUndecorated(true);
					window.frmMarkhamQuiznet.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	/**
	 * Create the application.
	 */
	public Main_Page() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMarkhamQuiznet = new JFrame();
		frmMarkhamQuiznet.setBackground(Color.LIGHT_GRAY);
		frmMarkhamQuiznet.setFont(new Font("Dialog", Font.ITALIC, 12));
		frmMarkhamQuiznet.setTitle("Markham Quiznet");
		frmMarkhamQuiznet.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\tlali\\Downloads\\Markham_College_Shield.png"));
		frmMarkhamQuiznet.getContentPane().setBackground(Color.WHITE);
		frmMarkhamQuiznet.setBounds(100, 100, 490, 429);
		frmMarkhamQuiznet.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMarkhamQuiznet.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tabbedPane.setBackground(new Color(255, 255, 255));
		tabbedPane.setBounds(120, 11, 344, 368);
		frmMarkhamQuiznet.getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tabbedPane.addTab("List", null, panel, null);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tabbedPane.addTab("Add", null, panel_1, null);
		panel_1.setLayout(null);
		
		JButton btn_Students = new JButton("Students");
		btn_Students.setFont(new Font("Times New Roman", Font.ITALIC, 11));
		btn_Students.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmMarkhamQuiznet.dispose();
				Students_btn btn = new Students_btn();
				btn.Students_btn();
				 
			}
		});
		btn_Students.setBounds(21, 40, 89, 23);
		frmMarkhamQuiznet.getContentPane().add(btn_Students);
		
		JButton btnQuizzes = new JButton("Quizzes");
		btnQuizzes.setFont(new Font("Times New Roman", Font.ITALIC, 11));
		btnQuizzes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
			}
		});
		btnQuizzes.setBounds(21, 74, 89, 23);
		frmMarkhamQuiznet.getContentPane().add(btnQuizzes);
		
		JButton btnRevision = new JButton("Revision");
		btnRevision.setFont(new Font("Times New Roman", Font.ITALIC, 11));
		btnRevision.setBounds(21, 142, 89, 23);
		frmMarkhamQuiznet.getContentPane().add(btnRevision);
		
		JButton btnMenu = new JButton("Menu");
		btnMenu.setFont(new Font("Times New Roman", Font.ITALIC, 11));
		btnMenu.setBounds(21, 277, 89, 23);
		frmMarkhamQuiznet.getContentPane().add(btnMenu);
		
		JButton btnHome = new JButton("Home");
		btnHome.setFont(new Font("Times New Roman", Font.ITALIC, 11));
		btnHome.setBounds(21, 322, 89, 23);
		frmMarkhamQuiznet.getContentPane().add(btnHome);
		
		JButton btnMarks = new JButton("Marks");
		btnMarks.setFont(new Font("Times New Roman", Font.ITALIC, 11));
		btnMarks.setBounds(21, 108, 89, 23);
		frmMarkhamQuiznet.getContentPane().add(btnMarks);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(10, 11, 110, 368);
		frmMarkhamQuiznet.getContentPane().add(panel_2);
		
		frmMarkhamQuiznet.setVisible(true);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
