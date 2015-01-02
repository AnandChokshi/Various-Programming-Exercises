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
		int x, y;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			line = line.replaceAll("\\(", "");
			line = line.replaceAll("\\)", "");
			line = line.replaceAll(",", "");
			lineS = line.split("\\s+");
			y = ((Integer.parseInt(lineS[3]) - Integer.parseInt(lineS[1])) * (Integer
					.parseInt(lineS[3]) - Integer.parseInt(lineS[1])));
			x = ((Integer.parseInt(lineS[2]) - Integer.parseInt(lineS[0])) * (Integer
					.parseInt(lineS[2]) - Integer.parseInt(lineS[0])));
			System.out.println((int) Math.sqrt((x + y)));
		}
		buffer.close();
	}
}