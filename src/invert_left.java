import java.util.Scanner;
public class invert_left{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number= scn.nextInt();
        for(int i=number;i>0;i--){
            for(int j=0;j<i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}