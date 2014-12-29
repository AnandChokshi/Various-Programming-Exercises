public class Main {
	public static void main(String[] args) {
		int n = 0, sum = 0, counter = 2;
		boolean prime;
		while (n < 1000) {
			prime = true;
			for (int j = 2; j < counter; j++) {
				if (prime != false) {
					if (counter % j == 0)
						prime = false;
				} else
					break;
			}
			if (prime == true) {
				n++;
				sum += counter;
			}
			counter++;
		}
		System.out.println(sum);
	}
}