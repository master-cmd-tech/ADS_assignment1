import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number");
        int n = scanner.nextInt();
        //int b = scanner.nextInt();
        //int[] arr = {5,2,7,1,2,4,5,6,9,2,4,6,4,3};

        //SumOfTheSquares(n,0);
        //SumOfTheNumbers(arr,n,0);
        //SumOfThePowers(n,b,0);
        PrintReverse(n,scanner);

    }
    public static void SumOfTheSquares ( int n,int sum){ // Big O(n)
        if (n == 0) {
            System.out.println("Result: " + sum);
            return;
        }
        SumOfTheSquares(n - 1, sum + n*n);
    }
    public static void SumOfTheNumbers( int[] arr,int n, int sum) { // Big O(n)
        if (n == 0) {
            System.out.println("Result: " + sum);
            return;
        }
        SumOfTheNumbers(arr,n-1, sum + arr[n-1]);
    }
    public static void SumOfThePowers (int n, int b, double sum){ // Big O(n)
        if (n == -1) {
            System.out.println("Result: " + sum);
            return;
        }
        SumOfThePowers(n-1,b,sum+Math.pow(b,n));
    }
    public static void PrintReverse (int n, Scanner scanner) { // Big O(n)
        if (n == 0 ) {
            return;
        }
        int x = scanner.nextInt();
        PrintReverse(n-1,scanner);
        System.out.print(x + " ");
    }
}
