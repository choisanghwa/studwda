package gameMake;

import javax.swing.*;

public class JPanel02 extends JPanel{
	JLabel text001,count1,rest;
	JCheckBox stones1,stones2,stones3,stones4,stones5,stones6;
	JButton gogo,dab,return1;

	public JPanel02(){
		
		text001 =new JLabel("6개의 돌중 무게가 다른 돌 하나를 찾아라");
		add(text001);
	
		rest = new JLabel("재시작 횟수 : ");
		add(rest);
	
		stones1 = new JCheckBox("a");
		add(stones1);
		stones2 = new JCheckBox("b");
		add(stones2);
		stones3 = new JCheckBox("c");
		add(stones3);
		stones4 = new JCheckBox("d");
		add(stones4);
		stones5 = new JCheckBox("e");
		add(stones5);
		stones6 = new JCheckBox("f");
		add(stones6);
	
	
		//무게재기를 누르면 무게재기 새창이 뜬다.
		gogo = new JButton("무게재기");
		add(gogo);
		//gogo.addActionListener(new okcheck());

		//정답맞추기를 누르면  답맞추기 창으로 이동한다.
		dab = new JButton("정답맞추기");		
		add(dab);
		
		//돌아가기 버튼, 누르면 메인Frame으로 돌아간다
		return1 = new JButton("돌아가기");
		add(return1);
		//return1.addActionListener(new returngo());
		
		}
}

