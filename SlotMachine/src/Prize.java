
public class Prize {
	
	int s1, s2, s3;
	
	public Prize(int s1, int s2, int s3) {
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}

	public int gameprize() {
		int result;
		if(s1 == 1 && s2 == 1 && s3 == 1) {
			result = 1;
		}
		else if(s1 == 2 && s2 == 2 && s3 == 2) {
			result = 10;
		}
		else if(s1 == 3 && s2 == 3 && s3 == 3) {
			result = 50;
		}
		else if(s1 == 4 && s2 == 4 && s3 == 4) {
			result = 100;
		}
		else if(s1 == 5 && s2 == 5 && s3 == 5) {
			result = 200;
		}
		else if(s1 == 6 && s2 == 6 && s3 == 6) {
			result = 500 ;
		}
		else if(s1 == 7 && s2 == 7 && s3 == 7) {
			result = 1000;
		}
		else{
			result = 0;
		}
		return result;
	}
}
