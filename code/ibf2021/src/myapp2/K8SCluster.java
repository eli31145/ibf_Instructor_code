package myapp2;

public class K8SCluster implements Startable
{
    @Override
    public void start() {
        System.out.println("Start Kube..");
    }

    @Override
    public void stop() {
        System.out.println("Stop Kube..");
    }

}
