import java.util.Scanner;

public class Game {
	
	private static Scanner option;
	private static Scanner start;
	private static Scanner a1;
	private static Scanner a2;
	private static Scanner restart;
	static int num1;
	static int num2;
	static int input;
	static int win;
	static int loose;
	static int tried = 1;
	static int r1, r2;
	
	public static void main(String[] args) {
		int Select=0;
		int i = 1;
		System.out.println("wellcome");
		while(Select != 2){
			System.out.print("Press: 1 to Start or 2 to Exit: ");
			option = new Scanner(System.in);
			input = option.nextInt();
			switch(input) {
			case 1:
				Mouse al1 = new Mouse();
				Mouse al2 = new Mouse();
				r1 = al1.randomMouse1();
				r2 = al2.randomMouse2();
				System.out.println("¡Lets Play!");
				System.out.println("The mouse is an array of 5,5, find it...");
				for(i = 1; i <= 5; i++) {
					tried++;
					int sn1 = 0, sn2 = 0;
					while(sn1 != 1) {
					System.out.print("Please insert your first number: ");
					a1 = new Scanner(System.in);
					num1 = a1.nextInt();
						if (num1 == 1 || num1 == 2 || num1 == 3 || num1 == 4 || num1 == 5) {
							sn1 = 1;
						}
						else {
							System.out.println("Numbers should be between 1 to 5");	
						}
					
					}
					while(sn2 != 1) {
						System.out.print("Please insert your second number: ");
						a2 = new Scanner(System.in);
						num2 = a2.nextInt();
							if (num2 == 1 || num2 == 2 || num2 == 3 || num2 == 4 || num2 == 5) {
								sn2 = 1;
							}
							else {
								System.out.println("Numbers should be between 1 to 5");	
							}
						
						}
					//Cat class
					Cat op = new Cat(num1, num2);
					op.MouseRandom(r1, r2);
					boolean result = op.Result();
								
					if(result == true){
						win++;
						System.out.println("¡Congratualation you found it!");
						start = new Scanner(System.in);
						i = 5;
						break;
								}
					else {
						System.out.println(" ");
						System.out.println("Sorry, try again");
						continue;
					}
						}
				if(tried >= 5) {
					loose++;
				}
				System.out.println("The mouse was in: " + r1 + " ," + r2 );
				System.out.println("Do you wann play again?");
				int startover = 0;
				while(startover != 2) {
					System.out.println("Press: 1 to try again or 2 to Exit");
					restart = new Scanner(System.in);
					startover = restart.nextInt();
					switch(startover) {
					case 1:
						System.out.println("Lets play again");
						startover = 2;
						break;
					case 2: 
						System.out.println(" ");
						System.out.println("Goodbye");
						Select = 2;
						startover = 2;
						break;
					default: 
						System.out.println("That is not a valid option");
						}
				}
				break;
			case 2: 
				System.out.println(" ");
				System.out.println("Goodbye");
				Select = 2;
				break;
			
			default:
				System.out.println("That is not a valid option");
			
		}
	}
		System.out.println("You win " + win + " time(s)");
		System.out.println("yo loose: " + loose + " time(s).");
}
}

