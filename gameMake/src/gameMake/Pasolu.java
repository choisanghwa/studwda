package gameMake;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Pasolu extends JPanel{
	public JTextField solu;
			JButton Ok1;
			
	public Pasolu(PaMain main2, JFGame gmmain){
		JTextField solu = new JTextField(10);
		add(solu);
		JButton Ok1= new JButton("»Æ¿Œ");
		Ok1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent okk) {
					if ( okk.getSource() == Ok1){						
//						if(){
//							
//						}else{
//							
//						}
				}
				
			}
		});
		add(Ok1);
	}
}
