import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		String[] lineS, temp;
		int[] distance;
		int dist;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			lineS = line.split(";");
			dist = 0;
			distance = new int[lineS.length];
			for (int i = 0; i < lineS.length; i++) {
				temp = lineS[i].trim().split(",");
				distance[i] = Integer.parseInt(temp[1]);
			}
			for (int i = 0; i < distance.length; i++) {
				for (int j = 0; j < distance.length - 1; j++) {
					if (distance[j] > distance[j + 1]) {
						dist = distance[j];
						distance[j] = distance[j + 1];
						distance[j + 1] = dist;
					}
				}
			}
			dist = 0;
			for (int i = 0; i < lineS.length; i++) {
				dist -= distance[i];
				dist = (dist < 0 ? -dist : dist);
				System.out.print(dist);
				dist = distance[i];
				if (i != lineS.length - 1) {
					System.out.print(",");
				}
			}
			System.out.println();
		}
		buffer.close();
	}
}