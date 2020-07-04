package com.revature.eval.java.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EvaluationService {

	/**
	 * 1.A Speed Converter - Convert to MilesPerHour
	 * 
	 * Write a method called toMilesPerHour that has 1 parameter of type double with
	 * the name kilometersPerHour. This method needs to return the rounded value of
	 * the calculation of type long.
	 * 
	 * If the parameter kilometersPerHour is less than 0, the method toMilesPerHour
	 * needs to return -1 to indicate an invalid value.
	 * 
	 * Otherwise if it is positive, calculate the value of miles per hour, round it
	 * and return it. For conversion and rounding use Math.round().
	 */
	static class SpeedConverter {

		public static long toMilesPerHour(double kilometersPerHour) {
			// TODO Write an implementation for this method declaration
			if (kilometersPerHour < 0) {
				return -1;
			}
			else {
				System.out.println(kilometersPerHour * 0.6213711922);
				return (long)(Math.round(kilometersPerHour * 0.6213711922));
			}
		}

		/**
		 * 1.B Speed Converter - Print Conversion
		 * 
		 * Write another method called printConversion with 1 parameter of type double
		 * with the name kilometersPerHour. This method needs to return a String and
		 * needs to calculate milesPerHour from the kilometersPerHour parameter.
		 * 
		 * The String should print in the format: "XX km/h = YY mi/h"
		 * 
		 * XX represents the original value kilometersPerHour. YY represents the rounded
		 * milesPerHour from the kilometersPerHour parameter.
		 * 
		 * If the parameter kilometersPerHour is < 0, then print the text "Invalid
		 * Value"
		 */
		public static String printConversion(double kilometersPerHour) {
			// TODO Write an implementation for this method declaration
			if (kilometersPerHour < 0) {
				return "Invalid Value";
			}
			long mph = toMilesPerHour(kilometersPerHour);
			String string = kilometersPerHour +" km/h = "+ mph +" mi/h";
			return string;
		}
	}

	/**
	 * 2. MegaBytes and KiloBytes
	 * 
	 * Write a method called printMegaBytesAndKiloBytes that has 1 parameter of type
	 * int with the name kiloBytes.
	 * 
	 * The method should return a String and it needs to calculate the megabytes and
	 * remaining kilobytes from the kilobytes parameter.
	 * 
	 * Then it needs to print a message in the format "XX KB = YY MB and ZZ KB".
	 * 
	 * XX represents the original value kiloBytes. YY represents the calculated
	 * megabytes. ZZ represents the calculated remaining kilobytes.
	 * 
	 * For examples, when the parameter kiloBytes is 2500 it needs to print "2500 KB
	 * = 2 MB and 452 KB"
	 * 
	 * If the parameter kiloBytes is less than 0 then print the text "Invalid
	 * Value".
	 */
	public String printMegaBytesAndKiloBytes(int XX) {
		// TODO Write an implementation for this method declaration
		if (XX < 0) {
			return "Invalid Value";
		}
		else
		{
			int mb = XX / 1024;
			int kb = XX % 1024;  // KB left over
			return (XX + " KB = " + mb + " MB and " + kb + " KB");
		}
	}

	/**
	 * 3. Barking Dog
	 * 
	 * We have a dog that loves to bark. We need to wake up if the dog is barking at
	 * night!
	 * 
	 * Write a method shouldWakeUp that has 2 parameters.
	 * 
	 * 1st parameter should be of type boolean and be named "barking". It represents
	 * if our dog is currently barking. 2nd parameter represents the hour of the day
	 * and is of type int with the name hourOfDay and has a valid range of 0-23.
	 * 
	 * We have to wake up if the dog is barking before 8 or after 22 hours, so in
	 * that case return true.
	 * 
	 * In all other cases return false.
	 * 
	 * If the hourOfDay parameter is less than 0 or greater than 23, return false.
	 */
	public boolean shouldWakeUp(boolean isBarking, int hourOfDay) {
		// TODO Write an implementation for this method declaration
		if ( (isBarking && (hourOfDay >=0)) && ( (hourOfDay > 22) || (hourOfDay < 8) ) ) 
		{
		  return true;
		}
		else 
		{
		  return false;
		}
	}

	/**
	 * 4. DecimalComparator
	 * 
	 * Write a method areEqualByThreeDecimalPlaces with two parameters of type
	 * double.
	 * 
	 * The method should return boolean and it needs to return true if two double
	 * numbers are the same up to three decimal places.
	 * 
	 * Otherwise, return false;
	 */
	public boolean areEqualByThreeDecimalPlaces(double firstNum, double secondNum) {
		// TODO Write an implementation for this method declaration
		int fn = (int) (1000 * firstNum);
		int sn = (int) (1000 * secondNum);
		if (fn == sn) {
			return true;
		}
		else
		{
			return false;
		}
	}

	/**
	 * 5. Teen Number Checker
	 * 
	 * We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).
	 * Write a method named hasTeen with 3 parameters of type int.
	 * 
	 * The method should return boolean and it needs to return true if ONE of the
	 * parameters is in range 13(inclusive) - 19 (inclusive). Otherwise return
	 * false.
	 */
	static class TeenNumberChecker {

		public static boolean hasTeen(int x, int y, int z) {
			// TODO Write an implementation for this method declaration
			if (isTeen(x) || isTeen(y) || isTeen(z)) {
				return true;
			} 
			else {
			    return false;
			}
		}

		// We can initialize isTeen method first
		// Then pass the parameter to hasTeen method

		public static boolean isTeen(int number) {
			// TODO Write an implementation for this method declaration
			if ((number > 12) && (number < 20)) {
				return true;
			}
			else {
			    return false;
			}
		}
	}

	/**
	 * 6. Minutes To Years and Days Calculator
	 * 
	 * Write a method printYearsAndDays with parameter of type long named minutes.
	 * The method should not return anything (void) and it needs to calculate the
	 * years and days from the minutes parameter.
	 * 
	 * If the parameter is less than 0, print text "Invalid Value".
	 * 
	 * Otherwise, if the parameter is valid then it needs to print a message in the
	 * format "XX min = YY y and ZZ d".
	 * 
	 * XX represents the original value minutes. YY represents the calculated years.
	 * ZZ represents the calculated days.
	 */
	public String printYearsAndDays(long minutes) {
		// TODO Write an implementation for this method declaration
		String result;
		if (minutes >= 0) {
			// 1440 = 60 * 24 = minutes in a day
			int totalDays = (int) (minutes / 1440);
			int years = totalDays/365;
			int days = totalDays - (years * 365);
			System.out.println (minutes + " min = "+ years +" y and "+ days +" d");
			return (minutes + " min = "+ years +" y and "+ days +" d");
		}
		else
		{
			System.out.println ("Invalid Value");
			return ("Invalid Value");
		}
	}

	/**
	 * 7. Number In Word
	 * 
	 * Write a method called printNumberInWord. The method has one parameter number
	 * which is the whole number. The method needs to print "ZERO", "ONE", "TWO",
	 * ... "NINE", "OTHER" if the int parameter number is 0, 1, 2, .... 9 or other
	 * for any other number including negative numbers. You can use if-else
	 * statement or switch statement whatever is easier for you.
	 */
	public String printNumberInWord(int number) {
		// TODO Write an implementation for this method declaration
		switch (number) {
		case 0:
			return "ZERO";
			//break;
		case 1:
			return "ONE";
			//break;
		case 2:
			return "TWO";
			//break;
		case 3:
			return "THREE";
			//break;
		case 4:
			return "FOUR";
			//break;
		case 5:
			return "FIVE";
			//break;
		case 6:
			return "SIX";
			//break;
		case 7:
			return "SEVEN";
			//break;
		case 8:
			return "EIGHT";
			//break;
		case 9:
			return "NINE";
			//break;
		default:
			return "OTHER";
		}
	}

	/**
	 * 8. Greatest Common Divisor
	 * 
	 * Write a method named getGreatestCommonDivisor with two parameters of type int
	 * named first and second.
	 * 
	 * If one of the parameters is < 10, the method should return -1 to indicate an
	 * invalid value. The method should return the greatest common divisor of the
	 * two numbers (int).
	 * 
	 * The greatest common divisor is the largest positive integer that can fully
	 * divide each of the integers (i.e. without leaving a remainder).
	 * 
	 * For example 12 and 30: 12 can be divided by 1, 2, 3, 4, 6, 12 30 can be
	 * divided by 1, 2, 3, 5, 6, 10, 15, 30
	 * 
	 * The greatest common divisor is 6 since both 12 and 30 can be divided by 6,
	 * and there is no resulting remainder.
	 */
	public int getGreatestCommonDivisor(int first, int second) {
		// TODO Write an implementation for this method declaration
		int smallest;
		int largest;
		
		if (first < second) {
			smallest = first;
			largest = second;
		} else {
			smallest = second;
			largest = first;
		}
		// Check for invalid values
		if (smallest < 10) {
			return -1;
		}
		
		int gcd = largest / 2;  // GCD cannot be more than 1/2 of largest value.
		while (gcd > 1) {
			if ((smallest % gcd == 0) && (largest % gcd == 0)) {
				return gcd;
			}
			gcd--;
		}
		return gcd;
	}

	/**
	 * 9. First and Last Digit Sum
	 * 
	 * Write a method named sumFirstAndLastDigit with one parameter of type int
	 * called number.
	 * 
	 * The method needs to find the first and the last digit of the parameter number
	 * passed to the method, using a loop and return the sum of the first and the
	 * last digit of that number.
	 * 
	 * If the number is negative then the method needs to return -1 to indicate an
	 * invalid value.
	 */
	public int sumFirstAndLastDigit(int num) {
		// TODO Write an implementation for this method declaration

		if (num < 0) {
			return -1;
		}
		int firstDigit;
		int lastDigit;
		int tmpNum = num;
		int lastDigitsPlace=1;
		firstDigit = num - (num/10)*10;  // First digit known
		
		// keep growing the last digits place holder
		tmpNum /= 10;
		while( tmpNum != 0) {
			lastDigitsPlace *= 10;
			tmpNum /= 10;
		}
		lastDigit = num / lastDigitsPlace;  // Last digit known
		
		return lastDigit + firstDigit;
	}

	/**
	 * 10. Reverse String
	 * 
	 * Without using the StringBuilder or StringBuffer class, write a method that
	 * reverses a String. Example: reverse("example"); -> "elpmaxe"
	 */
	public String reverse(String string) {
		// TODO Write an implementation for this method declaration
		char[] retStrOfChar = new char[string.length()];
		
		int j = 0;
		for(int i = string.length()-1; i>= 0; i--) {
			retStrOfChar[j] = string.charAt(i);
			j++;
		}
		String ss = new String(retStrOfChar);
		return ss;
	}

	/**
	 * 11. Acronyms
	 * 
	 * Convert a phrase to its acronym. Techies love their TLA (Three Letter
	 * Acronyms)! Help generate some jargon by writing a program that converts a
	 * long name like Portable Network Graphics to its acronym (PNG).
	 */
	public String acronym(String phrase) {
		// TODO Write an implementation for this method declaration
		String[] spltStr = phrase.split("[ -]");
		StringBuilder retVal = new StringBuilder();
	    for (int i=0;i<spltStr.length;i++) {
	    	System.out.println(Character.toUpperCase(spltStr[i].charAt(0)));
	    	retVal.append(Character.toUpperCase(spltStr[i].charAt(0)));
	    }		
		return retVal.toString();
	}

	/**
	 * 12. Triangles
	 * 
	 * Determine if a triangle is equilateral, isosceles, or scalene. An equilateral
	 * triangle has all three sides the same length. An isosceles triangle has at
	 * least two sides the same length.
	 * 
	 * (It is sometimes specified as having exactly two sides the same length, but
	 * for the purposes of this exercise we'll say at least two.) A scalene triangle
	 * has all sides of different lengths.
	 */
	static class Triangle {
		private double sideOne;
		private double sideTwo;
		private double sideThree;

		public Triangle() {
			super();
		}

		public Triangle(double sideOne, double sideTwo, double sideThree) {
			this();
			this.sideOne = sideOne;
			this.sideTwo = sideTwo;
			this.sideThree = sideThree;
		}

		public double getSideOne() {
			return sideOne;
		}

		public void setSideOne(double sideOne) {
			this.sideOne = sideOne;
		}

		public double getSideTwo() {
			return sideTwo;
		}

		public void setSideTwo(double sideTwo) {
			this.sideTwo = sideTwo;
		}

		public double getSideThree() {
			return sideThree;
		}

		public void setSideThree(double sideThree) {
			this.sideThree = sideThree;
		}

		public boolean isEquilateral() {
			// TODO Write an implementation for this method declaration
			if ((getSideThree() == getSideTwo()) && (getSideOne() == getSideTwo())) {
				return true;
			}else {
				return false;
			}
		}

		public boolean isIsosceles() {
			// TODO Write an implementation for this method declaration
			if ((getSideOne() == getSideTwo()) || (getSideOne() == getSideThree()) || (getSideTwo() == getSideThree())) {
				return true;
			}
			else 
			{
				return false;
			}
		}

		public boolean isScalene() {
			// TODO Write an implementation for this method declaration
			if ((getSideOne() != getSideTwo()) && 
					(getSideOne() != getSideThree()) && 
					(getSideTwo() != getSideThree())) {
					return true;
				}
			    else 
				{
					return false;
				}
     	}
	}
	/**
	 * 13. Scrabble Score
	 * 
	 * Given a word, compute the scrabble score for that word.
	 * 
	 * --Letter Values-- Letter Value A, E, I, O, U, L, N, R, S, T = 1; D, G = 2; B,
	 * C, M, P = 3; F, H, V, W, Y = 4; K = 5; J, X = 8; Q, Z = 10; Examples
	 * "cabbage" should be scored as worth 14 points:
	 * 
	 * 3 points for C, 1 point for A, twice 3 points for B, twice 2 points for G, 1
	 * point for E And to total:
	 * 
	 * 3 + 2*1 + 2*3 + 2 + 1 = 3 + 2 + 6 + 3 = 5 + 9 = 14
	 */
	public int getScrabbleScore(String string) {
		// TODO Write an implementation for this method declaration
	    String onePoint = "AEIOULNRSTaeioulnrst";
	    String twoPoint = "DGdg";
	    String threePoint = "BCMPbcmp";
	    String fourPoint = "FHVWYfhvwy";
	    String fivePoint = "Kk";
	    String eightPoint = "Xx";
	    String tenPoint = "QZqz";

	    int score = 0;
	    for(int i = 0; i < string.length();i++) {
	    	if (onePoint.indexOf(string.charAt(i)) > -1 ) {
	    		score += 1;
	    	}
	    	else if(twoPoint.indexOf(string.charAt(i)) > -1 ) {
	    		score += 2;
	    	}
	    	else if(threePoint.indexOf(string.charAt(i)) > -1 ) {
	    		score += 3;
	    	}
	    	else if(fourPoint.indexOf(string.charAt(i)) > -1 ) {
	    		score += 4;
	    	}
	    	else if(fivePoint.indexOf(string.charAt(i)) > -1 ) {
	    		score += 5;
	    	}
	    	else if(eightPoint.indexOf(string.charAt(i)) > -1 ) {
	    		score += 8;
	    	}
	    	else if(tenPoint.indexOf(string.charAt(i)) > -1 ) {
	    		score += 10;
	    	}
	    	else {
	    		score += 1000; // Shouldn't happen
	    	}
	    }		
	    return score;
	}

	/**
	 * 14. Clean the Phone Number
	 * 
	 * Clean up user-entered phone numbers so that they can be sent SMS messages.
	 * 
	 * The North American Numbering Plan (NANP) is a telephone numbering system used
	 * by many countries in North America like the United States, Canada or Bermuda.
	 * All NANP-countries share the same international country code: 1.
	 * 
	 * NANP numbers are ten-digit numbers consisting of a three-digit Numbering Plan
	 * Area code, commonly known as area code, followed by a seven-digit local
	 * number. The first three digits of the local number represent the exchange
	 * code, followed by the unique four-digit number which is the subscriber
	 * number.
	 * 
	 * The format is usually represented as
	 * 
	 * 1 (NXX)-NXX-XXXX where N is any digit from 2 through 9 and X is any digit
	 * from 0 through 9.
	 * 
	 * Your task is to clean up differently formatted telephone numbers by removing
	 * punctuation and the country code (1) if present.
	 * 
	 * For example, the inputs
	 * 
	 * +1 (613)-995-0253 613-995-0253 1 613 995 0253 613.995.0253 should all produce
	 * the output
	 * 
	 * 6139950253
	 * 
	 * Note: As this exercise only deals with telephone numbers used in
	 * NANP-countries, only 1 is considered a valid country code.
	 */
	public String cleanPhoneNumber(String pString) {
	    String nDigits = "23456789";
	    String xDigits = "0123456789";
	    String allValidDigits = xDigits + " .()-";
	    StringBuilder phoneNum = new StringBuilder();

	    int phoneDigitsFound = 0;
	    char pDigit;
	    int wordLen = pString.length();
	    for(int i = 0; i < wordLen;i++) {
	    	pDigit = pString.charAt(i);
	    	// The 1st and the 4th digit are N-Digits
	    	if ( ((phoneDigitsFound == 0) || (phoneDigitsFound == 3)) && ((nDigits.indexOf(pDigit)) > -1 )) {
	    		//
	    		phoneNum.append(pDigit);
	    		++phoneDigitsFound;
	    	}
	    	// All other valid digits other than 1st and 4th are X-Digits
	    	else if ( !((phoneDigitsFound == 0) || (phoneDigitsFound == 3)) && ((xDigits.indexOf(pDigit)) > -1 )) {
	    		phoneNum.append(pDigit);
	    		++phoneDigitsFound;
	    	}
	    	else if (!((allValidDigits.indexOf(pDigit)) > -1 )) {
	    		// Throw and exception if invalid data is found
	    		throw new IllegalArgumentException("Invalid character (" + pDigit + ")");
	    	}
	    }
	    if ( phoneNum.length() != 10 ) {
    		// Throw and exception if invalid data is found
    		throw new IllegalArgumentException("Phone number digits not convertable to NXX-NXX-XXXX, num valid digits is (" + phoneNum.length() + ")");
	    }
	    	//System.out.println("PhoneNumber: "+phoneNum);
		return phoneNum.toString();
	}

	/**
	 * 15. Recurring Word Counter
	 * 
	 * Given a phrase, count the occurrences of each word in that phrase.
	 * 
	 * For example for the input "olly olly in come free" olly: 2 in: 1 come: 1
	 * free: 1
	 */
	public Map<String, Integer> wordCount(String string) {
		// TODO Write an implementation for this method declaration
		Pattern p = Pattern.compile("[a-zA-Z]+");
		Matcher match = p.matcher(string);
		//System.out.println("Words from string \"" + string + "\"\n"); 
		Integer count;
		HashMap<String, Integer> freqWd = new HashMap<String, Integer>();
		
		while (match.find()) {
			String word = match.group();
			System.out.println(word);
			if (freqWd.containsKey(word)) {
				count = freqWd.get(word) + 1;
				freqWd.put(word, count);
			}else {
				freqWd.put(word, 1);
			}
		}
		return freqWd;
	}

	/**
	 * 16. Armstrong Number
	 * 
	 * An Armstrong number is a number that is the sum of its own digits each raised
	 * to the power of the number of digits.
	 * 
	 * For example:
	 * 
	 * 9 is an Armstrong number, because 9 = 9^1 = 9 10 is not an Armstrong number,
	 * because 10 != 1^2 + 0^2 = 2 153 is an Armstrong number, because: 153 = 1^3 +
	 * 5^3 + 3^3 = 1 + 125 + 27 = 153 154 is not an Armstrong number, because: 154
	 * != 1^3 + 5^3 + 4^3 = 1 + 125 + 64 = 190 Write some code to determine whether
	 * a number is an Armstrong number.
	 */
	public boolean isArmstrongNumber(int input) {
		  int temp = input;
		  int num = temp;
		  int sum = 0;
		  int digit;
		  String sInput = String.valueOf(input);  // to find length of number.
		  int power = sInput.length();			// create power to raise numbers to
		  int pwrValue;							// Used to calculate the power value for each digit
		  
		  while(num > 0) {
			  digit = num % 10;  // Strip first digit (LSV)
			  num /= 10; 		 // Shrink Num by 1 digit (LSV) for next pass
			  
			  pwrValue = digit;	 // Gives me the ^1 value
			  for(int i=1; i<power;i++) {
				  pwrValue *= digit;  // Gives me the powers 2+ digit input values
			  }
			  sum += pwrValue;
		  }
	      
		  if (sum == input) {
			  //System.out.println("TRUE\n");
			  return true;
		  } else {
			  //System.out.println("FALSE\n");
			  return false;
		  }
	}

	/**
	 * 17. Prime Factors
	 * 
	 * Compute the prime factors of a given natural number. A prime number is only
	 * evenly divisible by itself and 1.
	 * 
	 * Note that 1 is not a prime number.
	 */
	public List<Long> calculatePrimeFactorsOf(long ln) {
		// TODO Write an implementation for this method declaration
		  ArrayList<Long> list=new ArrayList<Long>();
		  
	      // Print the number of 2s that divide n 
	      while (ln % 2 == 0) { 
	          System.out.print(2 + " ");
	          list.add(2L);
	          ln /= 2; 
	      } 

	      // n must be odd at this point.  So we can 
	      // skip one element (Note i = i +2) 
	      for (int i = 3; i <= Math.sqrt(ln); i += 2) { 
	          // While i divides n, print i and divide n 
	          while (ln % i == 0) { 
	              System.out.print(i + " ");
	              list.add(Long.valueOf(i));
	              ln /= i; 
	          } 
	      } 

	      // This condition is to handle the case whien 
	      // n is a prime number greater than 2 
	      if (ln > 2) {
	          System.out.print(ln); 
	          list.add(Long.valueOf(ln));
	      }
		return list;
	}

	/**
	 * 18. Calculate Nth Prime
	 * 
	 * Given a number n, determine what the nth prime is.
	 * 
	 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
	 * that the 6th prime is 13.
	 * 
	 * If your language provides methods in the standard library to deal with prime
	 * numbers, pretend they don't exist and implement them yourself.
	 */
	public int calculateNthPrime(int k) {
		// TODO Write an implementation for this method declaration
		if (k < 1) {
			throw new IllegalArgumentException("Invalid argument (" + k + ")");
		}
		int num = 1;
		int count = 0;
		int i;  // needed also outside of for loop

		while (count < k){
			num += 1;
			for (i = 2; i <= num; i++){ //Here we will loop from 2 to num
				if (num % i == 0) {
					break;
				}
			}
			// To shorten time in finding a prime number dividing by numbers greater than
			// 1/2 of the number doesn't help any.
			if (i == (num/2)) {
				i = num - 1;
			}

			if ( i == num){             //if it is a prime number
				count += 1;
			}
		}

		return num;
	}

	/**
	 * 19. Pangram
	 * 
	 * Determine if a sentence is a pangram. A pangram (Greek: παν γράμμα, pan
	 * gramma, "every letter") is a sentence using every letter of the alphabet at
	 * least once. The best known English pangram is:
	 * 
	 * The quick brown fox jumps over the lazy dog.
	 * 
	 * The alphabet used consists of ASCII letters a to z, inclusive, and is case
	 * insensitive. Input will not contain non-ASCII symbols.
	 */
	public boolean isPangram(String string) {
		// TODO Write an implementation for this method declaration
		  string = string.toLowerCase();
		  System.out.println(string);
		  
		  char c = 'a';
		  //System.out.println("("+(char)(c+1)+")");
		  boolean pangram = true; // It is a panagram until proven otherwise.
		  for(int i=0; i<26;i++) {
			  if (string.indexOf((char)(c+i)) < 0) {
				  pangram = false;
				  break;
			  }
		  }
		return pangram;
	}

	/**
	 * 20. Sum of Multiples 
	 * 
	 * Given a number, find the sum of all the unique multiples of particular
	 * numbers up to but not including that number.
	 * 
	 * If we list all the natural numbers below 20 that are multiples of 3 or 5, we
	 * get 3, 5, 6, 9, 10, 12, 15, and 18.
	 * 
	 * The sum of these multiples is 78.
	 */
	public int getSumOfMultiples(int limit, int[] set) {
		
		HashSet<Integer> multiples = new HashSet<Integer>();
		for (int i=0; i < set.length; i++) {
			int m = set[i];
			while(m < limit) {
				multiples.add(m);
				m += set[i];
			}
		}
		
		int sumMultiples = 0;
		for (Integer i : multiples) {
			sumMultiples += i;
		}
		return sumMultiples;
	}
	
	/**
	 * 21. Three Magic Numbers
	 * 
	 * You work at a casino in Las Vegas.  Your job is to program a slot machine to
	 * return 3 random numbers using the java.util.Random class.
	 * 
	 * Write a method to return an int array of 3 random numbers between 1 - 100.
	 * Generate the 3 random numbers (1 - 100 inclusive) using the java.util.Random class.
	 */
	
	public int[] threeLuckyNumbers() {
		int[] luckyNums = new int[3];

		for(int i = 0;i<luckyNums.length;i++) {
			luckyNums[i] = ((int)(Math.random() * 101));
		}
		return luckyNums;
	}
	
	/*
	 * 22. Easy Guessing Game
	 * 
	 * Create a program to generate a number between the given range:
	 * int x = minimum
	 * iny y = maximum (inclusive)
	 * 
	 * You must use the Math.random class to generate a random number between x and y.
	 */
	
	public int guessingGame(int lowerBound, int upperBound) {
		return  (int)(Math.random() * ((upperBound - lowerBound) + 1) + lowerBound);
	}
}
