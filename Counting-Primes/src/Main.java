import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		String lineS[];
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			lineS = line.split(",");
			int counter = Integer.parseInt(lineS[0]) <= 2 ? 1 : 0;
			for (int i = Integer.parseInt(lineS[0]); i <= Integer
					.parseInt(lineS[1]); i++) {
				if(i > 2 && isPrime(i)){
					counter++;
				}
			}
			System.out.println(counter);
		}
		buffer.close();
	}

	public static boolean isPrime(int number) {
		if (number % 2 == 0)
			return false;
		else {
			int sqRoot = (int) Math.sqrt(number);
			for (int j = 3; j <= sqRoot; j += 2) {
				if(number % j == 0){
					return false;
				}
			}
			return true;
		}
	}
}