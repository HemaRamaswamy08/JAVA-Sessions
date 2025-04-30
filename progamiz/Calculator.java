package progamiz;
import java.util.*;
public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choice;
		
		do {
			System.out.println("Enter a first number :");
			float num1 = sc.nextFloat();
			System.out.println("Enter a second number :");
			float num2 = sc.nextFloat();
			float result = 0;
			System.out.println("select operator to perfome arithmetic operations");
			System.out.println("+ for add, - for sub, * for multy and / for divisions");
			String operator = sc.next();
			switch (operator) {
			case "+" :{
				result = num1+num2;
				break;
			}
			case "-" :{
				result = num1-num2;
				break;
			}
			case "*" :{
				result = num1*num2;
				break;
			}
			case "/" :{
				result = num1/num2;
				break;
			}
			default :
				System.out.println("enter correct operator");
			}
			System.out.println("result is :"+result);
			System.out.println("ENTER Y TO CONTINUE X TO STOP");
			choice = sc.next();
		}while(choice.equals("y"));
		System.out.println("MISSION COMPLETED");
		sc.close();
	}
}
