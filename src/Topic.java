import java.util.List;



public class Topic {
	private String name;
	private List<Question> questions;
	
	public Topic(String name, List<Question> questions) {
		this.name = name;
		this.questions = questions;
	}
	
	public String getName() {
		return name;
	}
	
	public List<Question> getQuestions() {
		return questions;
	}
}