import java.util.Scanner;
import java.util.Calendar;
import java.time.LocalDate;
public class MenstrualCalculator {
	
	public static String previousFlowDate(int menstMonth, int prevDay){
	Calendar calendar = Calendar.getInstance();

	int year = calendar.get(Calendar.YEAR);
	LocalDate flowDate = LocalDate.of(year, menstMonth, prevDay);

	String lastFlowDate = flowDate.toString();
	return lastFlowDate;
	}

	public static String nextMenstCycle(int menstMonth, int prevDay, int nextMenst){
	Calendar calendar = Calendar.getInstance();

	int year = calendar.get(Calendar.YEAR);
	LocalDate flowDate = LocalDate.of(year, menstMonth, prevDay);
	int monthLength = flowDate.lengthOfMonth();
	int remainingDays = (monthLength - prevDay);

	if (nextMenst > remainingDays && menstMonth != 12){
		nextMenst -= remainingDays; menstMonth += 1;
	}else if (menstMonth == 12 && nextMenst > remainingDays){
		nextMenst -= remainingDays; menstMonth = 1; year += 1;
	}else{
		nextMenst += prevDay;
		}
	LocalDate nextMenstruation = LocalDate.of(year, menstMonth, nextMenst);
	String nextFlowDate = nextMenstruation.toString();
	return nextFlowDate;
	}

	public static String ovulationDate (int prevDay, int menstMonth){
	
	Calendar calendar = Calendar.getInstance();

	int year = calendar.get(Calendar.YEAR);
	LocalDate today = LocalDate.of(year, menstMonth, prevDay);

	int ovulationDay = prevDay + 14;
	int daysLeft = today.lengthOfMonth() - prevDay;

	if (ovulationDay > daysLeft && menstMonth != 12){
		ovulationDay = 14 - daysLeft;  menstMonth += 1;
	} else if (ovulationDay > daysLeft && menstMonth == 12){
		ovulationDay = 14 - daysLeft;  menstMonth = 1;  year += 1;
	}
	LocalDate ovulation = LocalDate.of(year, menstMonth, ovulationDay);
	String ovulationDate = ovulation.toString();
	return ovulationDate;
	}

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter Month of last Menstruation: ");
	int menstMonth = input.nextInt();

	System.out.print("Enter Day of last Menstruation: ");
	int prevDay = input.nextInt();
	
	System.out.print("Enter Days before next cycle: ");
	int nextMenst = input.nextInt();
	
	System.out.println();
	System.out.println("Date of previous flow is " + previousFlowDate(menstMonth, prevDay));
	System.out.println("Next ovulation is " + ovulationDate (prevDay, menstMonth));
	System.out.println("Date of next menstruation is " + nextMenstCycle(menstMonth, prevDay, nextMenst));
	}
}

