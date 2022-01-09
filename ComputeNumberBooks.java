import java.util.Scanner;

public class ComputeNumberBooks {

	public static void main(String[] args) {
		
		int money;
		int price;
		int count;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the payment: ");
		money = sc.nextInt();
		
		System.out.print("Enter the cost of the book: ");
		price = sc.nextInt();

		count = money / price;
		System.out.println("(Max) Book count: " + count);
	}

}
