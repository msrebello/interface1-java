package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println(" ==== Locadora de Carros ==== \n");
		System.out.println("Enter rental data");
		
		System.out.print("Model: ");
		String model = sc.nextLine();
		
		System.out.print("Pickup (dd/MM/yyyy hh:mm): ");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), format);
		
		System.out.print("Return (dd/MM/yyyy hh:mm): ");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), format);
		
		CarRental car_rental = new CarRental(start, finish, new Vehicle(model));
		
		System.out.print("Enter price per hour: ");
		double pH = sc.nextDouble();
		System.out.print("Enter price per day: ");
		double pD = sc.nextDouble();
		
		RentalService rentalService = new RentalService(pH, pD, new BrazilTaxService());
		rentalService.processInvoice(car_rental);
		
		System.out.println("INVOICE: ");
		System.out.println("Basic Payment: " + String.format("%.2f", car_rental.getInvoice().getBasicPayment()));
		System.out.println("Tax: " + String.format("%.2f", car_rental.getInvoice().getTax())); 
		System.out.println("Total Payment: " + String.format("%.2f",  car_rental.getInvoice().totalPayment()));
		
		
		sc.close();
	}

}
