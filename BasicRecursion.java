public class BasicRecursion {
    
    //  question 1(pirnt natural number in increading order)
    public static void printDec(int n){
        
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+ " ");
        printDec(n-1);
    }

        // questions 2 (print natural number in decreasing order)
    public static void printInc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
        
    }

    // questions 3(check array is sorted or not)
    public static boolean isSorted(int arr[], int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>=arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }

    //  question 4 (find the factorials)
    public static int findFactorial(int n){
        if(n==0){
            return 1;
        }
        return n*findFactorial(n-1);
    }

    // question 5 (fibonacci series)
    public static int printFibonacci(int n){
        if(n==1){
            return 0;
        }
        if(n==2){
            return 1;
        }
        return printFibonacci(n-1)
    }

    //  calculate the x^n value

    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        return x * power(x, n-1);
    }

    // optimized power x^n value

    public static int optimizedPower(int x, int n){
        if(n==0){
            return 1;
        }
        int halfPower = optimizedPower(x, n/2);
        int halfPowerSq=halfPower * halfPower;

        if(n%2 !=0){
            halfPowerSq=  x* halfPower * halfPower;
        }
        return halfPowerSq;

    }
    public static void main(String args[]){
        // printDec(10);
        // printInc(10);
        // int arr[]={1,2,3,4,5};
        // System.out.println(isSorted(arr, 0));
        // System.out.println(findFactorial(4));
        System.out.println(optimizedPower(2,10));
    }
}
