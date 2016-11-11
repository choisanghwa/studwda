package gameMake;



import java.awt.Graphics;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PaGam extends JPanel{
	ImageIcon bgimg2;
	Jcheck check1;
	JLabel text001,count1,rest,names;
	JCheckBox stones1,stones2,stones3,stones4,stones5,stones6;
	JButton weight,dab,return1;
	int wei_count= 0;
	Pasolu solution;
	public PaGam(PaMain main2, JFGame gmmain, String name1){
		//메인이미지
		bgimg2 = new ImageIcon("../gameMake/img/Gameimg.jpg");
	
		//재시작횟수
		names =new JLabel(name1+"의 현재 횟수는");
		add(names);
		
		rest = new JLabel();
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
		count1 =new JLabel();
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
					setVisible(false);
					removeAll();
					solution = new Pasolu(main2,gmmain);
					gmmain.add(solution);
					solution.setVisible(true);
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
	
	/*@Override
	public void paintComponent(Graphics g2) {
		g2.drawImage(bgimg2.getImage(), 0, 0, null);
		setOpaque(false);
		super.paintComponent(g2);
	}*/
}

