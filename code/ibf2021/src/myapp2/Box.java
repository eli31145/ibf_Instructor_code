package myapp2;

import java.util.Objects;

public class Box<T> 
{
    private T item;

	public void setItem(T item) {
		this.item = item;
	}

	public T getItem() {
		return this.item;
	}

	public boolean isEmpty() {
		return Objects.isNull(this.item);
	}

	public static void main(String[] args) {
		Box<String> test1 = new Box<>();
		Box<Integer> test2 = new Box<>();
		test1.setItem("This is a String");
		test2.setItem(Integer.valueOf(123));
		System.out.println(test1.getItem() instanceof String);
		System.out.println(test2.getItem() instanceof Integer);
	}
}
