import java.util.Scanner;

public class hollowrhombus {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("How many rows of pattern do you want:");
        int rows=sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=rows;j++){
                if(i==1 || i==rows || j==1 || j==rows){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }    
            }
            System.out.println();
        }
    }
}    
