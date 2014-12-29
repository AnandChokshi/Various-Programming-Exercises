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
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			lineS = line.split("\\s+");
			if (lineS.length > 0) {
				for (int i = lineS.length - 1; i > 0; i--) {
					System.out.print(lineS[i] + " ");
				}
				System.out.println(lineS[0]);
			}
		}
		buffer.close();
	}
}