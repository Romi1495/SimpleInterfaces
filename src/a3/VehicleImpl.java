package a3;

public class VehicleImpl implements Vehicle {
	private String vMake;
	private String vModel;
	private String vPlate;
	private int mileage;
	private Position vPos;
	public VehicleImpl(String make, String model, String plate, Position position) {
		vMake = make;
		vModel = model;
		vPlate = plate;
		vPos = position;
		if (make == null) {
			throw new RuntimeException("Error: String 'make' = null");
		}
		if (model == null) {
			throw new RuntimeException("Error: String 'model' = null");
		}
		if (plate == null) {
			throw new RuntimeException("Error: String 'plate' = null");
		}
		if (position == null) {
			throw new RuntimeException("Error: Position 'position' = null");
		}
	}
	public String getMake() {
		return vMake;
	}
	public String getModel() {
		return vModel;
	}
	public String getPlate() {
		return vPlate;
	}
	public int getMileage() {
		return mileage;
	}
	public Position getPosition() {
		return vPos;
	}
	public void moveToPosition(Position p) {
		int manDist = vPos.getManhattanDistanceTo(p);
		mileage += manDist;
		vPos = p;
	}
}
