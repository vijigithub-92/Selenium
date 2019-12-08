package Homework;

public class Revword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String name = "hi how are you";
      String[] split = name.split(" ");
      for(int i =split.length-1; i>=0;i--)
      {
    	  int len = split[i].length();
    	  for(int a=len-1; a>=0; a--)
    	  {
    		  System.out.print(split[i].charAt(a));
    	  }
    	  System.out.print(" ");
      }
	}

}
