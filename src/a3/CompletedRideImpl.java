package a3;

public class CompletedRideImpl implements CompletedRide {
	RideRequest rRequest;
	Driver rDriver;
	Position initialPos;
	public CompletedRideImpl(RideRequest request, Driver driver) {
		if (request == null) {
			throw new RuntimeException("null ride request");
		}
		if (driver == null) {
			throw new RuntimeException("null driver");
		}
		rRequest = request;
		rDriver = driver;
		initialPos = driver.getVehicle().getPosition();
	}
	public RideRequest getRequest() {
		return rRequest;
	}
	public Driver getDriver() {
		return rDriver;
	}
	public int getWaitTime() {
		return initialPos.getManhattanDistanceTo(rRequest.getClientPosition());
	}
	
}
