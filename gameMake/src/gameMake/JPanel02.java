package gameMake;

import javax.swing.*;

public class JPanel02 extends JPanel{
	JLabel text001,count1,rest;
	JCheckBox stones1,stones2,stones3,stones4,stones5,stones6;
	JButton gogo,dab,return1;

	public JPanel02(){
		
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
		add(gogo);
		//gogo.addActionListener(new okcheck());

		//������߱⸦ ������  ����߱� â���� �̵��Ѵ�.
		dab = new JButton("������߱�");		
		add(dab);
		
		//���ư��� ��ư, ������ ����Frame���� ���ư���
		return1 = new JButton("���ư���");
		add(return1);
		//return1.addActionListener(new returngo());
		
		}
}

