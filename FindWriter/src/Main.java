import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		String[] lineS, key;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			if (!line.equals("")) {
				lineS = line.split("\\|");
				lineS[1] = lineS[1].trim();
				key = lineS[1].split("\\s+");
				for (int i = 0; i < key.length; i++) {
					System.out.print(lineS[0].charAt(Integer.parseInt(key[i])-1));
				}
				System.out.println();
			}
		}
		buffer.close();
	}
}