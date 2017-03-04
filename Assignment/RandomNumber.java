import java.util.*;

public class RandomNumber{
	public static void main(String args[]){
		Scanner imput = new Scanner(System.in);
		game();
		for(;;) {
			System.out.println("Again ? Y / N");
			String answer = imput.next();
			
			if (answer.charAt(0) == 'N')
				break;
			if (answer.charAt(0) == 'Y')
				game();
		}

		System.out.println("Game over !!!");
		System.out.println("Welcome back !!!");
		
		System.exit(0);
	}

	public static void game(){
		Random random = new Random();
		Scanner imput = new Scanner(System.in);

		int number = random.nextInt(100);
		for (int i =0; i < 10; i++){
			System.out.print("Enter a integer between 0 and 100: ");
			int guessNumber = imput.nextInt();

			if (guessNumber == number){
				System.out.println("Congratulation !!!");
				return;
			}
			if ( guessNumber > number)
				System.out.println("Too large");
			else
				System.out.println("Too small");
			
		}
		System.out.println("Your loss !!!");
			return;
	}
}
