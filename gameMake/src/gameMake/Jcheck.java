package gameMake;

import javax.swing.*;

public class Jcheck extends JFrame {
	
	public Jcheck(int[] number, String[] chlab2){
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
			
			JLabel okcheck = new JLabel();
			if(number2[0] > number2[1] ){
				System.out.println(chlab3[0]+"이 큽니다.");
			}else if(number2[0] < number2[1]){
				System.out.println(chlab3[0]+"이 작습니다.");
			}else{
				System.out.println("무게가 같습니다.");
			}
						
	}
}
