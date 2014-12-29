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
		int x, y, N;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			lineS = line.split("\\s+");
			x = Integer.parseInt(lineS[0]);
			y = Integer.parseInt(lineS[1]);
			N = Integer.parseInt(lineS[2]);
			for (int i = 1; i <= N; i++) {
				line = "";
				if (i % x == 0)
					line = "F";
				if (i % y == 0)
					line = line + "B";
				if (line == "")
					line = Integer.toString(i);				
				System.out.print(line + " ");
			}
			System.out.println();
		}
		buffer.close();
	}
}