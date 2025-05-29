import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class LetterDetectorTest {

	LetterDetectorProgram quiz = new LetterDetectorProgram();

	@Test
	public void testToDetectNumberOfOccurence(){

	String sentence = "How are you doing";

	char check = 'o';

	int expected = 3;

	assertEquals(expected, quiz.numberOfTimesIn(sentence, check));
	}

}