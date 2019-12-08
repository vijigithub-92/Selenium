package Homework;

public class Revchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      String name = "hi how";
	      String[] split = name.split(" ");
	      for(int i=0; i<split.length; i++)
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
