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
		boolean mark;
		int min, pos;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			lineS = line.split("\\s+");
			min = 0;
			pos = 0;
			for (int i = 0; i < lineS.length; i++) {
				mark = false;
				line = lineS[i];
				if (!line.equals("")) {
					for (int j = 0; j < lineS.length; j++) {
						if (line.equals(lineS[j]) && j != i) {
							lineS[j] = "";
							mark = true;
						}
					}
					if (mark != true) {
						if (min == 0 || min > Integer.parseInt(lineS[i])) {
							min = Integer.parseInt(lineS[i]);
							pos = i + 1;
						}
					} else {
						lineS[i] = "";
					}
				}
			}
			System.out.println(pos);
		}
		buffer.close();
	}
}