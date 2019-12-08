package Homework;

public class Uppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "testleaf";
		int num;
		char[] nam = name.toCharArray();
		for(int i=0;i<nam.length;i++) {
			
	    	if(i%2==1) {
	    		num = (int) nam[i];
	    		char a = (char) (num-32);
	    		System.out.print(a);
	    	}
	    	else
	    	{
	    		System.out.print(nam[i]);
	    	}
	    }
		
	}

}

/*
testleaf - print odd values in uppercase op = tEsTlEaF
int num ='a';
char b = (char)(num+32)
find sum of the numbers in the given string AC1SFc45c2
op=12 
 */