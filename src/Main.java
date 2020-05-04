import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

        Contra player1 = new Contra();
        Contra player2 = new Contra();

        player1.name = "Bill";
        player1.weapon = "Shotgun";

        player2.name = "Lance";
        player2.weapon = "Laser";

        player1.Clear();
        player1.Shotgun();
        player2.Clear();
        player2.Dead();
        player2.Dead();

        int kill1 = player1.shootMob * 15;
        int kill2 = player2.shootMob * 21;

        System.out.println(player1.name + " using " + player1.weapon);
        System.out.println("Total Score = " + (player1.score + kill1));
        System.out.println("Live left = " + player1.lives);
        System.out.println("");
        System.out.println(player2.name + " using " + player2.weapon);
        System.out.println("Total Score = " + (player2.score + kill2));
        System.out.println("Live left = " + player2.lives);
    }
}
