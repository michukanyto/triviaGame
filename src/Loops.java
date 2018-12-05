import java.util.List;
import java.util.ArrayList;


public class Loops extends Topic{
	public Loops() {
		super("Loops",createQuestion());
	}

	public static List<Question> createQuestion(){
		List<Question> questions = new ArrayList<>();
		
		List<Answer> q1Answers = new ArrayList<>();
		Answer answer1Question1 = new Answer("Do while().",false);
		Answer answer2Question1 = new Answer("if(condition).",true);
		Answer answer3Question1 = new Answer("While().",false);
		Answer answer4Question1 = new Answer("for(conditions).",false);
		q1Answers.add(answer1Question1);
		q1Answers.add(answer2Question1);
		q1Answers.add(answer3Question1);
		q1Answers.add(answer4Question1);
		
		Question question1 = new Question("Which is NOT a Loop structure ?", q1Answers);
		questions.add(question1);
		
		
		
		List<Answer> q2Answers = new ArrayList<>();
		Answer answer1question2 = new Answer("When the condition becomes true, the loop terminates.", false);
		Answer answer2question2 = new Answer("There is checking condition all the time.", false);
		Answer answer3question2 = new Answer("It's not checking for conditions at the first time.", true);
		Answer answer4question2 = new Answer("Always increment one by one.", false);
		q2Answers.add(answer1question2);
		q2Answers.add(answer2question2);
		q2Answers.add(answer3question2);
		q2Answers.add(answer4question2);
		
		
		Question question2 = new Question("Which is a property of DO WHILE?",q2Answers);
		questions.add(question2);
		
		
		List<Answer> q3Answers = new ArrayList<>();
		Answer answer1Question3 = new Answer("While loop.",false);
		Answer answer2Question3 = new Answer("For loop.",true);
		Answer answer3Question3 = new Answer("Class loop.",false);
		Answer answer4Question3 = new Answer("Do While loop.",false);
		q3Answers.add(answer1Question3);
		q3Answers.add(answer2Question3);
		q3Answers.add(answer3Question3);
		q3Answers.add(answer4Question3);
		
		Question question3 = new Question("(int i = 5; i != 0; i -= 2) this syntax looks like ?", q3Answers);
		questions.add(question3);
		
		
		List<Answer> q4Answers = new ArrayList<>();
		Answer answer1Question4 = new Answer("None",true);
		Answer answer2Question4 = new Answer("import java.util.loops;",false);
		Answer answer3Question4 = new Answer("import java.util.*;",false);
		Answer answer4Question4 = new Answer("import.java.util.list;",false);
		q4Answers.add(answer1Question4);
		q4Answers.add(answer2Question4);
		q4Answers.add(answer3Question4);
		q4Answers.add(answer4Question4);
		
		Question question4 = new Question("Which import is mandatory to work with loops in JAVA?", q4Answers);
		questions.add(question4);
		
		List<Answer> q5Answers = new ArrayList<>();
		Answer answer1Question5 = new Answer("0,1,2,3,4,5,6,7,8,9", false);
		Answer answer2Question5 = new Answer("-1,3,5,9", false);
		Answer answer3Question5 = new Answer("0,3,6,9", false);
		Answer answer4Question5 = new Answer("-1,2,5,8", true);
		q5Answers.add(answer1Question5);
		q5Answers.add(answer2Question5);
		q5Answers.add(answer3Question5);
		q5Answers.add(answer4Question5);
		
		Question question5 = new Question("Which is the output for => for (int i = 0; i =< 9; i+=3) {System.out.println((i - 1) + \",\")}?", q5Answers);
		questions.add(question5);
		
		List<Answer> q6Answers = new ArrayList<>();
		Answer answer1Question6 = new Answer("String", false);
		Answer answer2Question6 = new Answer("boolean", false);
		Answer answer3Question6 = new Answer("all", true);
		Answer answer4Question6 = new Answer("int", false);
		q6Answers.add(answer1Question6);
		q6Answers.add(answer2Question6);
		q6Answers.add(answer3Question6);
		q6Answers.add(answer4Question6);
		
		Question question6 = new Question("WHILE LOOP could be used with ___________ datatype : ?", q6Answers);
		questions.add(question6);
		
		
		List<Answer> q7Answers = new ArrayList<>();
		Answer answer1Question7 = new Answer("For loop type array.", false);
		Answer answer2Question7 = new Answer("It doesn't exists.", false);
		Answer answer3Question7 = new Answer("Class for loop for integers.", false);
		Answer answer4Question7 = new Answer("Enhanced for loop.", true);
		q7Answers.add(answer1Question7);
		q7Answers.add(answer2Question7);
		q7Answers.add(answer3Question7);
		q7Answers.add(answer4Question7);
		
		Question question7 = new Question("This FOR LOOP is well known like // for(int x : array){}?", q7Answers);
		questions.add(question7);
		
		
		List<Answer> q8Answers = new ArrayList<>();
		Answer answer1Question8 = new Answer("Yes, it's possible using the same counter (i).  ", false);
		Answer answer2Question8 = new Answer("No, it gets a compiler error.", false);
		Answer answer3Question8 = new Answer("Yes, always it is possible.", true);
		Answer answer4Question8 = new Answer("Yes, but the conditions should work with the same datatype.", false);
		q8Answers.add(answer1Question8);
		q8Answers.add(answer2Question8);
		q8Answers.add(answer3Question8);
		q8Answers.add(answer4Question8);
		
		Question question8 = new Question("It does possible making a neested WHILE inside a FOR LOOP?", q8Answers);
		questions.add(question8);
		
		
		List<Answer> q9Answers = new ArrayList<>();
		Answer answer1Question9 = new Answer("while (i<5){System.out.print(i++)}", false);
		Answer answer2Question9 = new Answer("while (i<5){System.out.print(i);}", false);
		Answer answer3Question9 = new Answer("while (i<=5){System.out.print(i++);}", false);
		Answer answer4Question9 = new Answer("while (i<5){System.out.print(i++);}", true);
		q9Answers.add(answer1Question9);
		q9Answers.add(answer2Question9);
		q9Answers.add(answer3Question9);
		q9Answers.add(answer4Question9);
		
		Question question9 = new Question("The output is :'1234' and (i=1), Which is the code to get this output in JAVA ?", q9Answers);
		questions.add(question9);
		
		List<Answer> q10Answers = new ArrayList<>();
		Answer answer1Question10 = new Answer("3102", false);
		Answer answer2Question10 = new Answer("2013", true);
		Answer answer3Question10 = new Answer("2,0,1,3", false);
		Answer answer4Question10 = new Answer("0123", false);
		q10Answers.add(answer1Question10);
		q10Answers.add(answer2Question10);
		q10Answers.add(answer3Question10);
		q10Answers.add(answer4Question10);
		
		Question question10 = new Question("int[] arr={2, 0, 1, 3};for (int el : arr){ System.out.print(el); } Which is the output ?", q10Answers);
		questions.add(question10);
		
		return questions;
		
		
	}
	
}
