package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.print("Enter acount number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char response1 = sc.next().charAt(0);
		if (response1 == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);	
		}
		else {
			account = new Account(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data");
		System.out.println(account);
		
		System.out.println();
		System.out.print("You want to deposit an amount? (y/n)");
		char response2 = sc.next().charAt(0);
		if (response2 == 'y') {
			System.out.print("Enter a deposit value: ");
			double depositValue = sc.nextDouble();
			account.deposit(depositValue);
			System.out.println("Update account data");
			System.out.println(account);		
		}
		if(account.getBalance() != 0){
			System.out.println();
			System.out.println("You want to withdraw an amount? (y/n)");
			char response3 = sc.next().charAt(0);
			if (response3 == 'y') {
				System.out.println();
				System.out.print("Enter a withdraw value: ");
				double withdrawValue = sc.nextDouble();
				account.withDraw(withdrawValue);
				System.out.println("Update account data");
				System.out.println(account);
				System.out.println();
				System.out.println("Finishing the program");
			} else {
				System.out.println(account);
				System.out.println();
				System.out.println("Finishing the program");
				
			}
			
		} else {
				System.out.println();
				System.out.println("Finishing the program");
		}
		sc.close();
	}
	
}


