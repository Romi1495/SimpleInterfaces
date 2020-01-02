package a3;

public class ShortestWaitDispatcher implements Dispatcher {
	Driver closestDriver = null;
	int closestDist;
	public Driver chooseDriver(Driver[] availableDrivers, RideRequest request) {
		for (int i = 0; i < availableDrivers.length; i++) {
			int driverDist = availableDrivers[i].getVehicle().getPosition().getManhattanDistanceTo(request.getClientPosition());
			if (i == 0) {
				closestDist = driverDist;
				closestDriver = availableDrivers[i];
			}
			else if (driverDist < closestDist) {
				closestDist = driverDist;
				closestDriver = availableDrivers[i];
			}
		}
		return closestDriver;
	}
}