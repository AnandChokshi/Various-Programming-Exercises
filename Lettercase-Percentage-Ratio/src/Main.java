import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		int upper, lower;
		float per;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			upper = 0;
			lower = 0;
			for (int i = 0; i < line.length(); i++) {
				if ((int) line.charAt(i) >= 65 && (int) line.charAt(i) <= 90) {
					upper++;
				} else {
					lower++;
				}
			}
			per = (float) (lower * 100) / (float) line.length();
			System.out.print("lowercase: ");
			System.out.format("%.2f ", per);
			per = (float) (upper * 100) / (float) line.length();
			System.out.print("uppercase: ");
			System.out.format("%.2f ", per);
			System.out.println();
		}
		buffer.close();
	}
}