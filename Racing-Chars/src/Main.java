import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		int current = 12, previous = 12;
		char decision = '|';
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			for (int i = 0; i < 12; i++) {
				if (line.charAt(i) == 'C') {
					current = i;
					break;
				}
				if (line.charAt(i) == '_') {
					current = i;
				}
			}
			if (previous == 12) {
				previous = current;
			} else if (previous == current) {
				decision = '|';
			} else if (previous < current) {
				decision = '\\';
			} else {
				decision = '/';
			}

			for (int i = 0; i < line.length(); i++) {
				if (i == current) {
					System.out.print(decision);
				} else {
					System.out.print(line.charAt(i));
				}
			}
			previous = current;
			System.out.println();

		}
		buffer.close();
	}
}