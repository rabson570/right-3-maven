import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the size of triangle side: ");
        int a = input.nextInt();
        for (int i=1;i<=a;i++){{
            for (int j=1;j<=(i-1);j++)
                System.out.print(" ");
            for (int k=0;k<=(a-i);k++)
                System.out.print("*");
        }
            System.out.println();
        }
    }
}
