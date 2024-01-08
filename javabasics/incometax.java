import java.util.Scanner;
public class incometax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Income:");
        int income=sc.nextInt();
        if (income<500000){
            System.out.println("no tax is reduced");
            System.out.println("your income is still:"+income);
        }
        else if(income>=500000 && income<=1000000){
            System.out.println("20% tax will be reduced from your income");
            System.out.println("your income after reducing the tax is :"+(income-(20.0/100.0)*income));
        }
        else{
            System.out.println("30% tax will be reduced from your income");
            System.out.println("your income after reducing the tax is :"+(income-(30.0/100.0)*100));
        }
    
        
    }
    
}
