import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

        Contra player1 = new Contra();
        Contra player2 = new Contra();

        player1.name = "Bill";
        player1.Shotgun();

        player2.name = "Lance";
        player2.Dead();
        player2.Dead();

        player1.Clear();
        System.out.println(player1.name + " " + player1.score * 15 );
        System.out.println("Live left = " + player1.lives);
        System.out.println("");
        player2.Clear();
        System.out.println(player2.name + " " + player2.score * 21 );
        System.out.println("Live left = " + player2.lives);
    }
}
