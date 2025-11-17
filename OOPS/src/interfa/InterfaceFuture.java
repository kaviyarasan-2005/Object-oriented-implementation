package interfa;

interface Payment{
	// can return type also accept
	void pay(int a);
}

class UpiPayments implements Payment{
	public void pay(int a) {
		System.out.println("Pay by UPI -> "+a);
	}
}

class CreditCard implements Payment{
	public void pay(int a) {
		System.out.println("Pay by Credit Card -> "+a);
	}
}

class DebitCard implements Payment{
	public void pay(int a) {
		System.out.println("Pay by Debitcard -> "+ a);
	}
}

public class InterfaceFuture {
	public static void main(String[] args) {
		Payment bill = new UpiPayments();
		bill.pay(10);
		bill = new CreditCard();
		bill.pay(15);
		bill = new DebitCard();
		bill.pay(20);
		
	}
}
