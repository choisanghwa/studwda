package gamemakeTest;

import java.awt.Graphics;
import java.awt.event.*;

import javax.swing.*;

class JFGame extends JFrame{
	JCheck check1;
	ImageIcon bgimg;
	JButton start1,rank1;
	JTextField name;
	JPanel main1,gamest;
	JLabel imgss1;
	public int a = 0;
	
	
	public JFGame(){
		setTitle("Game");
		setSize(906,662);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bgimg= new ImageIcon("../gamemakeTest/img/main1-1.jpg");
		main1 = new JPanel(){
			public void paintComponent(Graphics g) {
                g.drawImage(bgimg.getImage(), 0, 0, null);
                setOpaque(false);//그림을 표시하게 설정,투명하게 조절
                super.paintComponent(g);
           }
		};
		
		// 이미지
		
		
//		imgss1 = new JLabel();
//		imgss1.setIcon(bgimg);
//		imgss1.setBounds(470, 10, 57, 57);
//		main1.add(imgss1);
		
		
		
		name = new JTextField(10);
	
		main1.add(name);
		
		start1 = new JButton("gamestart");	
		main1.add(start1);
		start1.addActionListener(new gamestart());
		
		rank1 = new JButton("Rank");
		rank1.addActionListener(new gamerank());
		
		main1.add(rank1);
		
		add(main1);
		
		
		setVisible(true);
		
	}

//게임 화면
class gamestart implements ActionListener{
	
	
	JLabel text001,count1,rest;
	JCheckBox stones1,stones2,stones3,stones4,stones5,stones6;
	
	private JButton gogo,dab,return1;
	
		@Override
		public void actionPerformed(ActionEvent arg0) {
			//게임 패널들
			gamest = new JPanel();
			text001 =new JLabel("6개의 돌중 무게가 다른 돌 하나를 찾아라");
			gamest.add(text001);
		
			rest = new JLabel("재시작 횟수 : ");
			gamest.add(rest);
		
			stones1 = new JCheckBox("a");
			gamest.add(stones1);
			stones2 = new JCheckBox("b");
			gamest.add(stones2);
			stones3 = new JCheckBox("c");
			gamest.add(stones3);
			stones4 = new JCheckBox("d");
			gamest.add(stones4);
			stones5 = new JCheckBox("e");
			gamest.add(stones5);
			stones6 = new JCheckBox("f");
			gamest.add(stones6);
		
		
			//무게재기를 누르면 무게재기 새창이 뜬다.
			if(a > 0){
				
			}else{
			gogo = new JButton("무게재기");
			gamest.add(gogo);
			gogo.addActionListener(new okcheck());
			}
			//정답맞추기를 누르면  답맞추기 창으로 이동한다.
			dab = new JButton("정답맞추기");		
			gamest.add(dab);
			
			//돌아가기 버튼, 누르면 메인Frame으로 돌아간다
			return1 = new JButton("돌아가기");
			gamest.add(return1);
			return1.addActionListener(new returngo());
		
			add(gamest);
			gamest.setVisible(true);
			main1.setVisible(false);
			}
}

	//랭킹 액션
	class gamerank implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			JRank rank1 = new JRank();
		
		}
	
	}

	//무게맞추기 프레임 띄우기
	class okcheck implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			a++;
			check1 = new JCheck();
			 
				
		}
	}
	
	//돌아가기 액션
	class returngo implements  ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
					
					gamest.setVisible(false);
					main1.setVisible(true);
					//돌아가기를 누를때 무게재기 창이 떠있으면 닫는다.
					if(a > 0){
					check1.dispose();
					a=0;
					}
			}
	}
}
public class gameJf {

	public static void main(String[] args) {
		JFGame gamemain = new JFGame();
	}

}
