package SamplePackages;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Sample_001 {

	public static void main(String[] args) {
		
		   Set<Integer> numberSet = new HashSet<>();
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.print("Enter a number to add to the set (or enter 'q' to quit): ");
	            String userInput = scanner.nextLine();

	            if (userInput.equalsIgnoreCase("q")) {
	                break;
	            }

	            try {
	                int number = Integer.parseInt(userInput);
	                addNumber(number, numberSet);
	            } catch (NumberFormatException e) {
	                System.out.println("Invalid input. Please enter a valid number or 'q' to quit.");
	            }
	        }

	        scanner.close();
	    }

	    public static void addNumber(int number, Set<Integer> numberSet) {
	        if (numberSet.contains(number)) {
	            System.out.println("Error: " + number + " already exists in the set.");
	        } else {
	            numberSet.add(number);
	            System.out.println(number + " added to the set successfully.");
	        }

	}

}
