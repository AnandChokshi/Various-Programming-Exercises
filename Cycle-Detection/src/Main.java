import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		String[] numbers;
		int[] times;
		int counter;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			numbers = line.split("\\s+");
			times = new int[numbers.length];
			for (int i = numbers.length - 1; i >= 0; i--) {
				counter = 0;
				for (int j = numbers.length - 1; j >= i; j--) {
					if (numbers[i].equals(numbers[j])) {
						counter++;
					}
				}
				times[i] = counter;
			}
			counter = 0;
			for (int i = numbers.length - 1; i >= 0; i--) {
				if (times[numbers.length - 1] == (times[i])) {
					counter++;
				} else {
					break;
				}
			}
			line = "";
			for (int i = numbers.length - counter; i < numbers.length; i++) {
				line += numbers[i] + " ";
			}
			line = line.substring(0, line.length() - 1);
			System.out.println(line);
		}
		buffer.close();
	}
}