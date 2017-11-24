import java.util.Random;

public class CoinThrow {
	
	static int h = 0;
	static int t = 0;
	
	public void Throw() {
		Random randomNum = new Random();
		int result = randomNum.nextInt(2);
		if (result == 0) {
			System.out.println("You got a Head");
			h++;
		}
		else {
			System.out.println("You got a Tail");
			t++;
		}
	}
	public static void main(String[] args) {
		int i;
		CoinThrow Toss = new CoinThrow();
		for(i = 1; i <= 10; i++) {
			Toss.Throw();
		}
		GameResult Flip = new GameResult(h, t, 10);
		Flip.FlipResult();
	}
}
