package tranTrungTien.bai07;

public class Student extends Person {
	private double score1;
	private double score2;

	public Student() {
		super();
		this.score1 = 0;
		this.score2 = 0;
	}

	public Student(String name, String address, double score1, double score2) {
		super(name, address);
		setScore1(score1);
		setScore2(score2);
	}

	public double getScore1() {
		return score1;
	}

	public void setScore1(double score1) {
		if (score1 < 0)
			this.score1 = 0;
		else
			this.score1 = score1;
	}

	public double getScore2() {
		return score2;
	}

	public void setScore2(double score2) {
		if (score2 < 0)
			this.score2 = 0;
		else
			this.score2 = score2;
	}

	public double avgScore() {
		return (score1 + score2) / 2;
	}

	public String danhGia() {
		if (avgScore() >= 8)
			return "Gioi";
		else if (avgScore() >= 5)
			return "Kha";
		else if (avgScore() >= 2)
			return "Trung binh";
		else
			return "Yeu";
	}

	@Override
	public String toString() {
		String s = "";
		s += String.format("|%15s|%20s|%20s|%20s|%20s|", "Name", "Address", "Score 1", "Score 2", "Avg Score") + "\n"
				+ super.toString() + String.format("%-20s|%-20s|%-20s|", score1, score2, avgScore())
				+ "\n-----------------------------------------------------------------------------------------------------\n";
		return s;
	}

}
