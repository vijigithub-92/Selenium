package Homework;

public class Sumnum {

	public static void main(String[] args) {
		String name = "AC1SFc45c2";
		String num = name.replaceAll("\\D", "");
		int foo = Integer.parseInt(num);
				int sum = 0;
		        while (foo > 0) {
		            sum = sum + foo % 10;
		            foo = foo / 10;
		        }
		        System.out.println(sum); 
		
		
		
	}

}
