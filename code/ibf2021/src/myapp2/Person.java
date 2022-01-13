package myapp2;

public class Person 
{
    public void start(Startable startable) {
		startable.start();
	}

	public void stop(Startable startable) {
		startable.stop();
	}
}
