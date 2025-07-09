package DSA;

public class trianglePrinting {
    public static void main(String[] args) {
       final int totalRows = 10;

       for (int row = 1; row <= totalRows; row++) {
           for (int col = 1; col <= row; col++) {
               System.out.print('*');
           }
           for (int space = 1; space <= totalRows - row + 2; space++) {
               System.out.print(' ');
           }
           for (int col = totalRows; col >= row; col--) {
               System.out.print('*');
           }
           for (int space = 1; space <= 2; space++) {
               System.out.print(' ');
           }
           for (int col = 1; col < row; col++) {
               System.out.print(' ');
           }
           for (int col = totalRows; col >= row; col--) {
               System.out.print('*');
           }
           for (int space = 1; space <= 2; space++) {
               System.out.print(' ');
           }
           for (int col = totalRows; col > row; col--) {
               System.out.print(' ');
           }
           for (int col = 1; col <= row; col++) {
               System.out.print('*');
           }
           System.out.println();
       }
    }
}
