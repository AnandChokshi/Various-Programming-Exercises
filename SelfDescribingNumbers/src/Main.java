import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		int num[];
		boolean sdn;
		int test, dig;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			num = new int[line.length()];
			dig = Integer.parseInt(line);
			sdn = true;
			for (int i = line.length() - 1; i >= 0; i--) {
				num[i] = dig % 10;
				dig /= 10;
			}
			for (int i = 0; i < num.length; i++) {
				test = 0;
				for (int j = 0; j < num.length; j++) {
					if (i == num[j])
						test++;
				}
				if (test != num[i]) {
					sdn = false;
					break;
				}
			}
			System.out.println((sdn) ? 1 : 0);
		}
		buffer.close();
	}
}