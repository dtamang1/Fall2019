/**
 * 
 * 
 * 09/07/2019
 * Fall 2019
 * Dawa Tamang
 * CIS-2272
 *Homework week1
 *
 *
 */

public class Ticket {


				//Date Fields
		private String event;
		private Double ticketPrice;
		private char SeatRow;
		private int Seat;
			
			
			

			//Constroctor  withou argument

		
		public Ticket() {
			event = "Beyonce";
			ticketPrice = 75.50;
			SeatRow = 'j';
			Seat = 32;
			
		}
		
		// Method

	public Double getTicketPrice() {
			return ticketPrice;
		}



	public void setTicketPrice(Double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public static void main(String[] agrs) {
		Ticket t = new Ticket();
		System.out.println("*******");
		System.out.println("TICKET");
		System.out.println(t.event);
		System.out.println("$" + t.getTicketPrice());
		System.out.println("Seat " + t.SeatRow +"-"+ t.Seat);
		System.out.println("*******");
		
	}
	
		
	
	
}
	

	







