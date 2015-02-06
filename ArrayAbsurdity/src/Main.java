import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		String[] lineS, num, arr;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			lineS = line.split(";");
			num = new String[Integer.parseInt(lineS[0]) - 1];
			arr = lineS[1].split(",");
			for (int i = 0; i < arr.length; i++) {
				if (num[Integer.parseInt(arr[i])] != null) {
					System.out.println(arr[i]);
					break;
				} else {
					num[Integer.parseInt(arr[i])] = "done";
				}
			}
		}
		buffer.close();
	}
}