package gameMake;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PaMain extends JPanel {
	ImageIcon bgimg; //���
	JButton start1,rank1;
	final JTextField name;
	public PaMain main2 = this;
	public PaGam games;
	String name2= null;
	setgetclass name1 = new setgetclass();
	
	public PaMain(JFGame gmmain){
		//�����̹��� 
		bgimg = new ImageIcon("../gameMake/img/main1-1.jpg");
		 
		name = new JTextField(10);
		add(name);
		//�̸� �Է�
		
		//���� ��ŸƮ ��ư
		start1 = new JButton("gamestart");			
		add(start1);
		
		//�׼�
		start1.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				name1.setNamse(name.getText());
				name2= name1.getNamse();
		
				//�̸��� ���̷� �̸��� �Է��ߴ��� ���ߴ��� Ȯ���Ѵ�.
				if (e.getSource() == start1 && name2.length() !=0){							
					setVisible(false);
					
					games = new PaGam(main2,gmmain,name1);
					//JFrame�� �ҷ��� �ҷ��°��� games�� add�ϱ�
					gmmain.add(games);
					games.setLayout(null);
					games.setVisible(true);
				}
			}
		});
	
		
		
		//��ŷ �������� ����� ����.
		rank1 = new JButton("Rank");
		add(rank1);
		
		//�׼�
		rank1.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == rank1){
					Rank dbrank = new Rank();
					
				}
			}
		});
		
		//��ġ������
		name.setBounds(530, 150, 200, 50);
		start1.setBounds(470, 450, 150, 50);
		rank1.setBounds(660, 450, 150, 50);
	}
	
	//����̹���
	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(bgimg.getImage(), 0, 0, null);
		setOpaque(false);
		super.paintComponent(g);
	}

}
