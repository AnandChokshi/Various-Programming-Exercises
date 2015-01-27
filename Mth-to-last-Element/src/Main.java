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
			if (Integer.parseInt(lineS[lineS.length - 1]) <= lineS.length - 1) {
				System.out.println(lineS[(lineS.length - 1)
						- Integer.parseInt(lineS[lineS.length - 1])]);
			}
		}
		buffer.close();
	}
}