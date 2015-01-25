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
		int n, i = 0, min = 100000, index = 0;
		line = buffer.readLine();
		n = Integer.parseInt(line);
		lineS = new String[n];
		while (i < n) {
			lineS[i] = buffer.readLine();
			if (lineS[i].length() < min) {
				min = lineS[i].length();
				index = i;
			}
			i++;
		}
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			if (min < line.length()) {
				lineS[index] = line;
				min = line.length();
				for (int x = 0; x < lineS.length; x++) {
					if (min > lineS[x].length()) {
						min = lineS[x].length();
						index = x;
					}
				}
			}
		}
		for (int x = 0; x < lineS.length; x++) {
			for (int y = 0; y < lineS.length - 1; y++) {
				if (lineS[y].length() < lineS[y + 1].length()) {
					line = lineS[y];
					lineS[y] = lineS[y + 1];
					lineS[y + 1] = line;
				}
			}
		}
		for (int x = 0; x < lineS.length; x++) {
			System.out.println(lineS[x]);
		}
		buffer.close();
	}
}