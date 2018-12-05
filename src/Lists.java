import java.util.ArrayList;
import java.util.List;


public class Lists extends Topic{
	public Lists() {
		super("Lists", createQuestion());
	}
	
	public static List<Question> createQuestion(){
		List<Question> questions = new ArrayList<>();
		
		List<Answer> q1Answers = new ArrayList<>();
		Answer answer1Question1 = new Answer("None.", false);
		Answer answer2Question1 = new Answer("import java.util.Math;", false);
		Answer answer3Question1 = new Answer("import java.util.ArrayList;", true);
		Answer answer4Question1 = new Answer("import java.ArrayList;", false);
		q1Answers.add(answer1Question1);
		q1Answers.add(answer2Question1);
		q1Answers.add(answer3Question1);
		q1Answers.add(answer4Question1);
		
		Question question1 = new Question("Which import is necessary to work with Arraylist in JAVA?", q1Answers);
		questions.add(question1);
		
		
		List<Answer> q2Answers = new ArrayList<>();
		Answer answer1question2 = new Answer("places = new ArrayList<String>();", false);
		Answer answer2question2 = new Answer("List places = new ArrayList();", false);
		Answer answer3question2 = new Answer("List<String> places = new ArrayList<String>();", true);
		Answer answer4question2 = new Answer("List<String> = new ArrayList<String>();", false);
		q2Answers.add(answer1question2);
		q2Answers.add(answer2question2);
		q2Answers.add(answer3question2);
		q2Answers.add(answer4question2);
		
		
		Question question2 = new Question("How to declare an String ArrayList in JAVA?",q2Answers);
		questions.add(question2);
		
		
		List<Answer> q3Answers = new ArrayList<>();
		Answer answer1Question3 = new Answer("Yes.",true);
		Answer answer2Question3 = new Answer("No.",false);
		Answer answer3Question3 = new Answer("Yes, just if the List is String datatype",false);
		Answer answer4Question3 = new Answer("Some times, when it's inside a public Class.",false);
		q3Answers.add(answer1Question3);
		q3Answers.add(answer2Question3);
		q3Answers.add(answer3Question3);
		q3Answers.add(answer4Question3);
		
		Question question3 = new Question("Is posible to add another value at the end of the List in JAVA?", q3Answers);
		questions.add(question3);
		
		
		List<Answer> q4Answers = new ArrayList<>();
		Answer answer1Question4 = new Answer("add(\"Canada\");",false);
		Answer answer2Question4 = new Answer("add(\"Canada\").countries;",false);
		Answer answer3Question4 = new Answer("add(\"Canada\")",false);
		Answer answer4Question4 = new Answer("countries.add(\"Canada\");",true);
		q4Answers.add(answer1Question4);
		q4Answers.add(answer2Question4);
		q4Answers.add(answer3Question4);
		q4Answers.add(answer4Question4);
		
		Question question4 = new Question("How to add a value at the end of the countries Arraylist in JAVA", q4Answers);
		questions.add(question4);
		
		
		List<Answer> q5Answers = new ArrayList<>();
		Answer answer1Question5 = new Answer("cities.modify(2,\"Montreal\");", false);
		Answer answer2Question5 = new Answer("cities.update(2,\"Montreal\");", false);
		Answer answer3Question5 = new Answer("set(2,\"Montreal\");", false);
		Answer answer4Question5 = new Answer("cities.set(2,\"Montreal\");", true);
		q5Answers.add(answer1Question5);
		q5Answers.add(answer2Question5);
		q5Answers.add(answer3Question5);
		q5Answers.add(answer4Question5);
		
		Question question5 = new Question("How to modify a current value inside an ArrayList in JAVA?", q5Answers);
		questions.add(question5);
		
		
		List<Answer> q6Answers = new ArrayList<>();
		Answer answer1Question6 = new Answer("countries.rm(3,\"Montreal\");", false);
		Answer answer2Question6 = new Answer("countries.del(2);", false);
		Answer answer3Question6 = new Answer("countries.remove(3);", true);
		Answer answer4Question6 = new Answer("countries.delete(2);", false);
		q6Answers.add(answer1Question6);
		q6Answers.add(answer2Question6);
		q6Answers.add(answer3Question6);
		q6Answers.add(answer4Question6);
		
		Question question6 = new Question("How to delete the index number 3 of countries ArrayList in JAVA?", q6Answers);
		questions.add(question6);
	
		
		
		
		List<Answer> q7Answers = new ArrayList<>();
		Answer answer1Question7 = new Answer("System.out.println(countries.toString());", true);
		Answer answer2Question7 = new Answer("System.out.println(countries.all());", false);
		Answer answer3Question7 = new Answer("System.out.println(countries.get());", false);
		Answer answer4Question7 = new Answer("System.out.println(get(countries));", false);
		q7Answers.add(answer1Question7);
		q7Answers.add(answer2Question7);
		q7Answers.add(answer3Question7);
		q7Answers.add(answer4Question7);
		
		Question question7 = new Question("How to print ALL values inside an ArrayList in JAVA?", q7Answers);
		questions.add(question7);
		
		
		
		List<Answer> q8Answers = new ArrayList<>();
		Answer answer1Question8 = new Answer("System.out.println(countries.get.toString());", false);
		Answer answer2Question8 = new Answer("System.out.println(countries.toString());", false);
		Answer answer3Question8 = new Answer("System.out.println(countries.get(x));", true);
		Answer answer4Question8 = new Answer("It's not possible in JAVA.", false);
		q8Answers.add(answer1Question8);
		q8Answers.add(answer2Question8);
		q8Answers.add(answer3Question8);
		q8Answers.add(answer4Question8);
		
		Question question8 = new Question("Printing the value  of countries(x) in JAVA ArrayList?", q8Answers);
		questions.add(question8);
		
		
		
		List<Answer> q9Answers = new ArrayList<>();
		Answer answer1Question9 = new Answer("for (String nation : countries) {System.out.println(nation.get(x)};", false);
		Answer answer2Question9 = new Answer("for (String nation : countries) {System.out.println(nation)};", true);		                          
		Answer answer3Question9 = new Answer("for (String nation : countries) {System.out.println(countries)};", false);
		Answer answer4Question9 = new Answer("It's not possible with a FOR loop.", false);
		q9Answers.add(answer1Question9);
		q9Answers.add(answer2Question9);
		q9Answers.add(answer3Question9);
		q9Answers.add(answer4Question9);
		
		Question question9 = new Question("Printing an ArrayList in JAVA with a FOR loop?", q9Answers);
		questions.add(question9);
		
		
		
		List<Answer> q10Answers = new ArrayList<>();
		Answer answer1Question10 = new Answer("countries.size()", true);
		Answer answer2Question10 = new Answer("countries.length()", false);
		Answer answer3Question10 = new Answer("countries.length", false);
		Answer answer4Question10 = new Answer("countries.size", false);
		q10Answers.add(answer1Question10);
		q10Answers.add(answer2Question10);
		q10Answers.add(answer3Question10);
		q10Answers.add(answer4Question10);
		
		Question question10 = new Question("How to know wich is the size of countries ArrayList in JAVA?", q10Answers);
		questions.add(question10);
		
		return questions;
		
	}

}
