package gameMake;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Jcheck extends JFrame {
	int a = 0;
	public Jcheck(int[] number, String[] chlab2){
		JPanel okch = new JPanel();
		JLabel okcheck;
		
		int[] number2= {0,0};
		String[] chlab3 = {null,null};
		setTitle("무게재기");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(300,300);
		setResizable(false);	
		setVisible(true);
		
		for(int i=0; i<6;i++){
			if(number[i] != 0){
				if(number2[0] == 0 ){
				number2[0] = number[i];
				chlab3[0] = chlab2[i];
				}else{
					number2[1] = number[i];
					chlab3[1] = chlab2[i];
				}				
			}
		}
		System.out.println("\n");
			System.out.println(number2[0]+"ch");
			System.out.println(chlab3[0]+"ch");
			System.out.println(number2[1]+"ch2");
			System.out.println(chlab3[1]+"ch2");
			
			
			if(number2[0] > number2[1] ){
				okcheck = new JLabel(chlab3[0]+" 쪽이 큽니다.");
				a = 1;
			}else if(number2[0] < number2[1]){
				okcheck = new JLabel(chlab3[0]+" 쪽이 작습니다.");
				a = -1;
			}else{
				okcheck = new JLabel("무게가 같습니다.");
	
			}
			
			JButton oK = new JButton("돌아가기");
			oK.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					if(e.getSource() == oK){
						dispose();
					}
					
				}
			});
			
			
			
			okch.add(okcheck);
			okch.add(oK);
			add(okch);
						
	}
	ImageIcon bgimg5;
	
	public void paintComponent(Graphics g){
		if(a == 1){
			bgimg5 = new ImageIcon("../gameMake/img/Scale_Right.jpg");
		}else if(a==-1){
			bgimg5 = new ImageIcon("../gameMake/img/Scale_left.jpg");
		}else{
			bgimg5 = new ImageIcon("../gameMake/img/Gameimg.jpg");
		}
		g.drawImage(bgimg5.getImage(), 0, 0, null);
		setOpaque();
		super.paintComponents(g);
		
	}

	private boolean setOpaque() {
		return false;
		
	}


	
}
