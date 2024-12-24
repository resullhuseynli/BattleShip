public class MyOcean {
    public static void MakeTheOcean() {

        //Making The Head Of The Ocean
        System.out.println("  ");
        System.out.print("  0 1 2 3 4 5 6 7 8 9");

        //Making The Middle Of The Ocean
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

        //Making The Bottom Of The Ocean
        System.out.print("  0 1 2 3 4 5 6 7 8 9");

    }
}
