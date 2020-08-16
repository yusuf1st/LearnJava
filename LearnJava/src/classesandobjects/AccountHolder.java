package classesandobjects;

public class AccountHolder {
	String firstName;
	String lastName;
	int age;
	float accountbalance;
	boolean eligibleForCreditCard;
	
	
	public void testEligibilityForCreditCard() {
		
		if(age >25 && accountbalance>=20000) {
			eligibleForCreditCard = true;
			
			
		}
	}
	
}
