import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in) ;
    protected static int row =10 ;
    protected static int column = 10 ;
    protected static int PlayerShips = 5 ;
    protected static int GameShips = 5 ;
    protected static String[][] MyShips = new String[row][column] ;
    public static void main (String[] args) {
        System.out.println();
        System.out.println("***Welcome To The Game***");

        MyOcean.MakeTheOcean();       //Creating an Ocean

        DeployingShips.PlayerShips(); //Deploying The Ships Into The Ocean

        DeployingShips.GameShips();   //Deploying Game Ships Into The Ocean

        GameOcean.MakeTheOcean();     //Make The Ocean With Ships

        while(PlayerShips>0 && GameShips>0) {
            System.out.println();
            System.out.println("it is Your Turn...");
            AttackTheShips.AttackGameShips();
            System.out.println();
            if (PlayerShips>0) {
                System.out.println("It Is The Game Turn...");
                AttackTheShips.AttackPlayerShips();
            } else {
                GameOcean.MakeTheOcean();
                break ;
            }
            GameOcean.MakeTheOcean();
        }

        WhoIsWinner.Winner();
    }
}
