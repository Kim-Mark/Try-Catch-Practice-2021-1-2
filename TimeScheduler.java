import java.util.Scanner;

public class TimeScheduler {

	public static void main(String[] args) {
		
		
		String appointments[]; 
		int appointmentsMade; 
		int number;
		String name; 
		boolean made; 
		
		
		System.out.println("Make a reservation");
		System.out.println("Available Time: P.M 1 2 3 4 5 6 \n");
		
		Scanner sc = new Scanner(System.in);
		
		
		appointments = new String[6]; /////////////
		
		
		appointmentsMade = 0;
		
		while(appointmentsMade < 6) {
			System.out.print("Enter the number: ");
			number = sc.nextInt();
			
			System.out.print("Enter the name: ");
			name = sc.next();
			
			made = false;
			
			
			while(!made) {
				try {
					
					System.out.print("Enter the time you want(1, 2, 3, 4, 5, 6): ");
					int time = sc.nextInt();
					
					if(time < 1 || time > 6) {
						throw new InvalidTimeException("Out of range");
					}
					
					else if(appointments[time - 1] != null) {
						throw new TimeInUseException("Already reserved");
					}
					else {
						
						appointments[time - 1] = "" + name + "\t" + number;
						
						made = true;
						
						appointmentsMade += 1;
					}
				}
				catch (InvalidTimeException e) {
					System.out.println("Exception: " + e.getMessage());
				}
				catch (TimeInUseException k) {
					System.out.println("Exception: " + k.getMessage());
				}
				catch (Exception e){
					System.out.println("Exception: " + e.getMessage());
				}
			}
			
		}
		
		
		System.out.println("\n List of the appointment\n");
		System.out.println("Time\tNumber\tName");
		for(int i = 0; i < 6; i++) {
			System.out.println((i + 1) +"\t" + appointments[i]);
		}
	}

}
