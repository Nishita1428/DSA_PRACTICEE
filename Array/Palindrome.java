import java.util.Scanner;

class Palindrome {
    public boolean isPalindrome(int x) {
       
        if (x < 0) return false;

        int rev = 0, original = x;

        while (x > 0) {  
            int digit = x % 10;
            rev = rev * 10 + digit;
            x /= 10;
        }

        return original == rev;  
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Palindrome p = new Palindrome();
        System.out.println(p.isPalindrome(n));
        sc.close();
    }
}
