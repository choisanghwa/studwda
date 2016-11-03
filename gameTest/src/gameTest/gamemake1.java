package gameTest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


class JPmain extends JPanel{
		private JTextField name;
		private JLabel nameq,text1,text2;
		private JButton start,rank;
		private GameFram game01;
		
		public JPmain(GameFram game01){
			this.game01 = game01;
			setLayout(null);
			
			text1 = new JLabel("����Գ�");
			add(text1);
			
			nameq = new JLabel("�̸��� ����?: ");
			add(nameq);
			
			name = new JTextField(10);
			add(name);
			
			start = new JButton("����");
			start.addActionListener(new gamestart());
			add(start);
			
			rank = new JButton("����");
			//rank.addActionListener(new gamerank());
			add(rank);
			
		}
		class gamestart implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				game01.change("2");
				
			}
			
		}
		
		
	}
	class JPgamsart extends JPanel{
		private JLabel text001,count1,rest;
		private JCheckBox[] stones;
		String[] kgs = {"A","B","C","D","E","F"};
		private JButton gogo,dab;
		
		public JPgamsart(GameFram game01){
			text001 =new JLabel("6���� ���� ���԰� �ٸ� �� �ϳ��� ã�ƶ�");
			add(text001);
			
			rest = new JLabel("����� Ƚ�� : ");
			add(rest);
			
			for(int i=0; i<5; i++){
				stones[i] = new JCheckBox(kgs[i]);
				add(stones[i]);
			}
			
			gogo = new JButton("�������");
			dab = new JButton("����?");
			
			
		}
		
	}



	
class GameFram extends JFrame{
			public JPmain Jmain = null;
			public JPgamsart Jgamesat = null;
	
			public void change(String panelName){
				if(panelName.equals("1")){
					getContentPane().removeAll();
					getContentPane().add(Jmain);
					revalidate();
					repaint();
				}else{
				getContentPane().removeAll();
				getContentPane().add(Jgamesat);
				revalidate();
				repaint();
				}
			}
	
public static void main(String[] args) {
		GameFram game01 = new GameFram();
		
		game01.setTitle("�������� ����");
		game01.Jmain = new JPmain(game01);
		game01.Jgamesat = new JPgamsart(game01);

		game01.add(game01.Jmain);
		game01.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		game01.setVisible(true);
	}
}
