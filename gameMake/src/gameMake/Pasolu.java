package gameMake;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class Pasolu extends JPanel{
	public	 JTextField solu;
	 public String	 qmun= null;
	public JFgoodss goods;
		public Pasolu(PaMain main2, JFGame gmmain, setgetclass name1, String falsenum){
		
			JTextField solu = new JTextField(10);
			add(solu);
			solu.addKeyListener(new KeyListener() {
			
				@Override
				public void keyTyped(KeyEvent e) {}
				
				@Override
				public void keyReleased(KeyEvent e) {}
				
				@Override
				public void keyPressed(KeyEvent e) {
					qmun = solu.getText();
					if(qmun.length()!= 0 && e.getKeyCode() == e.VK_ENTER){
						System.out.println(qmun);
						
						if(qmun.equals(falsenum)){
							name1.setCki(1);
							goods = new JFgoodss(name1,falsenum);
							
							System.out.println("정답");
						}else{
							System.out.println("아니다");
						}
					}
					
					
					
				}
			});

			
		
			
	}
}
