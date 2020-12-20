public class Account {
	int balance,accNo;
	String name;
	public Account(int balance, int accNo, String name) {
		super();
		this.balance = balance;
		this.accNo = accNo;
		this.name = name;
	}
    public void deposit(int depoAmt) {
        this.balance += depoAmt;
        System.out.println("Deposit of " + depoAmt + " New Bal is " + this.balance);
    	}
    @Override
    public String toString() {
        return "AccountInfo{" +
                "name='" + name + '\'' +
                ", Ac.number='" + accNo + '\'' +
                ", bal=" + balance +
                '}';
    }
	public int getBalance() {
		System.out.println("Balance= " + balance);
		return balance;
	}
	public int getAccNo() {
		System.out.println("Acc. No. = " + accNo);
		return accNo;
	}
	

}
