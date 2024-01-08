import java.util.*;
public class code1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=sc.nextInt();
        if (age>=18){
            System.out.println("you are adult. You can drive vehicle");
        }
        else{
            System.out.println("No you can't drive a vehicle.");
        }
    }
}
