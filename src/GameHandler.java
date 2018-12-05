import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class GameHandler {
	static Menu menu = new Menu();
	static TriviaGame triviagame = new TriviaGame();
	static String[] topics = {"NO TOPIC","Variables","If Statement","Loops","Arrays","Lists","Classes"};
	static int[] playedTopic = {0,			0,			0,			  0,		0,		0,		0, 0};
	String topicName;
	String continueLogIn;
	int scoreTemp;
	boolean userLogIn;
	boolean flag = true;
	String messageLogIn ="LOG IN";
	private List<Score> finalScore = new ArrayList<>();
	Scanner input = new Scanner(System.in);

	public void beginGame() {
		int answerUser;
		int answerTopic;
		int answerAdmin;
		answerUser = menu.userMenu();
		
		
		switch(answerUser) {
		
			case 1 :
				do {
					answerTopic = menu.topicMenu();
					
					if (answerTopic < 7 && answerTopic > 0 && playedTopic[answerTopic] == 0) {
						for (int x = 1; x < topics.length; x++) {
							if(x == answerTopic)
								topicName = topics[x];
						}
					
						scoreTemp = triviagame.play(topicName);
						Score score = new Score(topicName, scoreTemp);
						finalScore.add(score);
						playedTopic[answerTopic] = 1;
//						System.out.println("Control point");
					}else if(playedTopic[answerTopic] == 1){
						System.out.println("** WARNING ** This topic has  been already played, Please Chose another topic.");
					}
					
				}while(answerTopic < 7 && answerTopic > 0);
				menu.showScore(finalScore);

				break;
				
			case 2 :
				
				userLogIn = menu.logIn();
				while(!userLogIn) {//controlling LOGIN user =  admin / password = 911
					System.out.println("\n\t\t\t\t\t\tUser or Password invalid, please try again");
					System.out.print("Do YOU WANT TO TRY AGAIN (y / n)? : ");
					continueLogIn = input.next();
					if(continueLogIn.equals("y") || continueLogIn.equals("Y") || continueLogIn.equals("yes") || continueLogIn.equals("YES")) {
						userLogIn = menu.logIn();
						flag = true;
					}else {
						userLogIn = true;
						flag = false;
					}
				}

				if(userLogIn && flag) {
					answerTopic = menu.topicMenu();
					if (answerTopic < 7 && answerTopic > 0) {
						for (int x = 1; x < topics.length; x++) {
							if(x == answerTopic)
								topicName = topics[x];
						}
					}
					if (topicName != null) {//controlling option EXIT
						answerAdmin = menu.adminMenu(topicName);
						if(answerAdmin == 1)
							triviagame.adminQuestion(topicName);
						else if(answerAdmin == 2)
							System.out.println("2");
		
					}
				}
				break;
			
			default :
				System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\t*** WRONG OPTION! ***");
		}
		
		System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\t*** HAVE A GOOD ONE! ***");
	
	}
}
