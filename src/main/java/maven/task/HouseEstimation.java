package maven.task;

import java.util.Scanner;

public class HouseEstimation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while(flag){
			
			System.out.println("Enter 1 if you want to use standard materials");
			System.out.println("Enter 2 if you want to use above standard materials");
			System.out.println("Enter 3 if you want to use high standard materials");
			System.out.println("Enter 4 if you want to use high standard materials and want a fully automated home");
			int choice = sc.nextInt();
			
			System.out.println("Enter the area in square feet");
			double area = sc.nextDouble();
			System.out.println("Do you want a fully automated home? (y/n)");
			boolean automated;
			char ch = sc.next().charAt(0);
			if(ch == 'Y' || ch == 'y'){
				automated = true;
			}else{
				automated = false;
			}
			
			char c;
			HouseConstruction hse = new HouseConstruction();
		
			switch(choice){
				case 1:
					System.out.println("House Construction cost using standard materials : "+hse.estimatedCost("standard", area, automated));
					break;
				case 2:
					System.out.println("House Construction cost using above standard materials : "+hse.estimatedCost("above standard", area, automated));
					break;
				case 3:
					System.out.println("House Construction cost using high standard materials : "+hse.estimatedCost("high standard", area, automated));
					break;
				case 4:
					System.out.println("House Construction cost using high standard materials for a fully automated home : "+hse.estimatedCost("high standard", area, automated));
					break;
				default:
					System.out.println("Please enter a valid number!");
			}
			System.out.println("Do you want to continue? (Y/N)");
			c = sc.next().charAt(0);
			if(c == 'n' || c == 'N'){
				flag = false;
			}
		}
		System.out.println("Thank You!!");
		sc.close();
	}

}
