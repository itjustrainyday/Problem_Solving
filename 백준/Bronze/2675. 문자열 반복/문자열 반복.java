import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i = 0; i < t; i++) {
			int n = sc.nextInt();
			String s = sc.next();
			
			for(int j = 0; j < s.length(); j++) {
				for(int k = 0; k < n; k++) {
					System.out.print(s.charAt(j));
				}
			}
			System.out.println();
		}
	}

}