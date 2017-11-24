import java.util.Random;

public class Mouse {
	
	public int randomMouse1() {
		Random randomNum1 = new Random();
		int a1 = randomNum1.nextInt(6);
		if(a1 == 0) {
			a1=1;
			return a1;
		}
		else {
			return a1;
		}
		
	}
	
	public int randomMouse2() {
		Random randomNum2 = new Random();
		int a2 = randomNum2.nextInt(6);
		if(a2 == 0) {
			a2=1;
			return a2;
		}
		else {
			return a2;
		}
	}
}
