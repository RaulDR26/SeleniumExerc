
public class GameResult {
	
	int head;
	int tail;
	int flip;
	
	public GameResult(int head, int tail, int flip) {
		this.flip = flip;
		this.head = head;
		this.tail = tail;
	}
	public void FlipResult() {
		System.out.println("Total Flips done: " + flip);
		System.out.println("Total Heads optained: " + head);
		System.out.println("Total Tails optained: " + tail);
	}
}
