package gameText;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class gameFrame extends JFrame{
	
	private JTextField name;
	private JLabel text1,text2;
	private JButton start,rank;
	public JPanel mainPanme;
	public gameFrame() {
		setTitle("main_strat");
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//ssListener listener = new ssListener();
		
		mainPanme = new JPanel();
		text1 = new JLabel("����Գ�");
		mainPanme.add(text1);
		
		mainPanme.add(new JLabel("�̸��� ����?: "));
		name = new JTextField(10);
		//name.addActionListener(listener);
		mainPanme.add(name);
		
		text2 = new JLabel("���� ���� �غ���");
		mainPanme.add(text2);
		
		start = new JButton("����");
		start.addActionListener(new gamestart());
		mainPanme.add(start);
		
		rank = new JButton("����");
		//rank.addActionListener(new gamerank());
		mainPanme.add(rank);
		
		add(mainPanme);
		setVisible(true);
		
		
	}
	class gamestart implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			mainPanme.setVisible(false);
			JFrame gamest = new JFrame("game_strat");
			gamest.setSize(500,500);
			gamest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			
			gamest.setVisible(true);
		}
		
	}
}

public class gameTe {

	public static void main(String[] args) {
		gameFrame main = new gameFrame();
	}

}
