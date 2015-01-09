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
		int counter, compare;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			lineS = line.split("\\s+");
			counter = 0;
			compare = Integer.parseInt(lineS[0]);
			for (int i = 0; i < lineS.length; i++) {
				if (compare != Integer.parseInt(lineS[i])) {
					System.out.print(counter + " " + compare + " ");
					counter = 0;
					compare = Integer.parseInt(lineS[i]);
				}
				counter ++;
			}
			System.out.print(counter + " " + compare);
			System.out.println();
		}
		buffer.close();
	}
}