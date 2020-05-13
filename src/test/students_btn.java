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
import java.awt.Component;
import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.ScrollPane;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;
import java.awt.event.ActionEvent;
import java.awt.Scrollbar;
import java.awt.Choice;
import javax.swing.JMenuBar;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.AbstractAction;
import javax.swing.AbstractButton;
import javax.swing.AbstractListModel;
import javax.swing.Action;
import javax.swing.DefaultListModel;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
		
public class students_btn {

			
			private static File filestudent = new File(System.getProperty("user.home") + "/MarkhamQuiznet/Databases/","Student Database.txt");
			private JFrame frmMarkhamQuiznet;
			private final Action action = new SwingAction();
			private Vector<student> studentlist = new Vector<>();
			private int selectedStudent;
			JList Jlist1 = new JList();
			DefaultListModel<String> defaultListModelNames = new DefaultListModel<>();
			protected AbstractButton nameTxt;
			
			
			public students_btn() {
			
				loadStudents(studentlist);
				for(student x: studentlist) {
				System.out.println(x.getCode() + " " + x.getName() + " " + x.getLast_name());
				}
				initialize();
				
			}

			//add to list
			@SuppressWarnings("unchecked")
			private void add(int code, String name, String last_name, String doB, String user, String password) {
				Jlist1.setModel(defaultListModelNames);
				defaultListModelNames.addElement(name);
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
				
				Label label_2 = new Label("Code no:");
				label_2.setBounds(8, 135, 67, 22);
				panel.add(label_2);
				
				TextField textFieldCode1 = new TextField();
				textFieldCode1.setBounds(73, 135, 78, 22);
				panel.add(textFieldCode1);
				
				Canvas canvas_1 = new Canvas();
				canvas_1.setBackground(Color.WHITE);
				canvas_1.setBounds(20, 10, 131, 85);
				panel.add(canvas_1);
		
		        		
		     /* String Name = studentlist.get(selectedStudent).getName();
				String Surname = studentlist.get(selectedStudent).getLast_name();
				String Password = studentlist.get(selectedStudent).getPassword();
				int CodeNo = studentlist.get(selectedStudent).getCode();
				String DoB = studentlist.get(selectedStudent).getDoB();
				*/
			
				
		      //String name = list.getSelectedValue().toString();
		        		
		   
				
				
				/*private int selectedUser;
				listNames.addMouseListener
				                (
				                        new MouseAdapter()
				                        {
				                            public void mouseClicked(MouseEvent e)
				                            {
				                                if (listNames.getSelectedValuesList().size() == 1)
				                                    selectedUser = listNames.getSelectedIndex();
				                            }
				                        }
				                );
				*/
				
				Label label_1_2 = new Label("Name:");
				label_1_2.setBounds(8, 175, 67, 22);
				panel.add(label_1_2);
				
				Label label_1_1_3 = new Label("Username:");
				label_1_1_3.setBounds(8, 213, 67, 22);
				panel.add(label_1_1_3);
				
				TextField textFieldName1 = new TextField();
				textFieldName1.setBounds(73, 175, 78, 22);
				panel.add(textFieldName1);
				
				TextField textFieldUsername1 = new TextField();
				textFieldUsername1.setBounds(73, 213, 78, 22);
				panel.add(textFieldUsername1);
				
				Label label_1_1_1_1 = new Label("Password:");
				label_1_1_1_1.setBounds(8, 246, 67, 22);
				panel.add(label_1_1_1_1);
				
				Label label_1_1_2_1 = new Label("DoB:");
				label_1_1_2_1.setBounds(8, 284, 67, 22);
				panel.add(label_1_1_2_1);
				
				TextField textFieldPassword1 = new TextField();
				textFieldPassword1.setBounds(73, 246, 78, 22);
				panel.add(textFieldPassword1);
				
				TextField textFieldDoB1 = new TextField();
				textFieldDoB1.setBounds(73, 284, 78, 22);
				panel.add(textFieldDoB1);
				
				JButton btnNewButton_1 = new JButton("select");
				btnNewButton_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				btnNewButton_1.setBounds(51, 101, 67, 16);
				panel.add(btnNewButton_1);
				
				JButton btn_update= new JButton("update");
				btn_update.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
					}
				});
				btn_update.setBounds(255, 312, 70, 20);
				panel.add(btn_update);
				
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(175, 11, 150, 291);
				panel.add(scrollPane);
				
				DefaultListModel<String> defaultListModelNames1 = new DefaultListModel<>();
		        for (student x : studentlist)
		            defaultListModelNames1.addElement(x.getName() + " " + x.getLast_name());
			
				JList<String> Jlist1 = new JList<>(defaultListModelNames1);
				Jlist1.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						String selected=Jlist1.getSelectedValue().toString();
		        		nameTxt=setText(selected);
		        		String Name = studentlist.get(selectedStudent).getName();
						String Surname = studentlist.get(selectedStudent).getLast_name();
						String Password = studentlist.get(selectedStudent).getPassword();
						int CodeNo = studentlist.get(selectedStudent).getCode();
						String DoB = studentlist.get(selectedStudent).getDoB();
		        		
					}

					private AbstractButton setText(String selected) {
						// TODO Auto-generated method stub
						return null;
					}
				});
				scrollPane.setViewportView(Jlist1);
				
				JPanel panel_1 = new JPanel();
				panel_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
				tabbedPane.addTab("Add", null, panel_1, null);
				panel_1.setLayout(null);
				
				TextField textField = new TextField();
				textField.setBounds(78, 10, 82, 22);
				panel_1.add(textField);
				
				Label label = new Label("Code no:");
				label.setBounds(10, 10, 62, 22);
				panel_1.add(label);
				
				Canvas canvas = new Canvas();
				canvas.setBackground(Color.WHITE);
				canvas.setBounds(185, 10, 117, 107);
				panel_1.add(canvas);
				
				TextField textField_1 = new TextField();
				textField_1.setBounds(78, 49, 82, 22);
				panel_1.add(textField_1);
				
				TextField textField_2 = new TextField();
				textField_2.setBounds(78, 88, 82, 22);
				panel_1.add(textField_2);
				
				Label label_1 = new Label("Name:");
				label_1.setBounds(10, 49, 62, 22);
				panel_1.add(label_1);
				
				Label label_1_1 = new Label("Lastname:");
				label_1_1.setBounds(10, 88, 62, 22);
				panel_1.add(label_1_1);
				
				TextField textField_2_1 = new TextField();
				textField_2_1.setBounds(78, 134, 82, 22);
				panel_1.add(textField_2_1);
				
				TextField textField_2_2 = new TextField();
				textField_2_2.setBounds(78, 172, 82, 22);
				panel_1.add(textField_2_2);
				
				Label label_1_1_1 = new Label("Password:");
				label_1_1_1.setBounds(10, 134, 62, 22);
				panel_1.add(label_1_1_1);
				
				Label label_1_1_2 = new Label("DoB:");
				label_1_1_2.setBounds(10, 172, 62, 22);
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
				
				//DefaultListModel<String> defaultListModelNames = new DefaultListModel<>();
				
				  /* String Name = studentlist.get(selectedStudent).getName();
				String Surname = studentlist.get(selectedStudent).getLast_name();
				String Password = studentlist.get(selectedStudent).getPassword();
				int CodeNo = studentlist.get(selectedStudent).getCode();
				String DoB = studentlist.get(selectedStudent).getDoB();
				*/
				
				JButton btn_add = new JButton("add");
				btn_add.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						
						add(selectedStudent, nameTxt.getText(), null, null, null, null);
						
						//clear test
						nameTxt.getText();
					}
				});
				btn_add.setBounds(207, 302, 82, 23);
				panel_1.add(btn_add);
				
				TextField textField_1_1 = new TextField();
				textField_1_1.setBounds(78, 213, 82, 22);
				panel_1.add(textField_1_1);
				
				Label label_1_3 = new Label("Username:");
				label_1_3.setBounds(10, 213, 62, 22);
				panel_1.add(label_1_3);
				
				JButton btn_Students = new JButton("Students");
				btn_Students.setFont(new Font("Times New Roman", Font.ITALIC, 11));
				btn_Students.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						frmMarkhamQuiznet.dispose();
						students_btn btn = new students_btn();
					
					}
				});
				btn_Students.setBounds(21, 40, 89, 23);
				frmMarkhamQuiznet.getContentPane().add(btn_Students);
				
				JButton Quizzes_btn = new JButton("Quizzes");
				Quizzes_btn.setFont(new Font("Times New Roman", Font.ITALIC, 11));
				Quizzes_btn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						
						frmMarkhamQuiznet.dispose();
						quizzes_btn btn = new quizzes_btn();
				
						
					}
				});
				Quizzes_btn.setBounds(21, 74, 89, 23);
				frmMarkhamQuiznet.getContentPane().add(Quizzes_btn);
				
				JButton btnRevision = new JButton("Revision");
				btnRevision.setFont(new Font("Times New Roman", Font.ITALIC, 11));
				btnRevision.setBounds(21, 142, 89, 23);
				frmMarkhamQuiznet.getContentPane().add(btnRevision);
				
				JButton btnMenu = new JButton("Menu");
				btnMenu.setFont(new Font("Times New Roman", Font.ITALIC, 11));
				btnMenu.setBounds(21, 277, 89, 23);
				frmMarkhamQuiznet.getContentPane().add(btnMenu);
				
				JButton btnHome = new JButton("Home");
				btnHome.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
					}
				});
				btnHome.setFont(new Font("Times New Roman", Font.ITALIC, 11));
				btnHome.setBounds(21, 322, 89, 23);
				frmMarkhamQuiznet.getContentPane().add(btnHome);
				
				JButton btnMarks = new JButton("Marks");
				btnMarks.setFont(new Font("Times New Roman", Font.ITALIC, 11));
				btnMarks.setBounds(21, 108, 89, 23);
				frmMarkhamQuiznet.getContentPane().add(btnMarks);
				
				frmMarkhamQuiznet.setVisible(true);
			}
			protected void add2(String name) {
				// TODO Auto-generated method stub
				
			}
			private class SwingAction extends AbstractAction {
				public SwingAction() {
					putValue(NAME, "SwingAction");
					putValue(SHORT_DESCRIPTION, "Some short description");
				}
				public void actionPerformed(ActionEvent e) {
				}
			}
			
			static void loadStudents(Vector<student> s)
		    {
		        s.clear();
		        try
		        {
		            Scanner scan = new Scanner(filestudent);
		            while (scan.hasNext())
		                s.add(new student(scan.nextInt(), scan.next(), scan.next(), scan.next(), scan.next(), scan.next(), scan.next()));
		            scan.close();
		        }
		        catch(Exception e)
		        {
		            System.out.println("Student load error.");
		        }
		       
		    }
			
			private void write()
		    {
		        try
		        {
		            PrintWriter printWriter = new PrintWriter(filestudent);
		            for (student x : studentlist)
		            printWriter.println(x.getCode() + " " + x.getName() + " " + x.getLast_name() + " " + x.getDoB() + " " + x.getUser() + " " + x.getPassword() + " " + x.getTutgroup());
		            printWriter.flush();
		            printWriter.close();
		        }
		        catch(Exception e)
		        {
		            System.out.println("error.");
		        }
		    }
	}




