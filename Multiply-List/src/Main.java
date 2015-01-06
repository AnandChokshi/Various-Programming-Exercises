import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		String[] lineS, first, second;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			lineS = line.split("\\|");
			first = lineS[0].trim().split("\\s+");
			second = lineS[1].trim().split("\\s+");
			for (int i = 0; i < first.length; i++) {
				System.out.print(Integer.parseInt(first[i].trim())
						* Integer.parseInt(second[i].trim()) + " ");
			}
			System.out.println();
		}
		buffer.close();
	}
}