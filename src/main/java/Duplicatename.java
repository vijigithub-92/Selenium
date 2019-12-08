import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Duplicatename {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> lis = new ArrayList<String>();
		lis.add("viji");
		lis.add("kiruba");
		lis.add("suji");
		lis.add("viji");
		lis.add("kiruba");
		lis.add("manju");
		lis.add("kavin");
		lis.add("nandhan");
		lis.add("abi");
		lis.add("abi");
		
		//int len = lis.size();
		Set<String> set = new TreeSet(lis);
		for(String each : set)
		{
			boolean a = set.contains(each);
			if(a=true) {
				System.out.println("Unique : "+each);
			}
			
		}
		
		for(int i=0; i<lis.size();i++) {
			String a = "";
			a = lis.get(i);
			int count = 0; 
			for(int j =0;j<lis.size();j++) {
				
				if(a==lis.get(j))
				{
					count++;
					
				}	
				
			}
			if(count>1) {
				System.out.println("Duplicate : "+lis.get(i));
				String b = lis.get(i);
				while(lis.contains(b) == true)
					lis.remove(b);
				continue;
					}
		}
	}
}

		
		
		
	/*	for(int i=0; i<lis.size();i++) {
			String a = "";
			a = lis.get(i);
			int count = 0;
			for(int j =0;j<lis.size();j++) {
				
				if(a==lis.get(j))
				{
					count++;
					
				}	
				
			}
			if(count>1) {
				System.out.println("Duplicate : "+lis.get(i));
				String b = lis.get(i);
				while(lis.contains(b) == true)
					lis.remove(b);
				continue;
					}
			else
			{
				System.out.println("Unique :"+lis.get(i));
			}
		}
		*/
