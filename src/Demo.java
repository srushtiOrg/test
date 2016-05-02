
public class Demo {
	/*
	fetch commit for branch2 only
	*/

	public static void main(String[] args)throws InsufficientBal {
		
		Account a=new Account(1,"sdf",5000);
		
		
		try
		{
			a.display();
			a.withdraw()
			
		}
		catch(InsufficientBal s)
		//catch(Exception s)
		{
			//s.printStackTrace(); //auto
		}

	}

}
