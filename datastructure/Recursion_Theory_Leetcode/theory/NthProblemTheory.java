package Recursion_Theory_Leetcode.theory;

public class NthProblemTheory {
    public static void main(String[] args) {
    //    func(5);  
    //    funcRev(5);
    
    // funcBoth(7);

    // System.out.println(factorialN(5)); 

    // System.out.println(sumN(5));

    // System.out.println(sumDigit(1342));

    // System.out.println(productN(25));

    
    // revNum(1824);
    // System.out.println(sum);

    // sum = 0;
    // revNum(1234)
    // System.out.println(sum);
    }
    
        static void func(int n){
        if ( n == 0){
            System.out.println();
            return;
        }

        System.out.print(n + " ");
        func(n-1);
    }

    static void funcRev(int n){
        if ( n == 0){
            return;
        }

        funcRev(--n);
        System.out.print(n + " ");
    }

    static void funcBoth (int n){
        if (n == 0){
            System.out.println();
            return;
        }

        System.out.print(n + " ");
        funcBoth(n-1);
        System.out.print(n + " ");
    }

    static int factorialN(int n){ // n =5; 5 * factorialN(4) -> 4 * factorialN(3) -> 3 * factorialN(2) ... till BC
        if (n == 1) {
            return n;
        }

        return n * factorialN(--n); // 2 * factorialN(1) -> 3 * factorialN(2) -> 4 * factorialN(4) -> 5 * factorialN(4)
    }

    static int sumN(int n){
        if (n == 1) {
            return n;
        }

        return n + sumN(--n);
    }

    static int productN(int n){ // n = 25; 5 * productN(25 % 10 = 2);
        if (n % 10 == n) return n;

        return (n % 10) * productN(n / 10);
    }

    static int sumDigit(int n){ // n 1342; ans = 1 + 3 + 4 + 2
        if (n == 0) return n;

        return sumDigit(n / 10) + (n % 10);
    }
    
    static int sum = 0;
    static void revNum(int n){
        if ( n == 0) return;

        int rem = n % 10;
        sum = sum * 10 + rem;

        revNum(n / 10);
    }
    
}
