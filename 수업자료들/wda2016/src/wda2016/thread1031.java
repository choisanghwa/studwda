package wda2016;

//Thread Ŭ������ ��ӹ޾� ��������� ������ Ŭ������ ����
class MyThread extends Thread{
	String name;
	//������
	public MyThread(String input){
		name = input;
	}
	
	@Override
	public void run(){
		for (int i=0; i<10000;i++){
			System.out.println(name+" : "+ i+" ");
		}
	}
}

public class thread1031 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread a = new MyThread("a");
		a.start();
		Thread b = new MyThread("b");
		b.start();
	}

}
