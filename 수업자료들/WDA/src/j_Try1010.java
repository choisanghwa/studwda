import java.util.Scanner;

public class j_Try1010{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y;
		Scanner sc= new Scanner(System.in);
		System.out.println("���� ��: ");
		x= sc.nextInt();
		System.out.println("����: ");
		y= sc.nextInt();
		try{
			int result = x/y;		//���ܹ߻�!
		}catch(ArithmeticException e){
			System.out.println("0���� ������ �����ϴ�.");
		}
		System.out.println("���α׷��� ��� ����˴ϴ�. ");
	
	}

}