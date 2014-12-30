public class Main {
	public static void main(String[] args) {
		String space = "";
		int length;
		for (int i = 1; i <= 12; i++) {
			for (int j = 1; j <= 12; j++) {
				space = "";
				length = 4 - Integer.toString(i * j).length();
				for (int k = length; k > 0; k--) {
					space += " ";
				}
				System.out.print(space + (i * j));
			}
			System.out.println();
		}
	}
}