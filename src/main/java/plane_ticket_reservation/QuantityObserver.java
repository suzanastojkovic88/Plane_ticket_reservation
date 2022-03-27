package plane_ticket_reservation;

public class QuantityObserver implements ReservationObserver {

	public void updated(Reservation reservation) {
		int count = reservation.getCount();
		if (count <= 2) {
			reservation.setReservationCost(2);
		} else {
			reservation.setReservationCost(5);
		}
	}
}
