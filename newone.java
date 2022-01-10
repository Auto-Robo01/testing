import java.util.*;

public class newone{
    
    static int adder(int a, int b){
        int x = a+b;
        return x;
    }
    static int sub(int a, int b){
        int x = a-b;
        return x;
    }
    static int multiplier(int a, int b){
        int x = a*b;
        return x;
    }
    static int divisor(int a, int b){
        int x = a/b;
        return x;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first and second number");
        int first = sc.nextInt();
        int second = sc.nextInt();

        
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        
        
        int x;
        x = sc.nextInt();
        int result = 0;
        switch(x){
            case 1:
                result = adder(first, second);
                break;
            case 2:
                result = sub(first, second);
                break;
            case 3:
                result = multiplier(first, second);
                break;
            case 4:
                result = divisor(first, second);
                break;
        }
        System.out.println("The output is: " + result);
        
    }
}