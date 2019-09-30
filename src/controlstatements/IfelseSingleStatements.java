package controlstatements;

public class IfelseSingleStatements {
	
	int x, y;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		IfelseSingleStatements fe = new IfelseSingleStatements();

		a = fe.x = 21;
		b = fe.y = 32;
					
			if(a < 30 || b > 30) {
				
				System.out.println("Yes x : " + a + " is less than 30 " + " and y : " + b + " is greater than 30");
			
			}else {
				System.out.println("you are Wrong values of x & y are " + a + " & " + b);
			}
			
	}

}