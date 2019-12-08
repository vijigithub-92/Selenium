import java.util.HashMap;
import java.util.Map;

public class Charcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Vijayalakshmi";
		char[] a = str.toCharArray();
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for(int i = 0; i<a.length;i++) {
			//map.put(a[i]);
			if(map.containsKey(a[i]))
			{
				map.put(a[i], map.get(a[i])+1);
			}
			else
			{
				map.put(a[i],1);
			}
			
		} 
		System.out.println(map);
	//	System.out.println(map.get(a));

	}

}
