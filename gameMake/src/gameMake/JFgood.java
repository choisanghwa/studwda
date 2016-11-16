package gameMake;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class JFgood extends JPanel{
		JButton restart,exits;
		int restart1=0;
	public JFgood(setgetclass name1, JFGame gmmain){
		
		restart =new JButton("시작페이지로");
		exits = new JButton("그만두기");
		add(restart);
		add(exits);
		//시작페이지 버튼 무명클래스
		restart.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == restart){
				gmmain.dispose();
				new JFGame();
				}
			}
		});
		//시작페이지 무명클래스 끝
		//그만두기를 클릭하면 DB에 저장된다.
	//	exits.addActionListener(l);
		
	}

	public JFgood(setgetclass name1, PaGam games,PaMain main2, JFGame gmmain) {
	
		restart =new JButton("다시시작");
		exits = new JButton("그만두기");
		
		add(restart);
		add(exits);
		
		//다시시작 페이지 버튼 무명클래스
				restart.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						if(e.getSource() == restart){
							restart1++;
							name1.setRestartss(restart1);
							setVisible(false);
							PaGam games = new PaGam(main2, gmmain, name1);
							gmmain.add(games);
							games.setVisible(true);
							
							
						}
					}
				});
				//다시시작 페이지 무명클래스 끝
	}
}
