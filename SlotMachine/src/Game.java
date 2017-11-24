import java.util.Random;
import java.util.Scanner;
public class Game {

	static int coin = 0;
	static int coincount;
	static int play;
	static int total = 0;
	static int result;
	static boolean pull;
	private static Scanner start;
	private static Scanner game;
	
	public static void main(String[] args) {
		while(coin < 1){
			System.out.println("Please insert at least 1 coin:");
			start = new Scanner(System.in);
			coin = start.nextInt();
			coincount = coin;
		}
		System.out.println("Yo have " + coincount + " coins to play");
		for(int i = 1; i <= coin; i++) {
			while(pull == false) {
				System.out.println(" ");
				System.out.println("Please press 1 to start or 2 to exit ");
				game = new Scanner(System.in);
				play = game.nextInt();
					switch(play) {
					case 1:
						coincount--;
						//Slot 1
						Random randomNum1 = new Random();
						int s1 = randomNum1.nextInt(8);
						//Slot 2
						Random randomNum2 = new Random();
						int s2 = randomNum2.nextInt(8);
						//Slot 3
						Random randomNum3 = new Random();
						int s3 = randomNum3.nextInt(8);
						
						Prize op = new Prize(s1, s2, s3);
						result = op.gameprize();
						System.out.println("["+s1+"]" + " ["+s2+"]" + " ["+s3+"]");
						System.out.println("You got "+ result + " points.");
						total += result;
						System.out.println("Yo have " + coincount + " coins left");
							if(coincount == 0) {
								pull = true;
							}
							else {
								continue;
							}
						break;
					case 2:
						System.out.println(" ");
						System.out.println("Your final score is: "+ total);
						System.out.print("Goodbye, thanks for playing");
						System.exit(0);
					default:
						System.out.println("Invalid salection.");
						break;
					}
				
				}
		}
		System.out.println(" ");
		System.out.println("Your final score is: "+ total);
		System.out.println("Thanks for playing");				
	}
}
