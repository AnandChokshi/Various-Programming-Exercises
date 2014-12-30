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
		int n,p1,p2;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			lineS = line.split(",");
			n = Integer.parseInt(lineS[0]);
			p1 = Integer.parseInt(lineS[1]);
			p2 = Integer.parseInt(lineS[2]);
			line = Integer.toBinaryString(n);
			if(line.charAt(line.length()-p1) == line.charAt(line.length()-p2)){
				System.out.println("true");
			}
			else{
				System.out.println("false");
			}
		}
		buffer.close();
	}
}