package gameMake;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Jcheck extends JFrame {
	int a=0;
	public Jcheck(int[] number, String[] chlab2, setgetclass name1){
		JPanel okch = new JPanel();
		JLabel okcheck;
		
		int[] number2= {0,0};
		String[] chlab3 = {null,null};
		setTitle("�������");
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
				okcheck = new JLabel(chlab3[0]+"�� Ů�ϴ�.");

			}else if(number2[0] < number2[1]){
				okcheck = new JLabel(chlab3[0]+"�� �۽��ϴ�.");
	
			}else{
				okcheck = new JLabel("���԰� �����ϴ�.");
	
			}
			
			JButton oK = new JButton("���ư���");
			oK.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					if(e.getSource() == oK){
						a+=1;
						name1.setCounts(a);
						dispose();
					}
					
				}
			});
			
			
			
			okch.add(okcheck);
			okch.add(oK);
			add(okch);
						
	}
}
