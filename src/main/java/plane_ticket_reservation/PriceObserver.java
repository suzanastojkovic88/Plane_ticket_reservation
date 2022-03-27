package plane_ticket_reservation;

public class PriceObserver implements ReservationObserver {

	public void updated(Reservation reservation) {
		int age = reservation.getPassengerAge();
		if (age <= 10) {
			reservation.setDiscount((reservation.getTicketCost() / 100) * 50);
		} else {
			reservation.setDiscount((reservation.getTicketCost() / 100) * 10);
		}
	}
}
