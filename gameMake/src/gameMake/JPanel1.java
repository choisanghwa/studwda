package gameMake;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

//���� ȭ�� �г�
public class JPanel1 extends JPanel {
	JTextField name;
	JButton start1,rank1;
	JPanel2 gamest;
	//������
	public JPanel1(){
		
		//�̸� �ʵ�
		name = new JTextField(10);
		add(name);
		
		//���۹�ư �� �׼�
		start1 = new JButton("���ӽ���");	
		start1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		add(start1);
		
		//��ŷ��ư �� �׼�
		rank1 = new JButton("��ŷ����");
		rank1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				gamest	= new JPanel2();
				
			}
			
		});
		add(rank1);
		
		setVisible(true);
			
	}
}
