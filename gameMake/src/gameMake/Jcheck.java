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
		setTitle("�������");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(200,200);
		setResizable(false);	
		setVisible(true);
		setLayout(new GridLayout(0, 1));
		
		JPanel okch = new JPanel();
		Font textfont = new Font("����",Font.BOLD,25);
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
				okcheck = new JLabel(chlab3[0]+" ���� Ů�ϴ�.");
	
			
				
			}else if(number2[0] < number2[1]){
				okcheck = new JLabel(chlab3[0]+" ���� �۽��ϴ�.");
				
				
			}else{
				okcheck = new JLabel("���԰� �����ϴ�.");
	
			
			}
			
			JButton oK = new JButton("���ư���");
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
