import java.util.Scanner;
public class floydtriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ener the number of rows:");
        int rows=sc.nextInt();
        int num=1;
        for (int i=1;i<=rows;i++){
            for(int j=0;j<i;j++){
                System.out.print(num++);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
}
