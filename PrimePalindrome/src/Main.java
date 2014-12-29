public class Main {
	public static void main(String[] args) {
		int num, rev, dig, maxPrimePalindrome = 0;
		boolean not = false;
		for (int i = 929; i > 0; i--) {
			if (i > maxPrimePalindrome) {
				num = i;
				rev = 0;
				while (num > 0) {
					dig = num % 10;
					rev = rev * 10 + dig;
					num = num / 10;
				}
				if (rev == i) {
					for (int j = 2; j < i; j++) {
						if (not == false) {
							if (i % j == 0)
								not = true;
						} else
							break;
					}
					if (not == false)
						maxPrimePalindrome = i;
					else
						not = false;
				}
			}
		}
		System.out.println(maxPrimePalindrome);
	}
}