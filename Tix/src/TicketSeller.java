/**
 * 
 * 
 * 09/07/2019
 * Fall 2019
 * Dawa Tamang
 * CIS-2272
 * Homework week1
 *
 */

public class TicketSeller {
	public static void main(String[] args) {
		
		
		Double ticketPrice = 120.00;
		String event = "Red Sox vs. Yankees";
		char SeatRow = 'B';
		
		for (int seatNum = 2; seatNum <= 42; seatNum = seatNum + 2) {
			
			System.out.println("********");
			System.out.println("TICKET");
			System.out.println(event);
			System.out.println("$" + ticketPrice);
			System.out.println("Seat " + SeatRow + "-" + seatNum);
			System.out.println("********");
			System.out.println();
			
		}
		
		
	}

}
