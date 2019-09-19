
public class Student {
	private String name;
	private int nuid;
	private double[] scores;
	private double totalScore;
	private double avgScore;
	
	public Student(String name, int nuid, double[] scores) {
		super();
		this.name = name;
		this.nuid = nuid;
		this.scores = scores;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNuid() {
		return nuid;
	}

	public void setNuid(int nuid) {
		this.nuid = nuid;
	}

	public double[] getScores() {
		return scores;
	}

	public void setScores(double[] scores) {
		this.scores = scores;
	}

	public double getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(double totalScore) {
		this.totalScore = totalScore;
	}

	public double getAvgScore() {
		return avgScore;
	}

	public void setAvgScore(double avgScore) {
		this.avgScore = avgScore;
	}
	
	
	
}
