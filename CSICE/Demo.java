package CSICE;

import java.util.Scanner;

/*
 * Due to the ambiguity of the prompt we were given, our driver class
 * is very repetitive and filled with hardcode, since the nature of the
 * prompt requires that there already be preset residents in the system
 * of different object types. 
 */

public class Demo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		Student bob = new Student("Bob", "2038578");
		Student sarah = new Student("Sarah", "2983442");
		RA christina = new RA("Christina", "29652935", true);
		RA ryan = new RA("Ryan", "9529002", true); 
		Custodian ben = new Custodian("Ben", true); 
		
		System.out.println("Have you met " + bob.getName() + "? (yes/no)");
		String answer = scan.next(); 
		if ((answer.equalsIgnoreCase("yes")) || (answer.equalsIgnoreCase("y"))){
			bob.setMeet(true); 
		} else {
			bob.setMeet(false);
		}
		System.out.println("Have you met " + sarah.getName() + "?");
		answer = scan.next(); 
		if ((answer.equalsIgnoreCase("yes")) || (answer.equalsIgnoreCase("y"))){
			sarah.setMeet(true); 
		} else {
			sarah.setMeet(false);
		}
		System.out.println("Have you met " + christina.getName() + "?");
		answer = scan.next(); 
		if ((answer.equalsIgnoreCase("yes")) || (answer.equalsIgnoreCase("y"))){
			christina.setMeet(true); 
		} else {
			christina.setMeet(false);
		}
		System.out.println("Have you met " + ryan.getName() + "?");
		answer = scan.next(); 
		if ((answer.equalsIgnoreCase("yes")) || (answer.equalsIgnoreCase("y"))){
			ryan.setMeet(true); 
		} else {
			ryan.setMeet(false);
		}
		System.out.println("Have you met " + ben.getName() + "?");
		answer = scan.next(); 
		if ((answer.equalsIgnoreCase("yes")) || (answer.equalsIgnoreCase("y"))){
			ben.setMeet(true); 
		} else {
			ben.setMeet(false);
		}
		
		System.out.println("Here are the list of residents: "); 
		if (bob.getMeet()) {
			System.out.println("You met " + bob.getName());
		} else {
			System.out.println("You have not met " + bob.getName());
		}
		if (sarah.getMeet()) {
			System.out.println("You met " + sarah.getName());
		} else {
			System.out.println("You have not met " + sarah.getName());
		}
		if (ryan.getMeet()) {
			System.out.println("You met " + ryan.getName());
		} else {
			System.out.println("You have not met " + ryan.getName());
		}
		if (christina.getMeet()) {
			System.out.println("You met " + christina.getName());
		} else {
			System.out.println("You have not met " + christina.getName());
		}
		if (ben.getMeet()) {
			System.out.println("You met " + ben.getName());
		} else {
			System.out.println("You have not met " + ben.getName());
		}
		
		scan.close();
	}
}
