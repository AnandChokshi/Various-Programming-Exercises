import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line, line2;
		String[] lineS;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			lineS = line.split(",");
			line = "";
			line2 = "";
			for (int i = 0; i < lineS.length; i++) {
				if (lineS[i].charAt(0) >= 48 && lineS[i].charAt(0) <= 57) {
					line += lineS[i] + ",";
				} else {
					line2 += lineS[i] + ",";
				}
			}
			if (line.length() == 0) {
				line2 = line2.substring(0, line2.length() - 1);
				System.out.println(line2);
			} else if (line2.length() == 0) {
				line = line.substring(0, line.length() - 1);
				System.out.println(line);
			} else {
				line = line.substring(0, line.length() - 1);
				line2 = line2.substring(0, line2.length() - 1);
				System.out.println(line2 + "|" + line);
			}
		}
		buffer.close();
	}
}