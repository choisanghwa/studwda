package gameMake;


import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.*;

public class JFgood extends JPanel{
		JButton restart,exits;
		static int restart1=0;
		ImageIcon bgimg4;
	
		//������ 2
		//�����϶� �����Ǵ� ������
		public JFgood(setgetclass name1, JFGame gmmain){
			
			bgimg4 = new ImageIcon("../gameMake/img/solutio_1.jpg");
			MyListener listener = new MyListener(gmmain,name1);
			restart =new JButton("������������");
			exits = new JButton("�׸��α�");
		
		
			//���������� ��ư,�׸��α�  �׼�
			restart.addActionListener(listener);
			add(restart);
			exits.addActionListener(listener);
			add(exits);
			//Ŭ���ϸ� DB�� ����ȴ�.
		
			//��ġ������
			restart.setBounds(530, 350, 200, 60);
			exits.setBounds(530, 430, 200, 60);
	}

	//----------------------------------------------------------------------------------------------------------
	
		//������ 2
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
							PaGam games = new PaGam(main2, gmmain, name1);
							games.setLayout(null);
							gmmain.add(games);
							
							games.setVisible(true);
							
							
							
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

		
//----------------------------------------------------------------------------------------------------------
		
		//����� Ŭ�� �̺�Ʈ
	private class MyListener implements ActionListener{
		JFGame gmmain2;
		String nameget;
		int restarts;
		//������
		public MyListener(JFGame gmmain, setgetclass name1) {
			gmmain2 = gmmain;
			nameget = name1.getNamse();
			restarts = name1.getRestartss();
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == restart){
				
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
