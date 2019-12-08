package Homework;

public class Countletter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String name = "america";
    char[] nam = name.toCharArray();
    int count = 0;
    for(int i =0;i<name.length();i++) {
    	if(nam[i]=='a') {
    		count++;
    	}
    }
    System.out.println("Total number of letter 'a' in the word America is "+count);
    
	}

}

/*
testleaf - print odd values in uppercase op = tEsTlEaF
int num ='a';
char b = (char)(num+32)
find sum of the numbers in the given string AC1SFc45c2
op=12 
 */
