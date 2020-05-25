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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
		
public class quizzes_btn<Quizzes_btn> {

			private static File filestudent = new File(System.getProperty("user.home") + "/MarkhamQuiznet2/Databases/","Quizzes Database.txt");
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
				
				Label label_2_1 = new Label("Code:");
				label_2_1.setFont(new Font("Dialog", Font.PLAIN, 11));
				label_2_1.setBounds(10, 64, 67, 22);
				panel.add(label_2_1);
				
				Label label_2_2 = new Label("Marks:");
				label_2_2.setFont(new Font("Dialog", Font.PLAIN, 11));
				label_2_2.setBounds(10, 104, 67, 22);
				panel.add(label_2_2);
				
				TextField textField_Name = new TextField();
				textField_Name.setBounds(86, 23, 78, 22);
				panel.add(textField_Name);
				
				TextField textField_3_Code = new TextField();
				textField_3_Code.setBounds(86, 64, 78, 22);
				panel.add(textField_3_Code);
				
				TextField textField_3_Marks = new TextField();
				textField_3_Marks.setBounds(86, 104, 78, 22);
				textField_3_Marks.setText("            /5 ");
				panel.add(textField_3_Marks);
				
				JScrollPane scrollPane_1 = new JScrollPane();
				scrollPane_1.setBounds(170, 11, 155, 314);
				panel.add(scrollPane_1);
				
				JScrollPane scrollPane = new JScrollPane();
				scrollPane_1.setViewportView(scrollPane);
				scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
				
			/*	int[] selected=Jlist1.getSelectedIndices();
				
				textFieldUsername1.setText(studentlist.get(selected[0]).getUser());
        		textFieldDoB1.setText(studentlist.get(selected[0]).getDoB());
				textFieldPassword1.setText(studentlist.get(selected[0]).getPassword());
				textFieldCode1.setText(String.valueOf(studentlist.get(selected[0]).getCode()));
				textFieldName1.setText(studentlist.get(selected[0]).getName());*/
				
				JList list = new JList();
				list.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						
					}
				});
				list.setModel(new AbstractListModel() {
					String[] values = new String[] {"Acids, Bases, and pH. ", "Atomic Structure", "Electrochemistry", "Thermodynamics", "Chemical Bonding", "Chemical Equations and Rxn Stoichiometry", "Gases", "Fundementals of Chemistry", "Liquids & Solids", "Types of Chemical Reactions", "Chemical Periodicity", "Nuclear Chemistry"};
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
						
						System.out.println("******************");
						System.out.println("Start");
						System.out.println("******************");
						
						System.out.println(list.getSelectedIndex());
						
						
						
						EventQueue.invokeLater(new Runnable() {
							public void run() {
								try {
									quiz_gui frame = new quiz_gui(list.getSelectedIndex(),"");
									frame.setVisible(true);
								} catch (Exception e) {
									e.printStackTrace();
								}
							}
						});
					}
				});
				btnNewButton.setBounds(96, 302, 67, 23);
				panel.add(btnNewButton);
				
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
				
				JButton btnHome = new JButton("Home");
				btnHome.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						
						
					
				}});
				btnHome.setBounds(21, 322, 89, 23);
				btnHome.setFont(new Font("Times New Roman", Font.ITALIC, 11));
				frmMarkhamQuiznet.getContentPane().add(btnHome);
				
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
