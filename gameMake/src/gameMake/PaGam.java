package gameMake;



import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PaGam extends JPanel{
	ImageIcon bgimg2;
	Jcheck check1;
	JLabel text001,count1,rest;
	JCheckBox stones1,stones2,stones3,stones4,stones5,stones6;
	JButton weight,dab,return1;
	int wei_count= 0;
	Pasolu solution;
	public PaGam(PaMain main2, JFGame gmmain){
		
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
		
		//���� ī���� ��Ÿ���� ��
		count1 =new JLabel("���� ���� �� Ƚ��");
		add(count1);
		
		//������⸦ ������ ������� ��â�� ���.
		weight = new JButton("�������");
		weight.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
					if (wei_count < 3 &&  arg0.getSource() == weight){						
						wei_count++;
						check1 = new Jcheck();
				}
				
			}
			
		});
		add(weight);
		
		//������߱⸦ ������  ����߱� â���� �̵��Ѵ�.
		dab = new JButton("������߱�");		
		dab.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent da) {
				if(da.getSource() == dab){
					removeAll();
					solution = new Pasolu();
					
				}
				
			}
			
		});
		add(dab);
		
		//���ư��� ��ư, ������ ����Frame���� ���ư���
		return1 = new JButton("���ư���");
		return1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (arg0.getSource() == return1){
					removeAll();
					if(wei_count !=0){
						check1.dispose();
					}
					main2.setVisible(true);
				}
				
			}		
		});
		add(return1);
		}
}

