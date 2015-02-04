import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		boolean check, put;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			check = true;
			put = false;
			for (int i = 65, j = 97; i < 91; i++, j++) {
				put = true;
				for (int x = 0; x < line.length(); x++) {
					if (line.charAt(x) == (char) i
							|| line.charAt(x) == (char) j) {
						put = false;
						break;
					}
				}
				if (put) {
					check = false;
					System.out.print((char) j);
				}
			}
			if (check) {
				System.out.println("NULL");
			} else {
				System.out.println();
			}
		}
		buffer.close();
	}
}