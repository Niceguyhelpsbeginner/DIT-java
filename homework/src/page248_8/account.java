package page248_8;

public class account {
	int balance;
	
	account(int yeguem){
		this.balance = yeguem;
	}
	
	void deposit(int [] money) {
		for(int i =0;i<money.length;i++) {
			balance += money[i];
		}
	}
	
	void deposit(int money) {
		balance += money;
	}

	int getBalance() {
		return balance;
	}
	int withdraw(int money) {
		if(money > balance) {
			money = balance;
			balance = 0;
			return money;
		}else {
			balance -= money;
			return money;
		}
	}
	
}
