import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		int count;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			count = 0;
			for (int i = 0; i < line.length() - 1; i++) {
				if (line.charAt(0) == line.charAt(i + 1))
					break;
				count++;
			}
			System.out.println(count + 1);
		}
		buffer.close();
	}
}