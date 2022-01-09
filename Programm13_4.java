import java.util.Scanner;

public class Programm13_4 {

	public static void main(String[] args) {
		
		int money;
		int price;
		int count;
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Enter the payment: ");
			money = sc.nextInt();
			
			System.out.print("Enter the cost of book: ");
			price = sc.nextInt();
			
			if(price == 0) {
				throw new DivideByZeroException("Exception: Cost of the book: 0");
			}
			count = money / price;
			System.out.println("(Max) Book count: " + count);
		}
		catch(DivideByZeroException e) {
			System.out.println(e.getMessage());
			System.out.println("Exception: Cost of the book must be up than 0");
		}

	}

}
