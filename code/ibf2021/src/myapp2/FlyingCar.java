package myapp2;

public class FlyingCar extends Car
{
    private int altitude = 0;

	public FlyingCar() { }
	public FlyingCar(String color) {
		this.setColor(color);
	}

	@Override()
	public String getColor() {
		// return "Matte %s".format(super.getColor());
        return String.format("Matte %s", super.getColor());
	}

	public void climb(int height) {
		this.altitude += height;
	}
}
