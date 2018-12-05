import java.util.ArrayList;
import java.util.List;


public class Classes extends Topic {
	public Classes() {
		super("Classes", createQuestion());
	}
	
	

	public static List<Question> createQuestion(){
		List<Question> questions = new ArrayList<>();
		
		List<Answer> q1Answers = new ArrayList<>();
		Answer answer1Question1 = new Answer("Yes, but It's necessary to import the respositories.",false);
		Answer answer2Question1 = new Answer("Yes, From version 8.0. ",false);
		Answer answer3Question1 = new Answer("Yes.",true);
		Answer answer4Question1 = new Answer("Not.",false);
		q1Answers.add(answer1Question1);
		q1Answers.add(answer2Question1);
		q1Answers.add(answer3Question1);
		q1Answers.add(answer4Question1);
		
		Question question1 = new Question("Java is an Object Oriented Program Lenguage?", q1Answers);
		questions.add(question1);
		
		
		
		List<Answer> q2Answers = new ArrayList<>();
		Answer answer1question2 = new Answer("A repository.", false);
		Answer answer2question2 = new Answer("An Object.", false);
		Answer answer3question2 = new Answer("A Blue Print", true);
		Answer answer4question2 = new Answer("A method.", false);
		q2Answers.add(answer1question2);
		q2Answers.add(answer2question2);
		q2Answers.add(answer3question2);
		q2Answers.add(answer4question2);
		
		
		Question question2 = new Question("What's a Class?",q2Answers);
		questions.add(question2);
		
		
		List<Answer> q3Answers = new ArrayList<>();
		Answer answer1Question3 = new Answer("A tool.",false);
		Answer answer2Question3 = new Answer("A constructor.",false);
		Answer answer3Question3 = new Answer("A house.",true);
		Answer answer4Question3 = new Answer("A brick.",false);
		q3Answers.add(answer1Question3);
		q3Answers.add(answer2Question3);
		q3Answers.add(answer3Question3);
		q3Answers.add(answer4Question3);
		
		Question question3 = new Question("If a Class is a Blue Print so what's an object?", q3Answers);
		questions.add(question3);
		
		
		List<Answer> q4Answers = new ArrayList<>();
		Answer answer1Question4 = new Answer("{}",true);
		Answer answer2Question4 = new Answer("[]",false);
		Answer answer3Question4 = new Answer("\"\"",false);
		Answer answer4Question4 = new Answer("::",false);
		q4Answers.add(answer1Question4);
		q4Answers.add(answer2Question4);
		q4Answers.add(answer3Question4);
		q4Answers.add(answer4Question4);
		
		Question question4 = new Question("The class body is surrounded by?", q4Answers);
		questions.add(question4);
		
		List<Answer> q5Answers = new ArrayList<>();
		Answer answer1Question5 = new Answer("SubClasses and Objects.", false);
		Answer answer2Question5 = new Answer("Attributes and methods.", true);
		Answer answer3Question5 = new Answer("Attributes and variables.", false);
		Answer answer4Question5 = new Answer("Methods and functions.", false);
		q5Answers.add(answer1Question5);
		q5Answers.add(answer2Question5);
		q5Answers.add(answer3Question5);
		q5Answers.add(answer4Question5);
		
		Question question5 = new Question("A class has?", q5Answers);
		questions.add(question5);
		
		List<Answer> q6Answers = new ArrayList<>();
		Answer answer1Question6 = new Answer("public class Dog{}", true);
		Answer answer2Question6 = new Answer("public void class Dog{}", false);
		Answer answer3Question6 = new Answer("CLASSE dog :", false);
		Answer answer4Question6 = new Answer("main class DOG;", false);
		q6Answers.add(answer1Question6);
		q6Answers.add(answer2Question6);
		q6Answers.add(answer3Question6);
		q6Answers.add(answer4Question6);
		
		Question question6 = new Question("How to declare a class dog in JAVA?", q6Answers);
		questions.add(question6);
		
		
		List<Answer> q7Answers = new ArrayList<>();
		Answer answer1Question7 = new Answer("Return variables", false);
		Answer answer2Question7 = new Answer("Create the class.", false);
		Answer answer3Question7 = new Answer("Return boolean variables.", false);
		Answer answer4Question7 = new Answer("Initialise variables.", true);
		q7Answers.add(answer1Question7);
		q7Answers.add(answer2Question7);
		q7Answers.add(answer3Question7);
		q7Answers.add(answer4Question7);
		
		Question question7 = new Question("What's the main function of constuctor?", q7Answers);
		questions.add(question7);
		
		
		List<Answer> q8Answers = new ArrayList<>();
		Answer answer1Question8 = new Answer("Something with CAPITAL letters.", false);
		Answer answer2Question8 = new Answer("Different than class Name", false);
		Answer answer3Question8 = new Answer("The same name of the class.", true);
		Answer answer4Question8 = new Answer("The same name of the class plus an identifier", false);
		q8Answers.add(answer1Question8);
		q8Answers.add(answer2Question8);
		q8Answers.add(answer3Question8);
		q8Answers.add(answer4Question8);
		
		Question question8 = new Question("What should be the name of the contructor for a class in Java?", q8Answers);
		questions.add(question8);
		
		
		List<Answer> q9Answers = new ArrayList<>();
		Answer answer1Question9 = new Answer("I can't create an objects outside the main class.", false);
		Answer answer2Question9 = new Answer("Dog tuffy = new Dog();", true);
		Answer answer3Question9 = new Answer("Dog tuffy = new Dog", false);
		Answer answer4Question9 = new Answer("tuffy = new Dog();", false);
		q9Answers.add(answer1Question9);
		q9Answers.add(answer2Question9);
		q9Answers.add(answer3Question9);
		q9Answers.add(answer4Question9);
		
		Question question9 = new Question("How to create an object outside class Dog?", q9Answers);
		questions.add(question9);
		
		List<Answer> q10Answers = new ArrayList<>();
		Answer answer1Question10 = new Answer("Constructor.", true);
		Answer answer2Question10 = new Answer("Sub class.", false);
		Answer answer3Question10 = new Answer("Main method", false);
		Answer answer4Question10 = new Answer("Nowhere.", false);
		q10Answers.add(answer1Question10);
		q10Answers.add(answer2Question10);
		q10Answers.add(answer3Question10);
		q10Answers.add(answer4Question10);
		
		Question question10 = new Question("Dog tuffy = new Dog(\"tuffy\",\"papillon\", 5, \"white\") the values are going to?", q10Answers);
		questions.add(question10);
		
		return questions;
		
		
	}
}



