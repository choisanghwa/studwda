package gameMake;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

//메인 화면 패널
public class JPanel1 extends JPanel {
	JTextField name;
	JButton start1,rank1;
	JPanel2 gamest;
	//생성자
	public JPanel1(){
		
		//이름 필드
		name = new JTextField(10);
		add(name);
		
		//시작버튼 및 액션
		start1 = new JButton("게임시작");	
		start1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		add(start1);
		
		//랭킹버튼 및 액션
		rank1 = new JButton("랭킹보기");
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
