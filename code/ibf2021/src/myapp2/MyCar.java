package myapp2;

public class MyCar implements Startable
{
    @Override
    public void start() {
        System.out.println("Turning ignition key..");
    }

    @Override
    public void stop() {
        System.out.println("..and also switch off engine.");
    }  
}
