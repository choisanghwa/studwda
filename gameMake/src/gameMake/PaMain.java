package gameMake;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PaMain extends JPanel {
	ImageIcon bgimg; //배경
	JButton start1,rank1;
	final JTextField name;
	public PaMain main2 = this;
	public PaGam games;
	String name2= null;
	setgetclass name1 = new setgetclass();
	
	public PaMain(JFGame gmmain){
		//메인이미지 
		bgimg = new ImageIcon("../gameMake/img/main1-1.jpg");
		 
		name = new JTextField(10);
		add(name);
		//이름 입력
		
		//게임 스타트 버튼
		start1 = new JButton("gamestart");			
		add(start1);
		
		//액션
		start1.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				name1.setNamse(name.getText());
				name2= name1.getNamse();
		
				//이름의 길이로 이름을 입력했는지 안했는지 확인한다.
				if (e.getSource() == start1 && name2.length() !=0){							
					setVisible(false);
					
					games = new PaGam(main2,gmmain,name1);
					//JFrame을 불러와 불러온곳에 games를 add하기
					gmmain.add(games);
					games.setLayout(null);
					games.setVisible(true);
				}
			}
		});
	
		
		
		//랭킹 프레임을 만들어 띄운다.
		rank1 = new JButton("Rank");
		add(rank1);
		
		//액션
		rank1.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == rank1){
					Rank dbrank = new Rank();
					
				}
			}
		});
		
		//배치관리자
		name.setBounds(530, 150, 200, 50);
		start1.setBounds(470, 450, 150, 50);
		rank1.setBounds(660, 450, 150, 50);
	}
	
	//배경이미지
	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(bgimg.getImage(), 0, 0, null);
		setOpaque(false);
		super.paintComponent(g);
	}

}
