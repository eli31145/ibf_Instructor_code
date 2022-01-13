package myapp2;

public class Car 
{
    private String color;
	private boolean started = false;

	public Car() { }

	public String getColor() { return this.color; }
	public void setColor(String color) { this.color = color; }
	public boolean isStarted() { return this.started; }
	
	public void start() { 
		// Start the car
		this.started = true;
	}
    
	public void stop() {
		// Stop the car
		this.started = false;
	}
}
