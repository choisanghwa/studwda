import java.util.Scanner;

public class j_Try1010{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y;
		Scanner sc= new Scanner(System.in);
		System.out.println("피켓 수: ");
		x= sc.nextInt();
		System.out.println("젯수: ");
		y= sc.nextInt();
		try{
			int result = x/y;		//예외발생!
		}catch(ArithmeticException e){
			System.out.println("0으로 나눌수 없습니다.");
		}
		System.out.println("프로그램은 계속 진행됩니다. ");
	
	}

}