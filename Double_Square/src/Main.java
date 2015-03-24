import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		buffer.readLine();
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			int num = Integer.parseInt(line);
			int sqRoot = (int) Math.sqrt(num);
			int counter = 0, temp = num, loopControl = 0;
			int sqRootCount;
			while (temp >= sqRoot) {
				sqRootCount = (int) Math.sqrt(temp);
				if (sqRootCount * sqRootCount == temp && sqRootCount >= loopControl) {
					counter++;
				}
				loopControl++;
				temp = num - (loopControl * loopControl);
			}
			System.out.println(counter);
		}
		buffer.close();
	}
}