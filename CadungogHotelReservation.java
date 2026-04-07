import java.util.Scanner;
public class CadungogHotelReservation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int choice;
		int [][] hotel = {
				{0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0},
				{0, 0, 0, 1, 0},
				{0, 1, 0, 0, 1},
		};
		
		
		System.out.println("=== HOTEL RESERVATION ===");
		
		do {
			
		System.out.println("1. View Room");
		System.out.println("2. Check In");
		System.out.println("3. Check Out");
		System.out.println("4. Exit");
		
		
		System.out.print("Enter a number: ");
		choice = scan.nextInt();
		
		switch (choice) {
			case 1:
				for (int i = 6; i >= 0; i--) {
                    System.out.print("Floor " + (i + 1) + ": ");
                    for (int j = 0; j < hotel[i].length; j++) {
                        System.out.print("[" + hotel[i][j] + "]");
                    }
                    System.out.println();
				}
			break;
			
			case 2:
                System.out.print("Enter floor: ");
                int floor = scan.nextInt();

                System.out.print("Enter room: ");
                int room = scan.nextInt();

                floor = floor - 1;
                room = room - 1;

                if (floor >= 0 && floor < 7 && room >= 0 && room < 5) {

                    if (hotel[floor][room] == 1) {
                        System.out.println("This room is already occupied.");
                    } else {
                        hotel[floor][room] = 1;
                        System.out.println("Check In Successful!");
                    }

                } else {
                    System.out.println("Invalid input.");
                }
                break;

            case 3:
                System.out.print("Enter floor: ");
                floor = scan.nextInt();

                System.out.print("Enter room: ");
                room = scan.nextInt();
                
                floor = floor - 1;
                room = room - 1;

                if (floor >= 0 && floor < 7 && room >= 0 && room < 5) {

                    if (hotel[floor][room] == 0) {
                        System.out.println("Room already empty.");
                    } else {
                        hotel[floor][room] = 0;
                        System.out.println("Check Out Successful!");
                    }

                } else {
                    System.out.println("Invalid input.");
                }
                break;
			
			}
		}while (choice !=4);
	}
}