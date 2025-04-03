import java.util.Scanner;

public class reverse {
    public int reverseANumber(int x) {
        int rev = 0;

        while (x != 0) {
            int digit = x % 10;

            
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                return 0;
            }

            rev = rev * 10 + digit;
            x /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        reverse r = new reverse();
        System.out.println(r.reverseANumber(n));
        sc.close();
    }
}
