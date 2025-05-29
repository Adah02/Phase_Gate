import java.util.Scanner;
public class LetterDetector {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	LetterDetectorProgram quiz = new LetterDetectorProgram();

	System.out.print("Enter the alphabet: ");
	char userChoice = input.next().charAt(0);

	String sentence = "Hello world";

	quiz.numberOfTimesIn(sentence, userChoice);
	}
}