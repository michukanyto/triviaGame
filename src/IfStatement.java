import java.util.List;
import java.util.ArrayList;


public class IfStatement extends Topic {
	public IfStatement() {
		super("If Statement", createQuestion());
	}
	
	public static List<Question> createQuestion(){
		List<Question> questions = new ArrayList<>();
		
		List<Answer> q1Answers = new ArrayList<>();
		Answer answer1Question1 = new Answer("Yes, except with subClasses.",false);
		Answer answer2Question1 = new Answer("Yes, but only comparing variables.",false);
		Answer answer3Question1 = new Answer("Yes, but only with BOOLEAN variables.",false);
		Answer answer4Question1 = new Answer("Yes, It's possible.",true);
		q1Answers.add(answer1Question1);
		q1Answers.add(answer2Question1);
		q1Answers.add(answer3Question1);
		q1Answers.add(answer4Question1);
		
		Question question1 = new Question("Is possible working with IF STATEMENT in JAVA?", q1Answers);
		questions.add(question1);
		
		
		
		List<Answer> q2Answers = new ArrayList<>();
		Answer answer1question2 = new Answer("name.getText().tostring('Escobar')", false);
		Answer answer2question2 = new Answer("if (\"Escobar\".equals.name)", false);
		Answer answer3question2 = new Answer("if (name.equals(\"ESCOBAR\")", true);
		Answer answer4question2 = new Answer("if (name = \"ESCOBAR\")", false);
		q2Answers.add(answer1question2);
		q2Answers.add(answer2question2);
		q2Answers.add(answer3question2);
		q2Answers.add(answer4question2);
		
		
		Question question2 = new Question("How to compare a String name variable in JAVA?",q2Answers);
		questions.add(question2);
		
		
		List<Answer> q3Answers = new ArrayList<>();
		Answer answer1Question3 = new Answer("Condition.",true);
		Answer answer2Question3 = new Answer("Loop.",false);
		Answer answer3Question3 = new Answer(" Java Method.",false);
		Answer answer4Question3 = new Answer("Data Type.",false);
		q3Answers.add(answer1Question3);
		q3Answers.add(answer2Question3);
		q3Answers.add(answer3Question3);
		q3Answers.add(answer4Question3);
		
		Question question3 = new Question("If Statement is a : ?", q3Answers);
		questions.add(question3);
		
		
		List<Answer> q4Answers = new ArrayList<>();
		Answer answer1Question4 = new Answer("Native class inside JAVA.",false);
		Answer answer2Question4 = new Answer("If condition after a WHILE Loop.",false);
		Answer answer3Question4 = new Answer("If condition inside a Loop.",false);
		Answer answer4Question4 = new Answer("If condition inside other If condition.",true);
		q4Answers.add(answer1Question4);
		q4Answers.add(answer2Question4);
		q4Answers.add(answer3Question4);
		q4Answers.add(answer4Question4);
		
		Question question4 = new Question("NESTED IF is a : ?", q4Answers);
		questions.add(question4);
		
		List<Answer> q5Answers = new ArrayList<>();
		Answer answer1Question5 = new Answer("Print '0'.", false);
		Answer answer2Question5 = new Answer("Print 'false.'", false);
		Answer answer3Question5 = new Answer("Print '7.'", false);
		Answer answer4Question5 = new Answer("Does not print anything.", true);
		q5Answers.add(answer1Question5);
		q5Answers.add(answer2Question5);
		q5Answers.add(answer3Question5);
		q5Answers.add(answer4Question5);
		
		Question question5 = new Question("What happens ? num=7 and condition=true, if(!condition){System.out.print(num);}", q5Answers) ;
		questions.add(question5);
		
		List<Answer> q6Answers = new ArrayList<>();
		Answer answer1Question6 = new Answer("Print '0'.", false);
		Answer answer2Question6 = new Answer("Print 'true'.", false);
		Answer answer3Question6 = new Answer("Print 'true 7'.", false);
		Answer answer4Question6 = new Answer("Compiler Error.", true);
		q6Answers.add(answer1Question6);
		q6Answers.add(answer2Question6);
		q6Answers.add(answer3Question6);
		q6Answers.add(answer4Question6);
		
		Question question6 = new Question("What happens ? num=7 and condition=true, if(!condition==num){System.out.print(num);}", q6Answers);
		questions.add(question6);
		
		
		List<Answer> q7Answers = new ArrayList<>();
		Answer answer1Question7 = new Answer("Comtemplate a second option.", false);
		Answer answer2Question7 = new Answer("Evaluate a second time.", false);
		Answer answer3Question7 = new Answer("Evaluate a second variable.", false);
		Answer answer4Question7 = new Answer("Take a second path.", true);
		q7Answers.add(answer1Question7);
		q7Answers.add(answer2Question7);
		q7Answers.add(answer3Question7);
		q7Answers.add(answer4Question7);
		
		Question question7 = new Question("Which the main propouse of ELSE inside IF statement in JAVA?", q7Answers);
		questions.add(question7);
		
		
		List<Answer> q8Answers = new ArrayList<>();
		Answer answer1Question8 = new Answer("ELSE IF could replace a loop.", false);
		Answer answer2Question8 = new Answer("ELSE evaluates nothing and ELSE IF evaluates same condition.", false);
		Answer answer3Question8 = new Answer("ELSE evaluates nothing and ELSE IF evaluates a different condition.", true);
		Answer answer4Question8 = new Answer("ELSE IF evaluates nothing and ELSE evaluates a different condition.", false);
		q8Answers.add(answer1Question8);
		q8Answers.add(answer2Question8);
		q8Answers.add(answer3Question8);
		q8Answers.add(answer4Question8);
		
		Question question8 = new Question("Which is the difference between ELSE and ELSE IF?", q8Answers);
		questions.add(question8);
		
		
		List<Answer> q9Answers = new ArrayList<>();
		Answer answer1Question9 = new Answer("Boolean datatype.", false);
		Answer answer2Question9 = new Answer("Integer datatype.", false);
		Answer answer3Question9 = new Answer("String datatype.", false);
		Answer answer4Question9 = new Answer("All of the above.", true);
		q9Answers.add(answer1Question9);
		q9Answers.add(answer2Question9);
		q9Answers.add(answer3Question9);
		q9Answers.add(answer4Question9);
		
		Question question9 = new Question("IF STATEMENT  does work with : ?", q9Answers);
		questions.add(question9);
		
		List<Answer> q10Answers = new ArrayList<>();
		Answer answer1Question10 = new Answer("Print nothing.", false);
		Answer answer2Question10 = new Answer("Print 'true'.", true);
		Answer answer3Question10 = new Answer("Print 'condition'.", false);
		Answer answer4Question10 = new Answer("Print '0'.", false);
		q10Answers.add(answer1Question10);
		q10Answers.add(answer2Question10);
		q10Answers.add(answer3Question10);
		q10Answers.add(answer4Question10);
		
		Question question10 = new Question("What happens ?condition=true, if(condition)System.out.print(condition);", q10Answers);
		questions.add(question10);
		
		return questions;
		
		
	}

}
