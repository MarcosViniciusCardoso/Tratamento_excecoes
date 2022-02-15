package Application_Hotel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
		System.out.print("Room Number: ");
		int number = sc.nextInt();
		System.out.print("CheckIn date: (dd/MM/yyyy) ");
		Date checkIn = sdf.parse(sc.next());

		System.out.print("CheckOut date: (dd/MM/yyyy) ");
		Date checkOut = sdf.parse(sc.next());

		Reservation reservation = new Reservation(number, checkIn, checkOut);
		System.out.println("Resevation" + reservation);

		System.out.println();
		System.out.println("Update reservation");
		System.out.print("CheckIn date: (dd/MM/yyyy) ");
		checkIn = sdf.parse(sc.next());

		System.out.print("CheckOut date: (dd/MM/yyyy) ");
		checkOut = sdf.parse(sc.next());
		reservation.updateDates(checkIn, checkOut);
		System.out.println("Resevation" + reservation);
	}
		catch (ParseException e) {
			System.out.println("Inválide date formate");
		}
		catch (DomainException e) {
			System.out.println("Erro in reservation: "+e.getMessage());
		}
		
		catch (RuntimeException e) {
			System.out.println("Unexpectec erro");
		}

	}
	
}
