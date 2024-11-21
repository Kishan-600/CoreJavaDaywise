package Game_Project;

import java.util.Scanner;
import java.util.Random;

class Kon_Banega_Vijeta {

	// Round questions and options
	static String[] javaQuestions = { "What is the default value of a local variable in Java?",
			"Which company developed Java?", "What is the size of an int in Java?",
			"What is the purpose of the 'final' keyword in Java?", "Which of the following is not a Java feature?" };

	static String[][] javaOptions = { { "1. null", "2. 0", "3. Depends on the data type", "4. No default value" },
			{ "1. Microsoft", "2. Sun Microsystems", "3. Oracle", "4. IBM" },
			{ "1. 8 bits", "2. 16 bits", "3. 32 bits", "4. 64 bits" },
			{ "1. Makes a variable unchangeable", "2. Used for inheritance", "3. Terminates a loop",
					"4. Marks a class as final" },
			{ "1. Object-oriented", "2. Portable", "3. Distributed", "4. Compiler-specific" } };

	static int[] javaCorrectAnswers = { 4, 2, 3, 1, 4 };

	static String[] htmlCssQuestions = { "Which HTML element is used to define a hyperlink?",
			"What does CSS stand for?", "Which property is used to change the background color in CSS?",
			"How can you make a list that is not ordered (i.e., without numbers)?",
			"Which HTML tag is used to display an image?" };

	static String[][] htmlCssOptions = { { "1. <a>", "2. <link>", "3. <img>", "4. <href>" },
			{ "1. Cascading Style Sheets", "2. Creative Style Sheets", "3. Computer Style Sheets",
					"4. Colorful Style Sheets" },
			{ "1. background-color", "2. color", "3. bg-color", "4. background" },
			{ "1. <ul>", "2. <ol>", "3. <li>", "4. <div>" },
			{ "1. <picture>", "2. <image>", "3. <img>", "4. <media>" } };

	static int[] htmlCssCorrectAnswers = { 1, 1, 1, 1, 3 };

	static String[] jsQuestions = { "Which of the following is a JavaScript data type?",
			"What is the correct way to write a JavaScript array?", "How do you declare a variable in JavaScript?",
			"Which symbol is used for comments in JavaScript?",
			"Which method is used to find an element by ID in JavaScript?" };

	static String[][] jsOptions = { { "1. Number", "2. Integer", "3. String", "4. Boolean" },
			{ "1. [1,2,3]", "2. (1,2,3)", "3. {1,2,3}", "4. <1,2,3>" },
			{ "1. var", "2. let", "3. const", "4. All of the above" }, { "1. //", "2. /* */", "3. <!-- -->", "4. #!" },
			{ "1. getElementById()", "2. getElement()", "3. querySelector()", "4. getById()" } };

	static int[] jsCorrectAnswers = { 1, 1, 4, 1, 1 };

	static boolean audienceUsed = false;
	static boolean fiftyFiftyUsed = false;

	public void startGame() {
		Scanner sc = new Scanner(System.in);

		// Collect Player Details
		
		System.out.println("Welcome to Kon Banega Wijeta!");
		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		sc.nextLine(); // Consume the newline
		System.out.print("Enter your address: ");
		String address = sc.nextLine();
		System.out.print("Enter your contact number: ");
		String contact = sc.nextLine();

		// Display Rules
		
		System.out.println("\nRules of the Game:");
		System.out.println("1. Each correct answer earns you ₹1000.");
		System.out.println("2. Game ends if you answer incorrectly.");
		System.out.println("3. Lifelines: Audience Poll and 50-50, used only once each.");
		System.out.println("\nLet's begin!");

		int totalMoney = 0;

		// Round 1: Java Questions
		
		totalMoney = startRound(javaQuestions, javaOptions, javaCorrectAnswers, sc, totalMoney, "Java");
		if (totalMoney == -1)
			return;

		// Ask if player wants to play next round (HTML/CSS)
		
		System.out.println("\nDo you want to play the next round (HTML/CSS)? (Yes/No)");
		sc.nextLine(); // Consume the newline
		String response = sc.nextLine();
		if (response.equalsIgnoreCase("No")) {
			System.out.println("Thank you for playing, " + name + "!");
			return;
		}

		// Round 2: HTML/CSS Questions
		
		totalMoney = startRound(htmlCssQuestions, htmlCssOptions, htmlCssCorrectAnswers, sc, totalMoney, "HTML/CSS");
		if (totalMoney == -1)
			return;

		// Ask if player wants to play next round (JavaScript)
		
		System.out.println("\nDo you want to play the next round (JavaScript)? (Yes/No)");
		sc.nextLine();    // Consume the newline
		response = sc.nextLine();
		if (response.equalsIgnoreCase("No")) {
			System.out.println("Thank you for playing, " + name + "!");
			return;
		}

		// Round 3: JavaScript Questions
		
		totalMoney = startRound(jsQuestions, jsOptions, jsCorrectAnswers, sc, totalMoney, "JavaScript");
		if (totalMoney == -1)
			return;

		System.out.println("\nCongratulations, " + name + "! You've completed all rounds with ₹" + totalMoney);
		System.out.println("Thank you for playing!");
		sc.close();
	}

	// Method for starting each round
	
	private int startRound(String[] questions, String[][] options, int[] correctAnswers, Scanner sc, int money,
			String roundName) {
		System.out.println("\nStarting " + roundName + " Round!");

		for (int i = 0; i < questions.length; i++) {
			System.out.println("\nQuestion " + (i + 1) + ": " + questions[i]);
			for (String option : options[i]) {
				System.out.println(option);
			}

			// Lifeline Options
			
			if (!audienceUsed || !fiftyFiftyUsed) {
				System.out.println("Would you like to use a lifeline? (1. Audience Poll, 2. 50-50, 3. No)");
				int lifelineChoice = sc.nextInt();

				if (lifelineChoice == 1 && !audienceUsed) {
					audienceLifeline(i);
					audienceUsed = true;
				} else if (lifelineChoice == 2 && !fiftyFiftyUsed) {
					fiftyFiftyLifeline(i);
					fiftyFiftyUsed = true;
				} else if (lifelineChoice == 3) {
					System.out.println("No lifeline used.");
				} else {
					System.out.println("Invalid or unavailable lifeline choice.");
				}
			}

			// Player's Answer
			
			System.out.print("Enter your answer (1-4): ");
			int answer = sc.nextInt();
			if (answer == correctAnswers[i]) {
				money += 1000;
				System.out.println("Correct! You've earned ₹" + money);
			} else {
				System.out.println("Wrong! The correct answer is: " + options[i][correctAnswers[i] - 1]);
				System.out.println("Game Over! You earned ₹" + money);
				return -1;
			}
		}
		return money;
	}

	// Audience Lifeline
	
	private void audienceLifeline(int questionIndex) {
		System.out.println("Audience Poll suggests: Option " + (questionIndex + 1)); // Randomized for simplicity
	}

	// 50-50 Lifeline
	
	private void fiftyFiftyLifeline(int questionIndex) {
		Random rand = new Random();
		int correctOption = questionIndex + 1;
		int incorrectOption;
		do {
			incorrectOption = rand.nextInt(4) + 1;
		} while (incorrectOption == correctOption);

		System.out.println("50-50 Lifeline: Remaining options are:");
		System.out.println("Correct answer: " + correctOption);
		System.out.println("One incorrect answer: " + incorrectOption);
	}
}

public class KBC {
	public static void main(String[] args) {
		Kon_Banega_Vijeta game = new Kon_Banega_Vijeta();
		game.startGame();
	}
}