
public class Reverseword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String name = "hi how are you";
      String[] split = name.split(" ");
      for(int i =0; i<split.length;i++)
      {
    	  int len = split[i].length();
    	  for(int a=len; a>=0; a--)
    	  {
    		  System.out.print(split[i].charAt(a));
    	  }
      }
    	  
      
	}

}
