import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		int x, n, i = 1, ans = 0;
		while ((line = buffer.readLine()) != null) {
			i = 1;
			ans = 0;
			x = Integer.parseInt(line.substring(0, line.indexOf(",")));
			n = Integer.parseInt(line.substring(line.indexOf(",") + 1,
					line.length()));
			while (ans < x) {
				ans = n * i;
				i++;
			}
			System.out.println(ans);
		}
		buffer.close();
	}
}