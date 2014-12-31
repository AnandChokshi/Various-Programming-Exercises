import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		int num, dig, sum, pow, count;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			num = Integer.parseInt(line);
			dig = num;
			sum = 0;
			count = 1;
			while (dig > 0) {
				pow = line.length();
				while (pow > 0) {
					pow--;
					count *= (dig % 10);
				}
				sum += count;
				dig /= 10;
				count = 1;
			}
			System.out.println((sum == num) ? "True" : "False");
		}
		buffer.close();
	}
}