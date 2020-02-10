package design_principles_epam;

import java.util.*;

public class calculator {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static List<Integer> getInput(){
		int num1,num2;
		//input
		System.out.println("Enter First no");
		num1 = sc.nextInt();
		System.out.println("Enter second no");;
		num2 = sc.nextInt();
		List<Integer> num = new ArrayList<Integer>();
		num.add(num1);
		num.add(num2);
		return num;
	}
	
	public static void main(String[] args) throws Exception{
		int choice = 0;
		List<Integer> ls = null;
		do {
			System.out.print("Choose your option\n");
			System.out.print("1.\tAdd\n");
			System.out.print("2.\tSubtract\n");
			System.out.print("3.\tMultiply\n");
			System.out.print("4.\tDivide\n");
			System.out.print("5.\tExit\n");
			choice = sc.nextInt();
			//object creation
			Math op = new Math();
			
			switch(choice) {
			case 1:
				ls = getInput();
				
				System.out.println("Answer =" +op.add(ls.get(0),ls.get(1)));
				break;
			case 2:
				ls = getInput();
				System.out.println("Answer =" +op.sub(ls.get(0),ls.get(1)));
				break;
			case 3:
				ls = getInput();
				System.out.println("Answer =" +op.mul(ls.get(0),ls.get(1)));
				break;
			case 4:
				ls = getInput();
				System.out.println("Answer =" +op.div(ls.get(0),ls.get(1)));
				break;
			case 5:
				System.out.println("Thank you!");
				break;
			default:
				System.out.println("Invalid Input");
				break;
			}
		}while(choice != 5);
	}
}
