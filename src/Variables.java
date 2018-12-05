import java.util.ArrayList;
import java.util.List;

public class Variables extends Topic {
	
	public Variables() {
		super("Variables", createQuestion());
	}

	
	public static List<Question> createQuestion(){
		List<Question> questions = new ArrayList<>();
		
		List<Answer> q1Answers = new ArrayList<>();
		Answer answer1Question1 = new Answer("Integer variableX;", false);
		Answer answer2Question1 = new Answer("INT variableX;", false);
		Answer answer3Question1 = new Answer("int variableX;", true);
		Answer answer4Question1 = new Answer("mat.variableX;", false);
		q1Answers.add(answer1Question1);
		q1Answers.add(answer2Question1);
		q1Answers.add(answer3Question1);
		q1Answers.add(answer4Question1);
		
		Question question1 = new Question("How to declare an Integer variable in JAVA ?", q1Answers);
		questions.add(question1);
		
		
		
		List<Answer> q2Answers = new ArrayList<>();
		Answer answer1question2 = new Answer("varchar", true);
		Answer answer2question2 = new Answer("char", false);
		Answer answer3question2 = new Answer("byte", false);
		Answer answer4question2 = new Answer("short", false);
		q2Answers.add(answer1question2);
		q2Answers.add(answer2question2);
		q2Answers.add(answer3question2);
		q2Answers.add(answer4question2);
		
		
		Question question2 = new Question("Which is NOT a primitive variable in JAVA ??",q2Answers);
		questions.add(question2);
		
		
		List<Answer> q3Answers = new ArrayList<>();
		Answer answer1Question3 = new Answer("16 bytes",false);
		Answer answer2Question3 = new Answer("2 bytes",false);
		Answer answer3Question3 = new Answer("1 bytes",false);
		Answer answer4Question3 = new Answer("4 bytes",true);
		q3Answers.add(answer1Question3);
		q3Answers.add(answer2Question3);
		q3Answers.add(answer3Question3);
		q3Answers.add(answer4Question3);
		
		Question question3 = new Question("How many bytes has an integer variable in JAVA?", q3Answers);
		questions.add(question3);
		
		
		List<Answer> q4Answers = new ArrayList<>();
		Answer answer1Question4 = new Answer("2 bits",false);
		Answer answer2Question4 = new Answer("4 bits",false);
		Answer answer3Question4 = new Answer("16 bits",false);
		Answer answer4Question4 = new Answer("8 bits",true);
		q4Answers.add(answer1Question4);
		q4Answers.add(answer2Question4);
		q4Answers.add(answer3Question4);
		q4Answers.add(answer4Question4);
		
		Question question4 = new Question("How many bits has a byte?", q4Answers);
		questions.add(question4);
		
		List<Answer> q5Answers = new ArrayList<>();
		Answer answer1Question5 = new Answer("False", false);
		Answer answer2Question5 = new Answer("True", true);
		Answer answer3Question5 = new Answer("A and B", false);
		Answer answer4Question5 = new Answer("None of the above", false);
		q5Answers.add(answer1Question5);
		q5Answers.add(answer2Question5);
		q5Answers.add(answer3Question5);
		q5Answers.add(answer4Question5);
		
		Question question5 = new Question("Boolean is a valid data type in JAVA?", q5Answers);
		questions.add(question5);
		
		List<Answer> q6Answers = new ArrayList<>();
		Answer answer1Question6 = new Answer("It is not possible", false);
		Answer answer2Question6 = new Answer("varchar variableChar = 'p';", false);
		Answer answer3Question6 = new Answer("String variableChar = \"p\"", false);
		Answer answer4Question6 = new Answer("char variableChar = 'p';", true);
		q6Answers.add(answer1Question6);
		q6Answers.add(answer2Question6);
		q6Answers.add(answer3Question6);
		q6Answers.add(answer4Question6);
		
		Question question6 = new Question("How to declare a character variable in JAVA?", q6Answers);
		questions.add(question6);
		
		
		List<Answer> q7Answers = new ArrayList<>();
		Answer answer1Question7 = new Answer("string lName = \"Escobar\";", false);
		Answer answer2Question7 = new Answer("String lName = \"Escobar\";", true);
		Answer answer3Question7 = new Answer("String lName = \"Escobar\"", false);
		Answer answer4Question7 = new Answer("char lName = \"Escobar\"", false);
		q7Answers.add(answer1Question7);
		q7Answers.add(answer2Question7);
		q7Answers.add(answer3Question7);
		q7Answers.add(answer4Question7);
		
		Question question7 = new Question("Which of the following String syntax is ok in JAVA?", q7Answers);
		questions.add(question7);
		
		
		List<Answer> q8Answers = new ArrayList<>();
		Answer answer1Question8 = new Answer("long number;", false);
		Answer answer2Question8 = new Answer("short number;", false);
		Answer answer3Question8 = new Answer("double number;", true);
		Answer answer4Question8 = new Answer("float number;", false);
		q8Answers.add(answer1Question8);
		q8Answers.add(answer2Question8);
		q8Answers.add(answer3Question8);
		q8Answers.add(answer4Question8);
		
		Question question8 = new Question("How to declare a FLOAT number of 8 bytes in JAVA?", q8Answers);
		questions.add(question8);
		
		
		List<Answer> q9Answers = new ArrayList<>();
		Answer answer1Question9 = new Answer("$name", false);
		Answer answer2Question9 = new Answer("3name", true);
		Answer answer3Question9 = new Answer("name3", false);
		Answer answer4Question9 = new Answer("NAME$", false);
		q9Answers.add(answer1Question9);
		q9Answers.add(answer2Question9);
		q9Answers.add(answer3Question9);
		q9Answers.add(answer4Question9);
		
		Question question9 = new Question("Which is NOT a valid variable name in Java?", q9Answers);
		questions.add(question9);
		
		List<Answer> q10Answers = new ArrayList<>();
		Answer answer1Question10 = new Answer("Is the way to declare just String variables in Java.", false);
		Answer answer2Question10 = new Answer("Is a Data Base running in Java.", false);
		Answer answer3Question10 = new Answer("Type of data that can be stored in a variable.", true);
		Answer answer4Question10 = new Answer("It doesn't exists in Java.", false);
		q10Answers.add(answer1Question10);
		q10Answers.add(answer2Question10);
		q10Answers.add(answer3Question10);
		q10Answers.add(answer4Question10);
		
		Question question10 = new Question("What's the meaning of DATATYPE in JAVA?", q10Answers);
		questions.add(question10);
		
		return questions;
		
		
	}
}
