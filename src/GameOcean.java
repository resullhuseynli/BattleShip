import java.util.Objects;

public class GameOcean {
    public static void MakeTheOcean() {
        System.out.println("  ");
        System.out.print("  ");
        for (int i=0 ; i<=9 ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i=0 ; i< Main.row ; i++) {
            System.out.print(i+ "|");
            for (int j=0 ; j < Main.column ; j++) {
                if (!Objects.equals(Main.MyShips[i][j], "-")) {
                    System.out.print(Main.MyShips[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("|" + i);
            System.out.println();
        }
        System.out.print("  ");
        for (int i=0 ; i<=9 ; i++) {
            System.out.print(i + " ");
        }
    }
}
