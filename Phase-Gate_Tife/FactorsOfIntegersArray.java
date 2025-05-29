public class FactorsOfIntegersArray {

	public static String factorsIn (int userInput){

	String factors = "";
	for (int index = 1; index <= userInput; index++){
	
		if(userInput % index == 0){
		factors += index + " ";
		}
	}
	System.out.print(factors);
	return factors;
	}
}