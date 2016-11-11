package gameMake;

import java.awt.Graphics;

import javax.swing.*;

public  class JFGame extends JFrame {
	public PaMain main;
	
	public JFGame(){
		setTitle("¾çÆÈ Àú¿ïGame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(906,662);
		setResizable(false);
		
		main = new PaMain(this);	
		add(main);
		
		
		setVisible(true);
		
		
	}


}