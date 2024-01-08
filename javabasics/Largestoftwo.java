import java.util.Scanner;
public class Largestoftwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First number:");
        int A=sc.nextInt();
        System.out.println("Enter second number:");
        int B=sc.nextInt();
        if (A>B){
            System.out.println(A+" is the largest of the two");
        }
        else{
            System.out.println(B+" is the largest of the two");
        }

    }
    
}
