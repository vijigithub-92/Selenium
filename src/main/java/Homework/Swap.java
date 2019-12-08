package Homework;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2, b = 3;
		System.out.println("Before Swapping 'a' value is "+a);
		System.out.println("Before Swapping 'b' value is "+b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After Swapping 'a' value is "+a);
		System.out.println("After Swapping 'b' value is "+b);

	}

}
