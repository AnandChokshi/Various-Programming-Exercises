import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line, argu;
		int x, y, sum;
		String[] lineS;
		int[][] board = new int[256][256];
		while ((line = buffer.readLine()) != null) {
			lineS = line.split("\\s+");
			sum = 0;
			y = -1;
			argu = lineS[0];
			x = Integer.parseInt(lineS[1]);
			if (argu.equals("SetCol") || argu.equals("SetRow")) {
				y = Integer.parseInt(lineS[2]);
			}
			if (y == -1) {
				switch (argu) {
				case "QueryRow":
					for (int i = 0; i < 256; i++) {
						sum += board[x][i];
					}
					System.out.println(sum);
					break;
				case "QueryCol":
					for (int i = 0; i < 256; i++) {
						sum += board[i][x];
					}
					System.out.println(sum);
					break;
				}
			} else {
				switch (argu) {
				case "SetRow":
					for (int i = 0; i < 256; i++) {
						board[x][i] = y;
					}
					break;
				case "SetCol":
					for (int i = 0; i < 256; i++) {
						board[i][x] = y;
					}
					break;
				}
			}
		}
		buffer.close();
	}
}