import java.util.Scanner;
public class reversenumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Give the number:");
        int num=sc.nextInt();
        int revnum=0;
        while(num>0){
            revnum=revnum*10 + num%10;
            num=num/10;

        }
        System.out.println("Reversed number:"+revnum);

    }
    
}
