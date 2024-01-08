import java.util.*;
public class checkprime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        boolean check=true;
        for(int i=2;i<(Math.sqrt(n));i++){
            if (num%i==0){
                check=false;
                break;
            }

        }
        if(check){
            System.out.println("It is a prime number.");

        }else{
            System.out.println("No it's not a prime number.");
        }
    }
    
}
