public class Contra {
    String name;
    int score;
    int lives = 3;
    double shootMob = 200;

    void Shotgun(){
        score *= 8;
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
