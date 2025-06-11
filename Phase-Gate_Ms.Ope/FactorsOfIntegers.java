import java.util.Scanner;
public class FactorsOfIntegers {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	FactorsOfIntegersArray quiz = new FactorsOfIntegersArray();

	System.out.print("Enter number: ");
	int userInput = input.nextInt();

	quiz.factorsIn(userInput);
	}
}