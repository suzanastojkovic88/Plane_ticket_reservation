package plane_ticket_reservation;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Reservation reservation = new Reservation();
		PriceObserver priceObserver = new PriceObserver();
		QuantityObserver quantpriceObserver = new QuantityObserver();

		Scanner sc = new Scanner(System.in);

		System.out.println("How many tickets do you want to book?");
		int number = sc.nextInt();

		while (reservation.getCount() < number) {
			System.out.println("Enter the ticket price:");
			double price = sc.nextDouble();

			System.out.println("Enter the age of passenger:");
			int age = sc.nextInt();

			reservation.addTicketPrice(price);
			reservation.setPassengerAge(age);
			reservation.attach(priceObserver);
			reservation.attach(quantpriceObserver);
		}
		sc.close();

		System.out.println(reservation);
	}

}
