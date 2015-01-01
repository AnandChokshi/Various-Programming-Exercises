import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		char[] seq;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			seq = line.toCharArray();
			for (int i = 0; i < seq.length; i++) {
				if ((int) seq[i] >= 65 && (int) seq[i] <= 90) {
					System.out.print((char) (seq[i] + 32));
				} else if ((int) seq[i] >= 97 && (int) seq[i] <= 122) {
					System.out.print((char) (seq[i] - 32));
				} else {
					System.out.print(seq[i]);
				}
			}
			System.out.println();
		}
		buffer.close();
	}
}