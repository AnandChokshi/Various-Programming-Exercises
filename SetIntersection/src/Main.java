import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		String[] lineS, list1, list2;
		boolean check;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			lineS = line.split(";");
			list1 = lineS[0].split(",");
			list2 = lineS[1].split(",");
			line = "";
			for (int i = 0; i < list1.length; i++) {
				check = true;
				for (int j = 0; j < list2.length; j++) {
					if (list1[i].equals(list2[j])) {
						line += list1[i] + ",";
						check = false;
					}
					if (!check)
						break;
				}
			}
			if (line.length() > 0) {
				line = line.substring(0, line.length() - 1);
			}
			System.out.println(line);
		}
		buffer.close();
	}
}
