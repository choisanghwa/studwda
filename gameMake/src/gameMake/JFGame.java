package gameMake;

import java.awt.Graphics;

import javax.swing.*;

public class JFGame extends JFrame {
	ImageIcon bgimg;
	static JPanel1 main1;
	
	//�гλ�����
	public JFGame(){
		setTitle("Game");
		setSize(906,662);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//����ȭ�� �г��̴�. 
		//�̹����� �־ ����� ���Ͽ���.
		bgimg= new ImageIcon("../gameMake/img/main1-1.jpg");
		main1 = new JPanel1(){
			public void paintComponent(Graphics g) {
                g.drawImage(bgimg.getImage(), 0, 0, null);
                setOpaque(false);//�׸��� ǥ���ϰ� ����,�����ϰ� ����
                super.paintComponent(g);
           }
		};
		
		add(main1);
		setVisible(true);
	}
}
