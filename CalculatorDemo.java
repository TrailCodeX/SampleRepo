import java.util.Scanner;

interface Calculator{
    int add(int numOne,int numTwo);
    int substract(int numOne,int numTwo);
    int multiplication(int numOne,int numTwo);
    double division(int numOne,int numTwo);
}

//class DemoOperations implements Calculator{
//
//    public int add(int numOne,int numTwo){
//        return numOne+numTwo;
//    }
//    public int substract(int numOne,int numTwo){
//        return numOne-numTwo;
//    }
//    public int multiplication(int numOne,int numTwo){
//        return numOne*numTwo;
//    }
//    public double division(int numOne,int numTwo){
//        return numOne/numTwo;
//    }
//
//
//
//}
public class CalculatorDemo implements Calculator{
    public int add(int numOne,int numTwo){
        return numOne+numTwo;
    }
    public int substract(int numOne,int numTwo){
        return numOne-numTwo;
    }
    public int multiplication(int numOne,int numTwo){
        return numOne*numTwo;
    }
    public double division(int numOne,int numTwo){
        if(numTwo==0){
            throw new ArithmeticException("Second number shouldn't be zero...Arithmetic Exception occurs");
        }else{
            return (double) numOne/numTwo;
        }

    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int numOne;
        int numTwo;
        int num;
        boolean flag=true;
        CalculatorDemo demo=new CalculatorDemo();


        System.out.println("Enter the First number:");
        numOne=sc.nextInt();
        System.out.println("Enter the Second number:");
        numTwo=sc.nextInt();

        do{
            System.out.println("Choose from the following\n1.Addition\n2. Substraction\n3. Multiplication\n4. Division\n");
            num = sc.nextInt();

            if(num==1){
                System.out.println("----------ADDITION-----------");
                System.out.println(demo.add(numOne,numTwo));
            } else if (num==2) {
                System.out.println("----------SUBSTRACTION-----------");
                System.out.println(demo.substract(numOne,numTwo));
            }else if (num==3) {
                System.out.println("----------MULTIPLICATION-----------");
                System.out.println(demo.multiplication(numOne,numTwo));
            }else if (num==4) {
                System.out.println("----------DIVISION-----------");
                System.out.println(demo.division(numOne,numTwo));
            }else{
                System.out.println("Invalid Operation");
            }
            System.out.println("Do you want to continue:");
            char c=sc.next().charAt(0);
            if(c!='y' && c!='Y'){
                flag=false;
                System.out.println("Exiting...");
            }
        }while(flag);





    }
}