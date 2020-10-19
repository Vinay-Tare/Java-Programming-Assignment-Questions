/** 11. Write an application Program to demonstrate Method overloading */

public class Question11 {
    public static void main(String[] args) {

        // Method Overloading: changing no. of arguments
        System.out.println(Multiply.Multiply(5, 5));
        System.out.println(Multiply.Multiply(5, 5, 5));

        //  Method Overloading: changing data type of arguments
        System.out.println(Multiply.Multiply(6.5, 1.5));
    }
}


class Multiply {

    // Method Overloading: changing no. of arguments
    static int Multiply(int a, int b) {
        return a * b;
    }

    static int Multiply(int a, int b, int c) {
        return a * b * c;
    }

    //  Method Overloading: changing data type of arguments
    static double Multiply(double a, double b) {
        return a * b;
    }
}


