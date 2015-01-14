import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		String[] lineS, recover, convert;
		int[] num;
		boolean test;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			lineS = line.split(";");
			recover = lineS[0].split("\\s+");
			convert = lineS[1].split("\\s+");
			num = new int[recover.length];
			test = false;
			for (int i = 0; i < convert.length; i++) {
				num[i] = Integer.parseInt(convert[i]) - 1;
			}
			num[recover.length - 1] = -1;
			for (int i = 0; i < recover.length; i++) {
				for (int j = 0; j < recover.length; j++) {
					if (i == num[j]) {
						test = true;
					}
				}
				if (!test) {
					num[recover.length - 1] = i;
					break;
				}
				test = false;
			}
			for (int i = 0; i < recover.length; i++) {
				for (int j = 0; j < num.length; j++) {
					if (i == num[j]) {
						System.out.print(recover[j] + " ");
					}
				}
			}
			System.out.println();
		}
		buffer.close();
	}
}