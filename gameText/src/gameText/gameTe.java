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
		//�����̸� �����ϱ� ���� �а�
		//String usname = "";
		
		
		JFrame main1 = new JFrame("main_strat");
		main1.setSize(300, 300);
		main1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel mpanal = new JPanel();
		JLabel nameQ = new JLabel("�״��� �̸��� �����ΰ�?");
		
		JLabel name = new JLabel("�� �̸��� : ");
		JTextField namet = new JTextField(10);
		
		JLabel texts = new JLabel("���� ���� �غ���");
		
		JButton mbutton1 = new JButton("����");
		mbutton1.addActionListener(new gamestart());
		
		JButton mbutton2 = new JButton("��ŷ");
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
