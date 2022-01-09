import java.util.Scanner;

public class ComputerNumberBooksException3 {

	int money;
	int price;
	int count;
	
	public static void main(String[] args) {
		ComputerNumberBooksException3 divide = new ComputerNumberBooksException3();
		
		try {
			divide.ComputeNumberBooks();
		}
		catch(DivideByZeroException e) {
			System.out.println(e.getMessage());
			System.out.println("Exception: Book's cost must be over 0 won");
		}

	}
	
	public void ComputeNumberBooks() throws DivideByZeroException{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the payment: ");
		money = sc.nextInt();
		
		System.out.print("Enter the cost of the book: ");
		price = sc.nextInt();
		
		if(price == 0) {
			throw new DivideByZeroException("Exception! Book's cost is 0");
		}
		count = money / price;
		System.out.println("Book's count:" + count);
	}

}
