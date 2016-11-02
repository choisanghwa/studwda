package wda2016;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;



class CountDown2 extends JFrame{
	private JLabel label;
	
	class MyRunnable2 implements Runnable{

		@Override
		public void run() {
			for(int i =1000;i>=0;i--){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
			}
		label.setText(i+"");
			}
		}
	}
	//积己磊
	public CountDown2(){
		setTitle("墨款飘促款");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label = new JLabel("Start");
		label.setFont(new Font("Serif",Font.BOLD,100));
		this.add(label);
		
		Thread a = new Thread(new MyRunnable2() );
		a.start();

		setVisible(true);
	}
}
public class runnablecountdown1031 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountDown2 a = new CountDown2();
	}

}
