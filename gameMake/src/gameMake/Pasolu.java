package gameMake;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class Pasolu extends JPanel{
	public	 JTextField solu;
	 public String	 qmun= null;
	public JFgood goods;
		public Pasolu(PaMain main2, JFGame gmmain, setgetclass name1, String falsenum, PaGam games){
		
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
							
							setVisible(false);
							goods = new JFgood(name1, gmmain);
							//JFrame�� �ҷ��� �ҷ��°��� games�� add�ϱ�
							gmmain.add(goods);
							goods.setVisible(true);
							System.out.println("����");
						}else{
							
							setVisible(false);
							goods = new JFgood(name1,games,main2,gmmain);
							gmmain.add(goods);
							System.out.println("�ƴϴ�");
						}
					}
					
					
					
				}
			});

			
		
			
	}

}
