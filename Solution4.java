import java.util.Scanner;
public class Que4{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		while(num!=1) {
			System.out.println(num);
			if(num%2==0) {
				num=num/2;
			}
			else {
				num=(3*num)+1;
			}
		}
		System.out.println(1);
	}
}
