import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number:");
        int num1=sc.nextInt();
        System.out.print("Enter second number:");
        int num2=sc.nextInt();
        System.out.println("Enter the expression you want to carry out(+,-,*,/,%):");
        char expression=sc.next().charAt(0);
        switch(expression){
            case '+':
            System.out.println(num1+" + "+num2+" = "+ num1+num2);
            break;
            case '-':
            System.out.println(num1+" - "+num2+" = "+ (num1-num2));
            break;
            case '*':
            System.out.println(num1+" * "+num2+" = "+ num1*num2);
            break;
            case '/':
            System.out.println(num1+" + "+num2+" = "+ num1/num2);
            break;
            default:
            System.out.println(num1+" % "+" num2 ="+num1%num2);


        }

    }
}
