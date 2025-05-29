import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class IndexOfLargestElementsTest {

	IndexOfLargestElements quiz = new IndexOfLargestElements();

	@Test
	public void checkForIndexOfLargestNumber(){

	double[] check = {3,2,9,1,6,0,8,7};

	int expected = 2;

	assertEquals(quiz.theIndexOfLargest(check), expected);
	}

}