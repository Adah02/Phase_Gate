import java.util.Arrays;
public class SquareOfAscendingValues{

	public static int[] squareOfNumberIn(int[] scores){

	int[] squares = new int[scores.length];
	int counter = 0;

	for (int index = 0; index < Integer.MAX_VALUE; index++){
		for (int count = 0; count < scores.length; count++){
			if (index == scores[count]){
			squares[counter] += (Math.pow(scores[count],2));
			counter += 1;
			}
		}
	}
	System.out.print(Arrays.toString(squares));
	return squares;
	} 

}