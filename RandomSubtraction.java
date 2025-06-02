import java.util.Random;
import java.util.Scanner;
public class RandomSubtraction {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	int counter = 0;
	int correctAnswers = 0;
	int answer = 0;
	int attempt = 0;

	while (counter != 10){

		int firstNumber = (int) (Math.random() * 20) + 1;
		int secondNumber = (int) (Math.random() * 20) + 1;

		for (int count = 0; count <= 2; count++){
			if (firstNumber > secondNumber && count != 2){
				System.out.println("What is " + firstNumber + " - " + secondNumber);
				answer = input.nextInt();
				//System.out.print((firstNumber - secondNumber) = answer(firstNumber - secondNumber));
				if (answer == (firstNumber - secondNumber)){
				correctAnswers += 1;
				counter += 1;
				attempt += 1;
				break;
				}
				else if (answer != (firstNumber - secondNumber)){
					attempt += 1;
				}
			}
		}
	}
	System.out.println();
	System.out.println("The number of correct answers is " + correctAnswers + " and the number of attempts is " + attempt);
	System.out.println("Your score is " + correctAnswers + " / " + attempt);
	}

}