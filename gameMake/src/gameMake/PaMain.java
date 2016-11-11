package gameMake;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PaMain extends JPanel {
	ImageIcon bgimg;
	JButton start1,rank1;
	JTextField name;
	public PaMain main2 = this;
	public PaGam games;
	
	public PaMain(JFGame gmmain){
		 bgimg = new ImageIcon("../gameMake/img/main1-1.jpg");
		 
		name = new JTextField(10);
		
		add(name);
		
		start1 = new JButton("gamestart");			
		start1.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == start1){
					
					setVisible(false);
					games = new PaGam(main2,gmmain);
					//JFrame을 불러와 불러온곳에 games를 add하기
					gmmain.add(games);
					games.setVisible(true);
					
				}
			}
		});
	
		add(start1);
		
		
		rank1 = new JButton("Rank");
		add(rank1);
		rank1.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == rank1){
					Rank dbrank = new Rank();
					
				}
			}
		});
		
	}

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(bgimg.getImage(), 0, 0, null);
		setOpaque(false);
		super.paintComponent(g);
	}

}
