import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		String[] lineS, swap, swapIndex;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			lineS = line.split(":");
			swap = lineS[1].split(",");
			lineS = lineS[0].split("\\s+");
			for (int i = 0; i < swap.length; i++) {
				swapIndex = swap[i].split("-");
				line = lineS[Integer.parseInt(swapIndex[0].trim())];
				lineS[Integer.parseInt(swapIndex[0].trim())] = lineS[Integer
						.parseInt(swapIndex[1].trim())];
				lineS[Integer.parseInt(swapIndex[1].trim())] = line;
			}
			for (int i = 0; i < lineS.length; i++) {
				System.out.print(lineS[i] + " ");
			}
			System.out.println();
		}
		buffer.close();
	}
}