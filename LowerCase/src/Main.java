import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		char[] ch;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			ch = line.toCharArray();
			for (int i = 0; i < ch.length; i++) {
				if ((int) ch[i] >= 65 && (int) ch[i] <= 90) {
					System.out.print((char) (ch[i] + 32));
				} else
					System.out.print(ch[i]);
			}
			System.out.println();
		}
		buffer.close();
	}
}