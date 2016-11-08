package gameMake;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class JPanel01 extends JPanel {
	ImageIcon bgimg;
	JButton start1,rank1;
	JTextField name;
	public JPanel02 games;
	
	public JPanel01(){
		name = new JTextField(10);
		
		add(name);
		
		start1 = new JButton("gamestart");			
		start1.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == start1){
					
					setVisible(false);
					games = new JPanel02();
					add(games);
				}
			}
		});
	
		add(start1);
		
		
		rank1 = new JButton("Rank");
		add(rank1);
		rank1.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == rank1){
					
				}
			}
		});
		
	}

}
