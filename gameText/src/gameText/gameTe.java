package gameText;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class gamestart implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		JFrame gamest = new JFrame("game_strat");
		gamest.setSize(500,500);
		gamest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gamest.setVisible(true);
		
	}
	
}

public class gameTe {

	public static void main(String[] args) {
		//유저이름 저장하기 위해 둔것
		//String usname = "";
		
		
		JFrame main1 = new JFrame("main_strat");
		main1.setSize(300, 300);
		main1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel mpanal = new JPanel();
		JLabel nameQ = new JLabel("그대의 이름은 무엇인가?");
		
		JLabel name = new JLabel("내 이름은 : ");
		JTextField namet = new JTextField(10);
		
		JLabel texts = new JLabel("나랑 게임 해보자");
		
		JButton mbutton1 = new JButton("시작");
		mbutton1.addActionListener(new gamestart());
		
		JButton mbutton2 = new JButton("랭킹");
		mpanal.add(nameQ);
		mpanal.add(name);
		mpanal.add(namet);
		mpanal.add(texts);
		mpanal.add(mbutton1);
		mpanal.add(mbutton2);
		
		
		main1.add(mpanal);
		
		main1.setVisible(true);
		
	}

}
