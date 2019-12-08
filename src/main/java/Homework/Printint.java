package Homework;

public class Printint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "testleaf (10002)";
		//System.out.println(word.split("").);
		//word.split(arg0)
		// Captial D - identify other than number, small d - identify the number
		System.out.println(word.replaceAll("\\D", ""));

	}

}
