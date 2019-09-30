package exceptionhandling;

public class Trycatch {

	public static void main(String args[]) {
		try {

			try {

				System.out.println("going to divide");
				int b = 39 / 0;
			} 
			catch (ArithmeticException e) 
			{
				System.out.println(e);

			}

			try {
				
				int a[] = new int[5];
				a[5] = 4;
				
			} 
			catch (ArrayIndexOutOfBoundsException e) 
			{
				System.out.println(e);
			}

			System.out.println("other statement");
		} 
		catch (Exception e) 
		{
			System.out.println("handeled");
		}

		System.out.println("normal flow..");
	}


static class MultipleCatchBlock1 {
	public static void main(String[] args)
	{
		try{int a[]=new int[5];
		a[5]=30/0;
	 }
	 catch(ArithmeticException e)
	 {
		 System.out.println("Arithmetic Exception occurs");
		 }
	 catch(ArrayIndexOutOfBoundsException e)
	 {
		 System.out.println("ArrayIndexOutOfBounds Exception occurs");
		 }
	 catch(Exception e)
	 {
		 System.out.println("Parent Exception occurs");
		 }
	 System.out.println("rest of the code");
	 }
	}
}
