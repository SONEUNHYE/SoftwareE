import java.util.Scanner;

public class Reserve {
	private Scanner input = new Scanner(System.in);
	private SeatType st = null;
	private int select;
	
	Reserve(){}
	
	public void run(){
		while(true){
			System.out.print("예약(1), 조회(2), 취소(3), 끝내기(4)>>");
			select = input.nextInt();
			st = new SeatType(select);
		}
	}
}
