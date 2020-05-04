public class Contra {
    String name;
    String weapon;
    int score;
    int lives = 3;
    int shootMob = 200;

    void Shotgun(){
        score *= 2;
    }

    void Dead(){
        lives -= 1;
        score -= 1000;
    }

    void Clear(){
        System.out.println("Stage Complete");
        score += 5000;
    }

}
