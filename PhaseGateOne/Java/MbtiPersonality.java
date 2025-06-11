import java.util.Scanner;
import java.util.ArrayList;
public class MbtiPersonality {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	PersonalityTestFunctions quiz = new PersonalityTestFunctions();

	System.out.println("what is your name?");
	String yourName = input.nextLine();

	String[] a = { "A. Comfortable with walking to someone to start conversations", 
				"A. Not moved by past mistakes",
				"A. Prioritizes facts in the course of actions",
				 "A. Often compare efforts to others",
				"A. Very productive in team work", 
				"A. Not worried of making impressions", 
				"A. Not worried of things taking negative turns",
				"A. Base choices on objectives",
				"A. Loud and outgoing",
				"A. Authority over honesty",
				"A. Prioritizes proving points over feelings",
				"A. Empathical and accommodating",
				"A. Enjoy networking and promoting yourself around people",
				"A. Work according to schedule",
				"A. Love eploring unfamiliar ideas & viewpoints",
				"A. Complete task before deadline",
				"A. Not observant",
				"A. Do chores before relaxation",
				"A. Highly unstable under pressure",
				"A. Overly interested in discussing with others"
				};

	String[] b = {"B. Love being by yourself always", 
				"B. Little mistakes causes doubt in your abilities",
				"B. Allow feelings drive decision makings",
				"B. Not bothered by other's achievements",
				"B. Highly productive alone", 
				"B. Prioritizes making good impressions",
				"B. Worried for negative outcomes",
				"B. Do things based on emotional impressions",
				"B. Lonely and indoor lifestyle",
				"B. Honesty over other things",
				"B. Considers effects of decisions on others",
				"B. Logical and questioning",
				"B. Enjoy solitary hobbies and activities",
				"B. Work without actual plan",
				"B. Work on pre-existing inventions",
				"B. Abandon complex tasks",
				"B. A good listener & highly observant",
				"B. Allow things come in the way",
				"B. Stay calm under pressure",
				"B. Not interested in discussions"
				};

	ArrayList<String> energy = new ArrayList<>();
	ArrayList<String> mind = new ArrayList<>();
	ArrayList<String> nature = new ArrayList<>();
	ArrayList<String> tactics = new ArrayList<>();
	
	int introvert = 0;   int extrovert = 0; 		int sensing = 0;   int intuitive = 0;
	int thinking = 0; 	int feeling = 0;		int judging = 0;   int perception = 0;

	String choicesInMind = String.format("Number of A selected: %d%nNumber of B selected: %d%n", sensing, intuitive);
	String choicesInNature = String.format("Number of A selected: %d%nNumber of B selected: %d%n", thinking, feeling);
	String choicesInTactics = String.format("Number of A selected: %d%nNumber of B selected: %d%n", judging, perception);
	

	for (int index = 0; index < 20; index++){
		String optionA = (a[index]);		 String optionB = (b[index]);
		
		boolean options = true;
		while (options == true){
		System.out.printf(" %d.) %s	%s%nChoose option A or B: ", (index + 1), optionA, optionB);
		String choice = input.next();

		if (choice.equalsIgnoreCase("a")){
			options = false;
		} else if (choice.equalsIgnoreCase("b")){
			options = false;
		} else {
				System.out.println("Enter a valid option");
				options = true;
				}
		if (optionA == (a[0])  && choice.equalsIgnoreCase("a") || optionA == (a[4])  && choice.equalsIgnoreCase("a") ||
		optionA == (a[8])  && choice.equalsIgnoreCase("a") || optionA == (a[12])  && choice.equalsIgnoreCase("a") || 
		optionA == (a[16])  && choice.equalsIgnoreCase("a")){  extrovert += 1;  energy.add(optionA);	
			} 
		else if (optionA == (a[0])  && choice.equalsIgnoreCase("b") || optionA == (a[4])  && choice.equalsIgnoreCase("b") ||
		optionA == (a[8])  && choice.equalsIgnoreCase("b") || optionA == (a[12])  && choice.equalsIgnoreCase("b") || 
		optionA == (a[16])  && choice.equalsIgnoreCase("b")){ introvert += 1;  energy.add(optionB);	}


		if (optionA == (a[1])  && choice.equalsIgnoreCase("a") || optionA == (a[5])  && choice.equalsIgnoreCase("a") ||
		optionA == (a[9])  && choice.equalsIgnoreCase("a") || optionA == (a[13])  && choice.equalsIgnoreCase("a") || 
		optionA == (a[17])  && choice.equalsIgnoreCase("a")){  intuitive += 1;	mind.add(optionA);	
			} 
		else if (optionA == (a[1])  && choice.equalsIgnoreCase("b") || optionA == (a[5])  && choice.equalsIgnoreCase("b") ||
		optionA == (a[9])  && choice.equalsIgnoreCase("b") || optionA == (a[13])  && choice.equalsIgnoreCase("b") || 
		optionA == (a[17])  && choice.equalsIgnoreCase("b")){  sensing += 1; 	mind.add(optionB); 	}


		if (optionA == (a[2])  && choice.equalsIgnoreCase("a") || optionA == (a[6])  && choice.equalsIgnoreCase("a") ||
		optionA == (a[10])  && choice.equalsIgnoreCase("a") || optionA == (a[14])  && choice.equalsIgnoreCase("a") || 
		optionA == (a[18])  && choice.equalsIgnoreCase("a")){  thinking += 1;	nature.add(optionA);
			} else if (optionA == (a[2])  && choice.equalsIgnoreCase("b") || optionA == (a[6])  && choice.equalsIgnoreCase("b") ||
		optionA == (a[10])  && choice.equalsIgnoreCase("b") || optionA == (a[14])  && choice.equalsIgnoreCase("b") || 
		optionA == (a[18])  && choice.equalsIgnoreCase("b")){ feeling += 1;	nature.add(optionB);	}


		if (optionA == (a[3])  && choice.equalsIgnoreCase("a") || optionA == (a[7])  && choice.equalsIgnoreCase("a") ||
		optionA == (a[11])  && choice.equalsIgnoreCase("a") || optionA == (a[15])  && choice.equalsIgnoreCase("a") || 
		optionA == (a[19])  && choice.equalsIgnoreCase("a")){  judging += 1;	tactics.add(optionA);
			} else if (optionA == (a[3])  && choice.equalsIgnoreCase("b") || optionA == (a[7])  && choice.equalsIgnoreCase("b") ||
		optionA == (a[11])  && choice.equalsIgnoreCase("b") || optionA == (a[15])  && choice.equalsIgnoreCase("b") || 
		optionA == (a[19])  && choice.equalsIgnoreCase("b")){ perception += 1;	tactics.add(optionB);	}
			}
		}
	System.out.print(quiz.energyDetails(energy, introvert, extrovert));

	}
}