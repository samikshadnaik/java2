package pkg1;

class Bank1{
	double balance1;
	Bank1(double balance1){
		this.balance1=balance1;
	}
	public void displayBalance() {
		System.out.println("Balance is: "+balance1);
	}
	public void addAmount(double amount) {
		balance1=balance1+amount;
		System.out.println("Balance is: "+balance1);
	}
	public void withdrawAmount(double amount) {
		if(balance1<amount) {
			System.out.println("Insufficient balance");
		}
		else {
			balance1=balance1-amount;
			System.out.println("Balance is: "+balance1);
		}
	}
}

public class S2 {

	public static void main(String[] args) {
		Bank1 bank1=new Bank1(500.0);
		bank1.displayBalance();
		bank1.addAmount(200);
		bank1.withdrawAmount(300);
		
		

	}

}
