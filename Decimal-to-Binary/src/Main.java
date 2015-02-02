import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		int rem;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			rem = Integer.parseInt(line);
			line = "";
			while (rem > 0) {
				line = Integer.toString(rem % 2) + line;
				rem /= 2;
			}
			line = line.equals("") ? "0" : line;
			System.out.println(line);
		}
		buffer.close();
	}
}