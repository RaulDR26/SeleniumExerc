
public class Cat {
	
	int num1, num2;
	int a1, a2;
	
	public Cat(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void MouseRandom(int a1, int a2) {
		this.a1 = a1;
		this.a2 = a2;
	}
	
	public boolean Result() {
		boolean result;
		int Array[][] = new int[6][6];
		
		for(int i = 1; i < 5; i++) {
			for(int r = 1; r < 5; r++) {
				Array[i][r] = 0;
			}
		}
		//Mouse class		
		Array[a1][a2] = 1;
		if(Array[num1][num2] == 1) {
			result = true;
		}
		else {
			result = false;
		}
		return result;
	}
}
