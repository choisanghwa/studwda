package gameMake;



import java.awt.Graphics;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class PaGam extends JPanel{
	final static int nem =6;	
	ImageIcon bgimg2;
	Jcheck check1;
	JLabel text001,count1,rest,names;
	JCheckBox[] stones = new JCheckBox[nem];
	JButton weight,dab,return1;
	int wei_count= 0;
	Pasolu solution;

	int[] num;
	int[] renum;
	String[] labels = {"A","B","C","D","E","F"};
	String[] chlab2 = new String[nem];
 	int[] number= new int[nem];
	
	public PaGam(PaMain main2, JFGame gmmain, setgetclass name1){
		num = new int[nem];
		for(int i=0;i<num.length;i++){
			if(i!=2){
				num[i]=10;
				num[2]=(int)(Math.random()*10)+20;
			}else{
				num[i]=(int)(Math.random()*10)+20;
					if(num[i] == num[0]){
						num[i]=(int)(Math.random()*10)+20;
						
					}
				 }
			
			}
		
		renum = shuffle(num);
		for(int i=0;i<num.length;i++){
			System.out.println(num[i]);
		}
		//�����̹���
		bgimg2 = new ImageIcon("../gameMake/img/Gameimg.jpg");
	
		//�����Ƚ��
		names =new JLabel(name1.getNamse()+"�� ���� Ƚ����");
		add(names);
		
		rest = new JLabel();
		add(rest);
		
		
		//���� ī���� ��Ÿ���� ��
		count1 =new JLabel();
		add(count1);
		

		for(int i=0;i<stones.length;i++){
			stones[i] = new JCheckBox(labels[i]);
			stones[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent chi) {
					for(int j =0;j<stones.length;j++){
					if(chi.getSource() == stones[j]){
						number[j] = num[j];
						chlab2[j] = labels[j];
						
					}
					}
					for(int k=0;k<6;k++){
						System.out.println(number[k]);
						System.out.println(chlab2[k]);
						
					}
				}
			});
			add(stones[i]);
		}

		
		//������⸦ ������ ������� ��â�� ���.
		weight = new JButton("�������");
		weight.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
					if (wei_count < 3 &&  arg0.getSource() == weight){						
						if(number[0] !=0 || number[1] !=0 || number[2] !=0 || number[3] !=0 || number[4] !=0 || number[5] !=0){
						wei_count++;
						check1 = new Jcheck();
						}
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
					setVisible(false);
					removeAll();
					solution = new Pasolu(main2,gmmain);
					gmmain.add(solution);
					solution.setVisible(true);
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
					for(int i=0;i<number.length;i++){
						number[i] = 0;
					}
				}
				
			}		
		});
		add(return1);
		}


	private int[] shuffle(int[] num2) {
		int temp,seed;
		
		for(int i=0;i<num2.length;i++){
			seed=(int)(Math.random()*5)+1;
			temp = num2[i];
			num2[i] = num2[seed];
			num2[seed] = temp;
		}
		
		return renum = num2;

	}





	
	/*@Override
	public void paintComponent(Graphics g2) {
		g2.drawImage(bgimg2.getImage(), 0, 0, null);
		setOpaque(false);
		super.paintComponent(g2);
	}*/
}

