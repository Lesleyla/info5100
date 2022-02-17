package assignment2.question4;

import java.util.Comparator;


class Checker implements Comparator<Player> {
    @Override
    public int compare(Player a1, Player a2) {
        if (a1.score < a2.score) {
            return 1;
        } else if (a1.score > a2.score) {
            return -1;
        } else {
            return a1.name.compareTo(a2.name);
        }
    }
}

public class Player {
    String name;
    int score;

    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}