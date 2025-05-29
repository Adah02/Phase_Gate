import java.util.Arrays;
public class RotateImage {

	public static int [][] isRotate(int[][] image){

	int[][] imageRotate = new int[image.length][image[0].length];

	int counter = 0;
	int rotate = 0;
	for (int index = image.length - 1; index >= 0 ; index--){
		rotate = image[index].length - 1;
		for (int count = 0; count < image[index].length; count++){
		imageRotate[counter][count] = image[rotate][counter];
		rotate -= 1;
		}
		counter += 1;
	}
	System.out.print(Arrays.deepToString(imageRotate));
	return imageRotate;
	}

}