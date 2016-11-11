package gameMake;



import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PaGam extends JPanel{
	ImageIcon bgimg2;
	Jcheck check1;
	JLabel text001,count1,rest;
	JCheckBox stones1,stones2,stones3,stones4,stones5,stones6;
	JButton weight,dab,return1;
	int wei_count= 0;
	Pasolu solution;
	public PaGam(PaMain main2, JFGame gmmain){
		
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
		
		//무게 카운터 나타내는 라벨
		count1 =new JLabel("현재 무게 잰 횟수");
		add(count1);
		
		//무게재기를 누르면 무게재기 새창이 뜬다.
		weight = new JButton("무게재기");
		weight.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
					if (wei_count < 3 &&  arg0.getSource() == weight){						
						wei_count++;
						check1 = new Jcheck();
				}
				
			}
			
		});
		add(weight);
		
		//정답맞추기를 누르면  답맞추기 창으로 이동한다.
		dab = new JButton("정답맞추기");		
		dab.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent da) {
				if(da.getSource() == dab){
					removeAll();
					solution = new Pasolu();
					
				}
				
			}
			
		});
		add(dab);
		
		//돌아가기 버튼, 누르면 메인Frame으로 돌아간다
		return1 = new JButton("돌아가기");
		return1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (arg0.getSource() == return1){
					removeAll();
					if(wei_count !=0){
						check1.dispose();
					}
					main2.setVisible(true);
				}
				
			}		
		});
		add(return1);
		}
}

