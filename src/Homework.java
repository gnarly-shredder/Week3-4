import java.util.ArrayList;
import java.util.jar.Attributes.Name;
public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 1.
		int[] ages = new int[8];
		ages[0] = 3;
		ages[1] = 9;
		ages[2] = 23;
		ages[3] = 64;
		ages[4] = 2;
		ages[5] = 8;
		ages[6] = 28;
		ages[7] = 93;
		
		int difference = lastMinusFirst(ages);
		System.out.println(difference);
		
		int avg = average(ages);
		System.out.println(avg);
		// 2.)
		String[] names = new String[6];
		names[0] = "Sam";
		names[1] = "Tommy";
		names[2] = "Tim";
		names[3] = "Sally";
		names[4] = "Buck";
		names[5] = "Bob";
		
		int avgLength = avgLetters(names);
		System.out.println(avgLength);
		
		printNames(names);
		// 5.)
		int[] nameLengths = getlengths(names);
		for (int number : nameLengths) {
			System.out.println(number);
		}
		// 6.)
		int nameTotals = allCharacters(nameLengths);
		System.out.println(nameTotals);
		// 7.)
		System.out.println(concatenator("Beetlejuice", 3));
		// 8.)
		System.out.println(fullName("Ethan", "Dahl"));
		// 9.)
		boolean isHundred = greaterThanHundred(ages);
		System.out.println(isHundred);
		// 10.)
		double[] dubs = {9.9, 9.9, 9.9, 3.3, 3.3, 3.3};
		System.out.println(avgDouble(dubs));
		// 11.)
		double[] dubs2 = {8.8, 8.8, 8.8, 2.2, 2.2, 2.2};
		System.out.println(biggerAverage(dubs, dubs2));
		// 12.)
		System.out.println(willBuyDrink(true, 9.3));
		// 13.)
		boolean[] prop13Votes = {false, false, true, false, true, true, false, false, false, true, true, true, true};
		System.out.println(electionResult(prop13Votes));
	}
	   
	
	
	// 1.) a
	public static int lastMinusFirst(int[] nums) {
		int result = nums[nums.length -1] - nums[0];
		return result;
		
	}
	// 1.) b
	public static int average(int[] nums) {
			int sum = 0;
					for (int num : nums) {
						sum += num;
						
			}
					return sum /nums.length;
	}
	// 2.) a
	public static int avgLetters(String[] names) {
		int sum = 0;
		for(String name : names) {
			int l = name.length();
					sum += l;
		}
		return sum / names.length;
	}
	// 2.) b
	public static void printNames(String[] names) {
		String k = " ";
		for (String j : names) {
			System.out.print(j+k);
		}
		
	}
	/* 3.) You can use a built in java method .length and subtract 1 from it.  
	 * Subtracting 1 from the total length gives a number that correlates to 
	 * the last number in an array indexes begin at 0 making the last index
	 * 1 less than the actual total number of indexes. 
	 * Example:  myArray.length -1. */
	 
	 /* 4.)  You can access the last index in an array using bracket notation.
	  * The first index in an array is always 0 so you place a 0 inside of the
	  * brackets to get the first index.  
	  * Example:  myArray[0]. */
	  
	  // 5.)
	public static int[] getlengths(String[] str) {
		int[] results = new int[str.length];
		for (int i = 0; i < str.length; i++) {
			results[i] = str[i].length();

		}
			
			return results;
			 
		}
	// 6.)
	public static int allCharacters(int[] sums) {
		int total = 0;
		for (int $ : sums) {
			
				total += sums[$];
		}
		return total;
	}
	// 7.)
	public static String concatenator(String word, int n) {
		String concatenated = "";
		
		for (int i = 0; i < n; i ++) {
			
			concatenated += word;
		}
		return concatenated;
		}
	// 8.)
	public static String fullName(String first, String last) {
		return first + " " + last;
	}
	// 9.)
	public static boolean greaterThanHundred(int[] nums) {
		int total = 0;
		for (int i = 0; i < nums.length; i++) {
			
			total += nums[i];
		}
		return total > 100;
	}
	// 10.)
	public static double avgDouble(double[] dubble) {
	// .length for type double[]???
			double total = 0;
		for (double num : dubble) {
			total += num;
			}
		return total / dubble.length;
		}
	// 11.)
	public static boolean biggerAverage(double[] a, double[] b) {
		double aTotal = 0;
		double bTotal = 0;
		for (double num : a) {
			aTotal +=  num;
		}
		for (double num : b) {
			bTotal += num;
		}
		if (aTotal / a.length > bTotal / b.length) {
			return true;
		}
		return false;
	}
	// 12.)
	public static boolean willBuyDrink(boolean isHot, double moneyInPocket) {
		if (isHot && moneyInPocket > 10.50) {
			return true;
		}
		return false;
	}
	// 13.)
	/* This method takes an array of booleans and returns a String.  
	 * The purpose of the method is to print the results of an election.
	 * Yes votes, represented as true in the array, are counted in a for-loop
	 * and stored in the variable yesVotes.  No votes are stored in the
	 * variable noVotes.  An if - else statement is used to compare results
	 * and display a different message for each of the three possible result 
	 * outcomes.*/
	
	public static String electionResult(boolean[] votes) {
		int yesVotes = 0;
		int noVotes = 0;
		for (boolean vote : votes) {
			if (vote == true) {
				yesVotes += 1;
			}
			else {
				noVotes += 1;
			}
		}
		if (yesVotes > noVotes) {
			return "The proposition has passed" + "\n" + "Yes Votes:  " + yesVotes + "\n" + "No Votes:  " + noVotes;
			
		} else if (noVotes > yesVotes){
			return "The proposition has failed" + "\n" + "Yes Votes:  " + yesVotes + "\n" + "No Votes:  " + noVotes;
		} else
		return "The vote has resulted in a tie." + "\n" + "Yes Votes:  " + yesVotes + "\n" + "No Votes:  " + noVotes;
	}
	
	
}

