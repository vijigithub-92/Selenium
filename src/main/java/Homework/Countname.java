package Homework;

public class Countname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name = {"vijayalakshmi","dinesh", "nandha", "sathish", "abi", "suganthi", "kiruba","sowmiya","Surendhar","vijaya"};
	    int len = name.length;
	    for(int i =0;i<len;i++)
	    {
	        //int le = name[i].length();
	        if(name[i].startsWith("s")||name[i].endsWith("a"))
	        {
	    	//String names = name[i].startsWith('s');
	    	System.out.println(name[i]);
	    }
	    }
	}

}
