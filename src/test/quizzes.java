package test;

import java.util.LinkedList;

public class quizzes {
	
	static LinkedList<quiz> quiz_list = new LinkedList<quiz>();

	
	public static LinkedList  prepare_and_deliver_test_01() {
		
	
		//The initialization allows to enter dynamically  the objects, there is no limit to enter.
			
		quiz q1 = new quiz();
		q1.setCode(1);
		q1.setQuestion("Question 1: Arrhenius defined an acid as");
		String[] q1_answers = new String[5];
		q1_answers[0]="(a) a species that can donate a proton";
		q1_answers[1]="(b) a species that can accept a proton";
		q1_answers[2]="(c) a source of OH- ions in water.";
		q1_answers[3]="(d) a sourse of H+ ions in water.";
		q1_answers[4]="(e) a species that can accept a pair of electrons.";
		q1.setAnswers(q1_answers);
		q1.setCorrect_answer(3);

		quiz q2 = new quiz();
		q2.setCode(1);
		q2.setQuestion("Question 2: In the Bronsted-Lowry system, a base is defined as");
		String[] q2_answers = new String[5];
		q2_answers[0]="(a) a species that can donate a proton.";
		q2_answers[1]="(b) a species that can accept a proton.";
		q2_answers[2]="(c) a source of OH- ions in water.";
		q2_answers[3]="(d) a sourse of H+ ions in water.";
		q2_answers[4]="(e) a species that can accept a pair of electrons.";
		q2.setAnswers(q2_answers);
		q2.setCorrect_answer(4);
		
		quiz q3 = new quiz();
		q3.setCode(1);
		q3.setQuestion("Question 3: According to the Lewis theory, a base _____ .");
		String[] q3_answers = new String[5];
		q3_answers[0]="(a) is a proton acceptor.";
		q3_answers[1]="(b) is a proton donor.";
		q3_answers[2]="(c) makes available a share in a pair of electrons.";
		q3_answers[3]="(d) produces OH- ions in aqueous solution.";
		q3_answers[4]="(e) accepts a share in a pair of electrons.";
		q3.setAnswers(q3_answers);
		q3.setCorrect_answer(2);
		
		quiz q4 = new quiz();
		q4.setCode(1);
		q4.setQuestion("Question 4: In the equation: HF + H2O  H3O+ + F-");
		String[] q4_answers = new String[5];
		q4_answers[0]="(a) H2O is a base and HF is its conjugate acid.";
		q4_answers[1]="(b) H2O is an acid and HF is the conjugate base.";
		q4_answers[2]="(c) HF is an acid and F- is its conjugate base.";
		q4_answers[3]="(d) HF is a base and H3O+ is its conjugate acid.";
		q4_answers[4]="(e) HF is a base and F- is its conjugate acid.";
		q4.setAnswers(q4_answers);
		q4.setCorrect_answer(2);
		
		quiz q5 = new quiz();
		q5.setCode(1);
		q5.setQuestion("Question 5: Which is the strongest acid?");
		String[] q5_answers = new String[5];
		q5_answers[0]="(a) HClO4";
		q5_answers[1]="(b) HClO3";
		q5_answers[2]="(c) HClO2";
		q5_answers[3]="(d) HClO";
		q5_answers[4]="(e) HF";
		q5.setAnswers(q5_answers);
		q5.setCorrect_answer(0);
		
		quiz_list.clear();
		
		quiz_list.add(q1);
		quiz_list.add(q2);
		quiz_list.add(q3);
		quiz_list.add(q4);
		quiz_list.add(q5);
		
		
		return quiz_list;
	}
	
		public static LinkedList  prepare_and_deliver_test_02() {
			
			
			//The initialization allows to enter dynamically  the objects, there is no limit to enter.
				
			quiz q1 = new quiz();
			q1.setCode(2);
			q1.setQuestion("Question 1: Which of the following has a positive charge?");
			String[] q1_answers = new String[5];
			q1_answers[0]="(a) proton";
			q1_answers[1]="(b) neutron";
			q1_answers[2]="(c) anion";
			q1_answers[3]="(d) electron";
			q1_answers[4]="(e) atom";
			q1.setAnswers(q1_answers);
			q1.setCorrect_answer(0);

			quiz q2 = new quiz();
			q2.setCode(2);
			q2.setQuestion("Question 2: Rutherford carried out experiments in which a beam of alpha particles was directed at a thin piece of metal foil. From these experiments he concluded that");
			String[] q2_answers = new String[5];
			q2_answers[0]="(a) electrons are massive particles.";
			q2_answers[1]="(b) the positively charged parts of atoms are moving about with a velocity approaching the speed of light.";
			q2_answers[2]="(c) the positively charged parts of atoms are extremely small and extremely heavy particles";
			q2_answers[3]="(d) the diameter of an electron is approximately equal to that of the nucleus.";
			q2_answers[4]="(e) electrons travel in circular orbits around the nucleus.";
			q2.setAnswers(q2_answers);
			q2.setCorrect_answer(2);
			
			quiz q3 = new quiz();
			q3.setCode(2);
			q3.setQuestion("Question 3: Consider the species 72Zn, 75As and 74Ge. These species have");
			String[] q3_answers = new String[5];
			q3_answers[0]="(a) the same number of electrons.";
			q3_answers[1]="(b) the same number of protons.";
			q3_answers[2]="(c) the same number of neutrons.";
			q3_answers[3]="(d) the same number of protons and neutrons.";
			q3_answers[4]="(e) the same mass number.";
			q3.setAnswers(q3_answers);
			q3.setCorrect_answer(2);
			
			quiz q4 = new quiz();
			q4.setCode(2);
			q4.setQuestion("Question 4: The neutral atoms of all of the isotopes of the same element have");
			String[] q4_answers = new String[5];
			q4_answers[0]="(a) different numbers of protons.";
			q4_answers[1]="(b) equal numbers of neutrons.";
			q4_answers[2]="(c) the same number of electrons.";
			q4_answers[3]="(d) the same mass numbers.";
			q4_answers[4]="(e) the same masses.";
			q4.setAnswers(q4_answers);
			q4.setCorrect_answer(2);
			
			quiz q5 = new quiz();
			q5.setCode(2);
			q5.setQuestion("Question 5: What is the atomic weight of a hypothetical element consisting of two isotopes, one with mass = 64.23 amu (26.0%), and one with mass = 65.32 amu?");
			String[] q5_answers = new String[5];
			q5_answers[0]="(a) 65.3 amu";
			q5_answers[1]="(b) 64.4 amu";
			q5_answers[2]="(c) 64.9 amu";
			q5_answers[3]="(d) 65.0 amu";
			q5_answers[4]="(e) 64.8 amu";
			q5.setAnswers(q5_answers);
			q5.setCorrect_answer(3);
			
			quiz_list.clear();
			
			quiz_list.add(q1);
			quiz_list.add(q2);
			quiz_list.add(q3);
			quiz_list.add(q4);
			quiz_list.add(q5);
			
			
			return quiz_list;
	}
		
		public static LinkedList  prepare_and_deliver_test_03() {
			
			
			//The initialization allows to enter dynamically  the objects, there is no limit to enter.
				
			quiz q1 = new quiz();
			q1.setCode(3);
			q1.setQuestion("Question 1: In an electrolytic cell the electrode at which the electrons enter the solution is called the ______ ; the chemical change that occurs at this electrode is called _______");
			String[] q1_answers = new String[5];
			q1_answers[0]="(a) anode, oxidation";
			q1_answers[1]="(b) anode, reduction";
			q1_answers[2]="(c) cathode, oxidation";
			q1_answers[3]="(d) cathode, reduction";
			q1_answers[4]="(e) cannot tell unless we know the species being oxidized and reduced.";
			q1.setAnswers(q1_answers);
			q1.setCorrect_answer(3);

			quiz q2 = new quiz();
			q2.setCode(3);
			q2.setQuestion("Question 2: Which of the following statements is FALSE?");
			String[] q2_answers = new String[5];
			q2_answers[0]="(a) Oxidation and reduction half-reactions occur at electrodes in electrochemical cells.";
			q2_answers[1]="(b) All electrochemical reactions involve the transfer of electrons.";
			q2_answers[2]="(c) Reduction occurs at the cathode.";
			q2_answers[3]="(d) Oxidation occurs at the anode.";
			q2_answers[4]="(e) All voltaic (galvanic) cells involve the use of electricity to initiate nonspontaneous chemical reactions.";
			q2.setAnswers(q2_answers);
			q2.setCorrect_answer(4);
			
			quiz q3 = new quiz();
			q3.setCode(3);
			q3.setQuestion("Question 3: The half-reaction that occurs at the anode during the electrolysis of molten sodium bromide is:");
			String[] q3_answers = new String[5];
			q3_answers[0]="(a) 2 Br-  Br2 + 2 e-";
			q3_answers[1]="(b) Br2 + 2 e-  2 Br-";
			q3_answers[2]="(c) Na+ + e-  Na";
			q3_answers[3]="(d) Na  Na+ + e-";
			q3_answers[4]="(e) 2 H2O + 2 e-  2 OH- + H2";
			q3.setAnswers(q3_answers);
			q3.setCorrect_answer(0);
			
			quiz q4 = new quiz();
			q4.setCode(1);
			q4.setQuestion("Question 4: What mass (in grams) of nickel could be electroplated from a solution of nickel(II) chloride by a current of 0.25 amperes flowing for 10 hours?");
			String[] q4_answers = new String[5];
			q4_answers[0]="(a) 12 g";
			q4_answers[1]="(b) 5.5 g";
			q4_answers[2]="(c) 0.046 g";
			q4_answers[3]="(d) 2.7 g";
			q4_answers[4]="(e) 6.0 g";
			q4.setAnswers(q4_answers);
			q4.setCorrect_answer(3);
			
			quiz q5 = new quiz();
			q5.setCode(1);
			q5.setQuestion("Question 5: How long (in hours) must a current of 5.0 amperes be maintained to electroplate 60 g of calcium from molten CaCl2?");
			String[] q5_answers = new String[5];
			q5_answers[0]="(a) 27 hours";
			q5_answers[1]="(b) 8.3 hours";
			q5_answers[2]="(c) 11 hours";
			q5_answers[3]="(d) 16 hours";
			q5_answers[4]="(e) 5.9 hours";
			q5.setAnswers(q5_answers);
			q5.setCorrect_answer(3);
			
			quiz_list.clear();
			
			quiz_list.add(q1);
			quiz_list.add(q2);
			quiz_list.add(q3);
			quiz_list.add(q4);
			quiz_list.add(q5);
			
			
			return quiz_list;
			
		}
			
		public static LinkedList  prepare_and_deliver_test_04() {
				
				
				//The initialization allows to enter dynamically  the objects, there is no limit to enter.
					
				quiz q1 = new quiz();
				q1.setCode(4);
				q1.setQuestion("Question 1: Which one of the following thermodynamic quantities is not a state function?");
				String[] q1_answers = new String[5];
				q1_answers[0]="(a) Gibbs free energy";
				q1_answers[1]="(b) enthalpy";
				q1_answers[2]="(c) entropy";
				q1_answers[3]="(d) internal energy";
				q1_answers[4]="(e) work";
				q1.setAnswers(q1_answers);
				q1.setCorrect_answer(4);

				quiz q2 = new quiz();
				q2.setCode(4);
				q2.setQuestion("Question 2: At a constant temperature, an ideal gas is compressed from 6.0 liters to 4.0 liters by a constant external pressure of 5.0 atm. How much work is done on the gas?");
				String[] q2_answers = new String[5];
				q2_answers[0]="(a) w = +10 liter atm";
				q2_answers[1]="(b) w = -10 liter atm";
				q2_answers[2]="(c) w = +30 liter atm";
				q2_answers[3]="(d) w = -30 liter atm";
				q2_answers[4]="(e) The answer cannot be calculated.";
				q2.setAnswers(q2_answers);
				q2.setCorrect_answer(0);
				
				quiz q3 = new quiz();
				q3.setCode(4);
				q3.setQuestion("Question 3: A system suffers an increase in internal energy of 80 J and at the same time has 50 J of work done on it. What is the heat change of the system?");
				String[] q3_answers = new String[5];
				q3_answers[0]="(a) +130 J";
				q3_answers[1]="(b) +30 J";
				q3_answers[2]="(c) -130 J";
				q3_answers[3]="(d) -30 J";
				q3_answers[4]="(e) 0 J";
				q3.setAnswers(q3_answers);
				q3.setCorrect_answer(1);
				
				quiz q4 = new quiz();
				q4.setCode(4);
				q4.setQuestion("Question 4: All of the following have a standard heat of formation value of zero at 25oC and 1.0 atm except");
				String[] q4_answers = new String[5];
				q4_answers[0]="(a) N2(g)";
				q4_answers[1]="(b) Fe(s)";
				q4_answers[2]="(c) Ne(g)";
				q4_answers[3]="(d) H(g)";
				q4_answers[4]="(e) Hg(l)";
				q4.setAnswers(q4_answers);
				q4.setCorrect_answer(3);
				
				quiz q5 = new quiz();
				q5.setCode(4);
				q5.setQuestion("Question 5: For which of the following reactions would the Ho for the reaction be labeled Hfo?");
				String[] q5_answers = new String[5];
				q5_answers[0]="(a) Al(s) + 3/2 H2(g) + 3/2 O2(g)  Al(OH)3(s)";
				q5_answers[1]="(b) PCl3(g) + 1/2 O2(g)  POCl3(g)";
				q5_answers[2]="(c) 1/2 N2O(g) + 1/4 O2(g)  NO(g)";
				q5_answers[3]="(d) CaO(s) + SO2(g)  CaSO3(s)";
				q5_answers[4]="(e) The Ho for all these reactions would be labeled Hfo.";
				q5.setAnswers(q5_answers);
				q5.setCorrect_answer(0);
				
				quiz_list.clear();
				
				quiz_list.add(q1);
				quiz_list.add(q2);
				quiz_list.add(q3);
				quiz_list.add(q4);
				quiz_list.add(q5);
				
				
				return quiz_list;
			}
			
		public static LinkedList  prepare_and_deliver_test_05() {
				
				
				//The initialization allows to enter dynamically  the objects, there is no limit to enter.
					
				quiz q1 = new quiz();
				q1.setCode(5);
				q1.setQuestion("Question 1: The valence electrons of representative elements are");
				String[] q1_answers = new String[5];
				q1_answers[0]="(a) in s orbitals only.";
				q1_answers[1]="(b) located in the outermost occupied major energy level.";
				q1_answers[2]="(c) located closest to the nucleus.";
				q1_answers[3]="(d) located in d orbitals.";
				q1_answers[4]="(e) located in the innermost occupied shell.";
				q1.setAnswers(q1_answers);
				q1.setCorrect_answer(1);

				quiz q2 = new quiz();
				q2.setCode(5);
				q2.setQuestion("Question 2: Which of the following pairs of elements and valence electrons is incorrect?");
				String[] q2_answers = new String[5];
				q2_answers[0]="(a) Al - 3";
				q2_answers[1]="(b) Br - 7";
				q2_answers[2]="(c) S - 4";
				q2_answers[3]="(d) Sr - 2";
				q2_answers[4]="(e) Tl - 3";
				q2.setAnswers(q2_answers);
				q2.setCorrect_answer(2);
				
				quiz q3 = new quiz();
				q3.setCode(5);
				q3.setQuestion("Question 3: Which is classified as nonpolar covalent?");
				String[] q3_answers = new String[5];
				q3_answers[0]="(a) the H-I bond in HI";
				q3_answers[1]="(b) the H-S bond in H2S";
				q3_answers[2]="(c) the P-Cl bond in PCl3";
				q3_answers[3]="(d) the N-Cl bond in NCl3";
				q3_answers[4]="(e) the N-H bond in NH3";
				q3.setAnswers(q3_answers);
				q3.setCorrect_answer(3);
				
				quiz q4 = new quiz();
				q4.setCode(5);
				q4.setQuestion("Question 4: What is the total number of electrons in the correct Lewis dot formula of the sulfite ion?");
				String[] q4_answers = new String[5];
				q4_answers[0]="(a) 8";
				q4_answers[1]="(b) 24";
				q4_answers[2]="(c) 26";
				q4_answers[3]="(d) 30";
				q4_answers[4]="(e) 32";
				q4.setAnswers(q4_answers);
				q4.setCorrect_answer(2);
				
				quiz q5 = new quiz();
				q5.setCode(5);
				q5.setQuestion("Question 5: In the Lewis structure for the OF2 molecule, the number of lone pairs of electrons around the central oxygen atom is");
				String[] q5_answers = new String[5];
				q5_answers[0]="(a) 0";
				q5_answers[1]="(b) 1";
				q5_answers[2]="(c) 2";
				q5_answers[3]="(d) 3";
				q5_answers[4]="(e) 4";
				q5.setAnswers(q5_answers);
				q5.setCorrect_answer(2);
				
				quiz_list.clear();
				
				quiz_list.add(q1);
				quiz_list.add(q2);
				quiz_list.add(q3);
				quiz_list.add(q4);
				quiz_list.add(q5);
				
				
				return quiz_list;
			}
			
		public static LinkedList  prepare_and_deliver_test_06() {
				
				
				//The initialization allows to enter dynamically  the objects, there is no limit to enter.
					
				quiz q1 = new quiz();
				q1.setCode(6);
				q1.setQuestion("Question 1: The valence electrons of representative elements are");
				String[] q1_answers = new String[5];
				q1_answers[0]="(a) in s orbitals only.";
				q1_answers[1]="(b) located in the outermost occupied major energy level.";
				q1_answers[2]="(c) located closest to the nucleus.";
				q1_answers[3]="(d) located in d orbitals.";
				q1_answers[4]="(e) located in the innermost occupied shell.";
				q1.setAnswers(q1_answers);
				q1.setCorrect_answer(1);

				quiz q2 = new quiz();
				q2.setCode(6);
				q2.setQuestion("Question 2: Which of the following pairs of elements and valence electrons is incorrect?");
				String[] q2_answers = new String[5];
				q2_answers[0]="(a) Al - 3";
				q2_answers[1]="(b) Br - 7";
				q2_answers[2]="(c) S - 4";
				q2_answers[3]="(d) Sr - 2";
				q2_answers[4]="(e) Tl - 3";
				q2.setAnswers(q2_answers);
				q2.setCorrect_answer(2);
				
				quiz q3 = new quiz();
				q3.setCode(6);
				q3.setQuestion("Question 3: Which is classified as nonpolar covalent?");
				String[] q3_answers = new String[5];
				q3_answers[0]="(a) the H-I bond in HI";
				q3_answers[1]="(b) the H-S bond in H2S";
				q3_answers[2]="(c) the P-Cl bond in PCl3";
				q3_answers[3]="(d) the N-Cl bond in NCl3";
				q3_answers[4]="(e) the N-H bond in NH3";
				q3.setAnswers(q3_answers);
				q3.setCorrect_answer(3);
				
				quiz q4 = new quiz();
				q4.setCode(6);
				q4.setQuestion("Question 4: What is the total number of electrons in the correct Lewis dot formula of the sulfite ion?");
				String[] q4_answers = new String[5];
				q4_answers[0]="(a) 8";
				q4_answers[1]="(b) 24";
				q4_answers[2]="(c) 26";
				q4_answers[3]="(d) 30";
				q4_answers[4]="(e) 32";
				q4.setAnswers(q4_answers);
				q4.setCorrect_answer(2);
				
				quiz q5 = new quiz();
				q5.setCode(6);
				q5.setQuestion("Question 5: In the Lewis structure for the OF2 molecule, the number of lone pairs of electrons around the central oxygen atom is");
				String[] q5_answers = new String[5];
				q5_answers[0]="(a) 0";
				q5_answers[1]="(b) 1";
				q5_answers[2]="(c) 2";
				q5_answers[3]="(d) 3";
				q5_answers[4]="(e) 4";
				q5.setAnswers(q5_answers);
				q5.setCorrect_answer(2);
				
				quiz_list.clear();
				
				quiz_list.add(q1);
				quiz_list.add(q2);
				quiz_list.add(q3);
				quiz_list.add(q4);
				quiz_list.add(q5);
				
				
				return quiz_list;
				}

		public static LinkedList  prepare_and_deliver_test_07() {
	
	
	//The initialization allows to enter dynamically  the objects, there is no limit to enter.
		
	quiz q1 = new quiz();
	q1.setCode(7);
	q1.setQuestion("Question 1: Balance the following equation with the smallest whole number coefficients. Choose the answer that is the sum of the coefficients in the balanced equation. Do not forget coefficients of ");
	String[] q1_answers = new String[5];
	q1_answers[0]="(a) 16";
	q1_answers[1]="(b) 22";
	q1_answers[2]="(c) 24";
	q1_answers[3]="(d) 26";
	q1_answers[4]="(e) 32";
	q1.setAnswers(q1_answers);
	q1.setCorrect_answer(0);

	quiz q2 = new quiz();
	q2.setCode(7);
	q2.setQuestion("Question 2: Balance the following equation with the smallest whole number coefficients. Choose the answer that is the sum of the coefficients in the balanced equation. Do not forget coefficients of 'one' Cr2(SO4)3 + RbOH  Cr(OH)3 + Rb2SO4");
	String[] q2_answers = new String[5];
	q2_answers[0]="(a) 10";
	q2_answers[1]="(b) 12";
	q2_answers[2]="(c) 13";
	q2_answers[3]="(d) 14";
	q2_answers[4]="(e) 15";
	q2.setAnswers(q2_answers);
	q2.setCorrect_answer(1);
	
	quiz q3 = new quiz();
	q3.setCode(7);
	q3.setQuestion("Question 3: The limiting reagent in a chemical reaction is one that:");
	String[] q3_answers = new String[5];
	q3_answers[0]="(a) has the largest molar mass (formula weight).";
	q3_answers[1]="(b) has the smallest molar mass (formula weight).";
	q3_answers[2]="(c) has the smallest coefficient.";
	q3_answers[3]="(d) is consumed completely.";
	q3_answers[4]="(e) is in excess.";
	q3.setAnswers(q3_answers);
	q3.setCorrect_answer(3);
	
	quiz q4 = new quiz();
	q4.setCode(7);
	q4.setQuestion("Question 4: How many grams of water are contained in 75.0 grams of a 6.10% aqueous solution of K3PO4?");
	String[] q4_answers = new String[5];
	q4_answers[0]="(a) 75.0g";
	q4_answers[1]="(b) 73.2g";
	q4_answers[2]="(c) 70.4g";
	q4_answers[3]="(d) 68.1g";
	q4_answers[4]="(e) 62.8g";
	q4.setAnswers(q4_answers);
	q4.setCorrect_answer(2);
	
	quiz q5 = new quiz();
	q5.setCode(7);
	q5.setQuestion("Question 5: What is the molarity of phosphoric acid in a solution labeled 20.0% phosphoric acid (H3PO4) by weight with a density = 1.12 g/mL?");
	String[] q5_answers = new String[5];
	q5_answers[0]="(a) 0.98 M";
	q5_answers[1]="(b) 2.3 M";
	q5_answers[2]="(c) 2.7 M";
	q5_answers[3]="(d) 3.0 M";
	q5_answers[4]="(e) 3.6 M";
	q5.setAnswers(q5_answers);
	q5.setCorrect_answer(1);
	
	quiz_list.clear();
	
	quiz_list.add(q1);
	quiz_list.add(q2);
	quiz_list.add(q3);
	quiz_list.add(q4);
	quiz_list.add(q5);
	
	
	return quiz_list;
}

		public static LinkedList  prepare_and_deliver_test_08() {
	
	
	//The initialization allows to enter dynamically  the objects, there is no limit to enter.
		
	quiz q1 = new quiz();
	q1.setCode(8);
	q1.setQuestion("Question 1: Which statement is false? ");
	String[] q1_answers = new String[5];
	q1_answers[0]="(a) The density of a gas is constant as long as its temperature remains constant.";
	q1_answers[1]="(b) Gases can be expanded without limit.";
	q1_answers[2]="(c) Gases diffuse into each other and mix almost immediately when put into the same container.";
	q1_answers[3]="(d) The molecular weight of a gaseous compound is a non-variable quantity.";
	q1_answers[4]="(e) Pressure must be exerted on a sample of a gas in order to confine it.";
	q1.setAnswers(q1_answers);
	q1.setCorrect_answer(0);

	quiz q2 = new quiz();
	q2.setCode(8);
	q2.setQuestion("Question 2: A sample of oxygen occupies 47.2 liters under a pressure of 1240 torr at 25oC. What volume would it occupy at 25oC if the pressure were decreased to 730 torr?");
	String[] q2_answers = new String[5];
	q2_answers[0]="(a) 27.8 L";
	q2_answers[1]="(b) 29.3 L";
	q2_answers[2]="(c) 32.3 L";
	q2_answers[3]="(d) 47.8 L";
	q2_answers[4]="(e) 80.2 L";
	q2.setAnswers(q2_answers);
	q2.setCorrect_answer(4);
	
	quiz q3 = new quiz();
	q3.setCode(8);
	q3.setQuestion("Question 3: The limiting reagent in a chemical reaction is one that:");
	String[] q3_answers = new String[5];
	q3_answers[0]="(a) has the largest molar mass (formula weight).";
	q3_answers[1]="(b) has the smallest molar mass (formula weight).";
	q3_answers[2]="(c) has the smallest coefficient.";
	q3_answers[3]="(d) is consumed completely.";
	q3_answers[4]="(e) is in excess.";
	q3.setAnswers(q3_answers);
	q3.setCorrect_answer(3);
	
	quiz q4 = new quiz();
	q4.setCode(8);
	q4.setQuestion("Question 4: A sample of nitrogen occupies 5.50 liters under a pressure of 900 torr at 25oC. At what temperature will it occupy 10.0 liters at the same pressure?");
	String[] q4_answers = new String[5];
	q4_answers[0]="(a) 32oC";
	q4_answers[1]="(b) -109oC";
	q4_answers[2]="(c) 154oC";
	q4_answers[3]="(d) 269oC";
	q4_answers[4]="(e) 370oC";
	q4.setAnswers(q4_answers);
	q4.setCorrect_answer(4);
	
	quiz q5 = new quiz();
	q5.setCode(8);
	q5.setQuestion("Question 5: The volume of a sample of nitrogen is 6.00 liters at 35oC and 740 torr. What volume will it occupy at STP?");
	String[] q5_answers = new String[5];
	q5_answers[0]="(a) 6.59 L";
	q5_answers[1]="(b) 5.46 L";
	q5_answers[2]="(c) 6.95 L";
	q5_answers[3]="(d) 5.67 L";
	q5_answers[4]="(e) 5.18 L";
	q5.setAnswers(q5_answers);
	q5.setCorrect_answer(1);
	
	quiz_list.clear();
	
	quiz_list.add(q1);
	quiz_list.add(q2);
	quiz_list.add(q3);
	quiz_list.add(q4);
	quiz_list.add(q5);
	
	
	return quiz_list;
}
		
		public static LinkedList  prepare_and_deliver_test_09() {
			
			
			//The initialization allows to enter dynamically  the objects, there is no limit to enter.
				
			quiz q1 = new quiz();
			q1.setCode(9);
			q1.setQuestion("Question 1: Of the following name/symbol combinations of elements, which one is WRONG?");
			String[] q1_answers = new String[5];
			q1_answers[0]="(a) uranium/U";
			q1_answers[1]="(b) sulfur/S";
			q1_answers[2]="(c) nitrogen/N";
			q1_answers[3]="(d) potassium/K";
			q1_answers[4]="(e) iron/I";
			q1.setAnswers(q1_answers);
			q1.setCorrect_answer(4);

			quiz q2 = new quiz();
			q2.setCode(9);
			q2.setQuestion("Question 2: Of the following symbol/name combinations of elements, which one is WRONG?");
			String[] q2_answers = new String[5];
			q2_answers[0]="(a) C/carbon";
			q2_answers[1]="(b) B/barium";
			q2_answers[2]="(c) F/fluorine";
			q2_answers[3]="(d) N/nitrogen";
			q2_answers[4]="(e) U/uranium";
			q2.setAnswers(q2_answers);
			q2.setCorrect_answer(1);
			
			quiz q3 = new quiz();
			q3.setCode(9);
			q3.setQuestion("Question 3: The chemical symbol for manganese is");
			String[] q3_answers = new String[5];
			q3_answers[0]="(a) Mn";
			q3_answers[1]="(b) Mo";
			q3_answers[2]="(c) Ma";
			q3_answers[3]="(d) Ga";
			q3_answers[4]="(e) Mg";
			q3.setAnswers(q3_answers);
			q3.setCorrect_answer(0);
			
			quiz q4 = new quiz();
			q4.setCode(9);
			q4.setQuestion("Question 4: The number 0.005436 has how many significant figures?");
			String[] q4_answers = new String[5];
			q4_answers[0]="(a) 7";
			q4_answers[1]="(b) 3";
			q4_answers[2]="(c) 4";
			q4_answers[3]="(d) 5";
			q4_answers[4]="(e) 6";
			q4.setAnswers(q4_answers);
			q4.setCorrect_answer(2);
			
			quiz q5 = new quiz();
			q5.setCode(9);
			q5.setQuestion("Question 5: The number 10.00 has how many significant figures?");
			String[] q5_answers = new String[5];
			q5_answers[0]="(a) 1";
			q5_answers[1]="(b) 2";
			q5_answers[2]="(c) 3";
			q5_answers[3]="(d) 4";
			q5_answers[4]="(e) 5";
			q5.setAnswers(q5_answers);
			q5.setCorrect_answer(3);
			
			quiz_list.clear();
			
			quiz_list.add(q1);
			quiz_list.add(q2);
			quiz_list.add(q3);
			quiz_list.add(q4);
			quiz_list.add(q5);
			
			
			return quiz_list;
		}
		
		public static LinkedList  prepare_and_deliver_test_10() {
			
			
			//The initialization allows to enter dynamically  the objects, there is no limit to enter.
				
			quiz q1 = new quiz();
			q1.setCode(10);
			q1.setQuestion("Question 1: What type of intermolecular forces are due to the attraction between temporary dipoles and their induced temporary dipoles?");
			String[] q1_answers = new String[5];
			q1_answers[0]="(a) metallic bond";
			q1_answers[1]="(b) London dispersion";
			q1_answers[2]="(c) hydrogen bond";
			q1_answers[3]="(d) ionic bond";
			q1_answers[4]="(e) covalent bond";
			q1.setAnswers(q1_answers);
			q1.setCorrect_answer(1);

			quiz q2 = new quiz();
			q2.setCode(10);
			q2.setQuestion("Question 2: What type of interparticle forces holds liquid N2 together?");
			String[] q2_answers = new String[5];
			q2_answers[0]="(a) ionic bonding";
			q2_answers[1]="(b) London forces";
			q2_answers[2]="(c) hydrogen bonding";
			q2_answers[3]="(d) dipole-dipole interaction";
			q2_answers[4]="(e) covalent bonding";
			q2.setAnswers(q2_answers);
			q2.setCorrect_answer(1);
			
			quiz q3 = new quiz();
			q3.setCode(10);
			q3.setQuestion("Question 3: Which of the following boils at the highest temperature?");
			String[] q3_answers = new String[5];
			q3_answers[0]="(a) CH4";
			q3_answers[1]="(b) C2H6";
			q3_answers[2]="(c) C3H8";
			q3_answers[3]="(d) C4H10";
			q3_answers[4]="(e) C5H12";
			q3.setAnswers(q3_answers);
			q3.setCorrect_answer(4);
			
			quiz q4 = new quiz();
			q4.setCode(10);
			q4.setQuestion("Question 4: Which probably has the lowest boiling point at 1.00 atm?");
			String[] q4_answers = new String[5];
			q4_answers[0]="(a) HF";
			q4_answers[1]="(b) HCl";
			q4_answers[2]="(c) HBr";
			q4_answers[3]="(d) HI";
			q4_answers[4]="(e) H2SO4";
			q4.setAnswers(q4_answers);
			q4.setCorrect_answer(1);
			
			quiz q5 = new quiz();
			q5.setCode(10);
			q5.setQuestion("Question 5: The normal boiling point of a liquid is");
			String[] q5_answers = new String[5];
			q5_answers[0]="(a) the temperature at which the vapor pressure equals 760 torr.";
			q5_answers[1]="(b) the temperature above which the substance cannot exist as a liquid regardless of the pressure.";
			q5_answers[2]="(c) the temperature at which the gas molecules have more kinetic energy than the molecules in the liquid.";
			q5_answers[3]="(d) the only temperature at which there can be equilibrium between liquid and gas.";
			q5_answers[4]="(e) the temperature at which the liquid will usually boil.";
			q5.setAnswers(q5_answers);
			q5.setCorrect_answer(0);
			
			quiz_list.clear();
			
			quiz_list.add(q1);
			quiz_list.add(q2);
			quiz_list.add(q3);
			quiz_list.add(q4);
			quiz_list.add(q5);
			
			
			return quiz_list;
		}
		
		public static LinkedList  prepare_and_deliver_test_11() {
			
			
			//The initialization allows to enter dynamically  the objects, there is no limit to enter.
				
			quiz q1 = new quiz();
			q1.setCode(11);
			q1.setQuestion("Question 1: What alkaline earth metal is located in period 3?");
			String[] q1_answers = new String[5];
			q1_answers[0]="(a) Li";
			q1_answers[1]="(b) Na";
			q1_answers[2]="(c) Ca";
			q1_answers[3]="(d) Mg";
			q1_answers[4]="(e) Sr";
			q1.setAnswers(q1_answers);
			q1.setCorrect_answer(3);

			quiz q2 = new quiz();
			q2.setCode(11);
			q2.setQuestion("Which of the following is classified as a metal?");
			String[] q2_answers = new String[5];
			q2_answers[0]="(a) Ge";
			q2_answers[1]="(b) As";
			q2_answers[2]="(c) F";
			q2_answers[3]="(d) V";
			q2_answers[4]="(e) Ar";
			q2.setAnswers(q2_answers);
			q2.setCorrect_answer(3);
			
			quiz q3 = new quiz();
			q3.setCode(11);
			q3.setQuestion("Question 3: Which of the following is a weak acid?");
			String[] q3_answers = new String[5];
			q3_answers[0]="(a) H2SO4";
			q3_answers[1]="(b)(b) HClO3";
			q3_answers[2]="(c) HF";
			q3_answers[3]="(d) HCl";
			q3_answers[4]="(e) HNO3";
			q3.setAnswers(q3_answers);
			q3.setCorrect_answer(2);
			
			quiz q4 = new quiz();
			q4.setCode(11);
			q4.setQuestion("Question 4: Which one of the following is likely to be the most soluble base?");
			String[] q4_answers = new String[5];
			q4_answers[0]="(a) Ca(OH)2";
			q4_answers[1]="(b) Cu(OH)2";
			q4_answers[2]="(c) Ga(OH)3";
			q4_answers[3]="(d) Zn(OH)2";
			q4_answers[4]="(e) Zr(OH)3";
			q4.setAnswers(q4_answers);
			q4.setCorrect_answer(0);
			
			quiz q5 = new quiz();
			q5.setCode(11);
			q5.setQuestion("Question 5: Which one of the following statements is TRUE?");
			String[] q5_answers = new String[5];
			q5_answers[0]="(a) One mole of any acid will ionize completely in aqueous solution to produce one mole of H+ ions.";
			q5_answers[1]="(b) Solutions of weak acids always have lower concentrations of H+ than solutions of strong acids.";
			q5_answers[2]="(c) There are several common acids that are insoluble.";
			q5_answers[3]="(d) All of the IA and IIA metal hydroxides are soluble.";
			q5_answers[4]="(e) All weak acids are insoluble.";
			q5.setAnswers(q5_answers);
			q5.setCorrect_answer(1);
			
			quiz_list.clear();
			
			quiz_list.add(q1);
			quiz_list.add(q2);
			quiz_list.add(q3);
			quiz_list.add(q4);
			quiz_list.add(q5);
			
			
			return quiz_list;
		}
		
		public static LinkedList  prepare_and_deliver_test_12() {
			
			
			//The initialization allows to enter dynamically  the objects, there is no limit to enter.
				
			quiz q1 = new quiz();
			q1.setCode(12);
			q1.setQuestion("Question 1: Select the term best describing the series of elements: Mn, Fe, Co, Ni, Cu.");
			String[] q1_answers = new String[5];
			q1_answers[0]="(a) d-transition metals";
			q1_answers[1]="(b) representative elements";
			q1_answers[2]="(c) metalloids";
			q1_answers[3]="(d) alkaline earth metals";
			q1_answers[4]="(e) halogens";
			q1.setAnswers(q1_answers);
			q1.setCorrect_answer(0);

			quiz q2 = new quiz();
			q2.setCode(12);
			q2.setQuestion("Question 2: Which element has the largest atomic radius?");
			String[] q2_answers = new String[5];
			q2_answers[0]="(a) Li";
			q2_answers[1]="(b) Na";
			q2_answers[2]="(c) Rb";
			q2_answers[3]="(d) F";
			q2_answers[4]="(e) I";
			q2.setAnswers(q2_answers);
			q2.setCorrect_answer(2);
			
			quiz q3 = new quiz();
			q3.setCode(12);
			q3.setQuestion("Question 3: Which element has the lowest first ionization energy?");
			String[] q3_answers = new String[5];
			q3_answers[0]="(a) He";
			q3_answers[1]="(b) Ne";
			q3_answers[2]="(c) Ar";
			q3_answers[3]="(d) Kr";
			q3_answers[4]="(e) Xe";
			q3.setAnswers(q3_answers);
			q3.setCorrect_answer(4);
			
			quiz q4 = new quiz();
			q4.setCode(12);
			q4.setQuestion("Question 4: Which element has the highest first ionization energy?");
			String[] q4_answers = new String[5];
			q4_answers[0]="(a) Be";
			q4_answers[1]="(b) B";
			q4_answers[2]="(c) C";
			q4_answers[3]="(d) N";
			q4_answers[4]="(e) O";
			q4.setAnswers(q4_answers);
			q4.setCorrect_answer(3);
			
			quiz q5 = new quiz();
			q5.setCode(12);
			q5.setQuestion("Question 5: Which of the following elements has the greatest attraction for electrons in a covalent bond?");
			String[] q5_answers = new String[5];
			q5_answers[0]="(a) Ge";
			q5_answers[1]="(b) As";
			q5_answers[2]="(c) Se";
			q5_answers[3]="(d) Br";
			q5_answers[4]="(e) Bi";
			q5.setAnswers(q5_answers);
			q5.setCorrect_answer(3);
			
			quiz_list.clear();
			
			quiz_list.add(q1);
			quiz_list.add(q2);
			quiz_list.add(q3);
			quiz_list.add(q4);
			quiz_list.add(q5);
			
			
			return quiz_list;
		}
		
		public static LinkedList  prepare_and_deliver_test_13() {
			
			
			//The initialization allows to enter dynamically  the objects, there is no limit to enter.
				
			quiz q1 = new quiz();
			q1.setCode(13);
			q1.setQuestion("Question 1: The 'magic numbers' for atoms are");
			String[] q1_answers = new String[5];
			q1_answers[0]="(a) numbers of electrons that confer atomic stability.";
			q1_answers[1]="(b) numbers of protons and/or neutrons that confer nuclear stability.";
			q1_answers[2]="(c) n/p ratios that confer nuclear stability.";
			q1_answers[3]="(d) atomic masses that confer nuclear stability.";
			q1_answers[4]="(e) atomic masses that indicate fissile isotopes.";
			q1.setAnswers(q1_answers);
			q1.setCorrect_answer(1);

			quiz q2 = new quiz();
			q2.setCode(13);
			q2.setQuestion("Question 2: Which of the following statements is incorrect?");
			String[] q2_answers = new String[5];
			q2_answers[0]="(a) Mass defect is the amount of matter that would be converted into energy if a nucleus were formed from initially separated protons and neutrons";
			q2_answers[1]="(b) Nuclear binding energy is the energy released in the formation of an atom from subatomic particles.";
			q2_answers[2]="(c) Nuclei with highest binding energies are the most stable nuclei.";
			q2_answers[3]="(d) Einstein postulated the Theory of Relativity in which he stated that matter and energy are equivalent.";
			q2_answers[4]="(e) Mass number is the sum of all protons and electrons in an atom.";
			q2.setAnswers(q2_answers);
			q2.setCorrect_answer(4);
			
			quiz q3 = new quiz();
			q3.setCode(13);
			q3.setQuestion("Question 3: A positron has a mass number of _____, a charge of _____, and a mass equal to that of a(an) _____.");
			String[] q3_answers = new String[5];
			q3_answers[0]="(a) 0, 1+, proton";
			q3_answers[1]="(b) 1, 2+, proton";
			q3_answers[2]="(c) 0, 1+, electron";
			q3_answers[3]="(d) 1, 2+, electron";
			q3_answers[4]="(e) 0, 0, proton";
			q3.setAnswers(q3_answers);
			q3.setCorrect_answer(2);
			
			quiz q4 = new quiz();
			q4.setCode(13);
			q4.setQuestion("Question 4: Emission of which one of the following leaves both atomic number and mass number unchanged?");
			String[] q4_answers = new String[5];
			q4_answers[0]="(a) positron";
			q4_answers[1]="(b) neutron";
			q4_answers[2]="(c) alpha particle";
			q4_answers[3]="(d) gamma radiation";
			q4_answers[4]="(e) beta particle";
			q4.setAnswers(q4_answers);
			q4.setCorrect_answer(3);
			
			quiz q5 = new quiz();
			q5.setCode(13);
			q5.setQuestion("Question 5: Which type of radiation is the least penetrating?");
			String[] q5_answers = new String[5];
			q5_answers[0]="(a) alpha";
			q5_answers[1]="(b) beta";
			q5_answers[2]="(c) gamma";
			q5_answers[3]="(d) x-ray";
			q5_answers[4]="(e) neutron";
			q5.setAnswers(q5_answers);
			q5.setCorrect_answer(0);
			
			quiz_list.clear();
			
			quiz_list.add(q1);
			quiz_list.add(q2);
			quiz_list.add(q3);
			quiz_list.add(q4);
			quiz_list.add(q5);
			
			
			return quiz_list;
		}
		
}

