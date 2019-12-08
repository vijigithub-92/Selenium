package Electronics;

public class mymobile {
public static void main(String[] args) {
	
	mobile mymobile = new mobile();
	int count = mymobile.mobileAvail();
	System.out.println(count);
	String name = mymobile.mobileName();
	System.out.println(name);
	mymobile.verified();
	boolean functional = mymobile.isFunctional;
	System.out.println(functional);
	String devname = mymobile.mobName;
	System.out.println(devname);
}
}
