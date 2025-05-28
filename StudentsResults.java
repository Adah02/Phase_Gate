import java.util.Arrays;
public class StudentsResults{

	public static double[] studentsResultsSorting(double[][] scores){

	double[] total = new double[2];
	double[] average = new double[2]; 
	double[] position = new double[2];
	
	for(int index = 0; index < total.length; index++){
		for (int count = 0; count < scores[0].length; count++){
			total[index] += scores[index][count];
		}
	}
	return total;

	for(int counter = 0; counter < total.length; counter++){
		average[counter] = (total[counter] / scores[counter].length);
	}
	return average;
/*
	for (int j = 0; j < average.length; j++){
		
		if (average[0] > average[1]){
		
		}
	}
	return position;
	}
*/

}