package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[]names = {"Derek", "Cody", "Dylan", "Dean", "Oliver"};
		
		//2. print the third element in the array
		System.out.println(names[2]);
		//3. set the third element to a different value
		names[2] = "Tanner";
		//4. print the third element again
		System.out.println(names[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		//6. make an array of 50 integers
		int[] randomNumbers = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		Random random = new Random();
		for (int i = 0; i < randomNumbers.length; i++) {
			randomNumbers[i] = random.nextInt(randomNumbers.length+1);
		}
		int bruh = 50;
		//8. without printing the entire array, print only the smallest number in the array
		for (int i = 0; i < randomNumbers.length; i++) {
		if(randomNumbers[i]<bruh) {
			bruh=randomNumbers[i];
			
		}
		
		}
		System.out.println(bruh);
		bruh = 0;
		//9 print the entire array to see if step 8 was correct
		for (int i = 0; i < randomNumbers.length; i++) {
			if (randomNumbers[i]>bruh) {
				bruh=randomNumbers[i];
			}
		
		
		}
		System.out.println(bruh);
		//10. print the largest number in the array.
		
	}
}
