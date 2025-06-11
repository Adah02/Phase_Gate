public class LetterDetectorProgram {

	public static int numberOfTimesIn (String sentence, char userChoice){

	int counter = 0;

	for (int index = 0; index < sentence.length(); index++){
		if (userChoice.equalsToIgnoreCase(sentence.charAt(index))){
			counter += 1;
		}
	}
	System.out.print(counter);
	return counter;
	}
}