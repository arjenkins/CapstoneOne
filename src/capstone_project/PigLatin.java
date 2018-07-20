package capstone_project;

import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String userContinue;
		String userInput;
		String countLetter;
		String restOfLetters;
		String newWord;

		// do while loop, always runs the first time, then checks afterward

		System.out.println("Welcome. Let's learn Pig Latin!");
		do {
		System.out.println("Please enter a word to be translated into Pig Latin: ");
		userInput = scnr.next();

		// convert user input to lowercase letters
		userInput = userInput.toLowerCase();

		// find where the vowels are in program
		int firstVowel = findVowel(userInput);
		countLetter = userInput.substring(0, firstVowel);
		restOfLetters = userInput.substring(firstVowel);
		
		System.out.println("Below is the word you entered translated into Pig Latin.");
		if (firstVowel == 0) {
			System.out.println(userInput + "way");
		}
		else {
		newWord = restOfLetters + countLetter + "ay";
		System.out.println(newWord);
		}
		// prompt user to see if they wish to continue
		System.out.println("Would you like to continue? (y/n):");
		userContinue = scnr.next();
		 }  while (userContinue.equalsIgnoreCase("y"));

		System.out.println("Thank you for playing!");
		scnr.close();
	}

	public static int findVowel(String userInput) {
		int count = 0;
		for (int i = 0; i < userInput.length(); i++) {
			if (userInput.charAt(i) != 'a' && userInput.charAt(i) != 'e' && userInput.charAt(i) != 'i'
					&& userInput.charAt(i) != 'o' && userInput.charAt(i) != 'u') {
				count++;

			} else {

				break;
			}

		}
		return count;
	}

}