import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A=0;
		int B=0;
		
		int num1,num2;
		
		Scanner UserInput = new Scanner (System.in);
        System.out.print("add the first number: ");
        
		while(!UserInput.hasNextInt()) {
            UserInput.next();

            System.out.println("add the first number: ");
            System.err.println("You Entered INVALID input");

		}
		num1=UserInput.nextInt();
		A=num1;
		
		System.out.print("add the second number: ");
			while(!UserInput.hasNextInt()) {
	            UserInput.next();

	            System.out.println("add the second number: ");
	            System.err.println("You Entered INVALID input");

			}
			num2=UserInput.nextInt();
			B=num2;
		
		A=A+B;
		B=A-B;
		A=A-B;
		
		System.out.println("The reverseNum where the first number was: "+num1);
		System.out.println("The reverseNum where the second number was: "+num2);
		System.out.println("the result for the first number now is= "+A);
		System.out.println("the result for the second number now is= "+B);

		System.out.println("THANK YOU");

        UserInput.close();
	}

}
