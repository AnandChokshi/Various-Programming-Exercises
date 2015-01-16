import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		char temp;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			System.out.print(line.charAt(0));
			temp = line.charAt(0);
			for (int i = 0; i < line.length(); i++) {
				if (temp != line.charAt(i)) {
					System.out.print(line.charAt(i));
					temp = line.charAt(i);
				}
			}
			System.out.println();
		}
		buffer.close();
	}
}