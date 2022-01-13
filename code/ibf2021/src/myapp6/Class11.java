package myapp6;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Supplier;

public class Class11 
{
    public <T> List<T> create(int count, Supplier<T> supplier) {
        List<T> list = new LinkedList<T>();
        for (int i = 0; i < count; i++)
            list.add(supplier.get());
        return list;
    } 
    

    public static void main(String[] args) {
        
        Class11 c11 = new Class11();
        List<Customer> custList2 = c11.create(5, () -> new Customer());
        List<Customer> custList3 = c11.create(3, Customer::new);
        List<Customer> custList4 = 
                c11.create(2, () -> new Customer("Me", "You"));

        System.out.println(custList4.get(0).getName());
    }
}
