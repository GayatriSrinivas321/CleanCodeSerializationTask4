package maven.task;

import java.util.Scanner;

public class Display {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while(flag){
			System.out.println("Enter principle amount");
			double principle = sc.nextDouble();
			System.out.println("Enter rate of interest");
			double rateOfInterest = sc.nextDouble();
			System.out.println("Enter time period");
			float time = sc.nextFloat();
			System.out.println("1 :  Simple Interest");
			System.out.println("2 :  Compound Interest");
			char c;
			int choice = sc.nextInt();
			CalculateInterest ci = new CalculateInterest();
			switch(choice){
				case 1:
					System.out.println("Simple Interest : "+ci.SimpleInterest(principle, time, rateOfInterest));
					break;
				case 2:
					System.out.println("Compound Interest : "+ci.CompundInterest(principle, time, rateOfInterest));
					break;
				default:
					System.out.println("Enter a valid number!");
			}
			System.out.println("Do you want to continue? (Y/N)");
			c = sc.next().charAt(0);
			if(c == 'n' || c == 'N'){
				flag = false;
				System.out.println("Thank You!!");
			}
		}
		sc.close();
	}
}