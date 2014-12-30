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
		int ans = -1;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			lineS = line.split(",");
			ans = -1;
			for (int i = 0; i < lineS[0].length(); i++) {
				if (lineS[1].charAt(0) == lineS[0].charAt(i))
					ans = i;
			}
			System.out.println(ans);
		}
		buffer.close();
	}
}