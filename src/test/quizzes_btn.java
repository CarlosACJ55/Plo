package test;

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
import java.io.File;
import java.util.Vector;
import java.awt.event.ActionEvent;
		import java.awt.Scrollbar;
		import java.awt.Choice;
		import javax.swing.JMenuBar;
		import javax.swing.JComboBox;
		import javax.swing.JList;
		import javax.swing.JTable;
		import javax.swing.AbstractAction;
		import javax.swing.Action;
		import javax.swing.border.LineBorder;
		import javax.swing.JLabel;
		import javax.swing.JInternalFrame;
		import javax.swing.JTextArea;
		import javax.swing.border.SoftBevelBorder;
		import javax.swing.border.BevelBorder;
		import javax.swing.JScrollPane;
		import javax.swing.ScrollPaneConstants;
		import javax.swing.ListSelectionModel;
		import javax.swing.AbstractListModel;
		
public class quizzes_btn<Quizzes_btn> {

			private static File filestudent = new File(System.getProperty("user.home") + "/MarkhamQuiznet/Databases/","Quizzes Database.txt");
			private JFrame frmMarkhamQuiznet;
			private final Action action = new SwingAction();
		
		
			public quizzes_btn() {
				initialize();
			}

		
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
				tabbedPane.setBounds(120, 11, 344, 368);
				tabbedPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
				tabbedPane.setBackground(Color.LIGHT_GRAY);
				frmMarkhamQuiznet.getContentPane().add(tabbedPane);
				
				JPanel panel = new JPanel();
				panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
				tabbedPane.addTab("List", null, panel, null);
				panel.setLayout(null);
				
				Label label_2 = new Label("Name:");
				label_2.setFont(new Font("Dialog", Font.PLAIN, 11));
				label_2.setBounds(10, 23, 34, 22);
				panel.add(label_2);
				
				Label label_2_1 = new Label("Date Added:");
				label_2_1.setFont(new Font("Dialog", Font.PLAIN, 11));
				label_2_1.setBounds(10, 64, 67, 22);
				panel.add(label_2_1);
				
				Label label_2_2 = new Label("Marks:");
				label_2_2.setFont(new Font("Dialog", Font.PLAIN, 11));
				label_2_2.setBounds(10, 104, 67, 22);
				panel.add(label_2_2);
				
				TextField textField_3 = new TextField();
				textField_3.setBounds(86, 23, 78, 22);
				panel.add(textField_3);
				
				TextField textField_3_1 = new TextField();
				textField_3_1.setBounds(86, 64, 78, 22);
				panel.add(textField_3_1);
				
				TextField textField_3_2 = new TextField();
				textField_3_2.setBounds(86, 104, 78, 22);
				panel.add(textField_3_2);
				
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
				scrollPane.setBounds(170, 11, 155, 314);
				panel.add(scrollPane);
				
				JList list = new JList();
				list.setModel(new AbstractListModel() {
					String[] values = new String[] {"Acids, Bases, and pH. ", "Atomic Structure", "Electrochemistry", "Units and Measurement. ", "Thermochemistry", "Chemical Bonding", "Periodic Table", "Equations and Stoichiometry", "Solutions and Mixtures", "Ionic Bonds", "Molecular geometry", "Heat of Solution", "Molar Connections", "Nuclear Reactions", "Chemical Thermodynamics"};
					public int getSize() {
						return values.length;
					}
					public Object getElementAt(int index) {
						return values[index];
					}
				});
				
				
				list.setToolTipText("");
				list.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
				list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
				scrollPane.setViewportView(list);
				
				JButton btnNewButton = new JButton("Start");
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				btnNewButton.setBounds(96, 302, 67, 23);
				panel.add(btnNewButton);
				
				JPanel panel_1 = new JPanel();
				panel_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
				tabbedPane.addTab("Add", null, panel_1, null);
				panel_1.setLayout(null);
				
				JButton btn_Students = new JButton("Students");
				btn_Students.setBounds(21, 40, 89, 23);
				btn_Students.setFont(new Font("Times New Roman", Font.ITALIC, 11));
				btn_Students.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						frmMarkhamQuiznet.dispose();
						students_btn btn = new students_btn();
					
						 
					}
				});
				frmMarkhamQuiznet.getContentPane().add(btn_Students);
				
				JButton Quizzes_btn = new JButton("Quizzes");
				Quizzes_btn.setBounds(21, 74, 89, 23);
				Quizzes_btn.setFont(new Font("Times New Roman", Font.ITALIC, 11));
				Quizzes_btn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						frmMarkhamQuiznet.dispose();
						quizzes_btn btn = new quizzes_btn();
						
					}
				});
				frmMarkhamQuiznet.getContentPane().add(Quizzes_btn);
				
				JButton btnRevision = new JButton("Revision");
				btnRevision.setBounds(21, 142, 89, 23);
				btnRevision.setFont(new Font("Times New Roman", Font.ITALIC, 11));
				frmMarkhamQuiznet.getContentPane().add(btnRevision);
				
				JButton btnMenu = new JButton("Menu");
				btnMenu.setBounds(21, 277, 89, 23);
				btnMenu.setFont(new Font("Times New Roman", Font.ITALIC, 11));
				frmMarkhamQuiznet.getContentPane().add(btnMenu);
				
				JButton btnHome = new JButton("Home");
				btnHome.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
					
				}});
				btnHome.setBounds(21, 322, 89, 23);
				btnHome.setFont(new Font("Times New Roman", Font.ITALIC, 11));
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
