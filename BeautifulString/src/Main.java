import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		List<Integer> cal = new ArrayList<Integer>();
		char[] setC;
		int beauty, counter, beautyNo;
		char comp;
		while ((line = buffer.readLine()) != null) {
			beauty = 0;
			line = line.trim();
			line = line.toLowerCase();
			setC = line.toCharArray();
			for (int i = 0; i < setC.length; i++) {
				if ((int) setC[i] >= 97 && (int) setC[i] <= 122) {
					counter = 0;
					comp = setC[i];
					for (int j = i; j < setC.length; j++) {
						if (comp == setC[j]) {
							counter++;
							setC[j] = ' ';
						}
					}
					if (counter != 0)
						cal.add(counter);
				}
			}
			beautyNo = 26;
			Collections.sort(cal, Collections.reverseOrder());
			for (int dig : cal) {
				beauty += dig * beautyNo;
				beautyNo--;
			}
			System.out.println(beauty);
			cal.clear();
		}
		buffer.close();
	}
}