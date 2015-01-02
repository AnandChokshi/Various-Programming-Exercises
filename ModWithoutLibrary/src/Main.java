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
		int N, M, res;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			lineS = line.split(",");
			N = Integer.parseInt(lineS[0]);
			M = Integer.parseInt(lineS[1]);
			res = N;
			if (N < 0 && M < 0) {
				if (N < M) {
					M = M * (-1);
					N = N * (-1);
				}
			}
			while (N >= 0) {
				res = N;
				N -= M;
			}
			System.out.println(res);
		}
		buffer.close();
	}
}