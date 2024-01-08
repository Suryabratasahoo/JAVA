import java.util.Scanner;
public class userinputtillmultipleof10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("Enter a number:");
            int num=sc.nextInt();
            if (num%10==0){
                break;
            }
        }
    }
    
}
