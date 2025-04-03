import java.util.Scanner;
class LCMandGCD {
    public static int[] lcmAndGcd(int a, int b) {
        int GCD = GCD(a,a%b);
        int LCM = (a/GCD)*b;
        
        return new int[]{LCM,GCD};
    }
     private static int GCD(int a, int b) {
        while (a != 0 &&b != 0) {
            if(a>b){
                a=a%b;
            }else{
                b=b%a;
            }

        }
      if(a!=0){
            return a;
      }else{
            return b;
      }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] result = lcmAndGcd(a, b);
        System.out.println("LCM: " + result[0] + ", GCD: " + result[1]);
        sc.close();
    }
}
