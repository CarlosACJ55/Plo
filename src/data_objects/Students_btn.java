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

public class Students_btn {

	private JFrame frmMarkhamQuiznet;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	
	public static void Students_btn() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Students_btn window = new Students_btn();
					window.frmMarkhamQuiznet.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	/**
	 * Create the application.
	 */
	public Students_btn() {
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
		tabbedPane.setBackground(Color.LIGHT_GRAY);
		tabbedPane.setBounds(120, 11, 344, 368);
		frmMarkhamQuiznet.getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tabbedPane.addTab("List", null, panel, null);
		panel.setLayout(null);
		
		Label label_2 = new Label("Name:");
		label_2.setBounds(8, 135, 67, 22);
		panel.add(label_2);
		
		TextField textField_3 = new TextField();
		textField_3.setBounds(73, 135, 78, 22);
		panel.add(textField_3);
		
		Canvas canvas_1 = new Canvas();
		canvas_1.setBackground(Color.WHITE);
		canvas_1.setBounds(20, 10, 131, 85);
		panel.add(canvas_1);
		
		JList list = new JList();
		list.setBounds(166, 10, 159, 296);
		panel.add(list);
		
		Label label_1_2 = new Label("Surname:");
		label_1_2.setBounds(8, 175, 67, 22);
		panel.add(label_1_2);
		
		Label label_1_1_3 = new Label("Password:");
		label_1_1_3.setBounds(8, 213, 67, 22);
		panel.add(label_1_1_3);
		
		TextField textField_3_1 = new TextField();
		textField_3_1.setBounds(73, 175, 78, 22);
		panel.add(textField_3_1);
		
		TextField textField_3_1_1 = new TextField();
		textField_3_1_1.setBounds(73, 213, 78, 22);
		panel.add(textField_3_1_1);
		
		Label label_1_1_1_1 = new Label("Code No:");
		label_1_1_1_1.setBounds(8, 246, 67, 22);
		panel.add(label_1_1_1_1);
		
		Label label_1_1_2_1 = new Label("DoB:");
		label_1_1_2_1.setBounds(8, 284, 67, 22);
		panel.add(label_1_1_2_1);
		
		TextField textField_3_1_1_1 = new TextField();
		textField_3_1_1_1.setBounds(73, 246, 78, 22);
		panel.add(textField_3_1_1_1);
		
		TextField textField_3_1_1_2 = new TextField();
		textField_3_1_1_2.setBounds(73, 284, 78, 22);
		panel.add(textField_3_1_1_2);
		
		Scrollbar scrollbar_1 = new Scrollbar();
		scrollbar_1.setBounds(308, 10, 17, 296);
		panel.add(scrollbar_1);
		
		JButton btnNewButton_1 = new JButton("Update");
		btnNewButton_1.setBounds(51, 101, 67, 16);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("delete");
		btnNewButton_2.setBounds(166, 312, 70, 20);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("add");
		btnNewButton_2_1.setBounds(255, 312, 70, 20);
		panel.add(btnNewButton_2_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tabbedPane.addTab("Add", null, panel_1, null);
		panel_1.setLayout(null);
		
		TextField textField = new TextField();
		textField.setBounds(78, 10, 82, 22);
		panel_1.add(textField);
		
		Label label = new Label("Name:");
		label.setBounds(10, 10, 62, 22);
		panel_1.add(label);
		
		Canvas canvas = new Canvas();
		canvas.setBackground(Color.WHITE);
		canvas.setBounds(185, 10, 117, 107);
		panel_1.add(canvas);
		
		TextField textField_1 = new TextField();
		textField_1.setBounds(78, 58, 82, 22);
		panel_1.add(textField_1);
		
		TextField textField_2 = new TextField();
		textField_2.setBounds(78, 108, 82, 22);
		panel_1.add(textField_2);
		
		Label label_1 = new Label("Surname:");
		label_1.setBounds(10, 58, 62, 22);
		panel_1.add(label_1);
		
		Label label_1_1 = new Label("Password:");
		label_1_1.setBounds(10, 108, 62, 22);
		panel_1.add(label_1_1);
		
		TextField textField_2_1 = new TextField();
		textField_2_1.setBounds(78, 154, 82, 22);
		panel_1.add(textField_2_1);
		
		TextField textField_2_2 = new TextField();
		textField_2_2.setBounds(78, 203, 82, 22);
		panel_1.add(textField_2_2);
		
		Label label_1_1_1 = new Label("Code No:");
		label_1_1_1.setBounds(10, 154, 62, 22);
		panel_1.add(label_1_1_1);
		
		Label label_1_1_2 = new Label("DoB:");
		label_1_1_2.setBounds(10, 203, 62, 22);
		panel_1.add(label_1_1_2);
		
		Button button = new Button("Select");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(210, 134, 70, 22);
		panel_1.add(button);
		
		Scrollbar scrollbar = new Scrollbar();
		scrollbar.setBounds(308, 10, 17, 315);
		panel_1.add(scrollbar);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.setBounds(207, 302, 82, 23);
		panel_1.add(btnNewButton);
		
		JButton btn_Students = new JButton("Students");
		btn_Students.setFont(new Font("Times New Roman", Font.ITALIC, 11));
		btn_Students.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_Students.setBounds(21, 40, 89, 23);
		frmMarkhamQuiznet.getContentPane().add(btn_Students);
		
		JButton btnQuizzes = new JButton("Quizzes");
		btnQuizzes.setFont(new Font("Times New Roman", Font.ITALIC, 11));
		btnQuizzes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				frmMarkhamQuiznet.dispose();
				Quizzes_btn btn = new Quizzes_btn();
				btn.Quizzes_btn();
				
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
