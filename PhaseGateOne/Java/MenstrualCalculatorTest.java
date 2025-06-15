import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;

public class MenstrualCalculatorTest {

	MenstrualCalculator quiz = new MenstrualCalculator();

	@Test
	public void calculatorCheckForDateOfPreviousFlow(){

	int day = 6;
	int month = 5;
	String expected = "2025-05-06";
	assertEquals(expected, quiz.previousFlowDate(month, day));
	}

	@Test
	public void calculatorCheckForDateOfNextFlowInTheSameMonth(){

	int day = 1;
	int month = 5;
	int nextMenst = 28;
	String expected = "2025-05-29";
	assertEquals(expected, quiz.nextMenstCycle(month, day, nextMenst));
	}

	@Test
	public void checkForDateOfNextFlowInDifferentMonth(){

	int day = 7;
	int month = 5;
	int nextMenst = 28;
	String expected = "2025-06-04";
	assertEquals(expected, quiz.nextMenstCycle(month, day, nextMenst));
	}

	@Test
	public void checkForDateOfNextFlowInDifferentYear(){

	int day = 7;
	int month = 12;
	int nextMenst = 28;
	String expected = "2026-01-04";
	assertEquals(expected, quiz.nextMenstCycle(month, day, nextMenst));
	}

	@Test
	public void checkForOvulationDateInTheSameMonth(){

	int day = 7;
	int month = 12;
	String expected = "2025-12-21";
	assertEquals(expected, quiz.ovulationDate(day, month));
	}

	@Test
	public void checkForOvulationDateInDifferentMonth(){

	int day = 25;
	int month = 5;
	String expected = "2025-06-08";
	assertEquals(expected, quiz.ovulationDate(day, month));
	}

	@Test
	public void checkForOvulationDateInDifferentYear(){

	int day = 27;
	int month = 12;
	String expected = "2026-01-10";
	assertEquals(expected, quiz.ovulationDate(day, month));

	}
}