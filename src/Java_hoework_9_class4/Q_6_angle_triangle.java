package Java_hoework_9_class4;

// 6. Display right angle triangle of @ using nested for loops.

import java.util.Scanner;

public class Q_6_angle_triangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Right Angled Triangle Pattern Rows : ");
        int rows = sc.nextInt();

        System.out.println("Printing Right Angled Triangle of @ Pattern");

        for (int i = 1; i <= rows; i++ )
        {
            for (int x = 1; x <= i; x++ )
            {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}

