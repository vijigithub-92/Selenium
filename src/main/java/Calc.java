
public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CaluclateArea obj = new CaluclateArea();
		int a = 2;
		float b = 1.53f;
		int i = 2, j =3;
		float k = 10.11f, v = 1.23f; 
		int s = obj.computeArea(a);
		float z = obj.computeArea(b);
		int c = obj.computeArea(i, j);
		float d = obj.computeArea(k, v);
		System.out.println("Integer square : "+s);
		System.out.println("Float square : "+z);
		System.out.println("Int rectangle : "+c);
		System.out.println("Float rectange : "+d);

	}

}
