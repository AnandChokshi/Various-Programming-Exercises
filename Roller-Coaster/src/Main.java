import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		boolean track;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			track = true;
			for (int i = 0; i < line.length(); i++) {
				if (line.charAt(i) >= 65 && line.charAt(i) <= 90
						|| line.charAt(i) >= 97 && line.charAt(i) <= 122) {
					if (track && line.charAt(i) <= 90) {
						System.out.print(line.charAt(i));
						track = false;
					} else if (track && line.charAt(i) > 90) {
						System.out.print((char) ((int) line.charAt(i) - 32));
						track = false;
					}else if (!track && line.charAt(i) >= 97) {
						System.out.print(line.charAt(i));
						track = true;
					}else if (!track && line.charAt(i) <= 90) {
						System.out.print((char) ((int) line.charAt(i) + 32));
						track = true;
					}
				} else {
					System.out.print(line.charAt(i));
				}
			}
			System.out.println();
		}
		buffer.close();
	}
}