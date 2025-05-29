import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
public class RotateImageTest {

	RotateImage quiz = new RotateImage();

	@Test
	public void testForRotateInArrayIntegers(){

	int[][] check = {{3,2,1},{6,5,4},{9,8,7}};

	int[][] expected = {{1,2,3},{4,5,6},{7,8,9}};

	assertArrayEquals(expected, quiz.isRotate(check));
	}

}