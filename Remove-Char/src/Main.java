import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		String[] lineS;
		boolean done;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			lineS = line.split(",");
			lineS[0] = lineS[0].trim();
			lineS[1] = lineS[1].trim();
			for (int i = 0; i < lineS[0].length(); i++) {
				done = false;
				for (int j = 0; j < lineS[1].length(); j++) {
					if (lineS[0].charAt(i) == lineS[1].charAt(j)) {
						break;
					}
					done = j == lineS[1].length() - 1 ? true : false;
				}
				if (done) {
					System.out.print(lineS[0].charAt(i));
				}
			}
			System.out.println();
		}
		buffer.close();
	}
}