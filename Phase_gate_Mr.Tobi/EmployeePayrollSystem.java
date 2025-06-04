import java.util.ArrayList;
import java.util.Scanner;
public class EmployeePayrollSystem {

	public static double[] payRoll (String employeeName, double workHours, double payRate, double federalTaxRate, double stateTaxRate){

		ArrayList<ArrayList<Double> > semicolonPayroll = new ArrayList<>();

		double grossPay = payRate * workHours;
		final double PERCENTAGE = 100;
		double federalWithholding = ((grossPay / PERCENTAGE) * federalTaxRate);
		double stateWithholding = ((grossPay / PERCENTAGE) * stateTaxRate);
		double totalDeduction = (federalWithholding + stateWithholding);
		double netPayment = (grossPay - totalDeduction);

		double[] semicolonPay = {workingHour, payRate, grossPay, federalWithholding, stateWithholding, totalDeduction, netPayment};

		boolean payrollList = true;
		int counter = 0;
		while (payrollList = true){
			for (int index = 0; index < semicolonPay.length; index++){
				semicolonPayroll[counter][index].add(semicolonPay[index]);
				}
				counter += 1;
			return semicolonPayroll;
			}
		
	}
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	ArrayList<ArrayList<Double> > semicolonPayroll = new ArrayList<>();

	String payroll = """
				Welcome to Semicolon Pay-roll
				press;-
				1. Add employee's pay-roll.
				2. View employee's pay-roll.
				3. Update employee's pay-roll.
						4. Exit.
				""";
	boolean payRollView = true;
	while (payRollView == true){

	System.out.print(payroll);
	System.out.print("Enter selection: ");
	int selection = input.nextInt();

	switch (selection){
		case 1: {
				boolean addPayroll = true;
				while (addPayroll == true){
					System.out.print("Enter employee's name: ");
					String employeeName = input.nextLine();
					
					System.out.print("Number of work hours per week: ");
					double workHours = input.nextDouble();

					System.out.print("Enter hourly pay-rate: ");
					double payRate = input.nextDouble();

					System.out.print("Enter federal withholding tax rate: ");
					double federalTaxRate = input.nextDouble();

					System.out.print("Enter state withholding tax rate: ");
					double stateTaxRate = input.nextDouble();

					payRoll(employeeName, workHours, payRate, federalTaxRate, stateTaxRate);

					System.out.print("Employee Pay-roll added =============>");
					addPayroll = false;
					} break;
				}
		case 2: {
				boolean viewPayroll = true;
				while (viewPayroll == true){
					System.out.print("Enter employee's name: ");
					String employeeName = input.nextLine();
					}
				}
		case 3:{
				boolean updatePayroll = true;
				while (updatePayroll == true){
					
					for (int index = 0; index < semicolonPayroll.size(); index++){
						for (int count = 0; count < semicolonPayroll[index].size(); count++){
							System.out.print("Enter employee's name: ");
							String employeeName = input.nextLine();
							if (employeeName == (semicolonPayroll[index][count])){
								System.out.print(semicolonPayroll);
								}
							}
						}

					}
				}
		case 4: {
				System.out.print("Good-Bye...");
				payRollView = false;
				} break;
		default : {
				System.out.print("Enter a valid option");
				payRollView = true;
				}
			}

		}
	}

}