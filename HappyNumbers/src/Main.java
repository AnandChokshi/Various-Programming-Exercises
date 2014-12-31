import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		int num,dig,sum;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			num = Integer.parseInt(line);
			for (int i = 0; i < 20; i++) {
				sum = 0;
				if(num==1)
					break;
				while(num>0){
					dig = (num%10)*(num%10);
					sum += dig;
					num = num/10;
				}
				num = sum;
			}
			if(num==1){
				System.out.println(num);
			}else
				System.out.println(0);
		}
		buffer.close();
	}
}