import java.util.Scanner;

public class Reserve {
	private Scanner input = new Scanner(System.in);
	private SeatType st = null;
	private int select;
	
	Reserve(){}
	
	public void run(){
		while(true){
			System.out.print("����(1), ��ȸ(2), ���(3), ������(4)>>");
			select = input.nextInt();
			st = new SeatType(select);
		}
	}
}
