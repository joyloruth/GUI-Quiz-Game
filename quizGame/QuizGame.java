package quizGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class QuizGame implements ActionListener {
	
	JFrame frame = new JFrame();
	ImageIcon icon = new ImageIcon("quizlogo.png");
	JTextField field =  new JTextField();
	JTextArea area = new JTextArea();
	
	JButton button_A = new JButton();
	JButton button_B = new JButton();
	JButton button_C = new JButton();
	JButton button_D = new JButton();
	
	JLabel answer_A = new JLabel();
	JLabel answer_B = new JLabel();
	JLabel answer_C = new JLabel();
	JLabel answer_D = new JLabel();
	
	JLabel time_label = new JLabel();
	JLabel seconds_left = new JLabel();
	
	JTextField number_right = new JTextField();
	JTextField percentage = new JTextField();
	

	String[] questions = 	{
								"What is your fav color?",
								"What is your name?",
								"Are you single or married?",
								"What is your favorite food?"
							};
	
	
	String[][] options = 	{
								{"blue","red","orange","yellow"},
								{"Blue Ivy","Karlie Redd","Al Green","Beyonce"},
								{"no","yes"},
								{"green tomatoes","cabbage","spaghetti","cake"},
							};
	
	
	char[] answers = 		{
								'A',
								'B',
								'C',
								'D'
							};
	
	
	
	char guess;
	char answer;
	int index;
	int correct_guesses = 0;
	int total = questions.length;
	int result;
	int seconds = 10;
	

	QuizGame(){
		
	
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setTitle("Quiz Game");
		frame.setSize(650, 650);
		frame.getContentPane().setBackground(Color.black);
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setVisible(true);
		
		frame.setIconImage(icon.getImage());
		
		frame.add(field);
		frame.add(area);
		
		field.setBounds(0,0,650,50);
		field.setBackground(new Color(25,25,25));
		field.setForeground(new Color(25,255,0));
		field.setFont(new Font("Ink Free", Font.BOLD,40));
		field.setBorder(BorderFactory.createBevelBorder(1));
		field.setHorizontalAlignment(JTextField.CENTER);
		field.setEditable(false);
		field.setText("Quiz Game");
		
		area.setBounds(0,50,650,50);
		area.setLineWrap(true);
		area.setWrapStyleWord(true);
		area.setBackground(new Color(25,35,25));
		area.setForeground(new Color(25,255,50));
		area.setFont(new Font("Arial", Font.BOLD,40));
		area.setBorder(BorderFactory.createBevelBorder(1));
		//area.setHorizontalAlignment(JTextField.CENTER);
		area.setEditable(false);
		//area.setText("Quiz Game");
		
		button_A.setBounds(0, 100, 100, 100);
		button_A.setFont(new Font("MV Boli",Font.BOLD,35));
		button_A.setText("Button A");
		button_A.setFocusable(false);
		button_A.setText("A");
		button_A.addActionListener(this);
		
		frame.add(button_A);
		

}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}