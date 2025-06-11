import java.util.Arrays;
public class CorrespondingDigits {

	public static boolean isTheSame(String userInput){

	String words = userInput;

	String[] alphabets = new String[words.length()];
	int timesOfOccurence = 0;

	for (int index = 0; index < words.length(); index++){
		for (int count = 0; count < words.length(); count++){
			char alpha = words.charAt(index);
			if (alpha == words.charAt(count)){
			  timesOfOccurence += 1;
			}

		}
	
	} return alphabets;

	}
}