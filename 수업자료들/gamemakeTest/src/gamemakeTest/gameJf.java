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
                setOpaque(false);//�׸��� ǥ���ϰ� ����,�����ϰ� ����
                super.paintComponent(g);
           }
		};
		
		// �̹���
		
		
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

//���� ȭ��
class gamestart implements ActionListener{
	
	
	JLabel text001,count1,rest;
	JCheckBox stones1,stones2,stones3,stones4,stones5,stones6;
	
	private JButton gogo,dab,return1;
	
		@Override
		public void actionPerformed(ActionEvent arg0) {
			//���� �гε�
			gamest = new JPanel();
			text001 =new JLabel("6���� ���� ���԰� �ٸ� �� �ϳ��� ã�ƶ�");
			gamest.add(text001);
		
			rest = new JLabel("����� Ƚ�� : ");
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
		
		
			//������⸦ ������ ������� ��â�� ���.
			if(a > 0){
				
			}else{
			gogo = new JButton("�������");
			gamest.add(gogo);
			gogo.addActionListener(new okcheck());
			}
			//������߱⸦ ������  ����߱� â���� �̵��Ѵ�.
			dab = new JButton("������߱�");		
			gamest.add(dab);
			
			//���ư��� ��ư, ������ ����Frame���� ���ư���
			return1 = new JButton("���ư���");
			gamest.add(return1);
			return1.addActionListener(new returngo());
		
			add(gamest);
			gamest.setVisible(true);
			main1.setVisible(false);
			}
}

	//��ŷ �׼�
	class gamerank implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			JRank rank1 = new JRank();
		
		}
	
	}

	//���Ը��߱� ������ ����
	class okcheck implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			a++;
			check1 = new JCheck();
			 
				
		}
	}
	
	//���ư��� �׼�
	class returngo implements  ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
					
					gamest.setVisible(false);
					main1.setVisible(true);
					//���ư��⸦ ������ ������� â�� �������� �ݴ´�.
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
