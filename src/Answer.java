

public class Answer {
	String name;
	boolean isCorrect;
	public Answer(String name, boolean isCorrect) {
		this.name = name;
		this.isCorrect = isCorrect;
	}
	
	public String getName() {//1
		return name;
	}
	
	public boolean getIsCorrect() {//1
		return isCorrect;
	}

}
