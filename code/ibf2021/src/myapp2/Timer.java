package myapp2;

public class Timer implements Startable
{
    @Override
    public void start() {
        System.out.println("0.00s"); 
    }

    @Override
    public void stop() {
        System.out.println("30.00 s");
    }
}
