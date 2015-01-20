import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		String lineS[];
		int mark;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			mark = 40;
			if (line.length() >= 55) {
				line = line.substring(0, 40);
				lineS = line.split("\\s+");
				if (lineS[0].length() < 40) {
					for (int i = 0; i < lineS.length; i++) {
						mark -= (lineS[i].length() + 1);
						if (mark >= 0) {
							if (i != 0) {
								System.out.print(" ");
							}
							System.out.print(lineS[i]);
						}
					}
					System.out.println("... <Read More>");
				} else {
					lineS[0] = lineS[0].substring(0, 40);
					System.out.println(lineS[0] + "... <Read More>");
				}
			} else {
				System.out.println(line);
			}
		}
		buffer.close();
	}
}