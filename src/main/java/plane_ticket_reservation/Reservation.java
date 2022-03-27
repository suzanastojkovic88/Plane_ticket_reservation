package plane_ticket_reservation;

import java.util.ArrayList;
import java.util.List;

public class Reservation {

	private int id = (int) (Math.random() * 10 + 1);

	private double reservationCost;

	private double ticketCost;

	private int passengerAge;

	private double discount;

	private int count;

	private List<ReservationObserver> reservations = new ArrayList<ReservationObserver>();

	public Reservation() {

	}

	public double getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getReservationCost() {
		return reservationCost;
	}

	public void setReservationCost(double reservationCost) {
		this.reservationCost = reservationCost;
	}

	public double getTicketCost() {
		return ticketCost;
	}

	public void setTicketCost(double ticketCost) {
		this.ticketCost = ticketCost;
	}

	public int getPassengerAge() {
		return passengerAge;
	}

	public void setPassengerAge(int passengerAge) {
		this.passengerAge = passengerAge;
	}

	public List<ReservationObserver> getReservations() {
		return reservations;
	}

	public void setReservations(List<ReservationObserver> reservations) {
		this.reservations = reservations;
	}

	public double getDiscount() {
		return discount;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void attach(ReservationObserver reservation) {
		reservations.add(reservation);
	}

	public void detach(ReservationObserver reservation) {
		reservations.remove(reservation);
	}

	public double getTotal() {
		return ticketCost - discount + reservationCost;
	}

	public void addTicketPrice(double price) {
		ticketCost += price;
		count++;
		reservations.stream().forEach(r -> r.updated(this));
	}

	public int getCount() {
		return count;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {

		return "Reservation ID: " + id + "\nTicket cost: " + ticketCost + " $" + "\nNumber of tickets: " + count
				+ "\nReservation cost: " + reservationCost + " $" + "\nDiscount: " + discount + " $" + "\nTotal: "
				+ getTotal() + " $";
	}

}
