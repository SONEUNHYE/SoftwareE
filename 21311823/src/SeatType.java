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
		
		System.out.print("�¼����� S(1), A(2), B(3)>>");
		reserveSelect = input.nextInt();
		seat.viewSeat(reserveSelect);
		
		
		System.out.print("�̸�>>");
		name = input2.nextLine();
		
		System.out.print("��ȣ>>");
		seatNumber = input3.nextInt();
		
		seat.checkSeat(reserveSelect, name, seatNumber-1);
	}
	
	public void view(){
		seat = new Seat();
		seat.viewSeat(4);
		System.out.println("<<<��ȸ�� �Ϸ��Ͽ����ϴ�.>>>");
	}
	
	public void cancle(){
		seat = new Seat();
		
		System.out.print("�¼����� S(1), A(2), B(3)>>");
		reserveSelect = input.nextInt();
		
		seat.viewSeat(reserveSelect);
		
		System.out.print("�̸�>>");
		name = input5.nextLine();
		
		seat.cancle(reserveSelect, name);
	}
	
	public void end(){
		System.out.println("�ý��� ����!");
		System.exit(0);
	}
}
