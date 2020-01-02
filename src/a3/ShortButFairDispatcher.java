package a3;
import java.util.ArrayList;

public class ShortButFairDispatcher implements Dispatcher {
	Driver closestDriver = null;
	int closestDist;
	ArrayList<Driver> driverJobs = new ArrayList<>();
	public ShortButFairDispatcher() {
		
	}
	public Driver chooseDriver(Driver[] availableDrivers, RideRequest request) {
		
		for (int i = 0; i < availableDrivers.length; i++) {
			if (!find(availableDrivers[i])) {
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
		}
		driverJobs.add(closestDriver);
		if (driverJobs.size() > 5) {
			driverJobs.remove(0);
		}
		
		return closestDriver;
	}
	public boolean find(Driver driver) {
		for (int j = 0; j < driverJobs.size(); j++) {
			if (driverJobs.contains(driver)) {
				return true;
			}
		}
		return false;
	}
}
