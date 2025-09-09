/*
    A func that multiplies a num by every num below it/
    3! = 3*2*1 = 6
*/

public class P13_Factorial_Num {
    public static void main(String[] args) {
        int num = 10;
        m1(num);
    }

    public static void m1(int num) {
        int fact = 1;
        for (int i = num; i >= 1; i--) {
            fact = fact * i;
        }
        System.out.println("factorial of num = " + num + " is " + fact);
    }
}
