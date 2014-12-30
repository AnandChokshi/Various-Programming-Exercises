import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		int n, temp, a, b;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			a = 0;
			b = 1;
			n = Integer.parseInt(line);
			if (n != 0) {
				for (int i = 0; i < n - 1; i++) {
					temp = a + b;
					a = b;
					b = temp;
				}
				System.out.println(b);
			} else
				System.out.println(a);
		}
		buffer.close();
	}
}