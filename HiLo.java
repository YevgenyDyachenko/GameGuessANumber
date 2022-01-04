
import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HiLo {

	public static void main(String[] args) {
		int min=5;
		int max=15;		
		
		Scanner scanner = new Scanner(System.in);
		
		String playAgain = "";
		
		do {
			int theNumber = ThreadLocalRandom.current().nextInt(min, max + 1);
			System.out.println(theNumber);	
			int guess=0;
		
		List<Integer> list = new ArrayList<>();
		while(guess!=theNumber) {
			System.out.println("Guess a number between 1 and 100:");
			
			 while( ! scanner.hasNextInt()) {
		            System.out.println("Not a number. Input a number between 1 and 100:");;
		            scanner.next();
		        }			
			guess=scanner.nextInt();
						
			if (guess<0||guess>100){
				System.out.println("A number must be between 1 and 100:");}	
			
			else if (guess<theNumber) {
				list.add(guess);
				System.out.println(list);
				System.out.println(guess + " is too low. Try again.");}
			else if (guess > theNumber) {
				list.add(guess);
				System.out.println(list);
				System.out.println(guess + " is too high. Try again.");}
			else 
				System.out.println(guess + " is correct. You win!");
			
		}
		System.out.println("Would you like to play again (y/n)?");
		playAgain = scanner.next();
		} while(playAgain.equalsIgnoreCase("y"));
		
		System.out.println("GAME OVER");
	
	}

}
