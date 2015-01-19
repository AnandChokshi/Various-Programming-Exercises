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
		int sum, counter;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			if (!line.equals("")) {
				lineS = line.split("Label\\s+");
				sum = 0;
				if (lineS.length > 1) {
					for (int i = 1; i < lineS.length; i++) {
						lineS[i] = lineS[i].trim();
						counter = 0;
						for (int j = 0; j < 3; j++) {
							if (lineS[i].charAt(j) >= 48
									&& lineS[i].charAt(j) <= 57) {
								counter++;
							}
						}
						sum += Integer.parseInt(lineS[i].substring(0, counter));
					}
				}
				System.out.println(sum);
			}
		}
		buffer.close();
	}
}