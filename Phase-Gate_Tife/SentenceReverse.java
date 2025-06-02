import java.util.Arrays;
public class SentenceReverse {

	public static String reverseAlphabetsIn(char userInput, String sentence){

	String letters = sentence;
	char firstAlpha = sentence.charAt(0);
	char[] characterCheck = new char[sentence.length()];
	char check = '0';

	for (int index = 0; index < sentence.length(); index++){
		characterCheck[index] = sentence.charAt(index);
		for (int count = 0; count < sentence.length(); count++){
			if (userInput == sentence.charAt(count)){
			characterCheck[0] = sentence.charAt(count);
			characterCheck[count] = firstAlpha;
			break;
			}
		}
	}	
		String refinedSentence = "";
	for (int counter = 0; counter < characterCheck.length; counter++){
		refinedSentence += characterCheck[counter];
	}

	return refinedSentence;
	}
	
}