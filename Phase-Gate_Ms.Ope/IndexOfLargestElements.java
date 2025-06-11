import java.util.Arrays;
public class IndexOfLargestElements {

	public static int theIndexOfLargest (double[] arrays){

	double maximum = arrays[0];
	int theIndex = 0;

	for (int index = 0; index < arrays.length; index++){
		if (arrays[index] > maximum){
			maximum = arrays[index];
			theIndex = index;
			}
		}
	System.out.print(theIndex);
	return theIndex;
	}
	
}