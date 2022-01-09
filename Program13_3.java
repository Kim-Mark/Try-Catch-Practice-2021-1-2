import java.util.Scanner;

public class Program13_3 {

	public static void main(String[] args) {
		
		int money;
		int price;
		int count;
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Enter the payment: ");
			money = sc.nextInt();
			
			System.out.println("Enter the cost of book: ");
			price = sc.nextInt();
			
			if(price == 0) {
				throw new Exception("Exception: Book cost: 0"); // throw - e.getMessage();
			}
				count = money / price;
				System.out.println("Count of book: " + count);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Exception: Cost of the book must be up than 0");
		}
			
			

	}

}
