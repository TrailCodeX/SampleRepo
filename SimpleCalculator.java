import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int numOne,numTwo;
        int result;
        char ch;
        int n;

        do {
            System.out.println(("Enter first number"));
            numOne=sc.nextInt();
            System.out.println(("Enter second number"));
            numTwo=sc.nextInt();

            System.out.println("Choose from the following\n1.Addition\n2. Substraction\n3. Division\n4. Multiplication\n5. Modulus");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    result = numOne + numTwo;
                    System.out.println("Result " + result);
                    break;
                case 2:
                    result = numOne - numTwo;
                    System.out.println("Result " + result);
                    break;
                case 3:
                    System.out.println("Result " + numOne / numTwo);
                    break;
                case 4:
                    result = numOne * numTwo;
                    System.out.println("Result " + result);
                    break;
                case 5:
                    result = numOne % numTwo;
                    System.out.println("Result " + result);
                    break;
                default:
                    System.out.println("Enter a valid operator");
            }
            System.out.println("Do you want to continue?(Y/N)");
            ch = sc.next().charAt(0);
        }while (ch == 'Y'||ch=='y') ;

    System.out.println("Exiting.....");
    }
}
