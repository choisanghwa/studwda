package wda_1021;

import java.awt.GridLayout;

import javax.swing.*;

class MyFrame extends JFrame{
	public MyFrame(){
		//setSize(200,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("book");
		setLayout(new GridLayout(5, 1));
		

		JPanel panel1 = new JPanel();
		JLabel label1 = new JLabel("제목 :");
		JTextField t1 = new JTextField(10);
		
		JPanel panel2 = new JPanel();
		JLabel label2= new JLabel("출판사 :");
		JTextField t2 = new JTextField(10);
		
		JPanel panel3 = new JPanel();
		JLabel label3 = new JLabel("년도 :");
		JTextField t3 = new JTextField(10);
		
		JPanel panel4 = new JPanel();
		JLabel label4 = new JLabel("가격 :");
		JTextField t4 = new JTextField(10);
		
		JPanel panel5 = new JPanel();
		JButton button = new JButton("등록");
		
		panel1.add(label1);
		panel1.add(t1);
		panel2.add(label2);
		panel2.add(t2);
		panel3.add(label3);
		panel3.add(t3);
		panel4.add(label4);
		panel4.add(t4);
		panel5.add(button);
		
		
		add(panel1);
		add(panel2);
		add(panel3);
		add(panel4);
		add(panel5);
		pack();
		setVisible(true);
		
	}
}

public class test_1021 {

	public static void main(String[] args) {
		MyFrame f = new MyFrame();
		
	}

}
