import java.util.Scanner;

public class Main {
    public static int row =10 ;
    public static int column = 10 ;
    public static String[][] MyShips = new String[row][column] ;
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("***Welcome To The Game***");

        MyOcean.MakeTheOcean();       //Creating an Ocean



    }
}
