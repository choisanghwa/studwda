package gameTest;

import java.awt.Choice;

import javax.swing.*;


	class Choice1 extends JFrame{
	
	public Choice1(){
		setTitle("GAMESTART");
		setSize(190, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		JCheckBox A = new JCheckBox("A");
		JCheckBox B = new JCheckBox("B");
		JCheckBox C = new JCheckBox("C");
		JCheckBox D = new JCheckBox("D");
		JCheckBox E = new JCheckBox("E");
		JCheckBox F = new JCheckBox("F");
		panel.add(A);
		panel.add(B);
		panel.add(C);
		panel.add(D);
		panel.add(E);
		panel.add(F);
		
        JButton buttonRegister = new JButton("µî·Ï");
		panel.add(buttonRegister);
      
        
        add(panel);
        setVisible(true);
        
	}
}
public class muge {

	public static void main(String[] args) {
		Choice1 start = new Choice1();

	}

}
