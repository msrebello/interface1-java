package model.entities;

import java.time.LocalDateTime;

public class CarRental {

	private LocalDateTime rentStart;
	private LocalDateTime rentFinish;

	private Vehicle vehicle;
	private Invoice invoice;

	public CarRental() {
	}

	public CarRental(LocalDateTime rent_start, LocalDateTime rent_finish, Vehicle vehicle) {
		this.rentStart = rent_start;
		this.rentFinish = rent_finish;
		this.vehicle = vehicle;
	}

	public LocalDateTime getRentStart() {
		return rentStart;
	}

	public void setRentStart(LocalDateTime rent_start) {
		this.rentStart = rent_start;
	}

	public LocalDateTime getRentFinish() {
		return rentFinish;
	}

	public void setRentFinish(LocalDateTime rent_finish) {
		this.rentFinish = rent_finish;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	
	
}
