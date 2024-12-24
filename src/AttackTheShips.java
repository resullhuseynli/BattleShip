import java.util.Objects;

public class AttackTheShips {
    public static void AttackGameShips() {
        System.out.println();
        System.out.print("Please Enter A Target Row");
        int MyTargetRow = Main.scanner.nextInt() ;

        if (MyTargetRow>9 || MyTargetRow<0) {
            System.out.println("Cannot Enter Out Of The Ocean");
            System.out.println("Please Try Again...");
            System.out.println();
            System.out.print("Enter A Target Row...");
            MyTargetRow = Main.scanner.nextInt() ;
        }
        System.out.println();
        System.out.print("Please Enter A Target Column");
        int MyTargetColumn = Main.scanner.nextInt() ;

        if (MyTargetColumn>9 || MyTargetColumn<0) {
            System.out.println("Cannot Enter Out Of The Ocean");
            System.out.println("Please Try Again...");
            System.out.println();
            System.out.print("Enter A Target Column...");
            MyTargetColumn = Main.scanner.nextInt() ;
        }

        if (Objects.equals(Main.MyShips[MyTargetRow][MyTargetColumn], "X")) {
            System.out.println("You Cannot Attack The Attacked Place!!!");
            System.out.println("Please Enter Again...");
            AttackGameShips();
        }

        if (Objects.equals(Main.MyShips[MyTargetRow][MyTargetColumn], " ")) {
            System.out.println("You Missed!!!");
            System.out.println("It Is The Game Turn...");
            Main.MyShips[MyTargetRow][MyTargetColumn] = "X" ;
        } else if (Objects.equals(Main.MyShips[MyTargetRow][MyTargetColumn], "-")) {
            System.out.println("You Sunk The Enemy Ship!!!");
            Main.GameShips-- ;
            Main.MyShips[MyTargetRow][MyTargetColumn] = "!" ;
        } else if (Objects.equals(Main.MyShips[MyTargetRow][MyTargetColumn], "#")){
            System.out.println("Ohh no! You Sunk Your Ship. Be Careful!!!");
            Main.PlayerShips-- ;
            Main.MyShips[MyTargetRow][MyTargetColumn] = "@" ;
        }
    }

    public static void AttackPlayerShips() {
        int RandomTargetRow = (int) (Math.random()*10) ;
        int RandomTargetColumn = (int) (Math.random()*10) ;

        if (Objects.equals(Main.MyShips[RandomTargetRow][RandomTargetColumn], "X") || Objects.equals(Main.MyShips[RandomTargetRow][RandomTargetColumn], "@") || Objects.equals(Main.MyShips[RandomTargetRow][RandomTargetColumn], "!")) {
            AttackPlayerShips();
        }
        if (Objects.equals(Main.MyShips[RandomTargetRow][RandomTargetColumn], "-")) {
            System.out.println("Ura! Game Sunk His Own Ship!!!");
            Main.GameShips-- ;
            Main.MyShips[RandomTargetRow][RandomTargetColumn] = "!" ;
            System.out.println();
            System.out.printf("Target was %d:%d" , RandomTargetRow , RandomTargetColumn);
        } else if (Objects.equals(Main.MyShips[RandomTargetRow][RandomTargetColumn], "#")) {
            System.out.println("Game Find Your Ship!!!");
            System.out.println(("Ship Lost..."));
            Main.PlayerShips-- ;
            Main.MyShips[RandomTargetRow][RandomTargetColumn] = "@" ;
            System.out.println();
            System.out.printf("Target was %d:%d" , RandomTargetRow , RandomTargetColumn);
        } else if (Objects.equals(Main.MyShips[RandomTargetRow][RandomTargetColumn], " ")) {
            System.out.println("Game Missed!!!");
            Main.MyShips[RandomTargetRow][RandomTargetColumn] = "X" ;
            System.out.println();
            System.out.printf("Target was %d:%d" , RandomTargetRow , RandomTargetColumn);
        }
    }
}
