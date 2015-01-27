import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		String[] lineS;
		boolean printPop;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			lineS = line.split("\\s+");
			printPop = true;
			Stack<String> st = new Stack<String>();
			for (int i = 0; i < lineS.length; i++) {
				st.push(lineS[i]);
			}
			line = "";
			for (int i = 0; i < lineS.length; i++) {
				if (printPop) {
					printPop = false;
					line += st.pop() + " ";
				} else {
					st.pop();
					printPop = true;
				}
			}
			System.out.println(line.substring(0, line.length() - 1));
		}
		buffer.close();
	}
}