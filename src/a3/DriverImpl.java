package a3;

public class DriverImpl implements Driver {
	String firstName;
	String lastName;
	int idNumber;
	Position initialPos;
	Vehicle driverVehicle;
	public DriverImpl(String first, String last, int id, Vehicle vehicle) {
		if (first == null) {
			throw new RuntimeException("Error: first name = null");
		}
		if (last == null) {
			throw new RuntimeException("Error: last name = null");
		}
		if (vehicle == null) {
			throw new RuntimeException("Error: vehicle = null");
		}
		firstName = first;
		lastName = last;
		idNumber = id; 
		driverVehicle = vehicle;
		initialPos = vehicle.getPosition();
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getID() {
		return idNumber;
	}
	
	public Vehicle getVehicle() {
		return driverVehicle;
	}
	public void setVehicle(Vehicle v) {
		if (v == null) {
			throw new RuntimeException("null vehicle");
		}
		driverVehicle = v;
	}
	public Position getInitial() {
		return initialPos;
	}
}
