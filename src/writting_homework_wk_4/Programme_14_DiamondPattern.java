package writting_homework_wk_4;

import java.util.Scanner;

/**
 * 14 Write a program in Java to display the pattern like a diamond.
 * While loop
 * <p>
 *        *
 *       ***
 *      *****
 *     *******
 *    *********
 *   ***********
 *  *************
 *   ***********
 *    *********
 *     *******
 *      *****
 *       ***
 *        *
 */
public class Programme_14_DiamondPattern {
    public static void printDiamondPattern(int r, char ch){
        int i = 1;
        int j;
        while(i <= r){
            j = 1;
            while (j++ <= r-i){
                System.out.print(" ");
            }
            j = 1;
            while (j++ <= i * 2- 1 ){
                System.out.print(ch);
            }
            System.out.println();
            i--;
        }
    }

    public static void main(String[] args) {
        //scanner declaration
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number of row : ");
        int a = scanner.nextInt();
        System.out.println("Enter the symbol : ");
        char c = scanner.next().charAt(0);
        printDiamondPattern(a , c);
        // closing the scanner object
        scanner.close();
    }
}
