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
import javax.swing.JOptionPane;
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
import javax.swing.SwingUtilities;
import javax.swing.JScrollPane;
		
public class students_btn {

			
			private static File filestudent = new File(System.getProperty("user.home") + "/MarkhamQuiznet2/Databases/","Student Database.txt");
			private JFrame frmMarkhamQuiznet;
			private final Action action = new SwingAction();
			private Vector<student> studentlist = new Vector<>();
			private int selectedStudent;
			JList Jlist1 = new JList();
		
			DefaultListModel<String> Model = new DefaultListModel<>();
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
				Jlist1.setModel(Model);
				Model.addElement(name);
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
						
						int[] selected=Jlist1.getSelectedIndices();
				
						textFieldUsername1.setText(studentlist.get(selected[0]).getUser());
		        		textFieldDoB1.setText(studentlist.get(selected[0]).getDoB());
						textFieldPassword1.setText(studentlist.get(selected[0]).getPassword());
						textFieldCode1.setText(String.valueOf(studentlist.get(selected[0]).getCode()));
						textFieldName1.setText(studentlist.get(selected[0]).getName());
		        		
					}

					
					}
				);
				scrollPane.setViewportView(Jlist1);
				
				JButton btn_edit= new JButton("edit");
				btn_edit.setBounds(255, 313, 70, 20);
				btn_edit.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						int selected=Jlist1.getSelectedIndex();
						
						
						studentlist.set(selected, new student (Integer.parseInt(intRequestCode()), stringRequestName(), stringRequestLastname(), stringRequestDoB(), stringRequestUser(), stringRequestPassword(), stringRequestTutGroup()));
						write();
						frmMarkhamQuiznet.dispose();
						SwingUtilities.invokeLater(() -> new students_btn());
						
						System.out.println("Edit succesful");
										}
					
					
				});
				panel.add(btn_edit);
				
				JButton btn_delete = new JButton("delete");
				btn_delete.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					
						
						int selected = Jlist1.getSelectedIndex();
					    ((DefaultListModel<String>) Jlist1.getModel()).remove(selected);
						studentlist.remove(selected);
						write();
						frmMarkhamQuiznet.dispose();
						SwingUtilities.invokeLater(() -> new students_btn());
				
					}
						
				});
				btn_delete.setBounds(177, 313, 70, 20);
				panel.add(btn_delete);
				
				JPanel panel_1 = new JPanel();
				panel_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
				tabbedPane.addTab("Add", null, panel_1, null);
				panel_1.setLayout(null);
				
				TextField textField_Code2 = new TextField();
				textField_Code2.setBounds(78, 10, 82, 22);
				panel_1.add(textField_Code2);
				
				Label label = new Label("Code no:");
				label.setBounds(10, 10, 62, 22);
				panel_1.add(label);
				
				Canvas canvas = new Canvas();
				canvas.setBackground(Color.WHITE);
				canvas.setBounds(185, 10, 117, 107);
				panel_1.add(canvas);
				
				TextField textField_Name2 = new TextField();
				textField_Name2.setBounds(78, 49, 82, 22);
				panel_1.add(textField_Name2);
				
				TextField textField_Lastname2 = new TextField();
				textField_Lastname2.setBounds(78, 88, 82, 22);
				panel_1.add(textField_Lastname2);
				
				Label label_1 = new Label("Name:");
				label_1.setBounds(10, 49, 62, 22);
				panel_1.add(label_1);
				
				Label label_1_1 = new Label("Lastname:");
				label_1_1.setBounds(10, 88, 62, 22);
				panel_1.add(label_1_1);
				
				TextField textField_Password = new TextField();
				textField_Password.setBounds(78, 134, 82, 22);
				panel_1.add(textField_Password);
				
				TextField textField_DoB2 = new TextField();
				textField_DoB2.setBounds(78, 172, 82, 22);
				panel_1.add(textField_DoB2);
				
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
				
				TextField textField_Username2 = new TextField();
				textField_Username2.setBounds(78, 213, 82, 22);
				panel_1.add(textField_Username2);
				
				Label label_1_3 = new Label("Username:");
				label_1_3.setBounds(10, 213, 62, 22);
				panel_1.add(label_1_3);
				
				TextField textField_TutGroup = new TextField();
				textField_TutGroup.setBounds(78, 253, 82, 22);
				panel_1.add(textField_TutGroup);
				
				Label label_1_3_1 = new Label("Tutor Group:");
				label_1_3_1.setBounds(10, 253, 62, 22);
				panel_1.add(label_1_3_1);
				
				JButton btn_add = new JButton("add");
				btn_add.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
				
						
					studentlist.add(new student(Integer.parseInt(textField_Code2.getText()), textField_Name2.getText(), textField_Lastname2.getText(), textField_DoB2.getText(), textField_Username2.getText(), textField_Password.getText(), textField_TutGroup.getText()));
					write();
					frmMarkhamQuiznet.dispose();
					SwingUtilities.invokeLater(() -> new students_btn());
					
					
					
					System.out.println("Save succesful");
					}
				});
			
				btn_add.setBounds(207, 302, 82, 23);
				panel_1.add(btn_add);
				
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
				
				JButton btnMenu = new JButton("Menu");
				btnMenu.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				btnMenu.setFont(new Font("Times New Roman", Font.ITALIC, 11));
				btnMenu.setBounds(21, 277, 89, 23);
				frmMarkhamQuiznet.getContentPane().add(btnMenu);
				
				JButton btnHome = new JButton("Home");
				btnHome.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						frmMarkhamQuiznet.dispose();
						
						
						
					}
				});
				btnHome.setFont(new Font("Times New Roman", Font.ITALIC, 11));
				btnHome.setBounds(21, 322, 89, 23);
				frmMarkhamQuiznet.getContentPane().add(btnHome);
				
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
		        
				private String intRequestCode()
				{
					return JOptionPane.showInputDialog("Code:");
				}
				
		    	private String stringRequestName()
		    	{
		    		return JOptionPane.showInputDialog("Name:");
		    	}
		    	
		    	private String stringRequestLastname()
		    	{
		    		return JOptionPane.showInputDialog("Lastname:");
		    	}
		    	
		    	private String stringRequestDoB()
		    	{
		    		return JOptionPane.showInputDialog("Date of Birth:");
		    	}
		    	
		    	private String stringRequestUser()
		    	{
		    		return JOptionPane.showInputDialog("Username:");
		    	}
		    
		    	private String stringRequestPassword()
		    	{
		    		return JOptionPane.showInputDialog("Password:");
		    	}
		    	
		    	private String stringRequestTutGroup()
		    	{
		    		return JOptionPane.showInputDialog("Tutor Group:");
		    	}
		    }
	




