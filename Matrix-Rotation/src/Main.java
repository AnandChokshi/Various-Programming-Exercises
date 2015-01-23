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
		String[][] matrix;
		int n = 0, count;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			lineS = line.split("\\s+");
			count = lineS.length;
			if (count > 2) {
				for (int i = 1; i < 11; i++) {
					if (count == (i * i)) {
						n = i;
						break;
					}
				}
				matrix = new String[n][n];
				count = 0;
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < n; j++) {
						matrix[i][j] = lineS[count] + " ";
						count++;
					}
				}
				matrix[0][n - 1] = lineS[n - 1];
				for (int i = 0; i < n; i++) {
					for (int j = n - 1; j >= 0; j--) {
						System.out.print(matrix[j][i]);
					}
				}
				System.out.println();
			} else {
				if (count == 2) {
					System.out.println(lineS[1] + " " + lineS[0]);
				}
				System.out.println(line);
			}
		}
		buffer.close();
	}
}