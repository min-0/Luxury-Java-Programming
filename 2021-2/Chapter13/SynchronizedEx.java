package Chapter13;

public class SynchronizedEx {
	public static void main(String[] args) {
		SharedBoard board = new SharedBoard(); //집계판 공유 데이터 생성
		
		//스레드 생성 시 집계판의 주소를 알려준다. 두 스레드는 집계판에 동시에 접근한다.
		Thread th1 = new StudentThread("kitae", board);
		Thread th2 = new StudentThread("hyosoo", board);
		
		//두 스레드를 실행
		th1.start();
		th2.start();
	}
}

//공유 데이터인 집계판을 시뮬레이션하는 클래스
//두 StudentThread 스레드에 의해 동시 접근됨
class SharedBoard {
	private int sum = 0; //집계판 합
	synchronized public void add() {
		int n = sum;
		Thread.yield(); //현재 실행 중인 스레드 양보
		n += 10;
		sum = n; 
		System.out.println(Thread.currentThread().getName() + " : " + sum);
	}
	public int getSum() {
		return sum;
	}
}

//학생을 시뮬레이션하는 스레드 클래스
class StudentThread extends Thread {
	private SharedBoard board;
	
	public StudentThread(String name, SharedBoard board) {
		super(name);
		this.board = board;
	}
	
	//집계판은 10번 접근하여 카운팅
	public void run() {
		for(int i = 0; i < 10; i++){
			board.add();
		}
	}
}