package fibonacci;
import java.util.Scanner;
public class Fibo {
    public static void fibo(int x) {
        int a=0,b=1,c;
        for (int i = 1; i <x; i++) {
            if(i==1){
                System.out.print(0+",");
            }
            else if(i==2){
                System.out.print(1+",");
            }
            else{
                c=a+b;
                System.out.print(c+",");
                a=b;b=c;
            }
        }
        c=a+b;
        System.out.print(c);
    }
    public static void main(String[] args){
        System.out.println("Enter the number upto which series is to be generated");
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        if (x == 1) {
            System.out.print(0);
            System.exit(0);
        }
        fibo(x);
    }
}
