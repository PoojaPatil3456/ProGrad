import java.util.*;
public class Que1{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		int n=sc.nextInt();
		
		if(n>x && n>y && n>z) {
			System.out.println("There is no lab which provide system to each student.");
		}
		else if(x==y && y==z) {
			System.out.println("You can allocate any lab");
		}
		else {
			int dif1=x-n;
			int dif2=y-n;
			int dif3=z-n;
			int min = Integer.MAX_VALUE;
			System.out.println(dif1 +" "+dif2+" "+dif3);
			if(min >= dif1 && dif1 > 0){
				min = dif1;
			} 
			if(min >= dif2 && dif2 > 0){
				min = dif2;
			}
			if(min >= dif3 && dif3 > 0){
				min = dif3;
			}
			if(min == dif1){
				System.out.println("Lab 1 is provided to "+n+" number of students");
			}else if(min == dif2){
				System.out.println("Lab 2 is provided to "+n+" number of students");
			}else {
				System.out.println("Lab 3 is provided to "+n+" number of students");
			}
		}
	}
}
