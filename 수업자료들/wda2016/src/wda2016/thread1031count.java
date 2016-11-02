package wda2016;

import java.awt.Font;

import javax.swing.*;

class CountDown extends JFrame{
	private JLabel label;
	
	class MyThread extends Thread{

		@Override
		public void run() {
			for(int i =0;i<10;i++){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
			}
		label.setText((10-i)+"");
			}
		}
	}
	//생성자
	public CountDown(){
		setTitle("카운트다운");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label = new JLabel("Start");
		label.setFont(new Font("Serif",Font.BOLD,100));
		this.add(label);
		
//		MyThread a = new MyThread();
//		a.start();
//		이걸 축약한게 밑에꺼다
		(new MyThread()).start();
		setVisible(true);
	}
}

public class thread1031count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountDown a = new CountDown();
	}

}
