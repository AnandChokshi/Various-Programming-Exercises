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
		int[] num;
		int comp, temp;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			lineS = line.split(",");
			num = new int[lineS.length];
			line = "None";
			for (int i = 0; i < num.length; i++) {
				num[i] = Integer.parseInt(lineS[i]);
			}
			for (int i = 0; i < lineS.length; i++) {
				if (num[i] != -1) {
					temp = num[i];
					comp = lineS.length / 2;
					for (int j = 0; j < lineS.length; j++) {
						if (temp == num[j]) {
							comp--;
							num[j] = -1;
						}
					}
					num[i] = -1;
					if (comp < 0) {
						line = Integer.toString(temp);
						break;
					}
				}
			}
			System.out.println(line);
		}
		buffer.close();
	}
}