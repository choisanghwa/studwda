package gameMake;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class Pasolu extends JPanel{
	public JTextField solu;
			String	 qmun= null;
	
		public Pasolu(PaMain main2, JFGame gmmain, setgetclass name1, String falsenum){
		
			JTextField solu = new JTextField(10);
			
			//키 입력 액션
			solu.addKeyListener(new KeyListener() {	
				@Override
				public void keyTyped(KeyEvent e) {
					//qmun에 필드값을 넣는다.
					qmun = solu.getText();
					if(e.getKeyCode() == e.VK_ENTER){
							if(qmun.equals(falsenum)){
								System.out.println("정답");
							}else{
								System.out.println("틀림");
							}
						
					}
				}
				
				@Override
				public void keyReleased(KeyEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void keyPressed(KeyEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
			
			
			
			add(solu);
		
		
	}
}
