import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class CheckOutAppTest {

	CheckOutApp quiz = new CheckOutApp();

	@Test
	public void appCheckForTotalPurchaseAmount (){
	ArrayList<> price = new ArrayList<>(250, 350, 150, 150, 100);
	ArrayList<> quantity = new ArrayList<>(2, 1, 2, 1, 2)

	double expected = 1900.00;
	assertEquals(expected, quiz.totalPurchaseAmount (ArrayList<> price, ArrayList<> quantity))
	}
}