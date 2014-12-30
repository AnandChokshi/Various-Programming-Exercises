import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		int n, sum;
		while ((line = buffer.readLine()) != null) {
			sum = 0;
			line = line.trim();
			n = Integer.parseInt(line);
			while (n > 0) {
				sum += n % 10;
				n /= 10;
			}
			System.out.println(sum);
		}
		buffer.close();
	}
}