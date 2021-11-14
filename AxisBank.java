package week3.day1;

public class AxisBank extends BankInfo {
	@Override
	public void deposit() {
		System.out.println("Deposit in Axis Bank");
		//super.deposit();
	}
	public static void main(String[] args) {
		AxisBank obj=new AxisBank();
		obj.deposit();
	}

}
