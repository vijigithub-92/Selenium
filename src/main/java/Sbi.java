
public class Sbi implements RBI, Cibil{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sbi bank = new Sbi();
		bank.maxTransLimit();
		bank.minBalance();
		bank.verifyAadhaar();
		bank.getCreditScore();
	}

	public void getCreditScore() {
		// TODO Auto-generated method stub
		System.out.println("Credit Score is 1 Lakh");
		
	}

	public void maxTransLimit() {
		// TODO Auto-generated method stub
		System.out.println("Maximum Transaction Limit is 20,000");
		
	}

	public void minBalance() {
		// TODO Auto-generated method stub
		System.out.println("Minimum Balance is 1500");
		
	}

	public void verifyAadhaar() {
		// TODO Auto-generated method stub
		System.out.println("Verified Aadhaar");
		
	}

}
