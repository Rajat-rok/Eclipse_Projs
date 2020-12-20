
public class SavingsAccount extends Account {
	
	int minBal;

	public SavingsAccount(int balance, int accNo, String name, int minBal) {
		super(balance, accNo, name);
		this.minBal = minBal;
	}
	
    public void withdraw(int withAmt) {
        if (this.balance - withAmt < minBal){
            System.out.println("Only Balance is " + this.balance + " So Unable to withdraw "+ minBal+ " is the required minimum bal");
        }
        else {
            this.balance -= withAmt;
            System.out.println("withdrawal of " + withAmt + " AvbBal is " + this.balance);
        }
    }

	public int getMinBal() {
		System.out.println("Min Bal: "+ minBal);
		return minBal;
	}

	
    
    
	
}
