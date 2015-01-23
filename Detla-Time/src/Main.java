import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		String[] lineS, first, second;
		int ans, carry;
		int[] one = new int[3];
		int[] two = new int[3];
		while ((line = buffer.readLine()) != null) {
			carry = 0;
			line = line.trim();
			lineS = line.split("\\s+");
			first = lineS[0].split(":");
			second = lineS[1].split(":");
			if (Integer.parseInt(first[0] + first[1] + first[2]) >= Integer
					.parseInt(second[0] + second[1] + second[2])) {
				for (int i = 0; i < 3; i++) {
					one[i] = Integer.parseInt(first[i]);
					two[i] = Integer.parseInt(second[i]);
				}
			} else {
				for (int i = 0; i < 3; i++) {
					one[i] = Integer.parseInt(second[i]);
					two[i] = Integer.parseInt(first[i]);
				}
			}
			line = "";
			ans = one[2] - two[2];
			if (ans < 0) {
				ans = 60 + ans;
				carry++;
			}
			if (ans < 10) {
				line = ":0" + Integer.toString(ans);
			} else {
				line = ":" + Integer.toString(ans);
			}
			ans = (one[1] - carry) - two[1];
			carry = 0;
			if (ans < 0) {
				ans = 60 + ans;
				carry++;
			}
			if (ans < 10) {
				line = ":0" + Integer.toString(ans) + line;
			} else {
				line = ":" + Integer.toString(ans) + line;
			}
			ans = (one[0] - carry) - two[0];
			if (ans < 0) {
				ans = 24 + ans;
			}
			if (ans < 10) {
				line = "0" + Integer.toString(ans) + line;
			} else {
				line = Integer.toString(ans) + line;
			}
			System.out.println(line);
		}
		buffer.close();
	}
}