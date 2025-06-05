import java.util.Scanner;
import java.util.Arrays;
public class SemicolonAssessment {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	System.out.println("Welcome to Semicolon Assessment.");
	System.out.print("Enter 1 to start: ");
	int userInput = input.nextInt();

	boolean userChoice = true;
	while (userChoice = true){

	int[] array = {1,2,3,4,5,6,7,8,9,10};
	

			System.out.print("Enter question number from 1 to 10: ");
			int usersChoice = input.nextInt();
			for (int index = 0; index < array.length; index++){
				for (int count = 0; count < array.length; count++){
				if (array[usersChoice -1] == 0){
				System.out.print("Question already answered");
				userChoice = true;
				}
			}
			switch (usersChoice){
				case 1: {
						boolean firstQues = true;
						while (firstQues = true){
						int counter = 0;
						String question1 = "What is the full meaning of OOP?";
						System.out.printf("%s%n (a) Open Opposite Pathway %n(b) Opposite Pathway%n(c) Object Oriented Programming%n(d) None of the above%n", question1);

						System.out.print("Enter selection: ");
						String selection = input.next();
						if (selection == "c"){
							System.out.print("Correct");
							array[0] = 0;
							firstQues = false;
						}
						else if (selection != "c" && counter != 2){
						counter += 1;
						firstQues = true;
						}
					}
					} break;
				case 2: {
						int counter = 0;
						boolean secondQues = true;
						while (secondQues = true){

						String question2 = "What is the capital of Nigeria?";
						String a = "(a) Lagos";
						String b = "(b) Abuja";
						String c = "(c) Ogun";
						String d = "(d) Makurdi";
						System.out.printf(" %s%n %s%n %s%n %s%n %s%n", question2, a, b, c, d);

						System.out.print("Enter selection: ");
						String selection = input.next();
						if (selection == "b"){
							System.out.print("Correct");
							array[1] = 0;
							secondQues = false;
						}
						else if (selection != "b" && counter != 2){
						counter += 1;
						secondQues = true;
						}
					}
					} break;
				case 3: {
						int counter = 0;
						boolean thirdQues = true;
						while (thirdQues = true){
						int count = 0;
						String question3 = "Array is a programming language?";
						String a = "(a) True";
						String b = "(b) False";
						System.out.printf(" %s%n %s%n %s%n", question3, a, b);

						System.out.print("Enter selection: ");
						String selection = input.next();
						if (selection == "b"){
							System.out.print("Correct");
							array[2] = 0;
							thirdQues = false;
						}
						else if (selection != "b" && counter != 2){
						counter += 1;
						thirdQues = true;
						}
					}
					} break;
				case 4: {
						int counter = 0;
						boolean fourthQues = true;
						while (fourthQues = true){
						String question4 = "School educates people.";
						String a = "(a) False";
						String b = "(b) True";
						System.out.printf(" %s%n %s%n %s%n", question4, a, b);

						System.out.print("Enter selection: ");
						String selection = input.next();
						if (selection == "b"){
							System.out.print("Correct");
							array[3] = 0;
							fourthQues = false;
						}
						else if (selection != "b" && counter != 2){
						counter += 1;
						fourthQues = true;
						}
						}
						} break;
				case 5: {
						int counter = 0;
						boolean fifthQues = true;
						while (fifthQues = true){

						String question5 = "Where is Semicolon located?";
						String a = "(a) Abuja";
						String b = "(b) Lagos";
						String c = "(c) Osun";
						String d = "(d) None of the above";
						System.out.printf(" %s%n %s%n %s%n %s%n %s%n", question5, a, b, c, d);

						System.out.print("Enter selection: ");
						String selection = input.next();
						if (selection == "b"){
							System.out.print("Correct");
							array[4] = 0;
							fifthQues = false;
						}
						else if (selection != "b" && counter != 2){
						counter += 1;
						fifthQues = true;
						}
					}
						}
				case 6: {
						int counter = 0;
						boolean sixthQues = true;
						while (sixthQues = true){
						String question6 = "What is 3 * 3";
						String a = "(a) 6";
						String b = "(b) 12";
						String c = "(c) 9";
						String d = "(d) 3";
						System.out.printf(" %s%n %s%n %s%n %s%n %s%n", question6, a, b, c, d);

						System.out.print("Enter selection: ");
						String selection = input.next();
						if (selection == "c"){
							System.out.print("Correct");
							array[5] = 0;
							sixthQues = false;
						}
						else if (selection != "c" && counter != 2){
						counter += 1;
						sixthQues = true;
						}
					}
						} break;
				case 7: {
						int counter = 0;
						boolean seventhQues = true;
						while (seventhQues = true){
						String question7 = "When is christmas?";
						String a = "(a) 25 Dec";
						String b = "(b) 25 Jan";
						String c = "(c) 1 jan";
						String d = "(d) 13 Apr";
						System.out.printf(" %s%n %s%n %s%n %s%n %s%n", question7, a, b, c, d);

						System.out.print("Enter selection: ");
						String selection = input.next();
						if (selection == "b"){
							System.out.print("Correct");
							array[5] = 0;
							seventhQues = false;
						}
						else if (selection != "b" && counter != 2){
						counter += 1;
						seventhQues = true;
						}
					}
						}
				case 8: {
						String question8 = "English is a language";
						String a = "(a) False";
						String b = "(b) True";
						System.out.printf(" %s%n %s%n %s%n", question8, a, b);

						System.out.print("Enter selection: ");
						char selection = input.next().charAt(0);
						}
				case 9: {
						String question9 = "9 * 3 = 21";
						String a = "(a) True";
						String b = "(b) False";
						System.out.printf(" %s%n %s%n %s%n", question9, a, b);

						System.out.print("Enter selection: ");
						char selection = input.next().charAt(0);
						}
				case 10: {
						String question10 = "Car is a machine";
						String a = "(a) True";
						String b = "(b) False";
						System.out.printf(" %s%n %s%n %s%n", question10, a, b);

						System.out.print("Enter selection: ");
						char selection = input.next().charAt(0);
						}
					}
				}
		}
	}

}