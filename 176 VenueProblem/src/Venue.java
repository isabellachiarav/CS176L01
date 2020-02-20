import java.util.ArrayList;

public class Venue {
	
	private boolean[][][] allSeats;
	
	public Venue(int section, int row, int seat) {
		boolean[][][] seatInitialize = new boolean[section][row][seat];
		for (int i = 0; i < section; i++) {
			for (int j = 0; j < row; j++) {
				for (int k = 0; k < seat; k++) {
					seatInitialize[i][j][k] = false;
				}
			}
		}
		allSeats = seatInitialize;
	}
	
	public boolean seatLookup(int sectionSearch, int rowSearch, int seatSearch) {
		if (allSeats[sectionSearch][rowSearch][seatSearch] == true) {
			System.out.println("Seat " + (sectionSearch + 1) + "-" + (rowSearch + 1) + "-" + (seatSearch + 1) + " taken.");
			return true;
		}
		else {
			System.out.println("Seat " + (sectionSearch + 1) + "-" + (rowSearch + 1) + "-" + (seatSearch + 1) + " available.");
			allSeats[sectionSearch][rowSearch][seatSearch] = true;
			return false;
		}
	}
	
}
