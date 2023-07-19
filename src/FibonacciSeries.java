import java.util.Scanner;

public class FibonacciSeries {
    static int fibonacci(int number)
    {
       if(number==0 || number==1)
       {
           return number;
       }
           return fibonacci(number-1)+fibonacci(number-2);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        System.out.println(fibonacci(number));
    }
}
