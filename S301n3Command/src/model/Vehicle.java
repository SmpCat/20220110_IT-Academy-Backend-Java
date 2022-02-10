package model;

public abstract class Vehicle {
	
	private String nomVehicle;
	
	public Vehicle() {
		
	}
	
	public Vehicle(String nomVehicle) {
		this.nomVehicle = nomVehicle;
	}

	public String getNomVehicle() {
		return nomVehicle;
	}

	public void setNomVehicle(String nomVehicle) {
		this.nomVehicle = nomVehicle;
	}
	
	public void arrencar() {
		
		System.out.println("El vehicle " + this.nomVehicle + " arrenca");
	}
	
	public void accelerar() {
	
		System.out.println("El vehicle " + this.nomVehicle + " accelera");
	}
	
	public void frenar() {
		
		System.out.println("El vehicle " + this.nomVehicle + " frena");
	}
}
