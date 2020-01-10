package org.bank;

public class BankInfo extends AxisBank
{
	private void saving() 
	{
		System.out.println("saving account");
	}
	private void fixed() 
	{ 
		System.out.println("fixed amount in this bank");
	}
	public static void main(String[] args) 
	{
		BankInfo bi = new BankInfo();
		bi.fixed();
		bi.saving();
		bi.deposit();
	}

}
