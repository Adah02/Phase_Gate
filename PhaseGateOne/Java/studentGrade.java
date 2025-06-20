import java.util.Scanner;
import java.util.Arrays;
public class studentGrade {

	public static double[] studentScoreTotal(double[][] scores){

		double[] studentTotal = new double[scores.length];

		for (int index = 0; index < scores.length; index++){
			int total = 0;
			for (int count = 0; count < scores[index].length; count++){
				total += scores[index][count];
			}
		studentTotal[index] = total;
		}
	return studentTotal;
	}

	public static double[] studentsAverage (double[][] scores){
	
	double[] average = new double[scores.length];
	
	for (int index = 0; index < scores.length; index++){
			double total = 0; 
			for (int count = 0; count < scores[index].length; count++){
				total += scores[index][count];
			}
		average[index] = total / scores[index].length;
		}
	return average;
	}

	public static int[] studentPosition(double[] studentTotal){

	int[] positions = new int[studentTotal.length];

	double[] studentScoreTotal = new double[studentTotal.length];
	double[] sortedScores = new double[studentTotal.length];
		
		for (int sorted = 0; sorted < studentTotal.length; sorted++){
			studentScoreTotal[sorted] = studentTotal[sorted];
		}
		Arrays.sort(studentScoreTotal);
		for (int sorted = 0; sorted < studentTotal.length; sorted++){
			sortedScores[sorted] = studentScoreTotal[sorted];
		}

		int position = 1;
		for (int  index = studentTotal.length - 1; index >= 0; index--){
			for (int count = 0; count < studentTotal.length; count++){
			if (sortedScores[index] == studentTotal[count] && index > 0 && sortedScores[index] == sortedScores[index - 1]){
				positions[count] = position - 1;  
				position += 1;
				break;
				}  else if (sortedScores[index] == studentTotal[count]){
					positions[count] = position;  
					position += 1;
					break;
				}
			}
		} 
	return positions;
	}




	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.println("How many students do you have? : ");
	int students = input.nextInt();

	System.out.println("How many do they offer? : ");
	int subjects = input.nextInt();

	double[][] scores = new double[students][subjects];

	for (int index = 0; index < scores.length; index++){
		for (int count = 0; count < scores[index].length; count++){
			boolean validScore = true;
			while (validScore = true){
				System.out.printf("Enter score for student %d%n Subject %d : ", index + 1,  count + 1);
				double score = input.nextDouble();
				if (score >= 0 && score <= 100){
					scores[index][count] = score;
					validScore = false;    break;
				} else {
					System.out.println("Enter a valid score between 0 and 100");
					 validScore = true;
					}
				}
			}
		}
		double[] studentTotal = studentScoreTotal(scores);
		double[] studentAverage = studentsAverage(scores);

		for (int header = 0; header < 1; header++){
			System.out.print("\nSTUDENTS \t");
			for (int subj = 0; subj < subjects; subj++){
			System.out.printf("SUB%d \t", (subj + 1));
			}
		System.out.println("TOTAL \tAVERAGE\tPOSITION");
		}

		int[] positions = studentPosition(studentTotal);	

		for (int index = 0; index < scores.length; index++){
			System.out.printf("Student %d \t", (index + 1));
			for (int count = 0; count < scores[index].length; count++){
				System.out.printf("%.0f \t", (scores[index][count]));
			}
		System.out.printf("%.0f \t%.1f \t%d%n", studentTotal[index], studentAverage[index], positions[index]);
		}

		System.out.println("\n \t SUBJECT SUMMARY");
		
		for (int subj = 0; subj < scores[0].length; subj++){
			System.out.println("Subject " + (subj + 1));

			double total = 0;    double highestScore = 0;	int highestStudent = 0; 
			double LowestScore = 100;	int lowestStudent = 0;  int pass = 0;   int fail = 0;

			for (int score = 0; score < scores.length; score++){
			
			if (scores[score][subj] > highestScore) {
				highestScore = scores[score][subj];
				highestStudent = score + 1;
				}
			if (scores[score][subj] < LowestScore) {
				LowestScore = scores[score][subj];
				lowestStudent = score + 1;
				}

			if (scores[score][subj] > 39){
				pass += 1;
			} else {	fail += 1;
				}
			total += scores[score][subj];
			}

		System.out.printf("Highest scoring student is :  Student %d  scoring %.0f%n", highestStudent, highestScore);
		System.out.printf("Lowest scoring student is :  Student %d  scoring %.0f%n", lowestStudent, LowestScore);
		System.out.printf("Total score is: %.0f%nThe average score is: %.2f%n", total, (total / subjects));
		System.out.printf("Number of passes %d%nNumber of fails %d%n", pass, fail);
		System.out.println("");
		}
	}
}