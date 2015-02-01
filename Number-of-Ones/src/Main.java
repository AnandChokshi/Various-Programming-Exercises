import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		int counter;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			line = Integer.toBinaryString(Integer.parseInt(line));
			counter = 0;
			for (int i = 0; i < line.length(); i++) {
				if(line.charAt(i) == '1'){
					counter++;
				}
			}
			System.out.println(counter);
		}
		buffer.close();
	}
}