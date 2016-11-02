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
			System.out.printf("<1> ���� <2> ���� <3> ���� : ");
			select = s.nextInt();

			switch (select) {
			case 1:
				Node newCar = new Node();
				newCar.data = carName;
				newCar.link = top;
				top = newCar;
				System.out.printf(" %c�ڵ����� ����\n", carName++);

				break;

			case 2:
				if (top == null) {
					System.out.printf("�������� �ڵ����� ����\n");
				} else {
					System.out.printf(" %c�ڵ����� ����\n", top.data);
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
				System.out.printf("���� �ͳο� %d�밡 ����.\n", count);
				System.out.printf("���α׷��� �����մϴ�.\n");
				break;

			default:
				System.out.printf("�߸� �Է��߽��ϴ�. �ٽ� �Է��ϼ���. \n");
			}
		}

	}
}
