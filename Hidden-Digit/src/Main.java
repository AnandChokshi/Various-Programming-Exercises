import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		boolean check;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			check = false;
			for (int i = 0; i < line.length(); i++) {
				if (line.charAt(i) >= 97 && line.charAt(i) <= 106
						|| line.charAt(i) >= 48 && line.charAt(i) <= 57) {
					check = true;
					if (line.charAt(i) >= 48 && line.charAt(i) <= 57) {
						System.out.print(line.charAt(i));
					} else {
						System.out.print((char) ((int) line.charAt(i) - 49));
					}
				}
			}
			System.out.println((check) ? "" : "NONE");
		}
		buffer.close();
	}
}