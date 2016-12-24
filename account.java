package core_javaS8;
import core_javaS8.BankException;		// Importing user defined exception class

import java.io.BufferedReader;// importing lib
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class account {

	int atmid = 15256;					// basic bank details
	String bank_name ="Axis Bank";
	String atm_loc="Shaniwar Peth/PUNE";
	double ac_balance=2365.23;
	
	public void withdraw(double ammount)	
	{
		
			try	// exception might be generated
			{
				if(ammount>ac_balance)		// check for amount to be withdraw
				{
						throw new BankException();
				}
				else
				{
					ac_balance=ac_balance-ammount;
					System.out.println("Transaction Successful:");
					System.out.println("ATM ID:"+atmid);
					System.out.println("ATM LOCATION:"+atm_loc);
					System.out.println("Available Balance:"+ac_balance);
				}
			}
			catch(BankException LowBalance)
			{
				//System.out.println(LowBalance);				
				System.out.println("Try Ammount less than "+ac_balance);
			}
		
		
	}
	public void deposite(double ammount)
	{
		ac_balance=ac_balance+ammount;
		System.out.println("Transaction Successful:");
		System.out.println("ATM ID:"+atmid);
		System.out.println("ATM LOCATION:"+atm_loc);
		System.out.println("Available Balance:"+ac_balance);
	}
	
	
	public static void main(String[] args) throws Exception, IOException {
		double amt_w=0;
		account b1 = new account();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Amount TO Withdraw:");
		amt_w=Double.parseDouble(br.readLine());
		b1.withdraw(amt_w);
	}

}

