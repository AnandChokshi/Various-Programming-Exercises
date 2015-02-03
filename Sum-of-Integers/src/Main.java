import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		String[] lineS;
		boolean test;
		int maxUntill, maxEnd;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			lineS = line.split(",");
			test = false;
			maxUntill = Integer.parseInt(lineS[0]);
			maxEnd = Integer.parseInt(lineS[0]);
			for (String num : lineS) {
				if (test) {
					int x = Integer.parseInt(num);
					maxEnd = Math.max(x, maxEnd + x);
					maxUntill = Math.max(maxUntill, maxEnd);
				} else {
					test = true;
				}
			}
			System.out.println(maxUntill);
		}
		buffer.close();
	}
}