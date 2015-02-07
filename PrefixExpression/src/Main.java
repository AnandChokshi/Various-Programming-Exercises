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
		double res;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			if (line.length() > 0) {
				lineS = line.split("\\s+");
				Stack<Double> num = new Stack<Double>();
				for (int i = lineS.length - 1; i > -1; i--) {
					switch (lineS[i]) {
					case "+":
						res = num.pop() + num.pop();
						num.push(res);
						break;
					case "/":
						res = num.pop() / num.pop();
						num.push(res);
						break;
					case "*":
						res = num.pop() * num.pop();
						num.push(res);
						break;
					default:
						num.push(Double.parseDouble(lineS[i]));
						break;
					}
				}
				System.out.println(Math.round(num.pop()));
			}
		}
		buffer.close();
	}
}