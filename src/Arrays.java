import java.util.List;
import java.util.ArrayList;


public class Arrays extends Topic{
	public Arrays() {
		super("Arrays",createQuestion());
	}
	
	public static List<Question> createQuestion(){
		List<Question> questions = new ArrayList<>();
		
		List<Answer> q1Answers = new ArrayList<>();
		Answer answer1Question1 = new Answer("var-name [type];",false);
		Answer answer2Question1 = new Answer("var-name type[];",false);
		Answer answer3Question1 = new Answer("type var-name[];",true);
		Answer answer4Question1 = new Answer("type [var-name];",false);
		q1Answers.add(answer1Question1);
		q1Answers.add(answer2Question1);
		q1Answers.add(answer3Question1);
		q1Answers.add(answer4Question1);
		
		Question question1 = new Question("How to declare an Array in JAVA?", q1Answers);
		questions.add(question1);
		
		
		
		List<Answer> q2Answers = new ArrayList<>();
		Answer answer1question2 = new Answer("int[] name;", true);
		Answer answer2question2 = new Answer("int numbers[]", false);
		Answer answer3question2 = new Answer("Integer numbers[];", false);
		Answer answer4question2 = new Answer("Integer [5];", false);
		q2Answers.add(answer1question2);
		q2Answers.add(answer2question2);
		q2Answers.add(answer3question2);
		q2Answers.add(answer4question2);
		
		
		Question question2 = new Question("How to declare an Integer Array in JAVA?",q2Answers);
		questions.add(question2);
		
		
		List<Answer> q3Answers = new ArrayList<>();
		Answer answer1Question3 = new Answer("int[] name = {0,0,0,0,0};",true);
		Answer answer2Question3 = new Answer("int number = {0,0,0,0,0};",false);
		Answer answer3Question3 = new Answer("integer number[] = {0,0,0,0,0};",false);
		Answer answer4Question3 = new Answer("String number = {0,0,0,0,0};",false);
		q3Answers.add(answer1Question3);
		q3Answers.add(answer2Question3);
		q3Answers.add(answer3Question3);
		q3Answers.add(answer4Question3);
		
		Question question3 = new Question("How to initialise an integer Array in JAVA?", q3Answers);
		questions.add(question3);
		
		
		List<Answer> q4Answers = new ArrayList<>();
		Answer answer1Question4 = new Answer("for(int x: name; x < name.length,x++)",false);
		Answer answer2Question4 = new Answer("for(int x: name;x++)",false);
		Answer answer3Question4 = new Answer("for(int x: name.length)",false);
		Answer answer4Question4 = new Answer("for(int x: name)",true);
		q4Answers.add(answer1Question4);
		q4Answers.add(answer2Question4);
		q4Answers.add(answer3Question4);
		q4Answers.add(answer4Question4);
		
		Question question4 = new Question("How to travel inside => int[] name = {0,5,0,9,3}?", q4Answers);
		questions.add(question4);
		
		List<Answer> q5Answers = new ArrayList<>();
		Answer answer1Question5 = new Answer("get.length()", false);
		Answer answer2Question5 = new Answer("length()", true);
		Answer answer3Question5 = new Answer("length(get)", false);
		Answer answer4Question5 = new Answer("size()", false);
		q5Answers.add(answer1Question5);
		q5Answers.add(answer2Question5);
		q5Answers.add(answer3Question5);
		q5Answers.add(answer4Question5);
		
		Question question5 = new Question("Which method gets an array' size?", q5Answers);
		questions.add(question5);
		
		List<Answer> q6Answers = new ArrayList<>();
		Answer answer1Question6 = new Answer("length(name)", false);
		Answer answer2Question6 = new Answer("name.size", false);
		Answer answer3Question6 = new Answer("name.length()", false);
		Answer answer4Question6 = new Answer("name.length", true);
		q6Answers.add(answer1Question6);
		q6Answers.add(answer2Question6);
		q6Answers.add(answer3Question6);
		q6Answers.add(answer4Question6);
		
		Question question6 = new Question("How to get the length of String[] name ={a,b,c,d,e} in JAVA?", q6Answers);
		questions.add(question6);
		
		
		List<Answer> q7Answers = new ArrayList<>();
		Answer answer1Question7 = new Answer("0", true);
		Answer answer2Question7 = new Answer("1", false);
		Answer answer3Question7 = new Answer("n-1", false);
		Answer answer4Question7 = new Answer("2", false);
		q7Answers.add(answer1Question7);
		q7Answers.add(answer2Question7);
		q7Answers.add(answer3Question7);
		q7Answers.add(answer4Question7);
		
		Question question7 = new Question("Which is the lower index in JAVA Array?", q7Answers);
		questions.add(question7);
		
		
		List<Answer> q8Answers = new ArrayList<>();
		Answer answer1Question8 = new Answer("lower 1 and higher 4", false);
		Answer answer2Question8 = new Answer("lower 1 and higher 5", false);
		Answer answer3Question8 = new Answer("lower 0 and higher 4", true);
		Answer answer4Question8 = new Answer("lower 4 and higher 0", false);
		q8Answers.add(answer1Question8);
		q8Answers.add(answer2Question8);
		q8Answers.add(answer3Question8);
		q8Answers.add(answer4Question8);
		
		Question question8 = new Question("Which is the lower and higher index in this Array =>String[] name ={a,b,c,d,e}?", q8Answers);
		questions.add(question8);
		
		
		List<Answer> q9Answers = new ArrayList<>();
		Answer answer1Question9 = new Answer("type var-name[]", false);
		Answer answer2Question9 = new Answer("type var-name[][]", true);
		Answer answer3Question9 = new Answer("type var-name[[]]", false);
		Answer answer4Question9 = new Answer("[][]type var-name", false);
		q9Answers.add(answer1Question9);
		q9Answers.add(answer2Question9);
		q9Answers.add(answer3Question9);
		q9Answers.add(answer4Question9);
		
		Question question9 = new Question("How to declare a multidimentional Array in JAVA?", q9Answers);
		questions.add(question9);
		
		List<Answer> q10Answers = new ArrayList<>();
		Answer answer1Question10 = new Answer("Allocating memory to array.", true);
		Answer answer2Question10 = new Answer("Nothing.", false);
		Answer answer3Question10 = new Answer("It's not JAVA syntax.", false);
		Answer answer4Question10 = new Answer("Creating an array with number 20 inside.", false);
		q10Answers.add(answer1Question10);
		q10Answers.add(answer2Question10);
		q10Answers.add(answer3Question10);
		q10Answers.add(answer4Question10);
		
		Question question10 = new Question("What's the meaning of this line ==> intArray = new int[20]?", q10Answers);
		questions.add(question10);
		
		return questions;
		
		
	}
}
