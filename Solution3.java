import java.util.Scanner;
public class Que3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] work_hours = new int[7];
        int total_hours = 0;
        double salary = 0;
        for(int i=0;i<7;i++){
        	work_hours[i] = sc.nextInt();
            total_hours += work_hours[i];
        }
        for(int i=0;i<7;i++){
            salary = salary+work_hours[i]*100;
            if(i==0) {
            	salary = salary+(work_hours[i]*100*0.5);
            }
            if(i==6) {
            	salary = salary+(work_hours[i]*100*0.25);
            }
            if(work_hours[i]-8>0) {
            	salary = salary+(work_hours[i]-8)*15;
            }
        }
        if(total_hours>40) {
        	salary=salary+(total_hours-40)*25;
        }
        System.out.println(salary);
    }
}
