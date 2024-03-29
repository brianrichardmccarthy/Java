package multimediaProgramming.assignmentOne;

/*
 * Student Name: Brian McCarthy
 * Student Number: 20063914
 * Date: 12/1/2016
 * Program Name: SimpleDateProgram
 * */

public class SimpleDateProgram {
	public static void main(String args[]) {

		// 2.1

		// Using default constructor
		SimpleDate dateObject1 = new SimpleDate();

		// Using a constructor with a parameter list
		SimpleDate dateObject2 = new SimpleDate(1, 12, 1994);

		// Display the contents of the day field of both objects to the screen
		// using the toString() method.
		// Expected Date output is "1/1/2000"
		System.out.println(dateObject1.toString());
		// Expected Date output is "1/12/1994"
		System.out.println(dateObject2.toString());

		// 2.2
		// Using a default constructor to create a date object.
		SimpleDate dateObject3 = new SimpleDate();

		// Using the .getDay(), .getMonth() and .getYear() accessor methods,
		// display the contents of this object to the screen
		// Expected output is "Day: 1 Month: 1 Year: 2000"
		System.out.println("Day: " + dateObject3.getDay() + " Month: " + dateObject3.getMonth() + " Year: "
				+ dateObject3.getYear());

		// Set the date using .setDate() to March 20th 1980
		dateObject3.setDate(3, 20, 1980);
		// Expected output is "3/20/1980"
		System.out.println(dateObject3.toString());

		// Set the date using seperate mutator methods to 25th November, 1990
		dateObject3.setDay(25);
		dateObject3.setMonth(11);
		dateObject3.setYear(1990);

		// Display the current value of the date
		// Expected output is "11/25/1990"
		System.out.println(dateObject3.toString());

		// Use .nextDay() to increment the date
		dateObject3.nextDay();

		// Expected output is "11/26/1990"
		System.out.println(dateObject3.toString());
	}
}