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
			JLabel text1 = new JLabel("����Գ�");
			mainPanme.add(text1);
			
			mainPanme.add(new JLabel("�̸��� ����?: "));
			JTextField name = new JTextField(10);
			//name.addActionListener(listener);
			mainPanme.add(name);
			
			JLabel text2 = new JLabel("���� ���� �غ���");
			mainPanme.add(text2);
			
			JButton start = new JButton("����");
			start.addActionListener(new gamestart());
			mainPanme.add(start);
			
			JButton rank = new JButton("����");
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
