package myapp6;

public class Class10b 
{
    public static void main(String[] args) {
        MyInterface mi = (s1,s2,s3) -> { return "Whatever"; };
        String str = mi.printSomething("One", "Two", "Three");
        System.out.println(str);

        MyOwnClass moc = new MyOwnClass();
        MyInterface mi2 = moc::concatThreeStrings;
        String str2 = mi2.printSomething("One", "Two", "Three");
        System.out.println(str2);
    }
}
