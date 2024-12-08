package Encapsulation;
public class Bank {
	private int money;

	public void setMoney(int money) {
		this.money = money;
	}

	public int getMoney() {
		return money;
	}
	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.setMoney(100);
		System.out.println("Money in bank: " + bank.getMoney());
	}
}