import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			int length = Integer.parseInt(line);
			boolean[] pNum = new boolean[length];
			if (length > 2) {
				for (int i = 2; i < length; i++) {
					pNum[i] = true;
				}
				line = "";
				for (int i = 2; i < length; i++) {
					if (pNum[i]) {
						line = line + i + ",";
						for (int j = i; j < length; j += i) {
							pNum[j] = false;
						}
					}
				}
				System.out.println(line.substring(0, line.length() - 1));
			}
		}
		buffer.close();
	}
}