package gameMake;

import java.awt.Graphics;

import javax.swing.*;

public class JFGame extends JFrame {
	public JPanel01 main;
	
	public JFGame(){
		setTitle("¾çÆÈ Àú¿ïGame");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(906,662);
		setResizable(false);
		
		main = new JPanel01();	
		add(main);
		
		
		setVisible(true);
		
		
	}


}