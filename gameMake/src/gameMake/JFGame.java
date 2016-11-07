package gameMake;

import java.awt.Graphics;

import javax.swing.*;

public class JFGame extends JFrame {
	ImageIcon bgimg;
	static JPanel1 main1;
	
	//패널생성자
	public JFGame(){
		setTitle("Game");
		setSize(906,662);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//메인화면 패널이다. 
		//이미지를 넣어서 배경을 정하였다.
		bgimg= new ImageIcon("../gameMake/img/main1-1.jpg");
		main1 = new JPanel1(){
			public void paintComponent(Graphics g) {
                g.drawImage(bgimg.getImage(), 0, 0, null);
                setOpaque(false);//그림을 표시하게 설정,투명하게 조절
                super.paintComponent(g);
           }
		};
		
		add(main1);
		setVisible(true);
	}
}
