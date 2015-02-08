import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		boolean done;
		int counter;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			done = true;
			counter = 0;
			while (done) {
				String reverse = new StringBuilder(line).reverse().toString();
				if(line.equals(reverse)){
					break;
				}
				line = String.valueOf(Integer.parseInt(line) + Integer.parseInt(reverse));
				counter++;
			}
			System.out.println(counter + " " + line);
		}
		buffer.close();
	}
}