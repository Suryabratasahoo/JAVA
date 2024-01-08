import java.util.Scanner;
public class switchcase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice:");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
            System.out.println("bring samosa");
            break;
            case 2:
            System.out.println("bring jalebi");
            break;
            default :
            System.out.println("bring water");
        }

    }
    
}
