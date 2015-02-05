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
		boolean check;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			if (!line.equals("")) {
				check = true;
				lineS = line.split(",");
				lineS[0] = lineS[0].trim();
				lineS[1] = lineS[1].trim();
				int i = lineS[1].length(), j = lineS[0].length();
				while (i > 0 && j > 0) {
					if (lineS[1].charAt(--i) != lineS[0].charAt(--j)) {
						check = false;
						break;
					}
				}
				System.out.println(check
						&& j == lineS[0].length() - lineS[1].length() ? 1 : 0);
			}
		}
		buffer.close();
	}
}