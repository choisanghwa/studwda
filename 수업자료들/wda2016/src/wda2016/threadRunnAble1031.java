package wda2016;

//1.Runnable 인터페이스를 상속받는 클래스를 생성
class MyRunnable implements Runnable{
	String name;
	
	//생성자
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
		//2. Runnable 인터페이스를 상속받은 클래스를  실행하고 자 하는 경우
		//2.1 상속 방은 클래스 MyThread 객체를 생성 
		//2.2 Thread 객체를 생성할 때 MyThread 객체를 매게변수로 만든다
		//2.3 Thread 객체의 start 메소드를 실행한다.
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
