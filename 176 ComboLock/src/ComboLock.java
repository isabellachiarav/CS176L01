
public class ComboLock {

	//keep track if you got first # right before moving onto the next one
	
	int correct1 = 0, correct2 = 0, correct3 = 0, current1 = 0, current2 = 0, current3 = 0, count = 0;

	public ComboLock(int secret1, int secret2, int secret3) {
		correct1 = secret1;
		correct2 = secret2;
		correct3 = secret3;
	}

	public void reset() {
		current1 = 0;
		current2 = 0;
		current3 = 0;
	}

	public void turnRight(int ticks) {
		count++;
		if (count == 1) {
			current1 = (40 - ticks) % 40;
		}
		if (count == 3) {
			current3 = (current2 - ticks + 40) % 40;
		}
	}

	public void turnLeft(int ticks) {
		count++;
		current2 = (current1 + ticks) % 40;
	}

	public boolean open() {
		System.out.println(current1 + " " + current2 + " " + current3);
		if (current1 == correct1 && current2 == correct2 && current3 == correct3) {
			return true;
		}
		else {
			return false;
		}
	}

}
