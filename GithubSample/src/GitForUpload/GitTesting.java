package GitForUpload;

public class GitTesting {

	public static void main(String[] args) {
		// First Uploading Test...
		System.out.println("First Uploading to GitHub!!!");
		Math cMath = new Math();
		System.out.println(cMath.add(10, 5));

	}

}

class Math {
	int add(int x, int y) {
		return x + y;
	}
}
