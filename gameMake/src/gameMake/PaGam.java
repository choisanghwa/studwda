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
	ImageIcon bgimg2; //배경이미지
	ImageIcon laimg,laimg2; //라벨 이미지
	Jcheck check1;  //무게 체크를 위한 박스
	JLabel count1,rest,names; // 무게잰 횟수, 다시시작한 횟수, 이름
	JCheckBox[] stones = new JCheckBox[nem]; // 체크박스 
	JLabel[] stoneimg =new JLabel[nem];
	JButton weight,dab,stop; // 무게제기, 답입력창, 그만두기
	int wei_count=0; //무게잰 횟수
	int chck =0; //체크를 제한하는 변수 
	//체크가 2초과될 경우 클릭이 안된다.
	//체크가 1일경우과 0일 경우도 안된다.

	Pasolu solution;   // 답입력창으로 이동하기 위한 선언

	int[] num;	//발생시킨 수를 저장
	int[] renum; // num에 저장된 수를 섞은뒤에 저장
	String[] alphabet  = {"A","B","C","D","E","F"};  //
	String[] chlab2 = new String[nem];	//선택시  alphabet이 저장된다.
 	int[] number= new int[nem]; //선택시 이곳에 수가 저장된다.
 	String falsenum=null; // 정답이 이곳에 저장된다.
 	Font textfont = new Font("돋움",Font.BOLD,25);
 	//생성자
	public PaGam(PaMain main2, JFGame gmmain, setgetclass name1){
		
		//배경에 이미지 넣기 357에서 지정
		bgimg2 = new ImageIcon("../gameMake/img/Gameimg.jpg");
		
		//수를 발생시킨다.
		num = new int[nem];
		for(int i=0;i<num.length;i++){
			//num[2]를 제외한 곳에 공통된 수를 넣는다. 
			if(i!=2){
				num[i]=10;
			}else{
				num[i]=(int)(Math.random()*11)+2;
					if(num[i] == num[0]){
						num[i]=(int)(Math.random()*11);
						
					}
				 }
			
			}
		//여기까지 num에 수를 넣기
		
		//renum에 수 섞기를 한다. 344에서 섞는다
		renum = shuffle(num);
	
			
		//이름 입력창에 입력한 이름을 받아온다.
		names =new JLabel(name1.getNamse()+" 님의");
		add(names);
		names.setFont(textfont);
		//재시작횟수
		rest = new JLabel(name1.getRestartss()+"");
		add(rest);
		rest.setFont(textfont);
		
		//무게를 잰 횟수를 나타내는 라벨
		count1 =new JLabel(wei_count+"번");
		add(count1);
		count1.setFont(textfont);
		
		//체크박스 생성
		for(int i=0;i<stones.length;i++){
			stones[i] = new JCheckBox();	
			add(stones[i]);
		}
		
		//라벨 생성
		laimg= new ImageIcon("../gameMake/img/stones.png"); //라벨 이미지
		laimg2= new ImageIcon("../gameMake/img/colorstones.png");
		for(int j= 0;j<stoneimg.length;j++){
			stoneimg[j] = new JLabel(alphabet[j],laimg,JLabel.CENTER);
			stoneimg[j].setVerticalTextPosition(JLabel.CENTER);
			stoneimg[j].setHorizontalTextPosition(JLabel.CENTER);
			add(stoneimg[j]);
		}
		
//여기서 부터 체크박스 이벤트 (무명클래스)==============
										//1번째
										stones[0].addActionListener(new ActionListener() {
											
											@Override
											public void actionPerformed(ActionEvent e) {			
												//처음 클릭시에는 click에 true이기에 가능 
												if( click[0] == true && e.getSource() == stones[0] ){
													//renum의 값이 number에 저장된다.
													//alphabet 값이 chlab2에 저장된다.
													number[0] = renum[0];
													chlab2[0] = alphabet [0];
													stoneimg[0].setIcon(laimg2);
													chck = chck+1;
													//한번더 클릭하면(체크해제) click false로 바뀐다.
													if(e.getSource() == stones[0]){
													click[0]= false;
													
													}
													//click가 false일경우 
													//number와 chlab2가 초기화 된다.
												}else{
													number[0] =0;
													chlab2[0] = null;
													stoneimg[0].setIcon(laimg);
													chck = chck-1;
													//click가 false일때 한번더 누르면 true로 다시 전환됨
													//다시 true 값이 true가 되므로 다시 누르면  값이 들어가게 된다.
													if(e.getSource() == stones[0]){
														click[0]= true;
														
														}
												}
												
												
											}
										});
										
										//2번째
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
										
									//3번째
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
										
								//4번째
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
			
								//5번째
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
								
								//6번째
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
								
//까지 체크박스 이벤트------------------------------	
								
		//다음 페이지에(정답확인을) 넘기위해 정답을 저장해 놓는다.
	for(int h=0;h<number.length;h++){
		if(renum[h] != 10){
			falsenum = alphabet [h];

		}
	}
	
		//무게재기를 누르면 무게재기 새창이 뜬다.
		weight = new JButton("무게재기");
		add(weight);
		weight.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
					if (wei_count < 3 &&  arg0.getSource() == weight){						
						//2개 체크했을때, 넘기기 위한것
						if( 1<chck && chck < 3){
							
							//무게잰 횟수 증가
							wei_count++;
							count1.setText(wei_count+"");
						check1 = new Jcheck(number,chlab2);
						
						}
				}else{
					//3번이상 누를경우 경고창
					JFrame overcount = new JFrame();
					overcount.setTitle("무게재기");
					overcount.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					overcount.setSize(200,200);
					overcount.setResizable(false);	
					overcount.setVisible(true);
					overcount.setLayout(new GridLayout(0, 1));
					JPanel countover= new JPanel();
					JLabel over = new JLabel("숫자 카운터가 초과 되었습니다.");
					JButton back = new JButton("돌아가기");
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
		

		
		
		
		//정답맞추기를 누르면  답맞추기 창으로 이동한다.
		dab = new JButton("정답맞추기");		
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
		
		
		//끝내기 버튼, 누르면 메인Frame으로 돌아간다
		stop = new JButton("그만두기");
		add(stop);
		stop.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (arg0.getSource() == stop){
					gmmain.dispose();
				}
				
			}		
		});
		
		//배치관리자
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

	//num를 매개변수 num2로 받아서 수를 섞은뒤 그 것을 renum에 저장한다.
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

	//배경이미지설정
	public void paintComponent(Graphics g2) {
		g2.drawImage(bgimg2.getImage(), 0, 0, null);
		setOpaque(false);
		super.paintComponent(g2);
	}
	
	
}

