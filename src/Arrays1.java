import java.util.List;
import java.util.ArrayList;


public class Arrays1 extends Topic{
	public Arrays1() {
		super("Arrays",createQuestion());
	}
	
	public static List<Question> createQuestion(){
		List<Question> questions = new ArrayList<>();
		
		List<Answer> q1Answers = new ArrayList<>();
		Answer answer1Question1 = new Answer("a",false);
		Answer answer2Question1 = new Answer("b",false);
		Answer answer3Question1 = new Answer("b",true);
		Answer answer4Question1 = new Answer("b",false);
		q1Answers.add(answer1Question1);
		q1Answers.add(answer2Question1);
		q1Answers.add(answer3Question1);
		q1Answers.add(answer4Question1);
		
		Question question1 = new Question("questionq1?", q1Answers);
		questions.add(question1);
		
		
		
		List<Answer> q2Answers = new ArrayList<>();
		Answer answer1question2 = new Answer("a", true);
		Answer answer2question2 = new Answer("b", false);
		Answer answer3question2 = new Answer("c", false);
		Answer answer4question2 = new Answer("d", false);
		q2Answers.add(answer1question2);
		q2Answers.add(answer2question2);
		q2Answers.add(answer3question2);
		q2Answers.add(answer4question2);
		
		
		Question question2 = new Question("Question2?",q2Answers);
		questions.add(question2);
		
		
		List<Answer> q3Answers = new ArrayList<>();
		Answer answer1Question3 = new Answer("a",true);
		Answer answer2Question3 = new Answer("b",false);
		Answer answer3Question3 = new Answer("c",false);
		Answer answer4Question3 = new Answer("d",false);
		q3Answers.add(answer1Question3);
		q3Answers.add(answer2Question3);
		q3Answers.add(answer3Question3);
		q3Answers.add(answer4Question3);
		
		Question question3 = new Question("Question3?", q3Answers);
		questions.add(question3);
		
		
		List<Answer> q4Answers = new ArrayList<>();
		Answer answer1Question4 = new Answer("a",false);
		Answer answer2Question4 = new Answer("b",false);
		Answer answer3Question4 = new Answer("c",false);
		Answer answer4Question4 = new Answer("a",true);
		q4Answers.add(answer1Question4);
		q4Answers.add(answer2Question4);
		q4Answers.add(answer3Question4);
		q4Answers.add(answer4Question4);
		
		Question question4 = new Question("Question4?", q4Answers);
		questions.add(question4);
		
		List<Answer> q5Answers = new ArrayList<>();
		Answer answer1Question5 = new Answer("a", false);
		Answer answer2Question5 = new Answer("b", true);
		Answer answer3Question5 = new Answer("c", false);
		Answer answer4Question5 = new Answer("d", false);
		q5Answers.add(answer1Question5);
		q5Answers.add(answer2Question5);
		q5Answers.add(answer3Question5);
		q5Answers.add(answer4Question5);
		
		Question question5 = new Question("Question5?", q5Answers);
		questions.add(question5);
		
		List<Answer> q6Answers = new ArrayList<>();
		Answer answer1Question6 = new Answer("a", false);
		Answer answer2Question6 = new Answer("a", false);
		Answer answer3Question6 = new Answer("a", false);
		Answer answer4Question6 = new Answer("a", true);
		q6Answers.add(answer1Question6);
		q6Answers.add(answer2Question6);
		q6Answers.add(answer3Question6);
		q6Answers.add(answer4Question6);
		
		Question question6 = new Question("Question6?", q6Answers);
		questions.add(question6);
		
		
		List<Answer> q7Answers = new ArrayList<>();
		Answer answer1Question7 = new Answer("a", true);
		Answer answer2Question7 = new Answer("a", false);
		Answer answer3Question7 = new Answer("a", false);
		Answer answer4Question7 = new Answer("a", false);
		q7Answers.add(answer1Question7);
		q7Answers.add(answer2Question7);
		q7Answers.add(answer3Question7);
		q7Answers.add(answer4Question7);
		
		Question question7 = new Question("Question7?", q7Answers);
		questions.add(question7);
		
		
		List<Answer> q8Answers = new ArrayList<>();
		Answer answer1Question8 = new Answer("a", false);
		Answer answer2Question8 = new Answer("a", false);
		Answer answer3Question8 = new Answer("a", true);
		Answer answer4Question8 = new Answer("a", false);
		q8Answers.add(answer1Question8);
		q8Answers.add(answer2Question8);
		q8Answers.add(answer3Question8);
		q8Answers.add(answer4Question8);
		
		Question question8 = new Question("Question8?", q8Answers);
		questions.add(question8);
		
		
		List<Answer> q9Answers = new ArrayList<>();
		Answer answer1Question9 = new Answer("a", false);
		Answer answer2Question9 = new Answer("a", true);
		Answer answer3Question9 = new Answer("a", false);
		Answer answer4Question9 = new Answer("a", false);
		q9Answers.add(answer1Question9);
		q9Answers.add(answer2Question9);
		q9Answers.add(answer3Question9);
		q9Answers.add(answer4Question9);
		
		Question question9 = new Question("Question9?", q9Answers);
		questions.add(question9);
		
		List<Answer> q10Answers = new ArrayList<>();
		Answer answer1Question10 = new Answer("a", true);
		Answer answer2Question10 = new Answer("a", false);
		Answer answer3Question10 = new Answer("a", false);
		Answer answer4Question10 = new Answer("a", false);
		q10Answers.add(answer1Question10);
		q10Answers.add(answer2Question10);
		q10Answers.add(answer3Question10);
		q10Answers.add(answer4Question10);
		
		Question question10 = new Question("Question10?", q10Answers);
		questions.add(question10);
		
		return questions;
		
		
	}
}
