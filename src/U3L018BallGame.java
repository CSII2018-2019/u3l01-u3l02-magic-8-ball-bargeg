import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	JLabel phrase = new JLabel(); 
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
		generateRandomPhrase(); 
		//titleLabel.setHorizontalAlignment(JLabel.CENTER);
		
		//PLACE FOR THE PHRASE
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
		shakeButton.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				randomShake(); 
			}
		}); 

		downButtonPanel.add(shakeButton);
	}
	private void generateRandomPhrase() {
		int whichPhrase = (int)(Math.random() * 6 +1);
		if (whichPhrase == 1) {
			phrase.setText("Yes, you shall");
			add(phrase, BorderLayout.CENTER);
			phrase.setHorizontalAlignment(JLabel.CENTER); //left or right
			//customize label
			Font titleFont = new Font ("Times new Roman" , Font.BOLD + Font.ITALIC,  32);
			phrase.setFont(titleFont);
			phrase.setForeground(Color.BLACK);
			
		}
		else if (whichPhrase == 2) {
			phrase.setText("My signs point to never");
			add(phrase, BorderLayout.CENTER);
			phrase.setHorizontalAlignment(JLabel.CENTER); //left or right
			//customize label
			Font titleFont = new Font ("Times new Roman" , Font.BOLD + Font.ITALIC,  32);
			phrase.setFont(titleFont);
			phrase.setForeground(Color.BLACK); 
		} 
		else if (whichPhrase == 3) {
			phrase.setText("What're you thinking?!? NO!!");
			add(phrase, BorderLayout.CENTER);
			phrase.setHorizontalAlignment(JLabel.CENTER); //left or right
			//customize label
			Font titleFont = new Font ("Times new Roman" , Font.BOLD + Font.ITALIC,  32);
			phrase.setFont(titleFont);
			phrase.setForeground(Color.BLACK); 
		} 
		else if (whichPhrase == 4) {
			phrase.setText("Of course, yes!");
			add(phrase, BorderLayout.CENTER);
			phrase.setHorizontalAlignment(JLabel.CENTER); //left or right
			//customize label
			Font titleFont = new Font ("Times new Roman" , Font.BOLD + Font.ITALIC,  32);
			phrase.setFont(titleFont);
			phrase.setForeground(Color.BLACK); 
		} 
		else if (whichPhrase == 5) {
			phrase.setText("Maybe.. time will tell");
			add(phrase, BorderLayout.CENTER);
			phrase.setHorizontalAlignment(JLabel.CENTER); //left or right
			//customize label
			Font titleFont = new Font ("Times new Roman" , Font.BOLD + Font.ITALIC,  32);
			phrase.setFont(titleFont);
			phrase.setForeground(Color.BLACK); 
		} 
		else if (whichPhrase == 6) {
			phrase.setText("Why haven't you done it yet?!");
			add(phrase, BorderLayout.CENTER);
			phrase.setHorizontalAlignment(JLabel.CENTER); //left or right
			//customize label
			Font titleFont = new Font ("Times new Roman" , Font.BOLD + Font.ITALIC,  32);
			phrase.setFont(titleFont);
			phrase.setForeground(Color.BLACK); 
		} 
	}
	private void randomShake() {
		int whichPhrase = (int) (Math.random() * 6 +1);
	updatePhrase(whichPhrase); 
	} 
	private void updatePhrase(int w) {
		int whichPhrase = w; 
		if (whichPhrase == 1) {
			phrase.setText("Yes, you shall");
			phrase.setBackground(Color.WHITE);
			add(phrase, BorderLayout.CENTER);
			phrase.setHorizontalAlignment(JLabel.CENTER); //left or right
			//customize label
			Font titleFont = new Font ("Times new Roman" , Font.BOLD + Font.ITALIC,  32);
			phrase.setFont(titleFont);
			phrase.setForeground(Color.BLACK);
			
		}
		else if (whichPhrase == 2) {
			phrase.setText("My signs point to never");
			phrase.setBackground(Color.WHITE);
			add(phrase, BorderLayout.CENTER);
			phrase.setHorizontalAlignment(JLabel.CENTER); //left or right
			//customize label
			Font titleFont = new Font ("Times new Roman" , Font.BOLD + Font.ITALIC,  32);
			phrase.setFont(titleFont);
			phrase.setForeground(Color.BLACK); 
		} 
		else if (whichPhrase == 3) {
			phrase.setText("What're you thinking?!? NO!!");
			phrase.setBackground(Color.WHITE);
			add(phrase, BorderLayout.CENTER);
			phrase.setHorizontalAlignment(JLabel.CENTER); //left or right
			//customize label
			Font titleFont = new Font ("Times new Roman" , Font.BOLD + Font.ITALIC,  32);
			phrase.setFont(titleFont);
			phrase.setForeground(Color.BLACK); 
		} 
		else if (whichPhrase == 4) {
			phrase.setText("Of course, yes!");
			phrase.setBackground(Color.WHITE);
			add(phrase, BorderLayout.CENTER);
			phrase.setHorizontalAlignment(JLabel.CENTER); //left or right
			//customize label
			Font titleFont = new Font ("Times new Roman" , Font.BOLD + Font.ITALIC,  32);
			phrase.setFont(titleFont);
			phrase.setForeground(Color.BLACK); 
		} 
		else if (whichPhrase == 5) {
			phrase.setText("Maybe.. time will tell");
			phrase.setBackground(Color.WHITE);
			add(phrase, BorderLayout.CENTER);
			phrase.setHorizontalAlignment(JLabel.CENTER); //left or right
			//customize label
			Font titleFont = new Font ("Times new Roman" , Font.BOLD + Font.ITALIC,  32);
			phrase.setFont(titleFont);
			phrase.setForeground(Color.BLACK); 
		} 
		else if (whichPhrase == 6) {
			phrase.setText("Why haven't you done it yet?!");
			phrase.setBackground(Color.WHITE);
			add(phrase, BorderLayout.CENTER);
			phrase.setHorizontalAlignment(JLabel.CENTER); //left or right
			//customize label
			Font titleFont = new Font ("Times new Roman" , Font.BOLD + Font.ITALIC,  32);
			phrase.setFont(titleFont);
			phrase.setForeground(Color.BLACK); 
		} 
	
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
