public class WhoIsWinner {
    public static void Winner() {
        System.out.println();
        if (Main.PlayerShips==0) {
            System.out.println("You Lost All Your Ships!!!");
            System.out.println("    ***Game Over...***    ");
        } else if (Main.GameShips==0) {
            System.out.println("You Sunk All Enemy Ships!!!");
            System.out.println("    ***You Won...***    ");
        }
    }
}
