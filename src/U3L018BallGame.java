import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class U3L018BallGame extends JFrame {
	//computer's color- randomly generated 
	private int compRed = 0;
	private int compGreen = 0; 
	private int compBlue = 0; 
	private Color compColor = new Color (compRed, compGreen, compBlue); 
	public U3L018BallGame() {
		initGUI();
		
		setTitle("8 Ball Truth");
		setSize(800,400);
		setResizable(true);
		setLocationRelativeTo(null);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public void initGUI() {
		//title for "this is your phrase..
		JLabel introWords = new JLabel("Your answer is...");
		add(introWords, BorderLayout.PAGE_START);
		Font wordFont = new Font ("Arial" , Font.BOLD + Font.ITALIC,  40);
		introWords.setFont(wordFont);
		introWords.setForeground(Color.BLACK);
		//titleLabel.setHorizontalAlignment(JLabel.CENTER);
		
		//PLACE FOR THE PHRASE
		int whichPhrase = (int) (Math.random() * 6 +1);
		if (whichPhrase == 1) {
			JLabel phrase = new JLabel("Yes, you shall");
			add(phrase, BorderLayout.CENTER);
			phrase.setHorizontalAlignment(JLabel.CENTER); //left or right
			//customize label
			Font titleFont = new Font ("Times new Roman" , Font.BOLD + Font.ITALIC,  32);
			phrase.setFont(titleFont);
			phrase.setForeground(Color.BLACK);
			
		}
		else if (whichPhrase == 2) {
			JLabel phrase = new JLabel("My signs point to never");
			add(phrase, BorderLayout.CENTER);
			phrase.setHorizontalAlignment(JLabel.CENTER); //left or right
			//customize label
			Font titleFont = new Font ("Times new Roman" , Font.BOLD + Font.ITALIC,  32);
			phrase.setFont(titleFont);
			phrase.setForeground(Color.BLACK); 
		} 
		else if (whichPhrase == 3) {
			JLabel phrase = new JLabel("What're you thinking?!? NO!!");
			add(phrase, BorderLayout.CENTER);
			phrase.setHorizontalAlignment(JLabel.CENTER); //left or right
			//customize label
			Font titleFont = new Font ("Times new Roman" , Font.BOLD + Font.ITALIC,  32);
			phrase.setFont(titleFont);
			phrase.setForeground(Color.BLACK); 
		} 
		else if (whichPhrase == 4) {
			JLabel phrase = new JLabel("Of course, yes!");
			add(phrase, BorderLayout.CENTER);
			phrase.setHorizontalAlignment(JLabel.CENTER); //left or right
			//customize label
			Font titleFont = new Font ("Times new Roman" , Font.BOLD + Font.ITALIC,  32);
			phrase.setFont(titleFont);
			phrase.setForeground(Color.BLACK); 
		} 
		else if (whichPhrase == 5) {
			JLabel phrase = new JLabel("Maybe.. time will tell");
			add(phrase, BorderLayout.CENTER);
			phrase.setHorizontalAlignment(JLabel.CENTER); //left or right
			//customize label
			Font titleFont = new Font ("Times new Roman" , Font.BOLD + Font.ITALIC,  32);
			phrase.setFont(titleFont);
			phrase.setForeground(Color.BLACK); 
		} 
		else if (whichPhrase == 6) {
			JLabel phrase = new JLabel("Why haven't you done it yet?!");
			add(phrase, BorderLayout.CENTER);
			phrase.setHorizontalAlignment(JLabel.CENTER); //left or right
			//customize label
			Font titleFont = new Font ("Times new Roman" , Font.BOLD + Font.ITALIC,  32);
			phrase.setFont(titleFont);
			phrase.setForeground(Color.BLACK); 
		} 
		
		//create if statements for the responses you can get
		//maybe math random and then if # then.. 
		
		//shake button
		JPanel downButtonPanel = new JPanel();
		downButtonPanel.setBackground(Color.LIGHT_GRAY);
		add(downButtonPanel, BorderLayout.PAGE_END);
		JButton shakeButton = new JButton ("SHAKE");
		shakeButton.setBackground(Color.DARK_GRAY);
		shakeButton.setForeground(Color.BLACK);
		Font ballFont = new Font ("Times new Roman" , Font.BOLD + Font.ITALIC,  32);
		shakeButton.setFont(ballFont);
		downButtonPanel.add(shakeButton);
	}
	
	public static void main(String[] args) {
		try {
            String className = UIManager.getCrossPlatformLookAndFeelClassName();
            UIManager.setLookAndFeel(className);
        } catch ( Exception e) {}
        
        EventQueue.invokeLater(new Runnable (){
            @Override
            public void run() {
                new U3L018BallGame();
            }   
        });
	}

}
