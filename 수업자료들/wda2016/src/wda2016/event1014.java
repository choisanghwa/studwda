package wda2016;

import java.awt.event.*;
import javax.swing.*;

//1. 리스너 클래스 생성
class MyListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		//어떤 버튼에서 눌러졌는지 해당 객체를 가져온다.
		JButton b =(JButton ) e.getSource();
		b.setText("홍길동");
	}
	
}

class MyFrame extends JFrame{
	//맴버 변수
	JButton button;
	//생성자 
	public MyFrame(){
		//2.1 등록을 위한 리스너 객체생성
		MyListener myListener = new MyListener();
		
		this.setSize(300, 200); //사이즈
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button = new JButton("버튼 누르기전");
		//2.2 해당 컴포넌트에 리스너 객체 등록
		button.addActionListener(myListener);
		this.add(button);
		this.setVisible(true);
	}
}

public class event1014 {

	public static void main(String[] args) {
		new MyFrame();
		
	}

}
