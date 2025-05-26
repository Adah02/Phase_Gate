import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class StudentResultsTest{

	StudentsResults arrays = new StudentsResults();

	@Test
	public void testForSumOfStudentsScores(){

	double[][] check = {{5,7,3},{8,9,1}};
	double[] expected = {15,18};

	assertArrayEquals(arrays.studentsResultsSorting(check), expected);
	}

	

}