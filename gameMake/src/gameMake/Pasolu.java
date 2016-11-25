package gameMake;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class Pasolu extends JPanel{
	public	 JTextField solu;
	 public String	 qmun= null;
	public JFgood goods;
	ImageIcon bgimg3;
		public Pasolu(PaMain main2, JFGame gmmain, setgetclass name1, String falsenum, PaGam games){
			bgimg3 = new ImageIcon("../gameMake/img/solutionimg.jpg");
			JTextField solu = new JTextField(10);
			add(solu);
			solu.addKeyListener(new KeyListener() {
			
				@Override
				public void keyTyped(KeyEvent e) {}
				
				@Override
				public void keyReleased(KeyEvent e) {}
				
				@Override
				public void keyPressed(KeyEvent e) {
					qmun =  solu.getText();
					qmun = qmun.toUpperCase();
					if(qmun.length()!= 0 && e.getKeyCode() == e.VK_ENTER){
						
						if(qmun.equals(falsenum)){
							
							setVisible(false);
							goods = new JFgood(name1, gmmain);
							goods.setLayout(null);
							//JFrame을 불러와 불러온곳에 games를 add하기
							gmmain.add(goods);
							goods.setVisible(true);
		
						}else{
							
							setVisible(false);
							goods = new JFgood(name1,games,main2,gmmain);
							goods.setLayout(null);
							gmmain.add(goods);
							
		
						}
					}
					
					
					
				}
			});

			
			solu.setBounds(550, 350, 200, 50);
			
	}
		public void paintComponent(Graphics g2) {
			g2.drawImage(bgimg3.getImage(), 0, 0, null);
			setOpaque(false);
			super.paintComponent(g2);
		}

}
