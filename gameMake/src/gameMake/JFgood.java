package gameMake;


import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class JFgood extends JPanel{
		JButton restart,exits;
		int restart1=1;
		ImageIcon bgimg4;
	public JFgood(setgetclass name1, JFGame gmmain){
		bgimg4 = new ImageIcon("../gameMake/img/solutio_1.jpg");
		MyListener listener = new MyListener(gmmain);
		restart =new JButton("������������");
		exits = new JButton("�׸��α�");
		
		
		//���������� ��ư ����Ŭ����
		restart.addActionListener(listener);
		add(restart);
		exits.addActionListener(listener);
		add(exits);
		//���������� ����Ŭ���� ��
		//�׸��α⸦ Ŭ���ϸ� DB�� ����ȴ�.
	
		restart.setBounds(530, 350, 200, 60);
		exits.setBounds(530, 430, 200, 60);
	}

	// Ʋ���� �����ȴ�.
	public JFgood(setgetclass name1, PaGam games,PaMain main2, JFGame gmmain) {
		bgimg4 = new ImageIcon("../gameMake/img/solutio_2.jpg");
		restart =new JButton("�ٽý���");
		exits = new JButton("�׸��α�");
		
		add(restart);
		add(exits);
		
		//�ٽý��� ������ ��ư ����Ŭ����
				restart.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						if(e.getSource() == restart){
							++restart1;
							name1.setRestartss(restart1);
							System.out.println(name1.getRestartss());
							setVisible(false);
							/*PaGam games = new PaGam(main2, gmmain, name1);
							gmmain.add(games);*/
							games.setVisible(true);
							games.setLayout(null);
							
							
						}
					}
				});
				//�ٽý��� ������ ����Ŭ���� ��
				//������
				exits.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						gmmain.dispose();
						
					}
				});
				restart.setBounds(530, 350, 200, 60);
				exits.setBounds(530, 430, 200, 60);
	}
	//����� Ŭ�� �̺�Ʈ
	private class MyListener implements ActionListener{
		JFGame gmmain2;
		public MyListener(JFGame gmmain) {
			gmmain2 = gmmain;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == restart){
				if(e.getSource() == restart){
					gmmain2.dispose();
					new JFGame();
					}
			}else if(e.getSource() == exits){
				gmmain2.dispose();
			}
			
		}
		
	}
	public void paintComponent(Graphics g2) {
		g2.drawImage(bgimg4.getImage(), 0, 0, null);
		setOpaque(false);
		super.paintComponent(g2);
	}
	
}
