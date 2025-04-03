import java.util.Scanner;
public class countdigit {
    public static int evenlyDivides(int n){
        int original = n;
        int count = 0;

        while(n>0){
            int digit = n % 10; 
            if(digit!=0 && original % digit == 0){
                count++;
            }
            n/=10;
        }
        return count;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(evenlyDivides(n));
        sc.close();
    }
}
