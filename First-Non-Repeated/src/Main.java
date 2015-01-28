import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		boolean done;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			done = false;
			for (int i = 0; i < line.length(); i++) {
				for (int j = 0; j < line.length(); j++) {
					if (i != j) {
						if (line.charAt(i) == line.charAt(j)) {
							break;
						}
					}
					done = j == line.length() - 1 ? true : false;
				}
				if (done) {
					System.out.println(line.charAt(i));
					break;
				}
			}
		}
		buffer.close();
	}
}