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
		int sum, dig, pow;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			if (!line.equals("")) {
				lineS = line.split("");
				sum = 0;
				pow = 1;
				for (int i = lineS.length - 1; i >= 0; i--) {
					switch (lineS[i]) {
					case "a":
						dig = 10;
						break;
					case "b":
						dig = 11;
						break;
					case "c":
						dig = 12;
						break;
					case "d":
						dig = 13;
						break;
					case "e":
						dig = 14;
						break;
					case "f":
						dig = 15;
						break;
					default:
						dig = Integer.parseInt(lineS[i]);
						break;
					}
					pow *= ((i == lineS.length - 1) ? 1 : 16);
					sum += dig * pow;
				}
				System.out.println(sum);
			}
		}
		buffer.close();
	}
}