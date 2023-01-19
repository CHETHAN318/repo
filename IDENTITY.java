import java.util.Scanner;

public class Identity {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the n value");
		int n=s.nextInt();
		for (int i = 1; i <= n ; i++) {
			for(int j=1;j<=n;j++) {
				if(i==1||i==n||j==1) {
					System.out.print("*");}
					else
						System.out.print(" ");
				}
			System.out.print("  ");
			for(int j=1;j<=n;j++) {
				if(j==1||i==(n/2)+1||j==n) {
					System.out.print("*");}
					else
						System.out.print(" ");
				}
			System.out.print("  ");
			for(int j=1;j<=n;j++) {
				if(i==1||j==1||i==(n/2)+1||i==n) {
					System.out.print("*");}
					else
						System.out.print(" ");
				}
			System.out.print("  ");
			for(int j=1;j<=n;j++) {
				if(i==1||j==(n/2)+1) {
					System.out.print("*");}
					else
						System.out.print(" ");
				}
			System.out.print("  ");
			for(int j=1;j<=n;j++) {
				if(j==1||i==(n/2)+1||j==n) {
					System.out.print("*");}
				
					else
						System.out.print(" ");
				}
			System.out.print("  ");
			 for(int j=1;j<=n;j++) {
				 if(j==n||i==1||j==1||i==(n/2)+1)
				 System.out.print("*");
				 else
					 System.out.print(" ");
			 }
			 System.out.print("  ");
			 for(int j=1;j<=n;j++) {
					if(j==1||i==j||j==n) {
						System.out.print("*");}
						else
							System.out.print(" ");
					}
			 System.out.print("  ");
			for(int j=0;j<=n;j++) {
				if(j>=(n/2)+2&&i>=(n/2)+2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			 System.out.print("  ");
			 for(int j=1;j<=n;j++) {
					if(i==1||j==1||((i<=(n/2)+1)&&j==n)||i==n/2+1||(i>=(n/2)+1&&i==j)) {
						System.out.print("*");}
						else
							System.out.print(" ");
					}

			System.out.println();
			}
s.close();
	}
	
}
