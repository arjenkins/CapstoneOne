package capstone_project;

import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String userContinue;
		String userInput;
		String firstLetter;
		String restOfLetters;
		String newWord;

		// do while loop, always runs the first time, then checks afterward
	//	do {

			System.out.println("Welcome. Let's learn Pig Latin!");
			System.out.println("Please enter a word to be translated into Pig Latin: ");
			userInput = scnr.nextLine();

			// convert user input to lowercase letters
			userInput.toLowerCase();
			userInput = userInput.toLowerCase();

			
			// find where the vowels are in program
		 firstLetter = (userInput.substring(0, 1));
		 restOfLetters = (userInput.substring(1));

	
			 
	 System.out.println("Below is the word you entered translated into Pig Latin.");
			 newWord = restOfLetters + firstLetter + "ay";
			 System.out.println(newWord);

			// prompt user to see if they wish to continue
			System.out.println("Would you like to continue? (y/n):");
			userContinue = scnr.next();
//		} while (userContinue.equalsIgnoreCase("y"));

		System.out.println("Thank you for playing!");
		scnr.close();
	}
}
/*	public String findVowel(String userInput) {
		for (int i = 0; i < userInput.length(); i++) {
			if (userInput.charAt(i) == 'a') {
				System.out.println("Below is the word you entered translated into Pig Latin.");
				System.out.println(userInput + "way");

			} else if (userInput.charAt(i) == 'e') {
				System.out.println("Below is the word you entered translated into Pig Latin.");
				System.out.println(userInput + "way");

			} else if (userInput.charAt(i) == 'i') {
				System.out.println("Below is the word you entered translated into Pig Latin.");
				System.out.println(userInput + "way");

			} else if (userInput.charAt(i) == 'o') {
				System.out.println("Below is the word you entered translated into Pig Latin.");
				System.out.println(userInput + "way");

			} else if (userInput.charAt(i) == 'u') {
				System.out.println("Below is the word you entered translated into Pig Latin.");
				System.out.println(userInput + "way");

			} else if (userInput.charAt(i) == 'u')
				System.out.println("Below is the word you entered translated into Pig Latin.");
			System.out.println(userInput + "way");

		} */
		
	

