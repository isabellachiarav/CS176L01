public class Quiz implements Measurable {
	
	private String name;
	private double score;
	
	public Quiz(String name, double score) {
		this.name = name;
		this.score = score;
	}
	
	public double getMeasure() {
		return score;
	}

}
