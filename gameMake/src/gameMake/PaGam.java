package gameMake;



import java.awt.Graphics;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class PaGam extends JPanel{
	
	public PaGam games;
	final static int nem =6;	
	boolean[] click = {true,true,true,true,true,true} ;
	ImageIcon bgimg2;
	Jcheck check1;
	JLabel count1,rest,names;
	JCheckBox[] stones = new JCheckBox[nem];
	JButton weight,dab,return1;
	int wei_count=0;

	Pasolu solution;

	int[] num;
	int[] renum;
	String[] labels = {"A","B","C","D","E","F"};
	String[] chlab2 = new String[nem];
 	int[] number= new int[nem];
 	String falsenum=null; //�� ����
 	
 	
	public PaGam(PaMain main2, JFGame gmmain, setgetclass name1){
		bgimg2 = new ImageIcon("../gameMake/img/Gameimg.jpg");
		num = new int[nem];
		for(int i=0;i<num.length;i++){
			if(i!=2){
				num[i]=10;
			}else{
				num[i]=(int)(Math.random()*11)+2;
					if(num[i] == num[0]){
						num[i]=(int)(Math.random()*11);
						
					}
				 }
			
			}
		
		renum = shuffle(num);
		for(int i=0;i<num.length;i++){
			System.out.println(renum[i]+"Ȯ��");
		}
		System.out.println("\n");
		//�����̹���
		bgimg2 = new ImageIcon("../gameMake/img/Gameimg.jpg");
		
		
		//�����Ƚ��
		names =new JLabel(name1.getNamse()+" ����");
		add(names);
		
	
		rest = new JLabel(name1.getRestartss()+"");
		add(rest);
		
		
		//���� ī���� ��Ÿ���� ��
		
	
		count1 =new JLabel(wei_count+"��");
		add(count1);
		
		
			
		
		System.out.println(wei_count);
		
		for(int i=0;i<stones.length;i++){
			stones[i] = new JCheckBox();
			
			
			
			add(stones[i]);
		
		
		}
//���⼭ ����==============
										//1��°
										stones[0].addActionListener(new ActionListener() {
											
											@Override
											public void actionPerformed(ActionEvent e) {			
												
												if(click[0] == true && e.getSource() == stones[0]){
													number[0] = renum[0];
													chlab2[0] = labels[0];
													if(e.getSource() == stones[0]){
													click[0]= false;
													
													}
												}else{
													number[0] =0;
													chlab2[0] = null;
													if(e.getSource() == stones[0]){
														click[0]= true;
														
														}
												}
												
												System.out.println(number[0]+"1��");
												System.out.println(chlab2[0]+"1��");
											}
										});
										//2��°
										stones[1].addActionListener(new ActionListener() {
											
											@Override
											public void actionPerformed(ActionEvent e) {			
												
												if(click[1] == true && e.getSource() == stones[1]){
													number[1] = renum[1];
													chlab2[1] = labels[1];
													if(e.getSource() == stones[1]){
														click[1]= false;
													
													}
												}else{
													number[1] =0;
													chlab2[1] = null;
													if(e.getSource() == stones[1]){
														click[1]= true;
														
														}
												}						
												System.out.println(number[1]+"2��");
												System.out.println(chlab2[1]+"2��");
											}
										});
									//3��°
										stones[2].addActionListener(new ActionListener() {
									
									@Override
									public void actionPerformed(ActionEvent e) {			
										
										if(click[2] == true && e.getSource() == stones[2]){
											number[2] = renum[2];
											chlab2[2] = labels[2];
											if(e.getSource() == stones[2]){
												click[2]= false;
											
											}
										}else{
											number[2] =0;
											chlab2[2] = null;
											if(e.getSource() == stones[2]){
												click[2]= true;
												
												}
										}
										System.out.println(number[2]+"3��");
										System.out.println(chlab2[2]+"3��");
									}
								});
								//4��°
								stones[3].addActionListener(new ActionListener() {
									
									@Override
									public void actionPerformed(ActionEvent e) {			
									
										if(click[3] == true && e.getSource() == stones[3]){
											number[3] = renum[3];
											chlab2[3] = labels[3];
											if(e.getSource() == stones[3]){
												click[3]= false;
											
											}
										}else{
											number[3] =0;
											chlab2[3] = null;
											if(e.getSource() == stones[3]){
												click[3]= true;
												
												}
										}
										System.out.println(number[3]+"4��");
										System.out.println(chlab2[3]+"4��");
									}
								});
			
								//5��°
								stones[4].addActionListener(new ActionListener() {
									
									@Override
									public void actionPerformed(ActionEvent e) {			
										
										if(click[4] == true && e.getSource() == stones[4]){
											number[4] = renum[4];
											chlab2[4] = labels[4];
											if(e.getSource() == stones[4]){
												click[4]= false;
											
											}
										}else{
											number[4] =0;
											chlab2[4] = null;
											if(e.getSource() == stones[4]){
												click[4]= true;
												
												}
										}
										System.out.println(number[4]+"5��");
										System.out.println(chlab2[4]+"5��");
									}
								});
								//6��°
								stones[5].addActionListener(new ActionListener() {
									
									@Override
									public void actionPerformed(ActionEvent e) {			
										
										if(click[5] == true && e.getSource() == stones[5]){
											number[5] = renum[5];
											chlab2[5] = labels[5];
											if(e.getSource() == stones[5]){
												click[5]= false;
											
											}
										}else{
											number[5] =0;
											chlab2[5] = null;
											if(e.getSource() == stones[5]){
												click[5]= true;
												
												}
										}
										System.out.println(number[5]+"6��");
										System.out.println(chlab2[5]+"6��");
									}
								});
//���� üũ�ڽ�------------------------------	
								
		
	for(int h=0;h<number.length;h++){
		if(renum[h] != 10){
			falsenum = labels[h];

		}
	}
	System.out.println(falsenum+" ��\n");
		//������⸦ ������ ������� ��â�� ���.
		weight = new JButton("�������");
		weight.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
					if (wei_count < 3 &&  arg0.getSource() == weight){						
						if(number[0]*number[1] !=0 ||number[0]*number[2] !=0 ||number[0]*number[3] !=0 ||number[0]*number[4] !=0
								|| number[0]*number[5] !=0 ||
								number[1]*number[2] !=0 ||number[1]*number[3] !=0 ||number[1]*number[4] !=0 ||number[1]*number[5] !=0
								|| number[2]*number[3] !=0|| number[2]*number[4] !=0|| number[2]*number[5] !=0 ||
								number[3]*number[4] !=0 || number[3]*number[4] !=0 || number[3]*number[5] !=0 ||
								number[4]*number[5] !=0){
							
							wei_count++;
							count1.setText(wei_count+"");
							System.out.println(wei_count);
						check1 = new Jcheck(number,chlab2);
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
					
					solution = new Pasolu(main2,gmmain,name1,falsenum,games);
					solution.setLayout(null);
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
					//removeAll();
					setVisible(false);
					if(wei_count !=0){
						check1.dispose();
					}
					main2.setVisible(true);
					for(int i=0;i<number.length;i++){
						number[i] = 0;
						chlab2[i] = null;
					}
				}
				
			}		
		});
		add(return1);
		
		names.setBounds(450, 20, 200, 50);
		rest.setBounds(700, 20, 200, 50);
		count1.setBounds(115, 330, 150, 50);
		weight.setBounds(365, 530, 150, 50);
		dab.setBounds(660, 450, 150, 50);
		return1.setBounds(660, 530, 150, 50);
		stones[0].setBounds(100, 200, 15, 15);
		stones[1].setBounds(200, 200, 15, 15);
		stones[2].setBounds(300, 200, 15,15);
		stones[3].setBounds(400, 200, 15, 15);
		stones[4].setBounds(500, 200, 15, 15);
		stones[5].setBounds(600, 200, 15, 15);
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


	public void paintComponent(Graphics g2) {
		g2.drawImage(bgimg2.getImage(), 0, 0, null);
		setOpaque(false);
		super.paintComponent(g2);
	}
	
	
}

