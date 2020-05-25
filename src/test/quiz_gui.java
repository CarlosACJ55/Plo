package test;

import java.awt.BorderLayout;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import java.util.LinkedList;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class quiz_gui extends JFrame {

	private JPanel contentPane;
	private JTextArea textField;
	
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Quiz_Main_Window frame = new Quiz_Main_Window(1,"");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	*/
	
	public quiz_gui(int id_quiz,String name_quiz) {
		
		quizzes question_bank = new quizzes();
		LinkedList<quiz> quiz_list = new LinkedList<quiz>();
		
		System.out.println(id_quiz);
		switch (id_quiz) 
        {
            case 0: quiz_list = question_bank.prepare_and_deliver_test_01();
    		         break;
            case 1: quiz_list = question_bank.prepare_and_deliver_test_02();
                     break;
            case 2: quiz_list = question_bank.prepare_and_deliver_test_03();
                     break;
            case 3: quiz_list = question_bank.prepare_and_deliver_test_04();
                     break;
            case 4: quiz_list = question_bank.prepare_and_deliver_test_05();
                     break;
            case 5: quiz_list = question_bank.prepare_and_deliver_test_06();
                     break;
            case 6: quiz_list = question_bank.prepare_and_deliver_test_07();
                     break;
            case 7: quiz_list = question_bank.prepare_and_deliver_test_08();
            		 break;
            case 8: quiz_list = question_bank.prepare_and_deliver_test_09();
            		 break;
            case 9: quiz_list = question_bank.prepare_and_deliver_test_10();
            		 break;
            case 10: quiz_list = question_bank.prepare_and_deliver_test_11();
   		 			 break;
            case 11: quiz_list = question_bank.prepare_and_deliver_test_12();
            		 break;
            case 12: quiz_list = question_bank.prepare_and_deliver_test_13();
            		 break;
            default:
                     break;
        }
		
		LinkedList<quiz> quiz_list2 = quiz_list;
		System.out.println(quiz_list.size());
		System.out.println(quiz_list2.size());
		
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		contentPane.setBorder(BorderFactory.createTitledBorder("Quizz"));
		add(contentPane);

	
		LinkedList<JRadioButton> Answers = new LinkedList<JRadioButton>();
		LinkedList<JTextArea> txtQuestions = new LinkedList<JTextArea>();
		LinkedList<ButtonGroup> AnswersGroup = new LinkedList<ButtonGroup>();
		
		
		for(int x = 0;x<quiz_list.size();x++) {
			
			txtQuestions.add(new JTextArea(5, 40));
			txtQuestions.get(x).setText((x+1)+") "+  quiz_list.get(x).getQuestion());
			txtQuestions.get(x).setFont(new Font("Arial", Font.BOLD, 15));
			txtQuestions.get(x).setLineWrap(true);
			txtQuestions.get(x).setWrapStyleWord(true);
			txtQuestions.get(x).setEditable(true);
			contentPane.add(txtQuestions.get(x));
		
			AnswersGroup.add(new ButtonGroup());
		
			for(int y = 0;y<4;y++) {
				 Answers.add(new JRadioButton(quiz_list.get(x).getAnswers()[y]));
				 Answers.getLast().setMinimumSize(new Dimension(50, 20));
				 Answers.getLast().setPreferredSize(new Dimension(50, 20));
				 AnswersGroup.getLast().add(Answers.getLast());
				 contentPane.add(Answers.getLast());
			
			}
			
		}
		
		JButton btn_Back = new JButton("Back");
		btn_Back.setBounds(638, 527, 55, 23);
		contentPane.add(btn_Back);
		
		btn_Back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
		}
		});
		
		JButton btn_Finish = new JButton("Finish");
		btn_Finish.setBounds(715, 527, 59, 23);
		contentPane.add(btn_Finish);
		
		btn_Finish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int points = 0;
				for(int i = 0;i<quiz_list2.size();i++)
				{
					
					int z = 0;
					int sel = 99;
					for (Enumeration<AbstractButton> buttons = AnswersGroup.get(i).getElements(); buttons.hasMoreElements();) {
			               AbstractButton button = buttons.nextElement();

			               if (button.isSelected()) {
			            	  sel = z;
			               }
			               z++;
			           }
					
					if(quiz_list2.get(i).getCorrect_answer() == sel) {
						points++;
					}
				}
				
				JOptionPane.showMessageDialog(null, "No. of correct answers " + points, "/5" + "InfoBox: " + "Message", JOptionPane.INFORMATION_MESSAGE);
				
				
			}
		});
		
	
	}

}
