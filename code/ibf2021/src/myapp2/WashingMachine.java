package myapp2;

public class WashingMachine implements Startable 
{
    @Override
    public void start() {
        System.out.println("Warm Wash.."); 
    }

    @Override
    public void stop() {
        System.out.println("Take out laundry");
    }
}
