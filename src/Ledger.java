import java.util.ArrayList;

public class Ledger{
	ArrayList<Account> ArrayOfAccounts;
	int ledgerNumber;
	String ledgerStartDate;

	public Ledger(int ledgerNumber, String ledgerStartDate) {
		super();
		this.ledgerNumber = ledgerNumber;
		this.ledgerStartDate = ledgerStartDate;
		this.ArrayOfAccounts=new ArrayList<Account>();
	}
	
	public void addNewAccount(int balance, int accNo, String name) {
		
		this.ArrayOfAccounts.add(new Account(balance, accNo, name));
	}
	
	private void printStatement(int acNo) {
			//getArrayOfAccounts()
	}

	public ArrayList<Account> getArrayOfAccounts() {
		return ArrayOfAccounts;
	}

	public int getLedgerNumber() {
		return ledgerNumber;
	}

	public String getLedgerStartDate() {
		return ledgerStartDate;
	}

	public void setArrayOfAccounts(ArrayList<Account> arrayOfAccounts) {
		ArrayOfAccounts = arrayOfAccounts;
	}

	public void setLedgerNumber(int ledgerNumber) {
		this.ledgerNumber = ledgerNumber;
	}

	public void setLedgerStartDate(String ledgerStartDate) {
		this.ledgerStartDate = ledgerStartDate;
	}

	public static void main(String[] args) {
		Ledger l=new Ledger(22, "220022");
		l.addNewAccount(500, 123, "sammy");
		l.addNewAccount(512, 245, "Joy");
		System.out.println(l.getArrayOfAccounts().get(1).getBalance()+"gg");
		l.printStatement(112);
	}
	
}
