package gameMake;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class JFgood extends JPanel{
		JButton restart,exits;
		int restart1=0;
	public JFgood(setgetclass name1, JFGame gmmain){
		
		restart =new JButton("������������");
		exits = new JButton("�׸��α�");
		add(restart);
		add(exits);
		//���������� ��ư ����Ŭ����
		restart.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == restart){
				gmmain.dispose();
				new JFGame();
				}
			}
		});
		//���������� ����Ŭ���� ��
		//�׸��α⸦ Ŭ���ϸ� DB�� ����ȴ�.
	//	exits.addActionListener(l);
		
	}

	public JFgood(setgetclass name1, PaGam games,PaMain main2, JFGame gmmain) {
	
		restart =new JButton("�ٽý���");
		exits = new JButton("�׸��α�");
		
		add(restart);
		add(exits);
		
		//�ٽý��� ������ ��ư ����Ŭ����
				restart.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						if(e.getSource() == restart){
							restart1++;
							name1.setRestartss(restart1);
							setVisible(false);
							PaGam games = new PaGam(main2, gmmain, name1);
							gmmain.add(games);
							games.setVisible(true);
							
							
						}
					}
				});
				//�ٽý��� ������ ����Ŭ���� ��
	}
}
