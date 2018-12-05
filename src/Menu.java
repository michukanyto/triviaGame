import java.util.List;
import java.util.Scanner;
public class Menu {
	static Scanner input = new Scanner(System.in);
	int answer;
	boolean isCorrect = false;
	String answerQuestion;
	String line = "\n\t\t*************************************************************************************************";
	String line2 = "\n\t\t\t**********************************************************************************";
	String line3 ="\n\n\t\t\t\t   ############################################################";
	
	public int userMenu() {
		System.out.println(line);
		System.out.println("\t\t\t\t\t########## WELCOME TO TRIVIA GAME ##########");
		System.out.println("\n\n\n\t\t\t\t\t\t\t1. PLAY GAME.");
		System.out.println("\n\n\t\t\t\t\t\t\t2. ADMIN GAME.");
		System.out.println("\n\n\t\t\t\t\t\t\t3. EXIT.");
		System.out.print("\n\t\t\tPlease Enter your Option here => ");
		 while(!(input.hasNextInt())) {
			 System.out.println("\n\t\t\tYOU TYPED A WRONG OPTION, TRY (1,2,3) ");
			 System.out.print("\n\t\t\tPlease Enter your Option here => ");
			 input.next();
		 }
		
		answer = input.nextInt();
		System.out.println(line);
		return answer;
			
	}
	
	
	public int topicMenu() {
		System.out.println(line);
		System.out.println("\n\t\t\t\t\t    ########## JAVA'S TOPICS ##########");
		System.out.println(line);
		System.out.println("\n\n\t\t\t\t\t\t###   1. Variables.   ######");
		System.out.println("\n\t\t\t\t\t\t###   2. IF statement.   ###");
		System.out.println("\n\t\t\t\t\t\t###   3. Loops.   ##########");
		System.out.println("\n\t\t\t\t\t\t###   4. Arrays.   #########");
		System.out.println("\n\t\t\t\t\t\t###   5. Lists.   ##########");
		System.out.println("\n\t\t\t\t\t\t###   6. Classes.   ########");
		System.out.println("\n\t\t\t\t\t\t###   7. Exit.    ##########");
		System.out.print("\n\t\t\tWhich topic do you want play => ");
		while(!(input.hasNextInt())) {
			System.out.print("\t\t\t\tSORRY BUT IT'S NOT A VALID TOPIC, TRY (1,2,3,4,5,6,7).");
			System.out.print("\n\t\t\tWhich topic do you want to play => ");
			input.next();
		}
		answer = input.nextInt();
		System.out.println(line);
		
		return  answer;
	
	}
	
	public boolean showQuestion(int num,String question,List<Answer> answers, String topic, int score) {
		System.out.println(line);
		System.out.println("\nQestion : "+ num +"/10\t\t\t\t  ########## "  + topic + " in JAVA ##########\t\t\t\t   * SCORE:" + score +" *");
		System.out.println(line);
		System.out.println("\n\t\t***** "+ question +" *****");
		System.out.println("\n\n\n\t\t\t\t\tA) "+ answers.get(0).getName());
		System.out.println("\n\t\t\t\t\tB) "+ answers.get(1).getName());
		System.out.println("\n\t\t\t\t\tC) "+ answers.get(2).getName());
		System.out.println("\n\t\t\t\t\tD) "+ answers.get(3).getName());
		System.out.print("\n\n\n\t\t\t\t\t\t Please enter your answer here => ");
		answerQuestion = input.next();
		while (!(answerQuestion.equals("a") || answerQuestion.equals("b") || answerQuestion.equals("c") || answerQuestion.equals("d") || answerQuestion.equals("A") || answerQuestion.equals("B") || answerQuestion.equals("C") || answerQuestion.equals("D"))){
			System.out.print("\n\n\n\t\t\t\t\t\t SORRY YOU TYPED A WRONG OPTION, TRY AGAIN!");
			System.out.print("\n\n\n\t\t\t\t\t\t Please enter your answer here => ");
			answerQuestion = input.next();
		}
		
		
		
		
		
		if (answerQuestion.equals("a") || answerQuestion.equals("A"))	
			isCorrect = answers.get(0).getIsCorrect();
		else if (answerQuestion.equals("b") || answerQuestion.equals("B")) 
			isCorrect = answers.get(1).getIsCorrect();
		else if (answerQuestion.equals("c") || answerQuestion.equals("C"))
			isCorrect = answers.get(2).getIsCorrect();
		else if (answerQuestion.equals("d") || answerQuestion.equals("D")) {
			isCorrect = answers.get(3).getIsCorrect();
		}
			
		return isCorrect; 
		
	}
	
	public void showAnswer (boolean answer, String correctAnswer) {
		System.out.println(line2);
		System.out.println(line2);
		System.out.println(answer ? "\t\t\t\t\t***YOU GOT IT***, 1 POINT FOR YOU ! ! !" : "\t\t\t\t***YOU FAILED***, correct Answer is : " + correctAnswer);
		System.out.println(line2);
		System.out.println(line2);
	}
	
	
	public void showScore(List<Score> scores) {
		String message;
		System.out.println(line);
		System.out.println(line2);
		
		for (int x = 0; x < scores.size(); x++) {
			System.out.println("\n\t\t\t\t  YOU PLAYED THE TOPIC : \"" + scores.get(x).getName() + "\" AND YOU GET : *** " + scores.get(x).getScoreValue() +"/10 ***");
	
			if(scores.get(x).getScoreValue() < 7) {
				message = "WE STRONGLY RECOMMEND YOU STUDY A LITTLE BIT FOR THIS TOPIC!";
			}else if(scores.get(x).getScoreValue() == 10){
				message = "\t\tYOU GOT PERFECT SCRORE FOR THIS TOPIC!";
			}else {
				message = "\t\tYOU GOT A GOOD SCORE FOR THIS TOPIC!";
			}
			System.out.println(line3);
			System.out.println("\n\n\t\t\t\t    " + message);
			System.out.println(line3);
			
			System.out.println(line2);
			System.out.println(line);
		}
	}
	
	public boolean logIn() {
		String user="";
		String password="";
		
		System.out.println(line);
		System.out.println(line2);
		System.out.println("\n\t\t\t\t\t\t\t    LOG IN");
		System.out.println(line3);
		System.out.println("\n\n\t\t\t\t    ########### *****************");
		System.out.print("\n\t\t\t\t    User     =>   ");
		user = input.next();
		System.out.print("\n\t\t\t\t    Password =>   ");
		password = input.next();
		System.out.println("\n\n\t\t\t\t    ########### *****************");
		System.out.println(line3 + "\n");
		System.out.println(line2);
		System.out.println(line);
		
		if(user.equals("admin") && password.equals("911"))
			return true;
		else
			return false;
		
	}
	
	
	public int adminMenu(String topic) {
		System.out.println(line);
		System.out.println("\n\t\t\t\t\t    ########## TOPIC " + topic + " ADMINISTRATION ##########");
		System.out.println(line);
		System.out.println("\n\n\t\t\t\t\t\t###   1. Modify a question.   ######");
		System.out.println("\n\t\t\t\t\t\t###   2. Exit.   ##########");
		System.out.print("\n\t\t\tWhat do you want to do ? => ");
		
		while(!(input.hasNextInt())) {
			System.out.print("\t\t\t\tSORRY BUT IT'S NOT A VALID OPTION, TRY (1,2).");
			System.out.print("\n\t\t\tWhat do you want to do ? => ");
			input.next();
		}
		answer = input.nextInt();
		System.out.println(line);
		
		return  answer;
	}
}
