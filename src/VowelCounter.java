import java.util.Scanner;
public class VowelCounter {
	static String word = "";
	public static void main(String[] args) 
		{
		askWord();
		vowelCount();
		}

	private static void askWord() {
		Scanner userStringInput = new Scanner(System.in);
		System.out.println("Enter a word please.");
		word = userStringInput.nextLine();
		
			
	}

	private static void vowelCount() {
		int count = 0;
		String lowerWord = word.toLowerCase();
		String [] letters = lowerWord.split("");
		for(int i = 0; i< lowerWord.length(); i ++)
		{
			switch(letters[i])
			{
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
				count++;
				break;
				}
			}
		System.out.println("Total Vowels: "+count+".");
		}
	
	
	}
