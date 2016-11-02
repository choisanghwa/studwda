package wda2016;

//Thread 클래스를 상속받아 사용자정의 스레드 클래스를 생성
class MyThread extends Thread{
	String name;
	//생성자
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
