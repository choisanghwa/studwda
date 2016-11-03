package gamemakeTest;

import javax.swing.*;

import gameTest.GameFram;
import gameText.gameFrame.gamestart;

public class gamesTest4 {
	class MyGame extends JFrame{
		public JPanel mainPanme;
		
		public MyGame(){
			setSize(400,400);
			setTitle("main_strat");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
			mainPanme = new JPanel();
			JLabel text1 = new JLabel("어서오게나");
			mainPanme.add(text1);
			
			mainPanme.add(new JLabel("이름은 뭔가?: "));
			JTextField name = new JTextField(10);
			//name.addActionListener(listener);
			mainPanme.add(name);
			
			JLabel text2 = new JLabel("나랑 게임 해보자");
			mainPanme.add(text2);
			
			JButton start = new JButton("시작");
			start.addActionListener(new gamestart());
			mainPanme.add(start);
			
			JButton rank = new JButton("순위");
			//rank.addActionListener(new gamerank());
			mainPanme.add(rank);
			
			add(mainPanme);
			setVisible(true);
			
		}
		
	}
	public static void main(String[] args) {
		MyGame main = new MyGame();

	}

}
