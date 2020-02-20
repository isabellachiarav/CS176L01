import java.util.Random;

public class VenueTester {

	public static void main(String[] args) {
		
		Random generator = new Random(); 
		
		Venue prudentialCenter = new Venue(4, 5, 10);
		
		for (int i = 0; i < 100; i++) {
			System.out.print(i + 1 + ": ");
			prudentialCenter.seatLookup(generator.nextInt(4), generator.nextInt(5), generator.nextInt(10));
		}

	}

}
