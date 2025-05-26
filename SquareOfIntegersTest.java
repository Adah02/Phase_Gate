import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SquareOfIntegersTest{

	SquareOfAscendingValues arrays = new SquareOfAscendingValues();

	@Test
	public void testForSquareOfValuesInArray(){

	int[] check = {5,2,4,3,6};
	int[] expected = {4,9,16,25,36};

	assertArrayEquals(arrays.squareOfNumberIn(check), expected);
	}

}