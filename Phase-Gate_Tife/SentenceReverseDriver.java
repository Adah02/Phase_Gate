import java.util.Scanner;
public class SentenceReverseDriver {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	
	SentenceReverse phase = new SentenceReverse();

	String sentence = "abcdefd";

	System.out.print("Enter number: ");
	char userInput = input.next().charAt(0);

	phase.reverseAlphabetsIn(userInput, sentence);
	

	}
}