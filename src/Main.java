import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in) ;
    public static int row =10 ;
    public static int column = 10 ;
    public static int PlayerShips = 5 ;
    public static int GameShips = 5 ;
    public static String[][] MyShips = new String[row][column] ;
    public static void main (String[] args) {
        System.out.println();
        System.out.println("***Welcome To The Game***");

        MyOcean.MakeTheOcean();       //Creating an Ocean

        DeployingShips.PlayerShips(); //Deploying The Ships Into The Ocean



    }
}
