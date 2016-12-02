import java.util.Scanner;

public class Seat {
	Scanner input = new Scanner(System.in);
	static private String[] S = new String[10];
	static private String[] A = new String[15];
	static private String[] B = new String[20];
	private int select;
	
	Seat(){}
	
	public void viewSeat(int select){
		this.select = select;
		
		if(select == 1){
			for(int i=0; i<10; i++){
				if(S[i] == null){
					S[i] = "...";
				}
				
				System.out.print(S[i]+" ");
			}
			System.out.println();
		}else if(select == 2){
			for(int i=0; i<15; i++){
				if(A[i] == null){
					A[i] = "...";
				}
				
				System.out.print(A[i]+" ");
			}
			System.out.println();
		}else if(select == 3){
			for(int i=0; i<20; i++){
				if(B[i] == null){
					B[i] = "...";
				}
				
				System.out.print(B[i]+" ");
			}
			System.out.println();
		}else if(select == 4){
			for(int i=0; i<10; i++){
				if(S[i] == null){
					S[i] = "...";
				}
				
				System.out.print(S[i]+" ");
			}
			System.out.println();
			
			for(int i=0; i<15; i++){
				if(A[i] == null){
					A[i] = "...";
				}
				
				System.out.print(A[i]+" ");
			}
			System.out.println();
			
			for(int i=0; i<20; i++){
				if(B[i] == null){
					B[i] = "...";
				}
				
				System.out.print(B[i]+" ");
			}
			System.out.println();
		}
	}
	
	public void checkSeat(int reserveSeat, String name, int seatNumber){
		if(reserveSeat == 1){
			if(S[seatNumber] == "..."){
				enterSeat(reserveSeat, name, seatNumber);
			}else{
				System.out.println("이미 예약된 좌석입니다.");
			}
		}else if(reserveSeat == 2){
			if(A[seatNumber] == "..."){
				enterSeat(reserveSeat, name, seatNumber);
			}else{
				System.out.println("이미 예약된 좌석입니다.");
			}
		}else if(reserveSeat == 3){
			if(B[seatNumber] == "..."){
				enterSeat(reserveSeat, name, seatNumber);
			}else{
				System.out.println("이미 예약된 좌석입니다.");
			}
		}
	}
	
	public void enterSeat(int reserveSeat, String name, int seatNumber){
		if(reserveSeat == 1){
			S[seatNumber] = name;
		}else if(reserveSeat == 2){
			A[seatNumber] = name;
		}else if(reserveSeat == 3){
			B[seatNumber] = name;
		}
	}
	
	public void cancle(int reserveSeat, String name){
		if(reserveSeat == 1){
			for(int i=0; i<10; i++){
				if(S[i].equals(name)){
					S[i] = "...";
				}
			}
		}else if(reserveSeat == 2){
			for(int i=0; i<15; i++){
				if(A[i].equals(name)){
					A[i] = "...";
				}
			}
		}else if(reserveSeat == 3){
			for(int i=0; i<20; i++){
				if(B[i].equals(name)){
					B[i] = "...";
				}
			}
		}
	}
}
