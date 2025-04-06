import java.util.Scanner;
public class sumof_oneton_divisor {
    public static int sumof_divisor(int n) {
        int sum = 0; 
        for(int i = 1 ; i<=n ; i++){
             sum+=(n/i)*i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Sum of divisors of " + n + " is: " + sumof_divisor(n));
        sc.close();
    }
}
