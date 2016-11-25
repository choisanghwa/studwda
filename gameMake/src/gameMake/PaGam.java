package gameMake;



import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Label;
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
	ImageIcon bgimg2; //����̹���
	ImageIcon laimg,laimg2; //�� �̹���
	Jcheck check1;  //���� üũ�� ���� �ڽ�
	JLabel count1,rest,names; // ������ Ƚ��, �ٽý����� Ƚ��, �̸�
	JCheckBox[] stones = new JCheckBox[nem]; // üũ�ڽ� 
	JLabel[] stoneimg =new JLabel[nem];
	JButton weight,dab,stop; // ��������, ���Է�â, �׸��α�
	int wei_count=0; //������ Ƚ��
	int chck =0; //üũ�� �����ϴ� ���� 
	//üũ�� 2�ʰ��� ��� Ŭ���� �ȵȴ�.
	//üũ�� 1�ϰ��� 0�� ��쵵 �ȵȴ�.

	Pasolu solution;   // ���Է�â���� �̵��ϱ� ���� ����

	int[] num;	//�߻���Ų ���� ����
	int[] renum; // num�� ����� ���� �����ڿ� ����
	String[] alphabet  = {"A","B","C","D","E","F"};  //
	String[] chlab2 = new String[nem];	//���ý�  alphabet�� ����ȴ�.
 	int[] number= new int[nem]; //���ý� �̰��� ���� ����ȴ�.
 	String falsenum=null; // ������ �̰��� ����ȴ�.
 	Font textfont = new Font("����",Font.BOLD,25);
 	//������
	public PaGam(PaMain main2, JFGame gmmain, setgetclass name1){
		
		//��濡 �̹��� �ֱ� 357���� ����
		bgimg2 = new ImageIcon("../gameMake/img/Gameimg.jpg");
		
		//���� �߻���Ų��.
		num = new int[nem];
		for(int i=0;i<num.length;i++){
			//num[2]�� ������ ���� ����� ���� �ִ´�. 
			if(i!=2){
				num[i]=10;
			}else{
				num[i]=(int)(Math.random()*11)+2;
					if(num[i] == num[0]){
						num[i]=(int)(Math.random()*11);
						
					}
				 }
			
			}
		//������� num�� ���� �ֱ�
		
		//renum�� �� ���⸦ �Ѵ�. 344���� ���´�
		renum = shuffle(num);
	
			
		//�̸� �Է�â�� �Է��� �̸��� �޾ƿ´�.
		names =new JLabel(name1.getNamse()+" ����");
		add(names);
		names.setFont(textfont);
		//�����Ƚ��
		rest = new JLabel(name1.getRestartss()+"");
		add(rest);
		rest.setFont(textfont);
		
		//���Ը� �� Ƚ���� ��Ÿ���� ��
		count1 =new JLabel(wei_count+"��");
		add(count1);
		count1.setFont(textfont);
		
		//üũ�ڽ� ����
		for(int i=0;i<stones.length;i++){
			stones[i] = new JCheckBox();	
			add(stones[i]);
		}
		
		//�� ����
		laimg= new ImageIcon("../gameMake/img/stones.png"); //�� �̹���
		laimg2= new ImageIcon("../gameMake/img/colorstones.png");
		for(int j= 0;j<stoneimg.length;j++){
			stoneimg[j] = new JLabel(alphabet[j],laimg,JLabel.CENTER);
			stoneimg[j].setVerticalTextPosition(JLabel.CENTER);
			stoneimg[j].setHorizontalTextPosition(JLabel.CENTER);
			add(stoneimg[j]);
		}
		
//���⼭ ���� üũ�ڽ� �̺�Ʈ (����Ŭ����)==============
										//1��°
										stones[0].addActionListener(new ActionListener() {
											
											@Override
											public void actionPerformed(ActionEvent e) {			
												//ó�� Ŭ���ÿ��� click�� true�̱⿡ ���� 
												if( click[0] == true && e.getSource() == stones[0] ){
													//renum�� ���� number�� ����ȴ�.
													//alphabet ���� chlab2�� ����ȴ�.
													number[0] = renum[0];
													chlab2[0] = alphabet [0];
													stoneimg[0].setIcon(laimg2);
													chck = chck+1;
													//�ѹ��� Ŭ���ϸ�(üũ����) click false�� �ٲ��.
													if(e.getSource() == stones[0]){
													click[0]= false;
													
													}
													//click�� false�ϰ�� 
													//number�� chlab2�� �ʱ�ȭ �ȴ�.
												}else{
													number[0] =0;
													chlab2[0] = null;
													stoneimg[0].setIcon(laimg);
													chck = chck-1;
													//click�� false�϶� �ѹ��� ������ true�� �ٽ� ��ȯ��
													//�ٽ� true ���� true�� �ǹǷ� �ٽ� ������  ���� ���� �ȴ�.
													if(e.getSource() == stones[0]){
														click[0]= true;
														
														}
												}
												
												
											}
										});
										
										//2��°
										stones[1].addActionListener(new ActionListener() {
											
											@Override
											public void actionPerformed(ActionEvent e) {			
												
												if( click[1] == true && e.getSource() == stones[1]){
													number[1] = renum[1];
													chlab2[1] = alphabet [1];
													stoneimg[1].setIcon(laimg2);
													chck = chck+1;
													if(e.getSource() == stones[1]){
														click[1]= false;
													
													}
												}else{
													number[1] =0;
													chlab2[1] = null;
													stoneimg[1].setIcon(laimg);
													chck = chck-1;
													if(e.getSource() == stones[1]){
														click[1]= true;
														
														}
												}						
											
											}
										});
										
									//3��°
										stones[2].addActionListener(new ActionListener() {
									
									@Override
									public void actionPerformed(ActionEvent e) {			
										
										if( click[2] == true && e.getSource() == stones[2]){
											number[2] = renum[2];
											chlab2[2] = alphabet [2];
											stoneimg[2].setIcon(laimg2);
											chck = chck+1;
											if(e.getSource() == stones[2]){
												click[2]= false;
											
											}
										}else{
											number[2] =0;
											chlab2[2] = null;
											stoneimg[2].setIcon(laimg);
											chck = chck-1;
											if(e.getSource() == stones[2]){
												click[2]= true;
												
												}
										}
										
									}
								});
										
								//4��°
								stones[3].addActionListener(new ActionListener() {
									
									@Override
									public void actionPerformed(ActionEvent e) {			
									
										if(click[3] == true && e.getSource() == stones[3]){
											number[3] = renum[3];
											chlab2[3] = alphabet [3];
											stoneimg[3].setIcon(laimg2);
											chck = chck+1;
											if(e.getSource() == stones[3]){
												click[3]= false;
											
											}
										}else{
											number[3] =0;
											chlab2[3] = null;
											stoneimg[3].setIcon(laimg);
											chck = chck-1;
											if(e.getSource() == stones[3]){
												click[3]= true;
												
												}
										}
										
									}
								});
			
								//5��°
								stones[4].addActionListener(new ActionListener() {
									
									@Override
									public void actionPerformed(ActionEvent e) {			
										
										if( click[4] == true && e.getSource() == stones[4]){
											number[4] = renum[4];
											chlab2[4] = alphabet [4];
											stoneimg[4].setIcon(laimg2);
											chck = chck+1;
											if(e.getSource() == stones[4]){
												click[4]= false;
											
											}
										}else{
											number[4] =0;
											chlab2[4] = null;
											stoneimg[4].setIcon(laimg);
											chck = chck-1;
											if(e.getSource() == stones[4]){
												click[4]= true;
												
												}
										}
										
									}
								});
								
								//6��°
								stones[5].addActionListener(new ActionListener() {
									
									@Override
									public void actionPerformed(ActionEvent e) {			
										
										if( click[5] == true && e.getSource() == stones[5]){
											number[5] = renum[5];
											chlab2[5] = alphabet [5];
											stoneimg[5].setIcon(laimg2);
											chck = chck+1;
											if(e.getSource() == stones[5]){
												click[5]= false;
											
											}
										}else{
											number[5] =0;
											chlab2[5] = null;
											stoneimg[5].setIcon(laimg);
											chck = chck-1;
											if(e.getSource() == stones[5]){
												click[5]= true;
												
												}
										}
										
									}
								});
								
//���� üũ�ڽ� �̺�Ʈ------------------------------	
								
		//���� ��������(����Ȯ����) �ѱ����� ������ ������ ���´�.
	for(int h=0;h<number.length;h++){
		if(renum[h] != 10){
			falsenum = alphabet [h];

		}
	}
	
		//������⸦ ������ ������� ��â�� ���.
		weight = new JButton("�������");
		add(weight);
		weight.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
					if (wei_count < 3 &&  arg0.getSource() == weight){						
						//2�� üũ������, �ѱ�� ���Ѱ�
						if( 1<chck && chck < 3){
							
							//������ Ƚ�� ����
							wei_count++;
							count1.setText(wei_count+"");
						check1 = new Jcheck(number,chlab2);
						
						}
				}else{
					//3���̻� ������� ���â
					JFrame overcount = new JFrame();
					overcount.setTitle("�������");
					overcount.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					overcount.setSize(200,200);
					overcount.setResizable(false);	
					overcount.setVisible(true);
					overcount.setLayout(new GridLayout(0, 1));
					JPanel countover= new JPanel();
					JLabel over = new JLabel("���� ī���Ͱ� �ʰ� �Ǿ����ϴ�.");
					JButton back = new JButton("���ư���");
					back.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							if(e.getSource() == back){
								overcount.dispose();
							}
							
						}
					});
					countover.add(over);
					countover.add(back);
					overcount.add(countover);
				}
				
			}
			
		});
		

		
		
		
		//������߱⸦ ������  ����߱� â���� �̵��Ѵ�.
		dab = new JButton("������߱�");		
		add(dab);
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
		
		
		//������ ��ư, ������ ����Frame���� ���ư���
		stop = new JButton("�׸��α�");
		add(stop);
		stop.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (arg0.getSource() == stop){
					gmmain.dispose();
				}
				
			}		
		});
		
		//��ġ������
		names.setBounds(420, 20, 200, 50);
		rest.setBounds(700, 20, 200, 50);
		count1.setBounds(115, 330, 150, 50);
		weight.setBounds(365, 530, 150, 50);
		dab.setBounds(660, 450, 150, 50);
		stop.setBounds(660, 530, 150, 50);
		
		int a=0;
		for(int j =0;j<stones.length;j++){
			
			stones[j].setBounds(100+a, 200, 15, 15);
			a+=130;
		}
		a=0;

		
		for(int i =0;i<stoneimg.length;i++){
			
			stoneimg[i].setBounds(40+a, 150, 130, 45);
			a+=130;
		}

		}

	//num�� �Ű����� num2�� �޾Ƽ� ���� ������ �� ���� renum�� �����Ѵ�.
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

	//����̹�������
	public void paintComponent(Graphics g2) {
		g2.drawImage(bgimg2.getImage(), 0, 0, null);
		setOpaque(false);
		super.paintComponent(g2);
	}
	
	
}

