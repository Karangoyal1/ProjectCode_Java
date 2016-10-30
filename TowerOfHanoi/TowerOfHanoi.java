package lec;

public class TowerOfHanoi {

	public static void main(String[] args) {
		towerOfHanoi(4, "T1", "T2", "T3");

	}

	public static void towerOfHanoi(int N, String source, String dest, String help) {
		if (N == 0) {
			return;
		}

		towerOfHanoi(N - 1, source, help, dest);
		System.out.println("Move " + N + "th disc from " + source + " to " + dest);
		towerOfHanoi(N - 1, help, dest, source);
	}

}
