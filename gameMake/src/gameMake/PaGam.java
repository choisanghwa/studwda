package gameMake;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PaGam extends JPanel{
	JLabel text001,count1,rest;
	JCheckBox stones1,stones2,stones3,stones4,stones5,stones6;
	JButton gogo,dab,return1;

	public PaGam(JFGame gmmain){
		
		text001 =new JLabel("6���� ���� ���԰� �ٸ� �� �ϳ��� ã�ƶ�");
		add(text001);
	
		rest = new JLabel("����� Ƚ�� : ");
		add(rest);
	
		stones1 = new JCheckBox("a");
		add(stones1);
		stones2 = new JCheckBox("b");
		add(stones2);
		stones3 = new JCheckBox("c");
		add(stones3);
		stones4 = new JCheckBox("d");
		add(stones4);
		stones5 = new JCheckBox("e");
		add(stones5);
		stones6 = new JCheckBox("f");
		add(stones6);
	
	
		//������⸦ ������ ������� ��â�� ���.
		gogo = new JButton("�������");
		gogo.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
					if (arg0.getSource() == gogo){
						Jcheck check1 = new Jcheck();
				}
				
			}
			
		});
		add(gogo);
		//������߱⸦ ������  ����߱� â���� �̵��Ѵ�.
		dab = new JButton("������߱�");		
		add(dab);
		
		//���ư��� ��ư, ������ ����Frame���� ���ư���
		return1 = new JButton("���ư���");
		return1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (arg0.getSource() == return1){
					removeAll();
					PaMain main = new PaMain(gmmain);
			}
				
			}

			private void removeAll() {
				// TODO Auto-generated method stub
				
			}
			
		});
		add(return1);
		}
}

