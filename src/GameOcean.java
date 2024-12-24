import java.util.Objects;

public class GameOcean {
    public static void MakeTheOcean() {

        //Making The Header Of The Ocean
        System.out.println("  ");
        System.out.print("   0 1 2 3 4 5 6 7 8 9");

        //Making The Middle Of The Ocean
        System.out.println();
        for (int i=0 ; i< Main.row ; i++) {
            System.out.print(i+ "|" + " ");
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

        //Making The Bottom Of The Ocean
        System.out.print("   0 1 2 3 4 5 6 7 8 9");

    }
}
