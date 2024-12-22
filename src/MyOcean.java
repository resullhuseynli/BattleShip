public class MyOcean {
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
                Main.MyShips[i][j] = " " ;
                System.out.print(Main.MyShips[i][j] + " ");
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
