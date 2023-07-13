package staticpack;

public class BankAccount {
	
	private int accNo;
	private double bal;
	private static int idNum=100;	//static variable
	
	
	public BankAccount() {
		accNo=idNum++;
	}
	
	public BankAccount(int accNo, double bal) {
     	this.accNo = idNum++;
		this.bal = bal;
		
	}
	//how many obj are created

	public static int getIdNum() {
		return idNum;
	}
	
	public static void main(String[] args) {
		//1
		System.out.println(BankAccount.getIdNum());
		
		//2
		BankAccount ba=new BankAccount();
		System.out.println(ba.getIdNum());
		
		BankAccount ca=new BankAccount();
		System.out.println(ca.getIdNum());
		
		//3
		System.out.println(getIdNum());
		
		
	}
}