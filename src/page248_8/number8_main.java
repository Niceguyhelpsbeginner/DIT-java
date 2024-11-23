package page248_8;

public class number8_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		account a = new account(100);
		a.deposit(5000);
		System.out.println("deposit is "+ a.getBalance());
		int bulk[] = { 100, 500, 200, 700};
		a.deposit(bulk);
		System.out.println("the deposit is "+ a.getBalance());
		int money = 1000;
		int wMoney = a.withdraw(money);
		if(wMoney < money) {
			System.out.println(wMoney + "is only withdrown");
		}
		else {
			System.out.println(wMoney + " is withdrown");
		}
		System.out.println("The deposit is "+ a.getBalance());
	}

}
