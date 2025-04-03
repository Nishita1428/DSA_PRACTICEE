import java.util.Scanner;
public class Armstrong {
    public boolean isArmstrong(int n){
        int original = n;
        int total_digits = 0;
        int sum = 0;

        for( int i = n ; i>0 ; i/=10){
            total_digits++;
        }

        for(int i = n; i>0 ; i/=10){
            int digit = i%10;
            sum += Math.pow(digit, total_digits);
            
        }
        return sum == original;

    }
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    Armstrong obj = new Armstrong();

    if(obj.isArmstrong(n)){
        System.out.println(n + " is an Armstrong number.");
    }else{  
        System.out.println(n + " is not an Armstrong number.");
    }
    sc.close();
}

}
