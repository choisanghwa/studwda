package gameMake;

import java.awt.Graphics;
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
		
		
		JPanel okch = new JPanel();
		
		JLabel okcheck;
	//	JLabel imgBox;
		
//		ImageIcon img;
		
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
		System.out.println("\n");
			System.out.println(number2[0]+"ch");
			System.out.println(chlab3[0]+"ch");
			System.out.println(number2[1]+"ch2");
			System.out.println(chlab3[1]+"ch2");
			
			
			if(number2[0] > number2[1] ){
				okcheck = new JLabel(chlab3[0]+" ���� Ů�ϴ�.");
		//		img = new ImageIcon("../gameMake/img/Scale_Right.jpg");
			
				
			}else if(number2[0] < number2[1]){
				okcheck = new JLabel(chlab3[0]+" ���� �۽��ϴ�.");
				//img = new ImageIcon("../gameMake/img/Scale_left.jpg");
				
				
			}else{
				okcheck = new JLabel("���԰� �����ϴ�.");
				//img = new ImageIcon("../gameMake/img/Gameimg.jpg");
			
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
			
		/*	imgBox = new JLabel(img);
			imgBox.setBounds(0, 50,493,371);
			add(imgBox);*/
			okch.add(okcheck);
			okch.add(oK);
			add(okch);
						
	}





	
}
