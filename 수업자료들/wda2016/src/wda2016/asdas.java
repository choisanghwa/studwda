package wda2016;

import java.util.*;

public class asdas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		char [] stack = new char[5] ;
		int top =  0;
		
		char carName = 'A';
		int select = 9;
		
		while(select !=3){
			System.out.printf("1 : ���� , 2: ����,  3: ����");
			select = s.nextInt();
			
			
			switch(select) {
			case 1: 
				if(top == 5){
					System.out.printf("����!!!\n");
				}else{
					stack[top] = carName++ ;
					System.out.printf("%c �ڵ����� ����\n ",stack[top]);
					top++;
				}
				
				break;
			case 2: 
				if(top == 0){
					System.out.printf("���������� ����!!!\n");
				}else{
					--top; 
					System.out.printf("%c �ڵ����� ����\n ",stack[top]);
				}
				break;
			case 3: 
				System.out.printf("���� �ͳο� %d�� ����" ,top);
				break;
			default:
				break;
			}
			
			
			
		}
		
				
	}

}
