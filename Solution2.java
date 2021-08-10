import java.util.*;
public class Que2{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num;
		int sum1=0;
		int sum2=0;
		int n=0;
		while(temp>0) {
			n=temp%10;
			temp=temp/10;
			if(n%2==0) {
				sum1+=n;
			}
			else {
				sum2+=n;
			}
		}
		if(sum1==sum2) {
			System.out.println("Number "+num+" is probable topper number");
		}
		else {
			System.out.println("Number "+num+" is not probable topper number");
		}
	}
}
