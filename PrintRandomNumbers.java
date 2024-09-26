package randomNumbers;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PrintRandomNumbers {

	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please provide three digit number");
		int smallestNum = scanner.nextInt();
		
		int sortedNum[] = returnRandomNumbers();
	
		
		if (smallestNum <= 0 || smallestNum > 500) {
            System.out.println("Please enter a valid number between 1 and 500.");
        } else {
            // Print the Nth smallest number
            int nthSmallest = sortedNum[smallestNum - 1]; // n-1 for zero-based index
            System.out.println("The " + smallestNum + "th smallest number is: " + nthSmallest);
        }
        scanner.close();
       }

	public static int[] returnRandomNumbers()
	{
		Random rd = new Random();
		int[] randomNumbers = new int[500];
		for(int i=0;i<500;i++)
		{
			randomNumbers[i] = rd.nextInt(900) + 100; 
		}
		Arrays.sort(randomNumbers);
		
		for(int i=0;i<500;i++)
		{
			System.out.println(randomNumbers[i]);
		}
		return randomNumbers;
	}

}
