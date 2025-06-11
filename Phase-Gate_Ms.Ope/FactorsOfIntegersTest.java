import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class FactorsOfIntegersTest {

	FactorsOfIntegersArray quiz = new FactorsOfIntegersArray();

	@Test
	public void testToDetectFactorsOfIntegers(){


	char check = 10;

	int expected = 1 2 5 10;

	assertEquals(expected, quiz.factorsIn(check));
	}

}