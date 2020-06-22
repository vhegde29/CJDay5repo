package Module7;

public class Exception_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length==0)
		{
			System.out.println("No input Recieved");
		}
		
		
		try
		{
			int res=(Integer.parseInt(args[0]))/(Integer.parseInt(args[1]));
			System.out.println(res);
		}		
		catch(NumberFormatException n)
		{
			System.out.println("only integers are allowed");
		}
		catch(ArithmeticException a)
		{
		System.out.println("division with zero is not possible");	
		}
		
	}

}
