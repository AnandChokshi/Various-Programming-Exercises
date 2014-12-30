import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line, prnt = "";
		String[] lineS;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			lineS = line.split(",");
			prnt = lineS[0];
			line = lineS[0];
			for (int i = 1; i < lineS.length; i++) {
				if (!line.equals(lineS[i])) {
					prnt += "," + lineS[i];
					line = lineS[i];
				}
			}
			System.out.println(prnt);
		}
		buffer.close();
	}
}