package gameMake;


import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class JFgood extends JPanel{
		JButton restart,exits;
		int restart1=1;
		ImageIcon bgimg4;
	public JFgood(setgetclass name1, JFGame gmmain){
		bgimg4 = new ImageIcon("../gameMake/img/solutio_1.jpg");
		MyListener listener = new MyListener(gmmain);
		restart =new JButton("시작페이지로");
		exits = new JButton("그만두기");
		
		
		//시작페이지 버튼 무명클래스
		restart.addActionListener(listener);
		add(restart);
		exits.addActionListener(listener);
		add(exits);
		//시작페이지 무명클래스 끝
		//그만두기를 클릭하면 DB에 저장된다.
	
		restart.setBounds(530, 350, 200, 60);
		exits.setBounds(530, 430, 200, 60);
	}

	// 틀릴때 생성된다.
	public JFgood(setgetclass name1, PaGam games,PaMain main2, JFGame gmmain) {
		bgimg4 = new ImageIcon("../gameMake/img/solutio_2.jpg");
		restart =new JButton("다시시작");
		exits = new JButton("그만두기");
		
		add(restart);
		add(exits);
		
		//다시시작 페이지 버튼 무명클래스
				restart.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						if(e.getSource() == restart){
							++restart1;
							name1.setRestartss(restart1);
							System.out.println(name1.getRestartss());
							setVisible(false);
							/*PaGam games = new PaGam(main2, gmmain, name1);
							gmmain.add(games);*/
							games.setVisible(true);
							games.setLayout(null);
							
							
						}
					}
				});
				//다시시작 페이지 무명클래스 끝
				//끝내기
				exits.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						gmmain.dispose();
						
					}
				});
				restart.setBounds(530, 350, 200, 60);
				exits.setBounds(530, 430, 200, 60);
	}
	//정답시 클릭 이벤트
	private class MyListener implements ActionListener{
		JFGame gmmain2;
		public MyListener(JFGame gmmain) {
			gmmain2 = gmmain;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == restart){
				if(e.getSource() == restart){
					gmmain2.dispose();
					new JFGame();
					}
			}else if(e.getSource() == exits){
				gmmain2.dispose();
			}
			
		}
		
	}
	public void paintComponent(Graphics g2) {
		g2.drawImage(bgimg4.getImage(), 0, 0, null);
		setOpaque(false);
		super.paintComponent(g2);
	}
	
}
