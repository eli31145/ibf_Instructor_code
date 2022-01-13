package myapp2;

public class Class22 
{
    public static void main(String[] args) {
        Person fred = new Person();
        MyCar car = new MyCar();
        WashingMachine washingMachine = new WashingMachine();
        K8SCluster k8sCluster = new K8SCluster();
        Timer timer = new Timer();

        fred.start(car);
        fred.start(washingMachine);
        fred.start(k8sCluster);
        fred.start(timer);
    }
}
