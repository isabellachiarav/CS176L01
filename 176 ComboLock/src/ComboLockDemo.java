import java.util.Arrays;
import java.util.Scanner;

public class ComboLockDemo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int ticks = 0, count = 0;
		
		ComboLock combo1 = new ComboLock(15, 39, 1);
		
		combo1.reset();
		
		while ((ticks > 39 && ticks < 0) || count < 3) {
			if (count % 2 == 0) {
				System.out.print("Enter number of ticks to turn to the right 0 - 39 "
						+ "(enter an invalid number to quit): ");
				ticks = scan.nextInt();
				combo1.turnRight(ticks);
			}
			else {
				System.out.print("Enter number of ticks to turn to the left 0 - 39 "
						+ "(enter an invalid number to quit): ");
				ticks = scan.nextInt();
				combo1.turnLeft(ticks);
			}
			count++;
		}
		
		if(combo1.open() == true) {
			System.out.println("You opened the lock!");
		}
		else {
			System.out.println("You did not open the lock!");
		}
		
		combo1.reset();

	}

}
