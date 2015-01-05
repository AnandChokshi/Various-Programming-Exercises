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
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			lineS = line.split("\\s+");
			line = "";
			for (int i = 0; i < lineS.length; i++) {
				if(line.length() < lineS[i].length()){
					line = lineS[i];
				}
			}
			System.out.println(line);
		}
		buffer.close();
	}
}