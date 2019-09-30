package polymorphism;

public class Methodoverloading {
	
	public static class GetAverage {
		
		@SuppressWarnings("unused")
		private static void gatherInput(int dataOne, int dataTwo) {
			System.out.println(dataOne + dataTwo);
		};


		
		// Method Overloading is allowed within the class given that 
		// the number of parameters of the overloaded methods are not the same.
	
		@SuppressWarnings("unused")
		private static void gatherInput(int dataThree, int dataFour, int dataFive) {
			System.out.println(dataThree + dataFour + dataFive);
		};
		
		//Method Overloading is allowed within the class given that at least one pair of parameters, 
		//from each overloaded method, are of different data type.
		
		@SuppressWarnings("unused")
		private static int gatherInput(int dataOne, double dataTwo) {
			
			return dataOne;
		
		};
		
		//Method Overloading is allowed within the class given that the order of the data type variables are not 
		//the same for overloaded methods.
		
		@SuppressWarnings("unused")
		private static void gatherInput(double dataOne, int dataTwo) {
		};
		
		
	}
	
	public static void main(String[] args) {
		int a = 5;
		int b = 6;
		
		GetAverage.gatherInput(a, b);
		System.out.println("this is Method overloading");
	}
	

}
