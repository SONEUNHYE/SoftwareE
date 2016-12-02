import java.util.Scanner;

public class SeatType {
	Scanner input = new Scanner(System.in);
	Scanner input2 = new Scanner(System.in);
	Scanner input3 = new Scanner(System.in);
	Scanner input4 = new Scanner(System.in);
	Scanner input5 = new Scanner(System.in);
	Seat seat = null;
	private int select;
	private int reserveSelect;
	private String name;
	private int seatNumber;
	
	SeatType(int select){
		this.select = select;
		
		if(select == 1){
			reservation();
		}else if(select == 2){
			view();
		}else if(select == 3){
			cancle();
		}else if(select == 4){
			end();
		}
	}
	
	public void reservation(){
		seat = new Seat();
		
		System.out.print("좌석구분 S(1), A(2), B(3)>>");
		reserveSelect = input.nextInt();
		seat.viewSeat(reserveSelect);
		
		
		System.out.print("이름>>");
		name = input2.nextLine();
		
		System.out.print("번호>>");
		seatNumber = input3.nextInt();
		
		seat.checkSeat(reserveSelect, name, seatNumber-1);
	}
	
	public void view(){
		seat = new Seat();
		seat.viewSeat(4);
		System.out.println("<<<조회를 완료하였습니다.>>>");
	}
	
	public void cancle(){
		seat = new Seat();
		
		System.out.print("좌석구분 S(1), A(2), B(3)>>");
		reserveSelect = input.nextInt();
		
		seat.viewSeat(reserveSelect);
		
		System.out.print("이름>>");
		name = input5.nextLine();
		
		seat.cancle(reserveSelect, name);
	}
	
	public void end(){
		System.out.println("시스템 종료!");
		System.exit(0);
	}
}
