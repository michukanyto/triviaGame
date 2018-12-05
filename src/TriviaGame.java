import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class TriviaGame {
	private Menu menu = new Menu();
	private boolean userAnswer;//1
	private String correctAnswer;
	private String newQuestion;
	private String newAnswer;
	private boolean newIsTrue;
	private int i = 0;//1
	private int index = 0;
	private int scoreTemp = 0;
	Scanner input = new Scanner (System.in);
//	Scanner input2 = new Scanner (System.in);
//	Scanner input3 = new Scanner (System.in);
	private List<Topic> topics = new ArrayList<>();
//	private List<Score> finalScore = new ArrayList<>();
	
	
	public TriviaGame() {
		Topic variables = new Variables();
		topics.add(variables);
		
		Topic ifStatement = new IfStatement();
		topics.add(ifStatement);
		
		Topic loops = new Loops();
		topics.add(loops);
		
		Topic arrays = new Arrays();
		topics.add(arrays);
		
		Topic lists = new Lists();
		topics.add(lists);
		
		Topic classes = new Classes();
		topics.add(classes);
	}
	
	public int play(String topicName) {
		Topic next = searchTopic(topicName);//?
		scoreTemp = 0;//cleaning score
		i = 0;//cleaning question counter
		
		
		
		for(Question question : next.getQuestions()) {
			userAnswer = menu.showQuestion(++i,question.getText(), question.getAnswers(), topicName, scoreTemp);//1
			correctAnswer = searchCorrectAnswer(question.getAnswers());
			
			menu.showAnswer(userAnswer,correctAnswer);
			if (userAnswer)
				scoreTemp +=1;// Good answer increment score
			
			System.out.println(userAnswer);//1	
		}
		return scoreTemp;

	}
	
	private Topic searchTopic(String topicName) {//?
		for (Topic topic : topics) {
			if(topic.getName().equals(topicName)) {
				return topic;
			}
		}
		return null;
	}
	
	
	private String searchCorrectAnswer(List<Answer> list) {
		String correct = "Not Answer.";
		for(int x =0; x < list.size(); x++) {
			if(list.get(x).getIsCorrect())
				correct = list.get(x).getName();
		}
		return correct;
			
	}	
	
	public void adminQuestion(String topicName) {
		Topic next = searchTopic(topicName);//?
		scoreTemp = 0;//cleaning score
		i = 0;//cleaning question counter
		
		for(int x = 0; x < next.getQuestions().size(); x++) 
			System.out.println("\t" + (x+1) + ". " + next.getQuestions().get(x).getText() + "\n");
		
		System.out.print("\n\t WHICH QUESTION DO YOU WANT TO MODIFY ? : ");
		index = input.nextInt();
		System.out.print("\n\t Please type the new Question : ");
		Scanner input3 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		newQuestion = input3.nextLine();
		
		List<Answer> answers = new ArrayList<>();
		
		for(int x = 1; x < 5; x++) {
			System.out.print("\n\t Please type Answer # " + x + " : ");
			newAnswer = input3.nextLine();
			System.out.print("\n\t This quetion is true or false ? : " );
			newIsTrue = input2.nextBoolean();
			answers.add(new Answer(newAnswer, newIsTrue));
		}

		
		Question toSet = new Question(newQuestion, answers);
		next.getQuestions().set(--index, toSet);
		
		System.out.println("\n\t\t\t\t\t THIS THE NEW LIST OF QUESTONS");
		System.out.println("\n\t\t\t\t\t #############################\n");
		for(int x = 0; x < next.getQuestions().size(); x++) 
			System.out.println("\t" + (x+1) + ". " + next.getQuestions().get(x).getText() + "\n");
		
		
		
		input2.close();
		input3.close();

	}
		

}
