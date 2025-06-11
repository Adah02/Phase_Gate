import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class SentenceReverseTest{

	SentenceReverse phase = new SentenceReverse();

	@Test
	public void alphabetReplacementTest(){

	String check = "semicolon";

	char userChoice = 'c';

	String expected = "cemisolon";

	assertEquals(expected, phase.reverseAlphabetsIn(userChoice, check));
	}
}