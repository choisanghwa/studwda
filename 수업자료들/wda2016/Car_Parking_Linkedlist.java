import java.util.Scanner;

class Node {
   char data;
   Node link;
}

public class Car_Parking_Linkedlist{
	public static void main(String[] args) {
   		 Node top = null;
   		 Scanner s = new Scanner(System.in);

    		char carName = 'A';
   		int select = 9;
		int count = 0;

		while (select != 3) {
			System.out.printf("<1> 입차 <2> 출차 <3> 종료 : ");
			select = s.nextInt();

			switch (select) {
			case 1:
				Node newCar = new Node();
				newCar.data = carName;
				newCar.link = top;
				top = newCar;
				System.out.printf(" %c자동차가 입차\n", carName++);

				break;

			case 2:
				if (top == null) {
					System.out.printf("빠져나갈 자동차가 없음\n");
				} else {
					System.out.printf(" %c자동차가 출차\n", top.data);
					top = top.link;
					
				}
				break;

			case 3:
				Node temp = top;
				while(temp != null)
				{
					count++;
					temp = temp.link;
				}	
				System.out.printf("현재 터널에 %d대가 있음.\n", count);
				System.out.printf("프로그램을 종료합니다.\n");
				break;

			default:
				System.out.printf("잘못 입력했습니다. 다시 입력하세요. \n");
			}
		}

	}
}
