import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int numOne,numTwo;
        int result;
        char ch;
        System.out.println(("Enter first number"));
        numOne=sc.nextInt();
        System.out.println(("Enter second number"));
        numTwo=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the operand");
        ch=sc.next().charAt(0);
        switch(ch){
            case '+':
                result=numOne+numTwo;
                System.out.println("Result "+result);
                break;
            case '-':
                result=numOne-numTwo;
                System.out.println("Result "+result);
                break;
            case '/':
                result=numOne/numTwo;
                System.out.println("Result "+result);
                break;
            case '*':
                result=numOne*numTwo;
                System.out.println("Result "+result);
                break;
            case '%':
                result=numOne%numTwo;
                System.out.println("Result "+result);
                break;
            default:
                System.out.println("Enter a valid operand");
        }


    }
}
