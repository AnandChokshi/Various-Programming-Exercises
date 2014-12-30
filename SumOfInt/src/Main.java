import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class Main {
	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		int n,sum=0;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			n = Integer.parseInt(line);
			sum += n;
		}
		System.out.println(sum);
		buffer.close();
	}
}