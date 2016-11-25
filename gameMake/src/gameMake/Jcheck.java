package gameMake;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Jcheck extends JFrame {
	int a = 0;
	public Jcheck(int[] number, String[] chlab2){
		setTitle("무게재기");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(200,200);
		setResizable(false);	
		setVisible(true);
		setLayout(new GridLayout(0, 1));
		
		JPanel okch = new JPanel();
		Font textfont = new Font("돋움",Font.BOLD,25);
		JLabel okcheck;

		
		int[] number2= {0,0};
		String[] chlab3 = {null,null};
		
		
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

			
			if(number2[0] > number2[1] ){
				okcheck = new JLabel(chlab3[0]+" 쪽이 큽니다.");
	
			
				
			}else if(number2[0] < number2[1]){
				okcheck = new JLabel(chlab3[0]+" 쪽이 작습니다.");
				
				
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
			
			okcheck.setFont(textfont);

			okch.add(okcheck);
			okch.add(oK);
			add(okch);
						
			
			
	}





	
}
