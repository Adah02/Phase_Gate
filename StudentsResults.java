import java.util.Arrays;
public class StudentsResults{

	public static double[] studentsResultsSorting(double[][] scores){

	double[] total = new double[2];
	double[] average = new double[2]; 
	int[] position = new int[2];
	
	
	for(int index = 0; index < total.length; index++){
		for (int count = 0; count < scores[0].length; count++){
			total[index] += scores[index][count];
		}
	}
	System.out.print(Arrays.toString(total));
	return total;

	for(int counter = 0; counter < total.length; counter++){
		average[counter] += (total[counter] / scores.length);
	}
	return average;

	for (int j = 0; j < total.length; j++){
		average[j] += (total[j] / scores.length);
	}
	return position;
	}


}