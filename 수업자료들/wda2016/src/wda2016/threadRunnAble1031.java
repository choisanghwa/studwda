package wda2016;

//1.Runnable �������̽��� ��ӹ޴� Ŭ������ ����
class MyRunnable implements Runnable{
	String name;
	
	//������
	public MyRunnable(String input){
		name = input;
	}
	@Override
	public void run() {
		for(int i =0;i<1000;i++){
	try {
		Thread.sleep(10);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
		}
		System.out.println(name+ " : "+i+" ");
		}
		
	}
	
}
public class threadRunnAble1031 {

	public static void main(String[] args) {
		//2. Runnable �������̽��� ��ӹ��� Ŭ������  �����ϰ� �� �ϴ� ���
		//2.1 ��� ���� Ŭ���� MyThread ��ü�� ���� 
		//2.2 Thread ��ü�� ������ �� MyThread ��ü�� �ŰԺ����� �����
		//2.3 Thread ��ü�� start �޼ҵ带 �����Ѵ�.
		//2.1
		MyRunnable  a = new MyRunnable("a");
		//2.2
		Thread thread = new Thread(a);
		//2.3
		thread.start();
		//2.1
		MyRunnable  b = new MyRunnable("b");
		//2.2
		Thread thread2 = new Thread(b);
		//2.3
		thread2.start();

	}

}
