package Electronics;

public class Fibo1 {
	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c=0;
		System.out.println(a);
    	System.out.println(b);
    while(c<100)
    {  
    	c=a+b;
    	if(c<100) {
    		
    	System.out.println(c);
    	}
    	a=b;
    	b=c;
    }
	}


}
