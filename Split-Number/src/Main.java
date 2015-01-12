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
			for (int i = 0; i < lineS[1].length(); i++) {
				if (lineS[1].charAt(i) == '-' || lineS[1].charAt(i) == '+') {
					if (lineS[1].charAt(i) == '-') {
						System.out.println(Integer.parseInt(lineS[0].substring(
								0, i))
								- Integer.parseInt(lineS[0].substring(i,
										lineS[0].length())));
					} else {
						System.out.println(Integer.parseInt(lineS[0].substring(
								0, i))
								+ Integer.parseInt(lineS[0].substring(i,
										lineS[0].length())));
					}
				}
			}
		}
		buffer.close();
	}
}