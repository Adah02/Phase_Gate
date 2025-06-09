import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class CreditCardValidatorTest {

	CreditCardValidator quiz = new CreditCardValidator();

	@Test
	public void checkForCardValidity() {

	String check = "4773437473784656";
	String expected = "Valid";

	assertEquals(expected, quiz.cardValidity(check));
	}

	@Test
	public void invalidCardCheck() {

	String check = "3273437473784656";
	String expected = "Invalid";

	assertEquals(expected, quiz.cardValidity(check));
	}

	@Test
	public void visaCardCheck() {

	String check = "4388 5760 1841 0707";
	String expected = "VisaCard";

	assertEquals(expected, quiz.creditCardType(check));
	}

	@Test
	public void checkForValidVisaCardValidityStatus() {

	String check = "4388 5760 1841 0707";
	String expected = "Valid";

	assertEquals(expected, quiz.validityStatus(check));
	}


	@Test
	public void masterCardCheck() {

	String check = "5399 5760 1261 2463";
	String expected = "MasterCard";

	assertEquals(expected, quiz.creditCardType(check));
	}

	@Test
	public void checkForValidMasterCardValidityStatus() {

	String check = "5399 2371 2539 2486";
	String expected = "Valid";

	assertEquals(expected, quiz.validityStatus(check));
	}

	@Test
	public void discoverCardCheck() {

	String check = "6481 5760 1261 2463";
	String expected = "DiscoverCard";

	assertEquals(expected, quiz.creditCardType(check));
	}

	@Test
	public void americanExpressCardCheck() {

	String check = "3781 5760 1261 2463";
	String expected = "AmericanExpressCard";

	assertEquals(expected, quiz.creditCardType(check));
	}

	@Test
	public void checkIfCardNumberIsTheSame() {

	String check = "4388 5760 1841 0707";
	String expected = "4388576018410707";

	assertEquals(expected, quiz.myCardNumber(check));
	}

	@Test
	public void checkForCardNumberLength() {

	String check = "477343747378465";
	int expected = 15;

	assertEquals(expected, quiz.cardNumberLength(check));
	}

}