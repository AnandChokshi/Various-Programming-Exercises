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
		char[] seq;
		boolean upper;
		while ((line = buffer.readLine()) != null) {
			upper = true;
			line = line.trim();
			seq = line.toCharArray();
			for (int i = 0; i < seq.length; i++) {
				if (upper) {
					if ((int) seq[i] >= 97 && (int) seq[i] <= 122) {
						System.out.print((char) (seq[i] - 32));
					}else{
						System.out.print(seq[i]);
					}
					upper = false;
				} else {
					if(seq[i]==' '){
						upper = true;
					}
					System.out.print(seq[i]);
				}
			}
			System.out.println();
		}
		buffer.close();
	}
}