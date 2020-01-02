package a3;

public class RideRequestImpl implements RideRequest {
	Position cPos;
	Position dPos;
	CompletedRide compRide;
	boolean completed = false;
	public RideRequestImpl(Position clientPosition, Position destination) {
		if (clientPosition == null) {
			throw new RuntimeException("Client position is null");
		}
		if (destination == null) {
			throw new RuntimeException("Destination is null");
		}
		cPos = clientPosition;
		dPos = destination;
		
	}
	public Position getClientPosition() {
		return cPos;
	}
	public Position getDestination() {
		return dPos;
	}
	public boolean getIsComplete() {
		return completed;
	}
	public CompletedRide complete(Driver driver) {
		if (!completed) {
			completed = true;
			compRide = new CompletedRideImpl(this, driver);
			driver.getVehicle().moveToPosition(cPos);
		}
		driver.getVehicle().moveToPosition(dPos);
		return compRide;
	}
}
