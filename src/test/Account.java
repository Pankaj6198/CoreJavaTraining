package test;

import java.util.Scanner;

public class Account {

	private int accNo;
	private String accHolderName;
	private double accBal;
	
	Scanner sc = new Scanner(System.in);
	
	public Account()
	{
		System.out.println("This is default constructor");
		accNo=0;
		accHolderName="";
		accBal=0;
	}

	public Account(int accNo,String accHolderName,double accBal)
	{
		System.out.println("This is parameterized constructor");
		this.accNo=accNo;
		this.accBal=accBal;
		this.accHolderName=accHolderName;
	}
	
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accHolderName=" + accHolderName + ", accBal=" + accBal + "]";
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public double getAccBal() {
		return accBal;
	}

	public void setAccBal(double accBal) {
		this.accBal = accBal;
	}

	public void accept() 
	{
		
	}
	public void display() 
	{
		System.out.println(accNo);
		System.out.println(accHolderName);
		System.out.println(accBal);
	}
	
}
