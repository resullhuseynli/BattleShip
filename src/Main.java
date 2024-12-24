/** You will be recreating the game of battleships.
 *  A player will place 5 of their ships on a 10 by 10 grid.
 *  The computer player will deploy five ships on the same grid.
 *  Once the game starts the player and computer take turns,
 *  trying to sink each other's ships by guessing the coordinates to "attack".
 *  The game ends when either the player or computer has no ships left.**/


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
        System.out.println();
        System.out.println();
        System.out.println("Your Ships Are |#|");


        while(PlayerShips>0 && GameShips>0) {
            System.out.println();
            System.out.println("it is Your Turn...");
            AttackTheShips.AttackGameShips();
            if (Main.PlayerShips==0) {
                GameOcean.MakeTheOcean();
                break ;
            }
            System.out.println();
            System.out.print("It Is The Game Turn...");
            System.out.println();
            AttackTheShips.AttackPlayerShips();
            GameOcean.MakeTheOcean();
            if (Main.GameShips==0) {
                break ;
            }
        }

        WhoIsWinner.Winner();
    }
}
