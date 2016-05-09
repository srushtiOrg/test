import java.util.Scanner;


public class Account {
	int accId;
	String accName;
	float balance=5000,amount;
	
	/*
	 * 
	 */
	public Account() {
		
	}
	/*
	comment on master
	*/
	
	public Account(int accId, String accName, float balance) {
		super();
		this.accId = accId;
		this.accName = accName;
		this.balance = balance;
	}
	
	public void display()
	{
		System.out.println("Id is :"+accId+"\nName is :"+accName);
	}
	
	public void withdraw()throws InsufficientBal
	{
		System.out.println("Enter amount to be withdraw :");
		Scanner sc=new Scanner(System.in);
		amount=sc.nextInt();
		if(balance<amount)
		{
			throw new InsufficientBal("you dont have sufficient balance!");
		}
		else
		{
			balance=balance-amount;
			System.out.println("Balance :"+balance)
		}
	}
/*
 * Comment on branch2
 */
}
