import java.util.Scanner;
public class Hanoi {
	public void disc(int n, String start, String auxiliary, String end) {
	     if (n == 1) {
		    System.out.println(start +"pole -> " + end+"pole");
		    } else {
		     disc(n - 1, start, end, auxiliary);
		     System.out.println(start + "pole -> " + end+"pole");
		     disc(n - 1, auxiliary, start, end);
		       }
		   }
		   public static void main(String[] args) {
		       Hanoi towersOfHanoi = new Hanoi();
		       System.out.print("Enter number of discs: ");
		       Scanner scanner = new Scanner(System.in);
		       int discs = scanner.nextInt();
		       towersOfHanoi.disc(discs, "1", "2", "3");
		       scanner.close();
		   }
		}

