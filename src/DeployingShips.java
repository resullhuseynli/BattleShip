import java.util.Objects;

public class DeployingShips {
     ;
    public static void PlayerShips() {
        System.out.println();
        while(Main.PlayerShips>0) {
            System.out.println();
            System.out.print("Please Enter A Row Of The Ship...");
            int InputRow = Main.scanner.nextInt() ;
            if (InputRow>9 || InputRow<0) {
                System.out.println("Cannot Enter Out Of The Ocean");
                System.out.println("Please Try Again...");
                System.out.println();
                System.out.print("Enter A Row Of The Ship...");
                InputRow = Main.scanner.nextInt() ;
            }
            System.out.print("Please Enter A Column Of The Ship...");
            int InputColumn = Main.scanner.nextInt() ;
            if (InputColumn>9 || InputColumn<0) {
                System.out.println("Cannot Enter Out Of The Ocean");
                System.out.println("Please Try Again...");
                System.out.println();
                System.out.print("Enter A Column Of The Ship...");
                InputColumn = Main.scanner.nextInt() ;
            }
            if (Objects.equals(Main.MyShips[InputRow][InputColumn], " ")) {
                Main.MyShips[InputRow][InputColumn] = "#" ;
                Main.PlayerShips-- ;
            } else {
                System.out.println("Cannot Deploy Two Ships In One Place!!!");
            }
        }
    }
}
