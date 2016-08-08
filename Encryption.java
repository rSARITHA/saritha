import java.util.*;
public class Encryption {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		char[] a = new char[str.length()];
		int[] ascii = new int[str.length()];
		int[] index = new int[str.length()];
		int[] pos = new int[str.length()];
		
		
		for (int i = 0; i < str.length(); i++) {
			a[i] = str.charAt(i);
			ascii[i] = a[i];
			if (ascii[i] >= 65 && ascii[i] <= 90) {
				index[i] = ascii[i] - 64;
			} else if (ascii[i] >= 97 && ascii[i] <= 122) {
				index[i] = ascii[i] - 96;
			}
		}
		for (int i = 0; i < str.length(); i++) {
			if (i < str.length() - 1) {
				pos[i] = index[i] - index[str.length() - 1];
				if (pos[i] <= 0) {
					pos[i] += 26;
				}
			} else {
				pos[i] = index[i];
			}
		}
		char[] c = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			if (ascii[i] >= 65 && ascii[i] <= 90) {
				c[i] = (char) (pos[i] + 64);
			} else if (ascii[i] >= 97 && ascii[i] <= 122) {
				c[i] = (char) (pos[i] + 96);
			} else {
				c[i] = (char) ascii[i];
			}
			System.out.print(c[i]);
		}
	}

}



