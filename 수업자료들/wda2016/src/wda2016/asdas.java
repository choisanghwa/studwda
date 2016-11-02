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
			System.out.printf("1 : 입차 , 2: 출차,  3: 종료");
			select = s.nextInt();
			
			
			switch(select) {
			case 1: 
				if(top == 5){
					System.out.printf("만차!!!\n");
				}else{
					stack[top] = carName++ ;
					System.out.printf("%c 자동차가 입차\n ",stack[top]);
					top++;
				}
				
				break;
			case 2: 
				if(top == 0){
					System.out.printf("빠져나갈게 없다!!!\n");
				}else{
					--top; 
					System.out.printf("%c 자동차가 출차\n ",stack[top]);
				}
				break;
			case 3: 
				System.out.printf("현재 터널에 %d대 있음" ,top);
				break;
			default:
				break;
			}
			
			
			
		}
		
				
	}

}
