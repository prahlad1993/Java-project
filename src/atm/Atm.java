package atm;

import java.util.Scanner;

class atmservice {
	void display() {
		System.out.println("Welcome to SBI ATM ");
		System.out.println("    ");
		System.out.println("Insert Your ATM Card");
	}
	void user() {
		Scanner sc=new Scanner(System.in);
		System.out.println("    ");
		System.out.print("Enter your pin:");
		int n=12345;
		int pin=sc.nextInt();
		if(pin==n) {
			System.out.println("    ");
			System.out.println("Choice your option:");
			
			System.out.println("1.Saving A/c      2.Banking "  );
			int option= sc.nextInt();
			switch(option){
			case 1:
				System.out.println("Saving Account details:");
				//System.out.println("     ");
				System.out.println("Enter your Required:");
				
				System.out.println("1. Balance Enquary   2. Mini statement   3. Withdraw");
				 int req=sc.nextInt();
				
				switch(req) 
				{
				case 1:
				System.out.println("Balance is yours: 25000");
				
				
				break;
				
			case 2:
				System.out.println("Ministatement printed now");
				break;
			case 3:
				System.out.println(" Enter your Amount :");
				int Amount=sc.nextInt();
				int currentamount=25000;
				 
				
				if(Amount<=currentamount) {
					System.out.println("Collect your cash");
					
				 }
				else {
					System.out.println("Insufficient amount");
				}
				break;
			}
			break;
			case 2:
				System.out.println("Enter your choice: ");
				
				System.out.println("1.Change/Add Mobile Number  2.Add Adhar  3.Email id  4.Withdraw Money By Adhar");
				int choice=sc.nextInt();
				switch(choice) {
				case 1:
					System.out.println("Enter your Mobile Number:");
					int Number=sc.nextInt();
					System.out.println("  ");
					System.out.println("Enter your OTP:");
					System.out.println("  ");
					int OTP=sc.nextInt();
				
					break;
				case 2:
					System.out.print("Enter Your Adhar Number:");
					int Adhar=sc.nextInt();
					System.out.println("Sent OTP on your link mobile number  "); 
					// How to link mobile number server ???
					
					
					System.out.println("Type OTP: ");
					System.out.println("  ");
					break;
				case 3:
					System.out.println("Enter Email id:");
					String Email=sc.next();
					break;
					
				case 4:
					System.out.println("Enter your Adhar1:");
			          double Adharnum=320325222;
			          int Adhar1=sc.nextInt();
			  if(Adhar1==Adharnum) {			  
				  
				  System.out.print("Enter OTP2:"); //Sent OTP in User mobile
				  int OTP2=sc.nextInt();
			      int OTP1=4567;
			  if (OTP2==OTP1) {
				System.out.println("Enter Required Amount:");
				int Amount=sc.nextInt();
				int currentamount=25000;
				 
				
				if(Amount<=currentamount) {
					System.out.println("Collect your cash");
					
				 }
				else {
					System.out.println("Insufficient amount");
				}
			  }
			  else {
				  System.out.println("Invaild OTP");
			  }
				}
			  
		}
			}
			}
			else 
		{
			System.out.println("Invaild pin Try Again");
		}
	}
}


public class Atm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		atmservice atms=new atmservice();
		atms.display();
		atms.user();

	}

}
